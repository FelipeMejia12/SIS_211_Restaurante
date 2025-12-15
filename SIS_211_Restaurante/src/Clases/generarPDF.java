package Clases;

import java.util.List;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.filechooser.FileSystemView;

public class generarPDF {
	// Método estático para ser llamado desde Sistema.java
    public static void generarPDF(pedido ped, List<itemPedido> listaDetalles, restaurante infoRestaurante) {
        try {
            // 1. Definir ruta y crear archivo
            String url = FileSystemView.getFileSystemView().getDefaultDirectory().getPath();
            File salida = new File(url + File.separator + "pedido_" + ped.getId() + ".pdf"); // Nombre dinámico
            FileOutputStream archivo = new FileOutputStream(salida);
            
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();

            // 2. Cargar Logo (Asegúrate que la ruta coincida con tu carpeta src/Imagenes)
            try {
                Image img = Image.getInstance(generarPDF.class.getResource("/Imagenes/logo.png"));
                img.scaleToFit(100, 100);
                // Alineación del logo (opcional, aquí lo agrego a la tabla después)
            } catch (Exception e) {
                // Si falla el logo, no detenemos el PDF
                System.out.println("No se pudo cargar el logo: " + e.getMessage());
            }
            
            // 3. Encabezado (Tabla con Logo y Datos de la Empresa)
            PdfPTable Encabezado = new PdfPTable(4);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);
            float[] columnWidthsEncabezado = new float[]{20f, 20f, 60f, 60f};
            Encabezado.setWidths(columnWidthsEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);

            // Intentar poner el logo en la celda
            try {
                Image img = Image.getInstance(generarPDF.class.getResource("/Imagenes/logo.png"));
                img.scaleToFit(100, 100);
                Encabezado.addCell(img);
            } catch (Exception ex) {
                Encabezado.addCell(""); // Celda vacía si falla
            }
            
            Encabezado.addCell(""); // Espacio

            // --- REEMPLAZO SQL 1: Datos de la Empresa (objeto restaurante) ---
            String datosEmpresa = "NIT: " + infoRestaurante.getNIT()
                    + "\nNombre: " + infoRestaurante.getNombre()
                    + "\nTeléfono: " + infoRestaurante.getTelefono()
                    + "\nDirección: " + infoRestaurante.getDireccion();
            
            Encabezado.addCell(datosEmpresa);

            // --- REEMPLAZO SQL 2: Datos del Pedido (objeto pedido) ---
            Paragraph info = new Paragraph();
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLUE);
            
            info.add("Atendido: " + ped.getUsuario()
                    + "\nN° Pedido: " + ped.getId()
                    + "\nFecha: " + ped.getFecha()
                    + "\nN° Mesa: " + ped.getNum_mesa()
            );
            Encabezado.addCell(info);
            
            doc.add(Encabezado);
            doc.add(Chunk.NEWLINE);

            // 4. Tabla de Productos
            PdfPTable tabla = new PdfPTable(4);
            tabla.setWidthPercentage(100);
            tabla.getDefaultCell().setBorder(0);
            float[] columnWidths = new float[]{10f, 50f, 15f, 15f};
            tabla.setWidths(columnWidths);
            tabla.setHorizontalAlignment(Element.ALIGN_LEFT);

            // Estilos de Encabezado de Tabla
            PdfPCell c1 = new PdfPCell(new Phrase("Cant.", negrita));
            PdfPCell c2 = new PdfPCell(new Phrase("Plato", negrita));
            PdfPCell c3 = new PdfPCell(new Phrase("P. Unit.", negrita));
            PdfPCell c4 = new PdfPCell(new Phrase("Total", negrita));
            
            // Quitar bordes y poner color
            PdfPCell[] celdas = {c1, c2, c3, c4};
            for (PdfPCell cell : celdas) {
                cell.setBorder(Rectangle.NO_BORDER);
                cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
                tabla.addCell(cell);
            }

            // --- REEMPLAZO SQL 3: Iterar la LISTA de detalles ---
            DecimalFormat df = new DecimalFormat("#.00");
            
            for (itemPedido item : listaDetalles) {
                double subTotal = item.getCantidad() * item.getPrecio();
                
                tabla.addCell(String.valueOf(item.getCantidad()));
                tabla.addCell(item.getNombre());
                tabla.addCell(String.valueOf(item.getPrecio()));
                tabla.addCell(df.format(subTotal));
            }

            doc.add(tabla);

            // 5. Total y Pie de Página
            Paragraph agra = new Paragraph();
            agra.add(Chunk.NEWLINE);
            agra.add("Total Bs.: " + ped.getTotal());
            agra.setAlignment(Element.ALIGN_RIGHT);
            doc.add(agra);

            Paragraph firma = new Paragraph();
            firma.add(Chunk.NEWLINE);
            firma.add("Cancelación \n\n");
            firma.add("------------------------------------\n");
            firma.add("Firma \n");
            firma.setAlignment(Element.ALIGN_CENTER);
            doc.add(firma);

            Paragraph gr = new Paragraph();
            gr.add(Chunk.NEWLINE);
            gr.add(infoRestaurante.getMensaje()); // Mensaje desde el objeto
            gr.setAlignment(Element.ALIGN_CENTER);
            doc.add(gr);

            // 6. Cerrar y Abrir
            doc.close();
            archivo.close();
            
            // Abrir el archivo automáticamente
            Desktop.getDesktop().open(salida);

        } catch (DocumentException | IOException e) {
            System.out.println("Error al generar PDF: " + e.toString());
        }
    }
}
