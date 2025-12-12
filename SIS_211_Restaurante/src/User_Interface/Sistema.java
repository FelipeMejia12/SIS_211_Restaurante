package User_Interface;

/* slDao (revisar salasDB): 1405, 1421, 1441, 1848, 1881
 * plaDao (revisar platosDB): 1586, 1607, 1624, 1939
 * pedDao (revisar pedidoDB): 1369, 1563, 1564, 1809, 1908, 1960, 1964, 1974, 1979, 1995
 * lgDao (revisar loginDB): 1356, 1468, 1798, 1834
 */

import Clases.*;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.JTabbedPane;

public final class Sistema extends javax.swing.JFrame {

    sala sl = new sala();
//    salasDB slDao = new salasDB();
    restaurante conf = new restaurante();
    Eventos event = new Eventos();

    plato pla = new plato();
//    platosDB plaDao = new platosDB();

    pedido ped = new pedido();
//    pedidoDB pedDao = new pedidoDB();
    itemPedido detPedido = new itemPedido();

    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel tmp = new DefaultTableModel();

//    loginDB lgDao = new loginDB();
    int item;
    double Totalpagar = 0.00;

    Date fechaActual = new Date();
    String fechaFormato = new SimpleDateFormat("yyyy-MM-dd").format(fechaActual);

