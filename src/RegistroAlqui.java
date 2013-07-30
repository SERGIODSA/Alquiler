import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

public class RegistroAlqui extends javax.swing.JFrame {
    Image cd;
    String sql;
    Conexion cxn;
    String ced;
    String fecha;
    String peliculas[];
    String datospeliculas[];
    int numeroColumnas;
    int mouse;
    int totalbs=0;
    int numpeliculas=0;
    ResultSet busquedapelicula;
    ResultSet busquedacantidad;
    ResultSet busquedacliente;
    ResultSetMetaData metaDatos;
    DefaultListModel modelo;
    LinkedList idpelis;
    LinkedList pelis;
    LinkedList precios;
    LinkedList cantidades;
    Manejofechas formatofecha;
    public RegistroAlqui() {
        initComponents();
        setLocationRelativeTo(null);
        cd = Toolkit.getDefaultToolkit().getImage("src/Imagenes/cd.png");
        this.setIconImage(cd);
        cxn = new Conexion();
        formatofecha = new Manejofechas();
        modelo = new DefaultListModel();
        idpelis = new LinkedList();
        pelis = new LinkedList();
        precios = new LinkedList();
        cantidades = new LinkedList();
        fechas();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pregunta = new javax.swing.JDialog();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        aceptar5 = new javax.swing.JButton();
        cancelar5 = new javax.swing.JButton();
        error = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        aceptar3 = new javax.swing.JButton();
        error2 = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        aceptar4 = new javax.swing.JButton();
        informacion = new javax.swing.JDialog();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        registrar2 = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        error3 = new javax.swing.JDialog();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        aceptar6 = new javax.swing.JButton();
        jEImagePanel1 = new JEImagePanel();
        atras = new javax.swing.JButton();
        Panel = new javax.swing.JDesktopPane();
        jLabel9 = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        aceptar2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dia = new javax.swing.JComboBox();
        mes = new javax.swing.JComboBox();
        ano = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        borrar2 = new javax.swing.JButton();
        finalizar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();
        borrar = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        pelicula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        cantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        subtotal = new javax.swing.JTextField();
        numero = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        venta = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        pregunta.setMinimumSize(new java.awt.Dimension(280, 140));
        pregunta.setModal(true);
        pregunta.setResizable(false);
        pregunta.getContentPane().setLayout(null);

        jLabel19.setText("¿Esta seguro que desea realizar");
        pregunta.getContentPane().add(jLabel19);
        jLabel19.setBounds(60, 10, 210, 14);

        jLabel20.setText(" esta operacion?");
        pregunta.getContentPane().add(jLabel20);
        jLabel20.setBounds(90, 30, 160, 14);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-question.png"))); // NOI18N
        pregunta.getContentPane().add(jLabel21);
        jLabel21.setBounds(20, 10, 32, 30);

        aceptar5.setText("Aceptar");
        aceptar5.setFocusPainted(false);
        aceptar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar5ActionPerformed(evt);
            }
        });
        pregunta.getContentPane().add(aceptar5);
        aceptar5.setBounds(30, 60, 90, 30);

        cancelar5.setText("Cancelar");
        cancelar5.setFocusPainted(false);
        cancelar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar5ActionPerformed(evt);
            }
        });
        pregunta.getContentPane().add(cancelar5);
        cancelar5.setBounds(150, 60, 90, 30);

        error.setMinimumSize(new java.awt.Dimension(310, 140));
        error.setModal(true);
        error.getContentPane().setLayout(null);

        jLabel5.setText("ID incorrecto, no existente o no disponible");
        error.getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 20, 240, 14);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-error.png"))); // NOI18N
        error.getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 10, 32, 40);

        aceptar3.setText("Aceptar");
        aceptar3.setFocusPainted(false);
        aceptar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar3ActionPerformed(evt);
            }
        });
        error.getContentPane().add(aceptar3);
        aceptar3.setBounds(110, 50, 80, 30);

        error2.setMaximumSize(new java.awt.Dimension(260, 130));
        error2.setMinimumSize(new java.awt.Dimension(260, 130));
        error2.setModal(true);
        error2.setPreferredSize(new java.awt.Dimension(260, 130));
        error2.setResizable(false);
        error2.getContentPane().setLayout(null);

        jLabel11.setText("Existe uno o mas campos vacios");
        error2.getContentPane().add(jLabel11);
        jLabel11.setBounds(50, 20, 210, 14);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-error.png"))); // NOI18N
        error2.getContentPane().add(jLabel15);
        jLabel15.setBounds(10, 10, 32, 40);

        aceptar4.setText("Aceptar");
        aceptar4.setFocusPainted(false);
        aceptar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar4ActionPerformed(evt);
            }
        });
        error2.getContentPane().add(aceptar4);
        aceptar4.setBounds(80, 50, 90, 30);

        informacion.setMinimumSize(new java.awt.Dimension(300, 140));
        informacion.setModal(true);
        informacion.setResizable(false);
        informacion.getContentPane().setLayout(null);

        jLabel16.setText("El cliente no se encuentra registrado");
        informacion.getContentPane().add(jLabel16);
        jLabel16.setBounds(60, 20, 230, 14);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-info.png"))); // NOI18N
        informacion.getContentPane().add(jLabel17);
        jLabel17.setBounds(20, 10, 32, 32);

        registrar2.setText("Registrar");
        registrar2.setFocusPainted(false);
        registrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar2ActionPerformed(evt);
            }
        });
        informacion.getContentPane().add(registrar2);
        registrar2.setBounds(40, 60, 90, 30);

        cancelar.setText("Cancelar");
        cancelar.setFocusPainted(false);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        informacion.getContentPane().add(cancelar);
        cancelar.setBounds(160, 60, 90, 30);

        error3.setMaximumSize(new java.awt.Dimension(270, 140));
        error3.setMinimumSize(new java.awt.Dimension(270, 140));
        error3.setModal(true);
        error3.setPreferredSize(new java.awt.Dimension(270, 140));
        error3.setResizable(false);
        error3.getContentPane().setLayout(null);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-error.png"))); // NOI18N
        error3.getContentPane().add(jLabel22);
        jLabel22.setBounds(10, 10, 40, 40);

        jLabel23.setText("Fecha erronea");
        error3.getContentPane().add(jLabel23);
        jLabel23.setBounds(50, 20, 140, 14);

        aceptar6.setText("Aceptar");
        aceptar6.setFocusPainted(false);
        aceptar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar6ActionPerformed(evt);
            }
        });
        error3.getContentPane().add(aceptar6);
        aceptar6.setBounds(80, 50, 90, 30);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de alquiler");
        setBounds(new java.awt.Rectangle(270, 110, 0, 0));
        setResizable(false);

        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.png"))); // NOI18N
        jEImagePanel1.setLayout(null);

        atras.setText("Atras");
        atras.setFocusPainted(false);
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jEImagePanel1.add(atras);
        atras.setBounds(440, 680, 70, 30);

        Panel.setBackground(new java.awt.Color(175, 213, 240));
        Panel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 153)));

        jLabel9.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Registro ALQUILER");
        jLabel9.setBounds(109, 10, 251, 25);
        Panel.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane2.setBackground(new java.awt.Color(175, 213, 240));
        jDesktopPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)), "Informacion del Cliente"));

        aceptar2.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        aceptar2.setText("Aceptar");
        aceptar2.setEnabled(false);
        aceptar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar2ActionPerformed(evt);
            }
        });
        aceptar2.setBounds(180, 30, 100, 30);
        jDesktopPane2.add(aceptar2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Cedula:");
        jLabel3.setBounds(20, 30, 52, 30);
        jDesktopPane2.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
        });
        cedula.setBounds(80, 30, 80, 30);
        jDesktopPane2.add(cedula, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Fecha:");
        jLabel2.setBounds(20, 70, 60, 30);
        jDesktopPane2.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        dia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dia.setBounds(100, 70, 40, 30);
        jDesktopPane2.add(dia, javax.swing.JLayeredPane.DEFAULT_LAYER);

        mes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        mes.setBounds(160, 70, 40, 30);
        jDesktopPane2.add(mes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ano.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        ano.setBounds(220, 70, 60, 30);
        jDesktopPane2.add(ano, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("-");
        jLabel7.setBounds(200, 70, 20, 30);
        jDesktopPane2.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("-");
        jLabel8.setBounds(140, 70, 20, 30);
        jDesktopPane2.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane2.setBounds(30, 40, 300, 120);
        Panel.add(jDesktopPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane1.setBackground(new java.awt.Color(175, 213, 240));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)), "Informacion de peliculas"));

        borrar2.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        borrar2.setText("Borrar Pelicula");
        borrar2.setEnabled(false);
        borrar2.setFocusPainted(false);
        borrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrar2ActionPerformed(evt);
            }
        });
        borrar2.setBounds(20, 350, 170, 40);
        jDesktopPane1.add(borrar2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        finalizar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        finalizar.setText("Finalizar Seleccion");
        finalizar.setEnabled(false);
        finalizar.setFocusPainted(false);
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
        });
        finalizar.setBounds(220, 350, 170, 40);
        jDesktopPane1.add(finalizar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaMouseClicked(evt);
            }
        });
        lista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(lista);

        jScrollPane4.setBounds(20, 210, 370, 80);
        jDesktopPane1.add(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        borrar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        borrar.setText("Borrar Busqueda");
        borrar.setEnabled(false);
        borrar.setFocusPainted(false);
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        borrar.setBounds(220, 160, 170, 40);
        jDesktopPane1.add(borrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        agregar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        agregar.setText("Agregar Pelicula");
        agregar.setEnabled(false);
        agregar.setFocusPainted(false);
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        agregar.setBounds(20, 160, 170, 40);
        jDesktopPane1.add(agregar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        pelicula.setEditable(false);
        pelicula.setEnabled(false);
        pelicula.setBounds(90, 80, 300, 30);
        jDesktopPane1.add(pelicula, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Pelicula:");
        jLabel1.setBounds(20, 80, 70, 30);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Precio:");
        jLabel6.setBounds(20, 120, 70, 30);
        jDesktopPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        precio.setEditable(false);
        precio.setEnabled(false);
        precio.setBounds(90, 120, 100, 30);
        jDesktopPane1.add(precio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cantidad.setEditable(false);
        cantidad.setEnabled(false);
        cantidad.setBounds(310, 120, 80, 30);
        jDesktopPane1.add(cantidad, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Codigo de la Pelicula:");
        jLabel4.setBounds(20, 30, 170, 30);
        jDesktopPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        codigo.setEditable(false);
        codigo.setEnabled(false);
        codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoKeyTyped(evt);
            }
        });
        codigo.setBounds(180, 30, 100, 30);
        jDesktopPane1.add(codigo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buscar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        buscar.setText("Buscar");
        buscar.setEnabled(false);
        buscar.setFocusPainted(false);
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        buscar.setBounds(290, 30, 100, 30);
        jDesktopPane1.add(buscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSeparator1.setBounds(20, 70, 370, 10);
        jDesktopPane1.add(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Cantidad:");
        jLabel12.setBounds(220, 120, 70, 30);
        jDesktopPane1.add(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        subtotal.setEditable(false);
        subtotal.setBounds(329, 300, 60, 30);
        jDesktopPane1.add(subtotal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        numero.setEditable(false);
        numero.setBounds(120, 300, 70, 30);
        jDesktopPane1.add(numero, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Total Bsf.:");
        jLabel13.setBounds(230, 300, 90, 30);
        jDesktopPane1.add(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Nº Peliculas:");
        jLabel14.setBounds(20, 300, 90, 30);
        jDesktopPane1.add(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane1.setBounds(30, 170, 420, 410);
        Panel.add(jDesktopPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        venta.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        venta.setText("Registrar Alquiler");
        venta.setEnabled(false);
        venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventaActionPerformed(evt);
            }
        });
        venta.setBounds(150, 590, 170, 40);
        Panel.add(venta, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CD-ROM.png"))); // NOI18N
        jLabel18.setBounds(360, 60, 80, 90);
        Panel.add(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jEImagePanel1.add(Panel);
        Panel.setBounds(30, 20, 480, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jEImagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
    this.setVisible(false);
    new menuAlquiler().setVisible(true);
}//GEN-LAST:event_atrasActionPerformed

private void fechas(){
    fecha = formatofecha.fecha();
    String desgloce[] = fecha.split("-");
    ano.setSelectedItem(desgloce[2]);
    mes.setSelectedItem(desgloce[1]);
    dia.setSelectedItem(desgloce[0]); 
} 

private void activacion(Boolean opcion){
    agregar.setEnabled(opcion);
    borrar.setEnabled(opcion);
    buscar.setEnabled(!opcion);
    codigo.setEditable(!opcion);
    pelicula.setEnabled(opcion);
    cantidad.setEnabled(opcion);
    precio.setEnabled(opcion);
}

    private void aceptar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar2ActionPerformed
        int clientess = 0;
        sql = "SELECT COUNT(Cedula) FROM peliculas.clientes WHERE Cedula='" + cedula.getText() + "'";
        busquedacliente = cxn.Consulta(sql);
        try {
            metaDatos = busquedacliente.getMetaData();
            numeroColumnas = metaDatos.getColumnCount();
            while (busquedacliente.next()) {
                clientess = Integer.parseInt(busquedacliente.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaAlquiler.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (clientess == 0) {
            informacion.setLocationRelativeTo(null);
            informacion.getContentPane().setBackground(new Color(222, 222, 222));
            informacion.setVisible(true);
        } 
        else{
            if((dia.getSelectedItem().toString().equalsIgnoreCase("..."))
                    || (mes.getSelectedItem().toString().equalsIgnoreCase("..."))
                    || (ano.getSelectedItem().toString().equalsIgnoreCase("..."))) {
                error2.setLocationRelativeTo(null);
                error2.getContentPane().setBackground(new Color(222, 222, 222));
                error2.setVisible(true);
            } 
            else{
                fecha = ano.getSelectedItem().toString()+"-"+mes.getSelectedItem().toString()+"-"+dia.getSelectedItem().toString();
                Boolean band = formatofecha.formato(fecha);
                if(band==false){
                    codigo.setEnabled(true);
                    codigo.setEditable(true);
                    buscar.setEnabled(true);
                    dia.setEnabled(false);
                    mes.setEnabled(false);
                    ano.setEnabled(false);
                    cedula.setEditable(false);
                    aceptar2.setEnabled(false);
                    ced = cedula.getText();
                }
                else{
                    error3.setLocationRelativeTo(null);
                    error3.getContentPane().setBackground(new Color(222,222,222));
                    error3.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_aceptar2ActionPerformed

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped
        int limite = 8;
        char C = evt.getKeyChar();
        if (((C < '0') || (C > '9')) || ((cedula.getText().length() == limite))) {
            evt.consume();
        }
        if (cedula.getText().length() == 7) {
            aceptar2.setEnabled(true);
        }
        if (cedula.getText().length() < 7) {
            aceptar2.setEnabled(false);
        }
    }//GEN-LAST:event_cedulaKeyTyped

    private void borrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar2ActionPerformed
        buscar.setEnabled(true);
        codigo.setEditable(true);
        int cant = idpelis.size();
        for (int i = 0; i < cant; i++) {
            if (pelis.get(i).toString().equals(lista.getModel().getElementAt(lista.getSelectedIndex()).toString())) {
                cant = i;
            }
        }
        totalbs = totalbs - Integer.parseInt(precios.get(cant).toString());
        subtotal.setText(Integer.toString(totalbs));
        numpeliculas = numpeliculas-1;
        numero.setText(Integer.toString(numpeliculas));
        cantidades.set(cant,Integer.parseInt(cantidades.get(cant).toString())+1);
        modelo.removeElementAt(mouse);
        lista.setModel(modelo);
        borrar2.setEnabled(false);
        if (numpeliculas == 0) {
            finalizar.setEnabled(false);
        }
    }//GEN-LAST:event_borrar2ActionPerformed

    private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed
        finalizar.setEnabled(false);
        borrar2.setEnabled(false);
        codigo.setText("");
        codigo.setEditable(false);
        buscar.setEnabled(false);
        agregar.setEnabled(false);
        borrar.setEnabled(false);
        lista.setEnabled(false);
        borrar2.setEnabled(false);
        venta.setEnabled(true);
    }//GEN-LAST:event_finalizarActionPerformed

    private void listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseClicked
        if (evt.getClickCount() > 0) {
            mouse = lista.locationToIndex(evt.getPoint());
            borrar2.setEnabled(true);
        }
    }//GEN-LAST:event_listaMouseClicked

    private void listaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaValueChanged
        lista.setSelectionMode(0);
    }//GEN-LAST:event_listaValueChanged

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        codigo.setText("");
        pelicula.setText("");
        cantidad.setText("");
        precio.setText("");
        activacion(false);
    }//GEN-LAST:event_borrarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        int aux = Integer.parseInt(cantidad.getText());
        aux = aux - 1;
        int cant = idpelis.size();
        for (int i = 0; i < cant; i++) {
            if (idpelis.get(i).toString().equals(codigo.getText())) {
                cant = i;
            }
        }
        cantidades.set(cant, aux);
        totalbs = totalbs + Integer.parseInt(precio.getText());
        subtotal.setText(Integer.toString(totalbs));
        numpeliculas = numpeliculas + 1;
        numero.setText(Integer.toString(numpeliculas));
        finalizar.setEnabled(true);
        agregar.setEnabled(false);
        borrar.setEnabled(false);
        modelo.addElement(pelicula.getText());
        lista.setModel(modelo);
        codigo.setText("");
        pelicula.setText("");
        cantidad.setText("");
        precio.setText("");
        activacion(false);
    }//GEN-LAST:event_agregarActionPerformed

    private void codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyTyped
        int limite = 7;
        char C = evt.getKeyChar();
        if (((C < '0') || (C > '9')) || ((codigo.getText().length() == limite))) {
            evt.consume();
        }
    }//GEN-LAST:event_codigoKeyTyped

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        String idpel = null;
        Boolean existe = false;
        int cant = idpelis.size();
        for (int i = 0; i < cant; i++) {
            idpel = idpelis.get(i).toString();
            if (idpel.equals(codigo.getText())) {
                existe = true;
                cant = i;
            }
        }
        if (existe == false) {
            sql = "SELECT Titulo,Precio,Cantidad FROM peliculas.peliculas WHERE idPelicula='"+codigo.getText()+"' AND Uso='Alquiler' AND Condicion='Buena'";
            busquedapelicula = cxn.Consulta(sql);
            try {
                metaDatos = busquedapelicula.getMetaData();
                numeroColumnas = metaDatos.getColumnCount();
                peliculas = new String[numeroColumnas];
                while (busquedapelicula.next()) {
                    for (int i = 0; i < numeroColumnas; i++) {
                        peliculas[i] = busquedapelicula.getString(i + 1);
                    }
                }
            } 
            catch (SQLException ex) {
                Logger.getLogger(ConsultaAlquiler.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (peliculas[0] == null) {
                error.setLocationRelativeTo(null);
                error.getContentPane().setBackground(new Color(222, 222, 222));
                error.setVisible(true);
            } 
            else{
                if(Integer.parseInt(peliculas[2]) == 0) {
                    error.setLocationRelativeTo(null);
                    error.getContentPane().setBackground(new Color(222, 222, 222));
                    error.setVisible(true);
                } 
                else{
                    activacion(true);
                    idpelis.add(codigo.getText());
                    pelis.add(peliculas[0]);
                    precios.add(peliculas[1]);
                    cantidades.add(peliculas[2]);
                    pelicula.setText(peliculas[0]);
                    precio.setText(peliculas[1]);
                    cantidad.setText(peliculas[2]);
                }
            }
        } 
        else{
            if(Integer.parseInt(cantidades.get(cant).toString()) == 0) {
                error.setLocationRelativeTo(null);
                error.getContentPane().setBackground(new Color(222, 222, 222));
                error.setVisible(true);
            } 
            else{
                activacion(true);
                pelicula.setText(pelis.get(cant).toString());
                precio.setText(precios.get(cant).toString());
                cantidad.setText(cantidades.get(cant).toString());
            }
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventaActionPerformed
        pregunta.setLocationRelativeTo(null);
        pregunta.getContentPane().setBackground(new Color(222, 222, 222));
        pregunta.setVisible(true);
    }//GEN-LAST:event_ventaActionPerformed

    private void aceptar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar3ActionPerformed
        error.setVisible(false);  
    }//GEN-LAST:event_aceptar3ActionPerformed

    private void aceptar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar4ActionPerformed
        error2.setVisible(false);
    }//GEN-LAST:event_aceptar4ActionPerformed

    private void registrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar2ActionPerformed
        informacion.setVisible(false);
        this.setVisible(false);
        new RegistroCliente().setVisible(true);
    }//GEN-LAST:event_registrar2ActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        cedula.setText("");
        dia.setSelectedIndex(0);
        mes.setSelectedIndex(0);
        ano.setSelectedIndex(0);
        aceptar2.setEnabled(false);
        informacion.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    private void cancelar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar5ActionPerformed
        pregunta.setVisible(false);
    }//GEN-LAST:event_cancelar5ActionPerformed
  
    private void aceptar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar5ActionPerformed
        String cantidadd = null;
        int cantidadd1 = 0;
        int cantidadd2 = 0;
        int alquilado = 0;
        int veces = 0;
        int tamanolista = idpelis.size();
        for(int i=0;i<tamanolista;i++){     
            // busco cuantas peliculas hay en almacen
            ResultSet busquedacantidad2;
            sql = "SELECT Cantidad,Veces_Alquilada FROM peliculas.peliculas WHERE idPelicula='"+idpelis.get(i)+"'";
            busquedacantidad2 = cxn.Consulta(sql);
            try{ 
                while (busquedacantidad2.next()){
                    cantidadd1 = Integer.parseInt(busquedacantidad2.getString(1));
                    veces = Integer.parseInt(busquedacantidad2.getString(2));
                }
            }
            catch(SQLException ex) {
                Logger.getLogger(ConsultaAlquiler.class.getName()).log(Level.SEVERE, null, ex);
            }
            cantidadd = cantidades.get(i).toString();
            cantidadd2 = Integer.parseInt(cantidadd);
            alquilado = cantidadd1-cantidadd2;
            veces = veces + alquilado;
            
            // resta peliculas alquiladas a las del almacen
            sql = "UPDATE peliculas.peliculas SET Cantidad='"+Integer.toString(cantidadd2)+"',Veces_Alquilada='"+Integer.toString(veces)+"' "
                 +"WHERE idPelicula='"+idpelis.get(i)+"'";
            cxn.Ejecutar(sql);
            
            // obtengo informacion de pelicula para registrar las peliculas alquiladas
            if(alquilado>0){
                ResultSet peliculavendida;
                ResultSet verificar;
                int can=0;
                sql = "SELECT Titulo,Año,Genero,Censura,Reparto,Uso,Condicion,Cantidad,Precio,Veces_Alquilada,Distribuidor,"
                    +"Precio_Pedido,Fecha_Solicitud,Fecha_Esperada,Fecha_Entrega,Estatus FROM peliculas.peliculas WHERE "
                    +"idPelicula='"+idpelis.get(i)+"'";
                peliculavendida = cxn.Consulta(sql);
                verificar = cxn.Consulta("SELECT Cantidad,Veces_Alquilada FROM peliculas.peliculas WHERE idAuxiliar='"+idpelis.get(i)+"' AND Estatus='Alquilada'");
                try{ 
                    metaDatos = peliculavendida.getMetaData();
                    numeroColumnas = metaDatos.getColumnCount();  
                    datospeliculas = new String[numeroColumnas];
                    while (peliculavendida.next()){
                        for (int k=0;k<numeroColumnas;k++){
                            datospeliculas[k]= peliculavendida.getString(k+1);
                        }
                    }
                    while (verificar.next())
                        can = Integer.parseInt(verificar.getString(1));
                }
                catch(SQLException ex) {
                    Logger.getLogger(ConsultaAlquiler.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(can==0){
                    sql = "INSERT INTO peliculas.peliculas (Titulo,Año,Genero,Censura,Reparto,Uso,Condicion,Cantidad,Precio,"
                        +"Veces_Alquilada,Distribuidor,Precio_Pedido,Fecha_Solicitud,Fecha_Esperada,Fecha_Entrega,Estatus,idAuxiliar,Registro) "
                        +"VALUES ('"+datospeliculas[0]+"','"+datospeliculas[1]+"','"+datospeliculas[2]+"','"+datospeliculas[3]+"',"
                        +"'"+datospeliculas[4]+"','"+datospeliculas[5]+"','"+datospeliculas[6]+"','"+alquilado+"',"
                        +"'"+datospeliculas[8]+"','0','"+datospeliculas[10]+"','"+datospeliculas[11]+"',"
                        +"'"+datospeliculas[12]+"','"+datospeliculas[13]+"','"+datospeliculas[14]+"','Alquilada','"+idpelis.get(i)+"','Vigente')";
                    cxn.Ejecutar(sql);
                }
                else{
                    can = can + alquilado;
                    sql = "UPDATE peliculas.peliculas SET Cantidad='0' WHERE idAuxiliar='"+idpelis.get(i)+"' AND Estatus='Alquilada'";
                    cxn.Ejecutar(sql);
                }
                
                // registrar alquiler  
                for (int j=0;j<alquilado;j++){
                    sql = "INSERT INTO peliculas.alquiler (idPelicula,Cedula,Fecha_Alquiler) VALUES "
                         +"('"+idpelis.get(i)+"','"+ced+"','"+fecha+"')";
                    cxn.Ejecutar(sql);
                }
            }  
        }
        // sumo cantidad de peliculas alquiladas de este cliente
        int cant=0;
        ResultSet pelalcli;
        sql = "SELECT Num_Peliculas_Alq FROM peliculas.clientes WHERE Cedula='"+cedula.getText()+"'";
        pelalcli = cxn.Consulta(sql);
        try{
            while (pelalcli.next())
                cant = Integer.parseInt(pelalcli.getString(1));
        } 
        catch (SQLException ex) {
            Logger.getLogger(RegistroAlqui.class.getName()).log(Level.SEVERE, null, ex);
        }
        cant=cant+Integer.parseInt(numero.getText());
        sql = "UPDATE peliculas.clientes SET Num_Peliculas_Alq='"+Integer.toString(cant)+"' WHERE Cedula='"+cedula.getText()+"'";
        cxn.Ejecutar(sql);
        pregunta.setVisible(false);
        this.setVisible(false);
        new menuAlquiler().setVisible(true);
    }//GEN-LAST:event_aceptar5ActionPerformed

    private void aceptar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar6ActionPerformed
        error3.setVisible(false);
    }//GEN-LAST:event_aceptar6ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegistroAlqui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Panel;
    private javax.swing.JButton aceptar2;
    private javax.swing.JButton aceptar3;
    private javax.swing.JButton aceptar4;
    private javax.swing.JButton aceptar5;
    private javax.swing.JButton aceptar6;
    private javax.swing.JButton agregar;
    private javax.swing.JComboBox ano;
    private javax.swing.JButton atras;
    private javax.swing.JButton borrar;
    private javax.swing.JButton borrar2;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton cancelar5;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField codigo;
    private javax.swing.JComboBox dia;
    private javax.swing.JDialog error;
    private javax.swing.JDialog error2;
    private javax.swing.JDialog error3;
    private javax.swing.JButton finalizar;
    private javax.swing.JDialog informacion;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private JEImagePanel jEImagePanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList lista;
    private javax.swing.JComboBox mes;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField pelicula;
    private javax.swing.JTextField precio;
    private javax.swing.JDialog pregunta;
    private javax.swing.JButton registrar2;
    private javax.swing.JTextField subtotal;
    private javax.swing.JButton venta;
    // End of variables declaration//GEN-END:variables
}
