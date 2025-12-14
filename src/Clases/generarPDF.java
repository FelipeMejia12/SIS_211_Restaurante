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
import java.util.ArrayList;
import java.util.List;
import javax.swing.filechooser.FileSystemView;

public class generarPDF {
    public static void generarPDFPedido(pedido pedido, List<itemPedido> detalles) {
        try {
            String rutaSalida = FileSystemView.getFileSystemView().getDefaultDirectory().getPath() + File.separator + "pedido.pdf";
            Document doc = new Document();
            PdfWriter.getInstance(doc, new FileOutputStream(rutaSalida));
            doc.open();
            
            // Logo e información de la empresa
            Image img = Image.getInstance(generarPDF.class.getResource("/Img/logo.png"));
            img.scaleToFit(100, 100);
            doc.add(img);
            
            Paragraph info = new Paragraph("Pedido #" + pedido.getId() + "\n" + "Fecha: " + pedido.getFecha() + "\n");
            doc.add(info);
            
            // Detalle de productos
            PdfPTable tabla = new PdfPTable(4);
            tabla.addCell("Cantidad");
            tabla.addCell("Nombre");
            tabla.addCell("Precio Unitario");
            tabla.addCell("Total");
            
            for (itemPedido item : detalles) {
                tabla.addCell(String.valueOf(item.getCantidad()));
                tabla.addCell(item.getNombre());
                tabla.addCell(String.valueOf(item.getPrecio()));
                tabla.addCell(String.valueOf(item.getCantidad() * item.getPrecio()));
            }
            
            doc.add(tabla);
            doc.close();
            
            Desktop.getDesktop().open(new File(rutaSalida));
        } catch (Exception e) {
            System.out.println("Error al generar el PDF: " + e.getMessage());
        }
    }
}