    public Sistema(login priv) {
        initComponents();
        ImageIcon img = new ImageIcon(getClass().getResource("/Imagenes/logo.png"));
        Image igmEscalada = img.getImage().getScaledInstance(labelLogo.getWidth(), labelLogo.getHeight(), Image.SCALE_SMOOTH);
        Icon icono = new ImageIcon(igmEscalada);
        labelLogo.setIcon(icono);
        this.setIconImage(img.getImage());
        this.setLocationRelativeTo(null);
        txtIdHistorialPedido.setVisible(false);
        txtIdConfig.setVisible(false);
        if (priv.getRol().equals("Asistente")) {
            btnSala.setEnabled(false);
            btnConfig.setEnabled(false);
            LabelVendedor.setText("Felipe Mejia");
        } else {
            LabelVendedor.setText("Felipe Mejia");
        }
        txtIdConfig.setVisible(false);
        txtIdHistorialPedido.setVisible(false);
        txtIdPedido.setVisible(false);
        txtIdPlato.setVisible(false);
        txtIdSala.setVisible(false);
        txtTempIdSala.setVisible(false);
        txtTempNumMesa.setVisible(false);
        Opciones_de_Paneles.setEnabled(false);
        panelSalas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        P_Opciones = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        btnSala = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnConfig = new javax.swing.JButton();
        LabelVendedor = new javax.swing.JLabel();
        tipo = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JButton();
        btnPlatos = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        Opciones_de_Paneles = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        PanelSalas = new javax.swing.JPanel();
        P_Salas = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableSala = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtNombreSala = new javax.swing.JTextField();
        btnRegistrarSala = new javax.swing.JButton();
        btnActualizarSala = new javax.swing.JButton();
        btnNuevoSala = new javax.swing.JButton();
        btnEliminarSala = new javax.swing.JButton();
        txtIdSala = new javax.swing.JTextField();
        jPanel35 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        txtMesas = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        PanelMesas = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        txtBuscarPlato = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblTemPlatos = new javax.swing.JTable();
        btnAddPlato = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        tableMenu = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        totalMenu = new javax.swing.JLabel();
        btnGenerarPedido = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnEliminarTempPlato = new javax.swing.JButton();
        txtTempIdSala = new javax.swing.JTextField();
        txtTempNumMesa = new javax.swing.JTextField();
        P_Recibo = new javax.swing.JPanel();
        btnFinalizar = new javax.swing.JButton();
        totalFinalizar = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tableFinalizar = new javax.swing.JTable();
        txtIdPedido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFechaHora = new javax.swing.JTextField();
        txtSalaFinalizar = new javax.swing.JTextField();
        txtNumMesaFinalizar = new javax.swing.JTextField();
        btnPdfPedido = new javax.swing.JButton();
        txtIdHistorialPedido = new javax.swing.JTextField();
        P_Historial_Pedidos = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablePedidos = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        P_Datos_Empresa = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        txtIdConfig = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtTelefonoConfig = new javax.swing.JTextField();
        txtDireccionConfig = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtMensaje = new javax.swing.JTextField();
        btnActualizarConfig = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        txtRucConfig = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtNombreConfig = new javax.swing.JTextField();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        P_Usuarios = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TableUsuarios = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnIniciar = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        cbxRol = new javax.swing.JComboBox<>();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        P_Platos_del_dia = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        txtNombrePlato = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtPrecioPlato = new javax.swing.JTextField();
        btnGuardarPlato = new javax.swing.JButton();
        btnEditarPlato = new javax.swing.JButton();
        btnEliminarPlato = new javax.swing.JButton();
        btnNuevoPlato = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        txtIdPlato = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablePlatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel de Adminstración");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P_Opciones.setBackground(new java.awt.Color(255, 255, 255));

        labelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLogoMouseClicked(evt);
            }
        });

        btnSala.setBackground(new Color(255, 255, 255));
        btnSala.setForeground(new java.awt.Color(45, 45, 45));
        btnSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sala.png"))); // NOI18N
        btnSala.setText("Salas");
        btnSala.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSala.setFocusable(false);
        btnSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalaActionPerformed(evt);
            }
        });

        btnVentas.setBackground(new Color(255, 255, 255));
        btnVentas.setForeground(new java.awt.Color(45, 45, 45));
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pedidos.png"))); // NOI18N
        btnVentas.setText("Pedidos");
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVentas.setFocusable(false);
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        btnConfig.setBackground(new Color(255, 255, 255));
        btnConfig.setForeground(new java.awt.Color(45, 45, 45));
        btnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/config.png"))); // NOI18N
        btnConfig.setText("Config");
        btnConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnConfig.setFocusable(false);
        btnConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigActionPerformed(evt);
            }
        });

        LabelVendedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelVendedor.setText("Administrador");

        tipo.setForeground(new java.awt.Color(255, 255, 255));

        btnUsuarios.setBackground(new Color(255, 255, 255));
        btnUsuarios.setForeground(new java.awt.Color(45, 45, 45));
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuarios.png"))); // NOI18N
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuarios.setFocusable(false);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnPlatos.setBackground(new Color(255, 255, 255));
        btnPlatos.setForeground(new java.awt.Color(45, 45, 45));
        btnPlatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/platos.png"))); // NOI18N
        btnPlatos.setText("Platos");
        btnPlatos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPlatos.setFocusable(false);
        btnPlatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gl_p_Opciones = new javax.swing.GroupLayout(P_Opciones);
        P_Opciones.setLayout(gl_p_Opciones);
        gl_p_Opciones.setHorizontalGroup(
            gl_p_Opciones.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnConfig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LabelVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addGroup(gl_p_Opciones.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(tipo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(btnPlatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(gl_p_Opciones.createSequentialGroup()
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        gl_p_Opciones.setVerticalGroup(
            gl_p_Opciones.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_p_Opciones.createSequentialGroup()
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tipo)
                .addGap(18, 18, 18)
                .addComponent(LabelVendedor)
                .addGap(28, 28, 28)
                .addComponent(btnPlatos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnSala, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        getContentPane().add(P_Opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 720));

        jLabel38.setFont(new java.awt.Font("Zilla Slab", 3, 48)); // NOI18N
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/titulo.png"))); // NOI18N
        jLabel38.setText("Bits & Grills");
        jLabel38.setFocusable(false);
        jLabel38.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 540, 90));

        Opciones_de_Paneles.setBackground(new java.awt.Color(255, 255, 255));

        PanelSalas.setBackground(new java.awt.Color(255, 255, 255));
        PanelSalas.setLayout(new java.awt.GridLayout(0, 5));
        jScrollPane8.setViewportView(PanelSalas);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Opciones_de_Paneles.addTab("Panel", jPanel9);

        P_Salas.setBackground(new java.awt.Color(255, 255, 255));
        P_Salas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableSala.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "Mesas"
            }
        ));
        tableSala.setRowHeight(23);
        tableSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSalaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableSala);
        if (tableSala.getColumnModel().getColumnCount() > 0) {
            tableSala.getColumnModel().getColumn(0).setMinWidth(80);
            tableSala.getColumnModel().getColumn(0).setPreferredWidth(80);
            tableSala.getColumnModel().getColumn(0).setMaxWidth(130);
            tableSala.getColumnModel().getColumn(1).setPreferredWidth(100);
            tableSala.getColumnModel().getColumn(2).setMinWidth(80);
            tableSala.getColumnModel().getColumn(2).setPreferredWidth(80);
            tableSala.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        P_Salas.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 490, 470));

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel18.setText("Nombre:");
        jPanel10.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txtNombreSala.setBackground(new java.awt.Color(204, 204, 204));
        txtNombreSala.setBorder(null);
        jPanel10.add(txtNombreSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 190, 30));

        btnRegistrarSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GuardarTodo.png"))); // NOI18N
        btnRegistrarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarSalaActionPerformed(evt);
            }
        });
        jPanel10.add(btnRegistrarSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 100, 40));

        btnActualizarSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        btnActualizarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarSalaActionPerformed(evt);
            }
        });
        jPanel10.add(btnActualizarSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 100, 40));

        btnNuevoSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        btnNuevoSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoSalaActionPerformed(evt);
            }
        });
        jPanel10.add(btnNuevoSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 100, 40));

        btnEliminarSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarSalaActionPerformed(evt);
            }
        });
        jPanel10.add(btnEliminarSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 100, 40));
        jPanel10.add(txtIdSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 24, -1));

        jPanel35.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 190, 2));

        jPanel38.setBackground(new java.awt.Color(0, 0, 0));
        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Nuevo Sala");
        jPanel38.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 30));

        jPanel10.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 35));

        jPanel36.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 190, 2));

        txtMesas.setBackground(new java.awt.Color(204, 204, 204));
        txtMesas.setBorder(null);
        jPanel10.add(txtMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 190, 30));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel19.setText("Mesas:");
        jPanel10.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        P_Salas.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 310, 370));

        Opciones_de_Paneles.addTab("Salas", P_Salas);

        PanelMesas.setLayout(new java.awt.GridLayout(0, 5));
        jScrollPane9.setViewportView(PanelMesas);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 1051, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                .addContainerGap())
        );

        Opciones_de_Paneles.addTab("Mesas", jPanel22);

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder("Platos del Dia"));

        txtBuscarPlato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarPlatoKeyReleased(evt);
            }
        });

        tblTemPlatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Nombre", "Precio"
            }
        ) {
            private static final long serialVersionUID = 1L;
			boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTemPlatos.setRowHeight(23);
        jScrollPane10.setViewportView(tblTemPlatos);
        if (tblTemPlatos.getColumnModel().getColumnCount() > 0) {
            tblTemPlatos.getColumnModel().getColumn(0).setMinWidth(30);
            tblTemPlatos.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblTemPlatos.getColumnModel().getColumn(0).setMaxWidth(50);
            tblTemPlatos.getColumnModel().getColumn(2).setMinWidth(150);
            tblTemPlatos.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblTemPlatos.getColumnModel().getColumn(2).setMaxWidth(200);
        }

        btnAddPlato.setBackground(new java.awt.Color(0, 0, 0));
        btnAddPlato.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        btnAddPlato.setForeground(new java.awt.Color(255, 255, 255));
        btnAddPlato.setText("+");
        btnAddPlato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddPlato.setFocusable(false);
        btnAddPlato.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPlatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(txtBuscarPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(btnAddPlato)))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBuscarPlato, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btnAddPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap())
        );

        tableMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Plato", "Cant", "Precio", "SubTotal", "Comentario"
            }
        ) {
            private static final long serialVersionUID = 1L;
			boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMenu.setRowHeight(23);
        jScrollPane11.setViewportView(tableMenu);
        if (tableMenu.getColumnModel().getColumnCount() > 0) {
            tableMenu.getColumnModel().getColumn(0).setMinWidth(30);
            tableMenu.getColumnModel().getColumn(0).setPreferredWidth(30);
            tableMenu.getColumnModel().getColumn(0).setMaxWidth(50);
            tableMenu.getColumnModel().getColumn(1).setPreferredWidth(100);
            tableMenu.getColumnModel().getColumn(2).setMinWidth(40);
            tableMenu.getColumnModel().getColumn(2).setPreferredWidth(40);
            tableMenu.getColumnModel().getColumn(2).setMaxWidth(50);
            tableMenu.getColumnModel().getColumn(3).setPreferredWidth(50);
            tableMenu.getColumnModel().getColumn(4).setPreferredWidth(60);
        }

        jLabel6.setText("Comentario:");

        jScrollPane12.setViewportView(txtComentario);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/money.png"))); // NOI18N
        jLabel11.setText("Total a Pagar");

        totalMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totalMenu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalMenu.setText("00.00");

        btnGenerarPedido.setText("Realizar Pedido");
        btnGenerarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPedidoActionPerformed(evt);
            }
        });

        jButton2.setText("Agregar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnEliminarTempPlato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminarTempPlato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarTempPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTempPlatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminarTempPlato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTempIdSala)
                                    .addComponent(txtTempNumMesa, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 323, Short.MAX_VALUE)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addGroup(jPanel23Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(totalMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnGenerarPedido, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarTempPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(txtTempIdSala, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(txtTempNumMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(14, 14, 14)
                                .addComponent(totalMenu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGenerarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39))
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Opciones_de_Paneles.addTab("Platos", jPanel23);

        P_Recibo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        P_Recibo.add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 110, 40));

        totalFinalizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totalFinalizar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalFinalizar.setText("00.00");
        P_Recibo.add(totalFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 390, 120, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/money.png"))); // NOI18N
        jLabel17.setText("Total a Pagar");
        P_Recibo.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 340, -1, -1));

        tableFinalizar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Plato", "Cant", "Precio", "SubTotal", "Comentario"
            }
        ) {
            private static final long serialVersionUID = 1L;
			boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableFinalizar.setRowHeight(23);
        jScrollPane13.setViewportView(tableFinalizar);
        if (tableFinalizar.getColumnModel().getColumnCount() > 0) {
            tableFinalizar.getColumnModel().getColumn(0).setMinWidth(30);
            tableFinalizar.getColumnModel().getColumn(0).setPreferredWidth(30);
            tableFinalizar.getColumnModel().getColumn(0).setMaxWidth(50);
            tableFinalizar.getColumnModel().getColumn(1).setPreferredWidth(100);
            tableFinalizar.getColumnModel().getColumn(2).setMinWidth(40);
            tableFinalizar.getColumnModel().getColumn(2).setPreferredWidth(40);
            tableFinalizar.getColumnModel().getColumn(2).setMaxWidth(50);
            tableFinalizar.getColumnModel().getColumn(3).setPreferredWidth(50);
            tableFinalizar.getColumnModel().getColumn(4).setPreferredWidth(60);
        }

        P_Recibo.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 13, 1030, 316));
        P_Recibo.add(txtIdPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 50, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Fecha y Hora:");
        P_Recibo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Sala:");
        P_Recibo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("N° Mesa:");
        P_Recibo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        txtFechaHora.setEditable(false);
        P_Recibo.add(txtFechaHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 240, 30));

        txtSalaFinalizar.setEditable(false);
        P_Recibo.add(txtSalaFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 240, 30));

        txtNumMesaFinalizar.setEditable(false);
        P_Recibo.add(txtNumMesaFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 240, 30));

        btnPdfPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pdf.png"))); // NOI18N
        btnPdfPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdfPedidoActionPerformed(evt);
            }
        });
        P_Recibo.add(btnPdfPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 440, 110, 40));
        P_Recibo.add(txtIdHistorialPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, 50, -1));

        Opciones_de_Paneles.addTab("Finalizar Pedido", P_Recibo);

        P_Historial_Pedidos.setBackground(new java.awt.Color(204, 204, 204));
        P_Historial_Pedidos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Sala", "Atendido", "N° Mesa", "Fecha", "Total", "Estado"
            }
        ) {
            private static final long serialVersionUID = 1L;
			boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablePedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TablePedidos.setRowHeight(23);
        TablePedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePedidosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(TablePedidos);
        if (TablePedidos.getColumnModel().getColumnCount() > 0) {
            TablePedidos.getColumnModel().getColumn(0).setMinWidth(80);
            TablePedidos.getColumnModel().getColumn(0).setPreferredWidth(80);
            TablePedidos.getColumnModel().getColumn(0).setMaxWidth(120);
            TablePedidos.getColumnModel().getColumn(2).setPreferredWidth(60);
            TablePedidos.getColumnModel().getColumn(3).setMinWidth(100);
            TablePedidos.getColumnModel().getColumn(3).setPreferredWidth(100);
            TablePedidos.getColumnModel().getColumn(3).setMaxWidth(150);
            TablePedidos.getColumnModel().getColumn(4).setPreferredWidth(60);
        }

        P_Historial_Pedidos.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 1020, 480));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Historial Pedidos");
        P_Historial_Pedidos.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 280, -1));

        Opciones_de_Paneles.addTab("Historial Pedidos", P_Historial_Pedidos);

        P_Datos_Empresa.setBackground(new java.awt.Color(255, 255, 255));
        P_Datos_Empresa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel32.setText("DATOS DE LA EMPRESA");
        P_Datos_Empresa.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdConfigActionPerformed(evt);
            }
        });
        jPanel8.add(txtIdConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 24, -1));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel30.setText("Dirección");
        jPanel8.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel29.setText("Teléfono");
        jPanel8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        txtTelefonoConfig.setBackground(new java.awt.Color(204, 204, 204));
        txtTelefonoConfig.setBorder(null);
        jPanel8.add(txtTelefonoConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 218, 30));

        txtDireccionConfig.setBackground(new java.awt.Color(204, 204, 204));
        txtDireccionConfig.setBorder(null);
        jPanel8.add(txtDireccionConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 147, 30));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel31.setText("Mensaje");
        jPanel8.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        txtMensaje.setBackground(new java.awt.Color(204, 204, 204));
        txtMensaje.setBorder(null);
        jPanel8.add(txtMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 400, 30));

        btnActualizarConfig.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizarConfig.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        btnActualizarConfig.setText("Modificar");
        btnActualizarConfig.setBorder(null);
        btnActualizarConfig.setFocusable(false);
        btnActualizarConfig.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizarConfig.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnActualizarConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarConfigActionPerformed(evt);
            }
        });
        jPanel8.add(btnActualizarConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 405, 220, 50));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel27.setText("Nit");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        txtRucConfig.setBackground(new java.awt.Color(204, 204, 204));
        txtRucConfig.setBorder(null);
        jPanel8.add(txtRucConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 147, 30));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel28.setText("Nombre");
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        txtNombreConfig.setBackground(new java.awt.Color(204, 204, 204));
        txtNombreConfig.setBorder(null);
        jPanel8.add(txtNombreConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 220, 30));

        jPanel41.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 147, 2));

        jPanel42.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 147, 2));

        jPanel43.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 400, 2));

        jPanel44.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 220, 2));

        jPanel45.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 220, 2));

        P_Datos_Empresa.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 420, 470));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/portada.png"))); // NOI18N
        P_Datos_Empresa.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 620, 470));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        P_Datos_Empresa.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 10));

        Opciones_de_Paneles.addTab("Datos de la Empresa", P_Datos_Empresa);

        P_Usuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Correo", "Rol"
            }
        ));
        TableUsuarios.setRowHeight(23);
        jScrollPane6.setViewportView(TableUsuarios);
        if (TableUsuarios.getColumnModel().getColumnCount() > 0) {
            TableUsuarios.getColumnModel().getColumn(0).setMinWidth(50);
            TableUsuarios.getColumnModel().getColumn(0).setPreferredWidth(50);
            TableUsuarios.getColumnModel().getColumn(0).setMaxWidth(80);
            TableUsuarios.getColumnModel().getColumn(3).setMinWidth(150);
            TableUsuarios.getColumnModel().getColumn(3).setPreferredWidth(150);
            TableUsuarios.getColumnModel().getColumn(3).setMaxWidth(200);
        }

        P_Usuarios.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 660, 520));

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel34.setText("Correo Electrónico");
        jPanel15.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 102, -1, -1));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel35.setText("Password");
        jPanel15.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 130, -1));

        txtCorreo.setBackground(new java.awt.Color(204, 204, 204));
        txtCorreo.setBorder(null);
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel15.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 126, 300, 30));

        txtPass.setBackground(new java.awt.Color(204, 204, 204));
        txtPass.setBorder(null);
        jPanel15.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 300, 30));

        btnIniciar.setBackground(new java.awt.Color(0, 0, 0));
        btnIniciar.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("Registrar");
        btnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel15.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 300, 50));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel36.setText("Nombre:");
        jPanel15.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        txtNombre.setBackground(new java.awt.Color(204, 204, 204));
        txtNombre.setBorder(null);
        jPanel15.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 300, 30));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel37.setText("Rol:");
        jPanel15.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 90, -1));

        cbxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Asistente" }));
        jPanel15.add(cbxRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 300, 30));

        jPanel16.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 156, 300, 2));

        jPanel17.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 300, 2));

        jPanel18.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 300, 2));

        jPanel21.setBackground(new java.awt.Color(0, 0, 0));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Nuevo Usuario");
        jPanel21.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 35));

        jPanel15.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 35));

        P_Usuarios.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 360, 520));

        Opciones_de_Paneles.addTab("Usuarios", P_Usuarios);

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel23.setText("Nombre:");
        jPanel11.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        txtNombrePlato.setBackground(new java.awt.Color(204, 204, 204));
        txtNombrePlato.setBorder(null);
        jPanel11.add(txtNombrePlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 170, 30));

        jLabel25.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel25.setText("Precio:");
        jPanel11.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        txtPrecioPlato.setBackground(new java.awt.Color(204, 204, 204));
        txtPrecioPlato.setBorder(null);
        txtPrecioPlato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioPlatoKeyTyped(evt);
            }
        });
        jPanel11.add(txtPrecioPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 170, 30));

        btnGuardarPlato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GuardarTodo.png"))); // NOI18N
        btnGuardarPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPlatoActionPerformed(evt);
            }
        });
        jPanel11.add(btnGuardarPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 110, 50));

        btnEditarPlato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        btnEditarPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPlatoActionPerformed(evt);
            }
        });
        jPanel11.add(btnEditarPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 270, 100, 50));

        btnEliminarPlato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminarPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPlatoActionPerformed(evt);
            }
        });
        jPanel11.add(btnEliminarPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 110, 50));

        btnNuevoPlato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        btnNuevoPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPlatoActionPerformed(evt);
            }
        });
        jPanel11.add(btnNuevoPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 100, 50));

        jPanel31.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 170, 2));

        jPanel33.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 170, 2));

        jPanel39.setBackground(new java.awt.Color(0, 0, 0));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Platos del Día");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel11.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 50));
        jPanel11.add(txtIdPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 80, -1));

        TablePlatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DESCRIPCIÓN", "PRECIO"
            }
        ));
        TablePlatos.setRowHeight(23);
        TablePlatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePlatosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TablePlatos);
        if (TablePlatos.getColumnModel().getColumnCount() > 0) {
            TablePlatos.getColumnModel().getColumn(0).setMinWidth(100);
            TablePlatos.getColumnModel().getColumn(0).setPreferredWidth(100);
            TablePlatos.getColumnModel().getColumn(0).setMaxWidth(150);
            TablePlatos.getColumnModel().getColumn(2).setMinWidth(200);
            TablePlatos.getColumnModel().getColumn(2).setPreferredWidth(200);
            TablePlatos.getColumnModel().getColumn(2).setMaxWidth(300);
        }

        javax.swing.GroupLayout gl_p_Platos_del_dia = new javax.swing.GroupLayout(P_Platos_del_dia);
        P_Platos_del_dia.setLayout(gl_p_Platos_del_dia);
        gl_p_Platos_del_dia.setHorizontalGroup(
            gl_p_Platos_del_dia.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_p_Platos_del_dia.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                .addContainerGap())
        );
        gl_p_Platos_del_dia.setVerticalGroup(
            gl_p_Platos_del_dia.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_p_Platos_del_dia.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(gl_p_Platos_del_dia.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Opciones_de_Paneles.addTab("Platos", P_Platos_del_dia);

        getContentPane().add(Opciones_de_Paneles, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 95, 1080, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalaActionPerformed
        // TODO add your handling code here:
        LimpiarTable();
        ListarSalas();
        Opciones_de_Paneles.setSelectedIndex(1);
    }//GEN-LAST:event_btnSalaActionPerformed

    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed
        // TODO add your handling code here:
        Opciones_de_Paneles.setSelectedIndex(6);
        ListarConfig();
    }//GEN-LAST:event_btnConfigActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        // TODO add your handling code here:
        LimpiarTable();
        ListarPedidos();
        Opciones_de_Paneles.setSelectedIndex(5);
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
        LimpiarTable();
        ListarUsuarios();
        Opciones_de_Paneles.setSelectedIndex(7);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnActualizarConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarConfigActionPerformed
        // TODO add your handling code here:
        if (!"".equals(txtRucConfig.getText()) || !"".equals(txtNombreConfig.getText()) || !"".equals(txtTelefonoConfig.getText()) || !"".equals(txtDireccionConfig.getText())) {
            conf.setRuc(txtRucConfig.getText());
            conf.setNombre(txtNombreConfig.getText());
            conf.setTelefono(txtTelefonoConfig.getText());
            conf.setDireccion(txtDireccionConfig.getText());
            conf.setMensaje(txtMensaje.getText());
            conf.setId(Integer.parseInt(txtIdConfig.getText()));
//            lgDao.ModificarDatos(conf);
            JOptionPane.showMessageDialog(null, "Datos de la empresa modificado");
            //ListarConfig();
        } else {
            JOptionPane.showMessageDialog(null, "Los campos estan vacios");
        }
    }//GEN-LAST:event_btnActualizarConfigActionPerformed

    private void btnPdfPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfPedidoActionPerformed

        if (txtIdHistorialPedido.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecciona una fila");
        } else {
//            pedDao.pdfPedido(Integer.parseInt(txtIdHistorialPedido.getText()));
            txtIdHistorialPedido.setText("");
        }
    }//GEN-LAST:event_btnPdfPedidoActionPerformed

    private void TablePedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePedidosMouseClicked
        // TODO add your handling code here:
        int fila = TablePedidos.rowAtPoint(evt.getPoint());
        int id_pedido = Integer.parseInt(TablePedidos.getValueAt(fila, 0).toString());
        LimpiarTable();
        verPedido(id_pedido);
        verPedidoDetalle(id_pedido);
        Opciones_de_Paneles.setSelectedIndex(4);
        btnFinalizar.setEnabled(false);
        txtIdHistorialPedido.setText(""+id_pedido);
    }//GEN-LAST:event_TablePedidosMouseClicked

    private void tableSalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSalaMouseClicked
        // TODO add your handling code here:
        int fila = tableSala.rowAtPoint(evt.getPoint());
        txtIdSala.setText(tableSala.getValueAt(fila, 0).toString());
        txtNombreSala.setText(tableSala.getValueAt(fila, 1).toString());
        txtMesas.setText(tableSala.getValueAt(fila, 2).toString());
    }//GEN-LAST:event_tableSalaMouseClicked

    private void txtIdConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdConfigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdConfigActionPerformed

    private void btnRegistrarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarSalaActionPerformed
        // TODO add your handling code here:
        if (txtNombreSala.getText().equals("") || txtMesas.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Los campos esta vacios");
        } else {
            sl.setNombre(txtNombreSala.getText());
            sl.setMesas(Integer.parseInt(txtMesas.getText()));
//            slDao.RegistrarSala(sl);
            JOptionPane.showMessageDialog(null, "Sala Registrado");
            LimpiarSala();
            LimpiarTable();
            ListarSalas();
        }
    }//GEN-LAST:event_btnRegistrarSalaActionPerformed

    private void btnActualizarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarSalaActionPerformed
        // TODO add your handling code here:
        if ("".equals(txtIdSala.getText())) {
            JOptionPane.showMessageDialog(null, "Seleecione una fila");
        } else {
            if (!"".equals(txtNombreSala.getText())) {
                sl.setNombre(txtNombreSala.getText());
                sl.setId(Integer.parseInt(txtIdSala.getText()));
//                slDao.Modificar(sl);
                JOptionPane.showMessageDialog(null, "Sala Modificado");
                LimpiarSala();
                LimpiarTable();
                ListarSalas();
            }
        }
    }//GEN-LAST:event_btnActualizarSalaActionPerformed

    private void btnNuevoSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoSalaActionPerformed
        // TODO add your handling code here:
        LimpiarSala();
    }//GEN-LAST:event_btnNuevoSalaActionPerformed

    private void btnEliminarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarSalaActionPerformed
        // TODO add your handling code here:
        if (!"".equals(txtIdSala.getText())) {
            int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar");
            if (pregunta == 0) {
                int id = Integer.parseInt(txtIdSala.getText());
//                slDao.Eliminar(id);
                LimpiarSala();
                LimpiarTable();
                ListarSalas();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
    }//GEN-LAST:event_btnEliminarSalaActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        if (txtNombre.getText().equals("") || txtCorreo.getText().equals("") || txtPass.getPassword().equals("")) {
            JOptionPane.showMessageDialog(null, "Todo los campos son requeridos");
        } else {
            login lg = new login();
            String correo = txtCorreo.getText();
            String pass = String.valueOf(txtPass.getPassword());
            String nom = txtNombre.getText();
            String rol = cbxRol.getSelectedItem().toString();
            lg.setNombre(nom);
            lg.setCorreo(correo);
            lg.setPass(pass);
            lg.setRol(rol);
//            lgDao.Registrar(lg);
            JOptionPane.showMessageDialog(null, "Usuario Registrado");
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void labelLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLogoMouseClicked
        Opciones_de_Paneles.setSelectedIndex(0);
        PanelSalas.removeAll();
        panelSalas();
    }//GEN-LAST:event_labelLogoMouseClicked

    private void txtBuscarPlatoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPlatoKeyReleased
        LimpiarTable();
        ListarPlatos(tblTemPlatos);
    }//GEN-LAST:event_txtBuscarPlatoKeyReleased

    private void btnAddPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPlatoActionPerformed
        if (tblTemPlatos.getSelectedRow() >= 0) {
            int id = Integer.parseInt(tblTemPlatos.getValueAt(tblTemPlatos.getSelectedRow(), 0).toString());
            String descripcion = tblTemPlatos.getValueAt(tblTemPlatos.getSelectedRow(), 1).toString();
            double precio = Double.parseDouble(tblTemPlatos.getValueAt(tblTemPlatos.getSelectedRow(), 2).toString());
            double total = 1 * precio;
            item = item + 1;
            tmp = (DefaultTableModel) tableMenu.getModel();
            for (int i = 0; i < tableMenu.getRowCount(); i++) {
                if (tableMenu.getValueAt(i, 0).equals(id)) {
                    int cantActual = Integer.parseInt(tableMenu.getValueAt(i, 2).toString());
                    int nuevoCantidad = cantActual + 1;
                    double nuevoSub = precio * nuevoCantidad;
                    tmp.setValueAt(nuevoCantidad, i, 2);
                    tmp.setValueAt(nuevoSub, i, 4);
                    TotalPagar(tableMenu, totalMenu);
                    return;
                }
            }
            ArrayList lista = new ArrayList();
            lista.add(item);
            lista.add(id);
            lista.add(descripcion);
            lista.add(1);
            lista.add(precio);
            lista.add(total);
            Object[] O = new Object[6];
            O[0] = lista.get(1);
            O[1] = lista.get(2);
            O[2] = lista.get(3);
            O[3] = lista.get(4);
            O[4] = lista.get(5);
            O[5] = "";
            tmp.addRow(O);
            tableMenu.setModel(tmp);
            TotalPagar(tableMenu, totalMenu);
        } else {
            JOptionPane.showMessageDialog(null, "SELECCIONA UNA FILA");
        }
    }//GEN-LAST:event_btnAddPlatoActionPerformed

    private void btnGenerarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPedidoActionPerformed
        if (tableMenu.getRowCount() > 0) {
            RegistrarPedido();
            detallePedido();
            LimpiarTableMenu();
            JOptionPane.showMessageDialog(null, "PEDIDO REGISTRADO");
            Opciones_de_Paneles.setSelectedIndex(0);
        } else {
            JOptionPane.showMessageDialog(null, "NO HAY PRODUCTO EN LA PEDIDO");
        }
    }//GEN-LAST:event_btnGenerarPedidoActionPerformed

    private void btnEliminarTempPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTempPlatoActionPerformed
        modelo = (DefaultTableModel) tableMenu.getModel();
        modelo.removeRow(tableMenu.getSelectedRow());
        TotalPagar(tableMenu, totalMenu);
    }//GEN-LAST:event_btnEliminarTempPlatoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (txtComentario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UNA FILA");
        } else {
            int id = Integer.parseInt(tableMenu.getValueAt(tableMenu.getSelectedRow(), 0).toString());
            for (int i = 0; i < tableMenu.getRowCount(); i++) {
                if (tableMenu.getValueAt(i, 0).equals(id)) {
                    tmp.setValueAt(txtComentario.getText(), i, 5);
                    txtComentario.setText("");
                    tableMenu.clearSelection();
                    return;
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        // TODO add your handling code here:
        int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro de finalizar");
        if (pregunta == 0) {
//            if (pedDao.actualizarEstado(Integer.parseInt(txtIdPedido.getText()))) {
//                pedDao.pdfPedido(Integer.parseInt(txtIdPedido.getText()));
//            }
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnPlatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlatosActionPerformed
        Opciones_de_Paneles.setSelectedIndex(8);
        LimpiarTable();
        ListarPlatos(TablePlatos);
    }//GEN-LAST:event_btnPlatosActionPerformed

    private void txtPrecioPlatoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioPlatoKeyTyped
        // TODO add your handling code here:
        event.numberDecimalKeyPress(evt, txtPrecioPlato);
    }//GEN-LAST:event_txtPrecioPlatoKeyTyped

    private void btnGuardarPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPlatoActionPerformed
        // TODO add your handling code here:
        if (!"".equals(txtNombrePlato.getText()) || !"".equals(txtPrecioPlato.getText())) {
            pla.setNombre(txtNombrePlato.getText());
            pla.setPrecio(Double.parseDouble(txtPrecioPlato.getText()));
            pla.setFecha(fechaFormato);
////            if (plaDao.Registrar(pla)) {
//                JOptionPane.showMessageDialog(null, "Plato Registrado");
//                LimpiarTable();
//                ListarPlatos(TablePlatos);
//                LimpiarPlatos();
//            }

        } else {
            JOptionPane.showMessageDialog(null, "Los campos estan vacios");
        }
    }//GEN-LAST:event_btnGuardarPlatoActionPerformed

    private void btnEditarPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPlatoActionPerformed
        // TODO add your handling code here:
        if ("".equals(txtIdPlato.getText())) {
            JOptionPane.showMessageDialog(null, "Seleecione una fila");
        } else {
            if (!"".equals(txtNombrePlato.getText()) || !"".equals(txtPrecioPlato.getText())) {
                pla.setNombre(txtNombrePlato.getText());
                pla.setPrecio(Double.parseDouble(txtPrecioPlato.getText()));
                pla.setId(Integer.parseInt(txtIdPlato.getText()));
//                if (plaDao.Modificar(pla)) {
//                    JOptionPane.showMessageDialog(null, "Plato Modificado");
//                    LimpiarTable();
//                    ListarPlatos(TablePlatos);
//                    LimpiarPlatos();
//                }

            }
        }
    }//GEN-LAST:event_btnEditarPlatoActionPerformed

    private void btnEliminarPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPlatoActionPerformed
        // TODO add your handling code here:
        if (!"".equals(txtIdPlato.getText())) {
            int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar");
            if (pregunta == 0) {
                int id = Integer.parseInt(txtIdPlato.getText());
//                plaDao.Eliminar(id);
                LimpiarTable();
                LimpiarPlatos();
                ListarPlatos(TablePlatos);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una fila");
        }
    }//GEN-LAST:event_btnEliminarPlatoActionPerformed

    private void btnNuevoPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPlatoActionPerformed
        // TODO add your handling code here:
        LimpiarPlatos();
    }//GEN-LAST:event_btnNuevoPlatoActionPerformed

    private void TablePlatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePlatosMouseClicked
        // TODO add your handling code here:
        int fila = TablePlatos.rowAtPoint(evt.getPoint());
        txtIdPlato.setText(TablePlatos.getValueAt(fila, 0).toString());
        txtNombrePlato.setText(TablePlatos.getValueAt(fila, 1).toString());
        txtPrecioPlato.setText(TablePlatos.getValueAt(fila, 2).toString());
    }//GEN-LAST:event_TablePlatosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelVendedor;
    private javax.swing.JPanel PanelMesas;
    private javax.swing.JPanel PanelSalas;
    private javax.swing.JTable TablePedidos;
    private javax.swing.JTable TablePlatos;
    public javax.swing.JTable TableUsuarios;
    private javax.swing.JButton btnActualizarConfig;
    private javax.swing.JButton btnActualizarSala;
    private javax.swing.JButton btnAddPlato;
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnEditarPlato;
    private javax.swing.JButton btnEliminarPlato;
    private javax.swing.JButton btnEliminarSala;
    private javax.swing.JButton btnEliminarTempPlato;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnGenerarPedido;
    private javax.swing.JButton btnGuardarPlato;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnNuevoPlato;
    private javax.swing.JButton btnNuevoSala;
    private javax.swing.JButton btnPdfPedido;
    private javax.swing.JButton btnPlatos;
    private javax.swing.JButton btnRegistrarSala;
    private javax.swing.JButton btnSala;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVentas;
    private javax.swing.JComboBox<String> cbxRol;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel P_Opciones;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel P_Usuarios;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel P_Platos_del_dia;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel P_Recibo;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel P_Salas;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel P_Historial_Pedidos;
    private javax.swing.JPanel P_Datos_Empresa;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane Opciones_de_Paneles;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JTable tableFinalizar;
    private javax.swing.JTable tableMenu;
    private javax.swing.JTable tableSala;
    private javax.swing.JTable tblTemPlatos;
    private javax.swing.JLabel tipo;
    private javax.swing.JLabel totalFinalizar;
    private javax.swing.JLabel totalMenu;
    private javax.swing.JTextField txtBuscarPlato;
    private javax.swing.JTextPane txtComentario;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccionConfig;
    private javax.swing.JTextField txtFechaHora;
    private javax.swing.JTextField txtIdConfig;
    private javax.swing.JTextField txtIdHistorialPedido;
    private javax.swing.JTextField txtIdPedido;
    private javax.swing.JTextField txtIdPlato;
    private javax.swing.JTextField txtIdSala;
    private javax.swing.JTextField txtMensaje;
    private javax.swing.JTextField txtMesas;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreConfig;
    private javax.swing.JTextField txtNombrePlato;
    private javax.swing.JTextField txtNombreSala;
    private javax.swing.JTextField txtNumMesaFinalizar;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtPrecioPlato;
    private javax.swing.JTextField txtRucConfig;
    private javax.swing.JTextField txtSalaFinalizar;
    private javax.swing.JTextField txtTelefonoConfig;
    private javax.swing.JTextField txtTempIdSala;
    private javax.swing.JTextField txtTempNumMesa;
    // End of variables declaration//GEN-END:variables

    private void TotalPagar(JTable tabla, JLabel label) {
        Totalpagar = 0.00;
        int numFila = tabla.getRowCount();
        for (int i = 0; i < numFila; i++) {
            double cal = Double.parseDouble(String.valueOf(tabla.getModel().getValueAt(i, 4)));
            Totalpagar += cal;
        }
        label.setText(String.format("%.2f", Totalpagar));
    }

    private void LimpiarTableMenu() {
        tmp = (DefaultTableModel) tableMenu.getModel();
        int fila = tableMenu.getRowCount();
        for (int i = 0; i < fila; i++) {
            tmp.removeRow(0);
        }
    }

    public void ListarConfig() {
//        conf = lgDao.datosEmpresa();
        txtIdConfig.setText("" + conf.getId());
        txtRucConfig.setText("" + conf.getRuc());
        txtNombreConfig.setText("" + conf.getNombre());
        txtTelefonoConfig.setText("" + conf.getTelefono());
        txtDireccionConfig.setText("" + conf.getDireccion());
        txtMensaje.setText("" + conf.getMensaje());
    }

    private void ListarPedidos() {
        mesa color = new mesa();
//        List<pedido> Listar = pedDao.listarPedidos();
        modelo = (DefaultTableModel) TablePedidos.getModel();
        Object[] ob = new Object[7];
//        for (int i = 0; i < Listar.size(); i++) {
//            ob[0] = Listar.get(i).getId();
//            ob[1] = Listar.get(i).getSala();
//            ob[2] = Listar.get(i).getUsuario();
//            ob[3] = Listar.get(i).getNum_mesa();
//            ob[4] = Listar.get(i).getFecha();
//            ob[5] = Listar.get(i).getTotal();
//            ob[6] = Listar.get(i).getEstado();
//            modelo.addRow(ob);
//        }
        colorHeader(TablePedidos);
        TablePedidos.setDefaultRenderer(Object.class, color);
    }

    public void LimpiarTable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    private void ListarUsuarios() {
//        List<login> Listar = lgDao.ListarUsuarios();
        modelo = (DefaultTableModel) TableUsuarios.getModel();
        Object[] ob = new Object[4];
//        for (int i = 0; i < Listar.size(); i++) {
//            ob[0] = Listar.get(i).getId();
//            ob[1] = Listar.get(i).getNombre();
//            ob[2] = Listar.get(i).getCorreo();
//            ob[3] = Listar.get(i).getRol();
//            modelo.addRow(ob);
//        }
        colorHeader(TableUsuarios);
    }

    private void ListarSalas() {
//        List<salas> Listar = slDao.Listar();
        modelo = (DefaultTableModel) tableSala.getModel();
        Object[] ob = new Object[3];
//        for (int i = 0; i < Listar.size(); i++) {
//            ob[0] = Listar.get(i).getId();
//            ob[1] = Listar.get(i).getNombre();
//            ob[2] = Listar.get(i).getMesas();
//            modelo.addRow(ob);
//        }
        colorHeader(tableSala);
    }

    private void colorHeader(JTable tabla) {
        tabla.setModel(modelo);
        JTableHeader header = tabla.getTableHeader();
        header.setOpaque(false);
        header.setBackground(new Color(0, 110, 255));
        header.setForeground(Color.white);
    }

    private void LimpiarSala() {
        txtIdSala.setText("");
        txtNombreSala.setText("");
        txtMesas.setText("");
    }

    private void LimpiarPlatos() {
        txtIdPlato.setText("");
        txtNombrePlato.setText("");
        txtPrecioPlato.setText("");
    }

    private void panelSalas() {
//        List<salas> Listar = slDao.Listar();
//        for (int i = 0; i < Listar.size(); i++) {
//            int id = Listar.get(i).getId();
//            int cantidad = Listar.get(i).getMesas();
//            JButton boton = new JButton(Listar.get(i).getNombre(), new ImageIcon(getClass().getResource("/Imagenes/salas.png")));
//            boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
//            boton.setHorizontalTextPosition(JButton.CENTER);
//            boton.setVerticalTextPosition(JButton.BOTTOM);
//            boton.setBackground(new Color(204, 204, 204));
//            PanelSalas.add(boton);
//            boton.addActionListener((ActionEvent e) -> {
//                LimpiarTable();
//                PanelMesas.removeAll();
//                panelMesas(id, cantidad);
//                jTabbedPane1.setSelectedIndex(2);
//            });
//        }
    }

    //crear mesas
    private void panelMesas(int id_sala, int cant) {
        for (int i = 1; i <= cant; i++) {
            int num_mesa = i;
            //verificar estado
            JButton boton = new JButton("MESA N°: " + i, new ImageIcon(getClass().getResource("/Imagenes/mesa.png")));
            boton.setHorizontalTextPosition(JButton.CENTER);
            boton.setVerticalTextPosition(JButton.BOTTOM);
//            int verificar = pedDao.verificarStado(num_mesa, id_sala);
//            if (verificar > 0) {
//                boton.setBackground(new Color(255, 51, 51));
//            } else {
//                boton.setBackground(new Color(0, 102, 102));
//            }
            boton.setForeground(Color.WHITE);
            boton.setFocusable(false);
            boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            PanelMesas.add(boton);
            boton.addActionListener((ActionEvent e) -> {
//                if (verificar > 0) {
//                    LimpiarTable();
//                    verPedido(verificar);
//                    verPedidoDetalle(verificar);
//                    btnFinalizar.setEnabled(true);
//                    btnPdfPedido.setEnabled(false);
//                    jTabbedPane1.setSelectedIndex(4);
//                } else {
//                    LimpiarTable();
//                    ListarPlatos(tblTemPlatos);
//                    jTabbedPane1.setSelectedIndex(3);
//                    txtTempIdSala.setText("" + id_sala);
//                    txtTempNumMesa.setText("" + num_mesa);
//                }
            });
        }
    }

    // platos
    private void ListarPlatos(JTable tabla) {
//        List<platos> Listar = plaDao.Listar(txtBuscarPlato.getText(), fechaFormato);
        modelo = (DefaultTableModel) tabla.getModel();
        Object[] ob = new Object[3];
//        for (int i = 0; i < Listar.size(); i++) {
//            ob[0] = Listar.get(i).getId();
//            ob[1] = Listar.get(i).getNombre();
//            ob[2] = Listar.get(i).getPrecio();
//            modelo.addRow(ob);
//        }
        colorHeader(tabla);
    }

    //registrar pedido
    private void RegistrarPedido() {
        int id_sala = Integer.parseInt(txtTempIdSala.getText());
        int num_mesa = Integer.parseInt(txtTempNumMesa.getText());
        double monto = Totalpagar;
        ped.setId_sala(id_sala);
        ped.setNum_mesa(num_mesa);
        ped.setTotal(monto);
        ped.setUsuario(LabelVendedor.getText());
//        pedDao.RegistrarPedido(ped);
    }

    private void detallePedido() {
//        int id = pedDao.IdPedido();
        for (int i = 0; i < tableMenu.getRowCount(); i++) {
            String nombre = tableMenu.getValueAt(i, 1).toString();
            int cant = Integer.parseInt(tableMenu.getValueAt(i, 2).toString());
            double precio = Double.parseDouble(tableMenu.getValueAt(i, 3).toString());
            detPedido.setNombre(nombre);
            detPedido.setCantidad(cant);
            detPedido.setPrecio(precio);
            detPedido.setComentario(tableMenu.getValueAt(i, 5).toString());
//            detPedido.setId_pedido(id);
//            pedDao.RegistrarDetalle(detPedido);
        }
    }

    public void verPedidoDetalle(int id_pedido) {
//        List<itemPedido> Listar = pedDao.verPedidoDetalle(id_pedido);
        modelo = (DefaultTableModel) tableFinalizar.getModel();
        Object[] ob = new Object[6];
//        for (int i = 0; i < Listar.size(); i++) {
//            ob[0] = Listar.get(i).getId();
//            ob[1] = Listar.get(i).getNombre();
//            ob[2] = Listar.get(i).getCantidad();
//            ob[3] = Listar.get(i).getPrecio();
//            ob[4] = Listar.get(i).getCantidad() * Listar.get(i).getPrecio();
//            ob[5] = Listar.get(i).getComentario();
//            modelo.addRow(ob);
//        }
        colorHeader(tableFinalizar);
    }

    public void verPedido(int id_pedido) {
//        ped = pedDao.verPedido(id_pedido);
        totalFinalizar.setText("" + ped.getTotal());
        txtFechaHora.setText("" + ped.getFecha());
        txtSalaFinalizar.setText("" + ped.getSala());
        txtNumMesaFinalizar.setText("" + ped.getNum_mesa());
        txtIdPedido.setText("" + ped.getId());
    }

}
