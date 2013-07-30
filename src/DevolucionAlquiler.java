import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class DevolucionAlquiler extends javax.swing.JFrame {
    Image cd;
    int cant;
    int puntero2;
    int puntero;
    int multa;
    int numeroColumnas;
    Boolean bandera;
    String sql;
    String Columna;
    String [] celdas;
    String [] Fila;
    String datospeliculas[];
    Conexion cxn;
    ResultSet codigoo;
    ResultSet cedulaa;
    ResultSet conteo;
    ResultSet numalq;
    ResultSet busqueda;
    Manejofechas formatofecha;
    ResultSetMetaData metaDatos;
    DefaultTableModel modelotabla;
    DefaultTableCellRenderer tcr;
    LinkedList pelis;                          // titulo         #1 #2
    LinkedList multas;                         // multas         #2
    LinkedList idpelis;                        // idpelicula     #1
    LinkedList estado;                         // condicion      #2
    LinkedList fechaalquiler;                  // fecha alquiler #1
    LinkedList idalquiler;                     // idalquiler     #1
    LinkedList posicion;                       // para la tabla  #1
    LinkedList fechaentrega;
    public DevolucionAlquiler() {
        initComponents();
        setLocationRelativeTo(null);
        cd = Toolkit.getDefaultToolkit().getImage("src/Imagenes/cd.png");
        this.setIconImage(cd);
        cxn = new Conexion();
        formatofecha = new Manejofechas();
        tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        pelis = new LinkedList();
        multas = new LinkedList();
        idpelis = new LinkedList();
        estado = new LinkedList();
        fechaalquiler = new LinkedList();
        idalquiler = new LinkedList();
        posicion = new LinkedList();
        fechaentrega = new LinkedList();
        multa = 0;
        bandera = true;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        error = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        aceptar2 = new javax.swing.JButton();
        pregunta = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        aceptar3 = new javax.swing.JButton();
        cancelar3 = new javax.swing.JButton();
        error2 = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        aceptar4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jEImagePanel1 = new JEImagePanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        consulta = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        condicion = new javax.swing.JComboBox();
        agregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        dia = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        mes = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        ano = new javax.swing.JComboBox();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        borrar2 = new javax.swing.JButton();
        finalizar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lista = new javax.swing.JTable();
        jDesktopPane4 = new javax.swing.JDesktopPane();
        jLabel15 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        totalmulta = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        atras = new javax.swing.JButton();

        error.setMinimumSize(new java.awt.Dimension(260, 140));
        error.setModal(true);
        error.setResizable(false);
        error.getContentPane().setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-error.png"))); // NOI18N
        error.getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 10, 32, 40);

        jLabel9.setText("Existe uno o mas campos vacios");
        error.getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 20, 200, 14);

        aceptar2.setText("Aceptar");
        aceptar2.setFocusPainted(false);
        aceptar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar2ActionPerformed(evt);
            }
        });
        error.getContentPane().add(aceptar2);
        aceptar2.setBounds(80, 60, 90, 30);

        pregunta.setMinimumSize(new java.awt.Dimension(300, 140));
        pregunta.setModal(true);
        pregunta.setResizable(false);
        pregunta.getContentPane().setLayout(null);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-question.png"))); // NOI18N
        pregunta.getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 10, 40, 40);

        jLabel11.setText("¿Esta seguro que desea continuar?");
        pregunta.getContentPane().add(jLabel11);
        jLabel11.setBounds(60, 20, 210, 14);

        aceptar3.setText("Aceptar");
        aceptar3.setFocusPainted(false);
        aceptar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar3ActionPerformed(evt);
            }
        });
        pregunta.getContentPane().add(aceptar3);
        aceptar3.setBounds(40, 60, 90, 30);

        cancelar3.setText("Cancelar");
        cancelar3.setFocusPainted(false);
        cancelar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar3ActionPerformed(evt);
            }
        });
        pregunta.getContentPane().add(cancelar3);
        cancelar3.setBounds(160, 60, 90, 30);

        error2.setMinimumSize(new java.awt.Dimension(230, 130));
        error2.setModal(true);
        error2.setResizable(false);
        error2.getContentPane().setLayout(null);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-error.png"))); // NOI18N
        error2.getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 10, 32, 40);

        aceptar4.setText("Aceptar");
        aceptar4.setFocusPainted(false);
        aceptar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar4ActionPerformed(evt);
            }
        });
        error2.getContentPane().add(aceptar4);
        aceptar4.setBounds(70, 50, 90, 30);

        jLabel16.setText("cedula no registrada");
        error2.getContentPane().add(jLabel16);
        jLabel16.setBounds(50, 20, 150, 20);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Entrega");
        setBounds(new java.awt.Rectangle(270, 110, 0, 0));
        setResizable(false);

        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.png"))); // NOI18N
        jEImagePanel1.setLayout(null);

        jDesktopPane1.setBackground(new java.awt.Color(175, 213, 240));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 153)));

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Entrega de alquiler");
        jLabel1.setBounds(240, 10, 310, 30);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        registrar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar.png"))); // NOI18N
        registrar.setText("Registrar");
        registrar.setEnabled(false);
        registrar.setFocusPainted(false);
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        registrar.setBounds(300, 490, 170, 40);
        jDesktopPane1.add(registrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane2.setBackground(new java.awt.Color(175, 213, 240));
        jDesktopPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)), "Informacion de peliculas"));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        consulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        consulta.setAutoscrolls(false);
        consulta.setEnabled(false);
        consulta.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        consulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(consulta);

        jScrollPane1.setBounds(10, 30, 580, 100);
        jDesktopPane2.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Condicion:");
        jLabel14.setBounds(10, 150, 90, 30);
        jDesktopPane2.add(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        condicion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Buena", "Dañada" }));
        condicion.setEnabled(false);
        condicion.setBounds(90, 150, 90, 30);
        jDesktopPane2.add(condicion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        agregar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        agregar.setText("Agregar Pelicula");
        agregar.setEnabled(false);
        agregar.setFocusPainted(false);
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        agregar.setBounds(530, 150, 170, 30);
        jDesktopPane2.add(agregar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Fecha:");
        jLabel5.setBounds(230, 150, 60, 30);
        jDesktopPane2.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        dia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dia.setEnabled(false);
        dia.setBounds(290, 150, 40, 30);
        jDesktopPane2.add(dia, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("-");
        jLabel8.setBounds(330, 150, 20, 30);
        jDesktopPane2.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        mes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        mes.setEnabled(false);
        mes.setBounds(350, 150, 40, 30);
        jDesktopPane2.add(mes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("-");
        jLabel7.setBounds(390, 150, 20, 30);
        jDesktopPane2.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ano.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        ano.setEnabled(false);
        ano.setBounds(410, 150, 60, 30);
        jDesktopPane2.add(ano, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane2.setBounds(30, 110, 710, 200);
        jDesktopPane1.add(jDesktopPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane3.setBackground(new java.awt.Color(175, 213, 240));
        jDesktopPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)), "Informacion del alquiler"));

        borrar2.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        borrar2.setText("Borrar Pelicula");
        borrar2.setEnabled(false);
        borrar2.setFocusPainted(false);
        borrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrar2ActionPerformed(evt);
            }
        });
        borrar2.setBounds(530, 20, 170, 40);
        jDesktopPane3.add(borrar2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        finalizar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        finalizar.setText("Finalizar Seleccion");
        finalizar.setEnabled(false);
        finalizar.setFocusPainted(false);
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
        });
        finalizar.setBounds(530, 100, 170, 40);
        jDesktopPane3.add(finalizar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        lista.setAutoscrolls(false);
        lista.setEnabled(false);
        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(lista);

        jScrollPane3.setBounds(10, 20, 510, 120);
        jDesktopPane3.add(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane3.setBounds(30, 320, 710, 160);
        jDesktopPane1.add(jDesktopPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane4.setBackground(new java.awt.Color(175, 213, 240));
        jDesktopPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)), "Informacion del cliente"));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Cedula:");
        jLabel15.setBounds(10, 20, 60, 30);
        jDesktopPane4.add(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
        });
        cedula.setBounds(80, 20, 80, 30);
        jDesktopPane4.add(cedula, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buscar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        buscar.setText("Buscar");
        buscar.setEnabled(false);
        buscar.setFocusPainted(false);
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        buscar.setBounds(200, 20, 90, 30);
        jDesktopPane4.add(buscar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        borrar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        borrar.setText("Borrar");
        borrar.setEnabled(false);
        borrar.setFocusPainted(false);
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        borrar.setBounds(310, 20, 90, 30);
        jDesktopPane4.add(borrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Total Multa:");
        jLabel18.setBounds(460, 20, 100, 30);
        jDesktopPane4.add(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        totalmulta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totalmulta.setForeground(new java.awt.Color(255, 0, 0));
        totalmulta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalmulta.setText("0");
        totalmulta.setBounds(570, 20, 50, 30);
        jDesktopPane4.add(totalmulta, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("BsF.");
        jLabel17.setBounds(630, 20, 40, 30);
        jDesktopPane4.add(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane4.setBounds(30, 40, 710, 60);
        jDesktopPane1.add(jDesktopPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jEImagePanel1.add(jDesktopPane1);
        jDesktopPane1.setBounds(30, 20, 770, 540);

        atras.setText("Atras");
        atras.setFocusPainted(false);
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jEImagePanel1.add(atras);
        atras.setBounds(730, 570, 70, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void activacion(Boolean activar){
        cedula.setEditable(!activar);
        dia.setEnabled(activar);
        mes.setEnabled(activar);
        ano.setEnabled(activar);
        condicion.setEnabled(activar);
        borrar.setEnabled(activar);
    }
    
    private void modelodemitabla(){
        modelotabla = new DefaultTableModel(){
            @Override
            public Class getColumnClass(int c) { 
                return getValueAt(0,c).getClass(); 
            } 
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };    
    }  
    
    public final void consulta(String sql,int ancho[],Boolean centrar[]) throws SQLException{
        modelodemitabla();
        busqueda = cxn.Consulta(sql);
        metaDatos = busqueda.getMetaData();
        numeroColumnas = metaDatos.getColumnCount();
        Fila = new String[numeroColumnas];
        for (int c=0;c<numeroColumnas;c++){
            if(c!=2){
                Columna=metaDatos.getColumnName(c+1);
                modelotabla.addColumn(Columna);
            }
            else
                modelotabla.addColumn("IdPelicula");
        }
        while (busqueda.next()){
            for (int j=0;j<numeroColumnas;j++){
                Fila[j]= busqueda.getString(j+1);  
            }
            modelotabla.addRow(Fila);
        }
        consulta.setModel(modelotabla);
        for (int k=0;k<ancho.length;k++){
            consulta.getColumnModel().getColumn(k).setMinWidth(ancho[k]);
            consulta.getColumnModel().getColumn(k).setMaxWidth(ancho[k]);
            if(centrar[k]==true)
                consulta.getColumnModel().getColumn(k).setCellRenderer(tcr);
        }
    }
    
private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
    pregunta.setLocationRelativeTo(null);
    pregunta.getContentPane().setBackground(new Color(222,222,222));
    pregunta.setVisible(true);
}//GEN-LAST:event_registrarActionPerformed

private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
    activacion(false);
    agregar.setEnabled(false);
    buscar.setEnabled(false);
    registrar.setEnabled(false);
    finalizar.setEnabled(false);
    borrar2.setEnabled(false);
    cedula.setText("");
    dia.setSelectedIndex(0);
    mes.setSelectedIndex(0);
    ano.setSelectedIndex(0);
    condicion.setSelectedIndex(0);
    modelodemitabla();
    consulta.setModel(modelotabla);
    lista.setModel(modelotabla);
    pelis = new LinkedList();     
    multas = new LinkedList();
    idpelis = new LinkedList();
    estado = new LinkedList();
    fechaalquiler = new LinkedList();
    idalquiler = new LinkedList();
    posicion = new LinkedList();
    fechaentrega = new LinkedList();
    bandera = true;
}//GEN-LAST:event_borrarActionPerformed

    private void aceptar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar2ActionPerformed
        error.setVisible(false);
    }//GEN-LAST:event_aceptar2ActionPerformed

    private void aceptar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar3ActionPerformed
        while(idalquiler.size()>0){
            /****************************************resta de registro alquilado***********************************************/

            // busco peliculas alquiladas en el almacen
            int cantidadd=0;
            String idPel=null;
            ResultSet busquedacantidad;
            sql = "SELECT DISTINCT Cantidad,idPelicula FROM peliculas.peliculas WHERE idAuxiliar='"+idpelis.getFirst()+"' AND Estatus='Alquilada'";
            busquedacantidad = cxn.Consulta(sql);
            try{ 
                while (busquedacantidad.next()){
                    cantidadd = Integer.parseInt(busquedacantidad.getString(1));
                    idPel = busquedacantidad.getString(2);
                }
            }
            catch(SQLException ex) {
                Logger.getLogger(ConsultaAlquiler.class.getName()).log(Level.SEVERE, null, ex);
            }
            cantidadd = cantidadd-1;
            // resto 1 a las alquiladas si existe, si queda 1 borro el registro
            if(cantidadd>0)
                sql = "UPDATE peliculas.peliculas SET Cantidad='"+Integer.toString(cantidadd)+"' WHERE idPelicula='"+idPel+"' AND Estatus='Alquilada'";
            else
                sql = "DELETE FROM peliculas.peliculas WHERE idPelicula='"+idPel+"' AND Estatus='Alquilada'";
            cxn.Ejecutar(sql);

            /*******************************Suma o creacion de registro de pelicula dañada**************************************/

            if(estado.getFirst().toString().equals("Dañada")){  // si esta dañada: si existe una sumo 1, si no agrego nuevo 

                // busco si existe otra pelicula como esta dañada ya registrada en el almacen

                String iddañado=null; 
                int cantid=0;
                sql = "SELECT idPelicula,Cantidad FROM peliculas.peliculas WHERE idAuxiliar='"+idpelis.getFirst()+"' AND Condicion='Dañada'";
                ResultSet peliculadañada;
                peliculadañada = cxn.Consulta(sql);
                try{ 
                    while (peliculadañada.next()){
                        iddañado=peliculadañada.getString(1);
                        cantid = Integer.parseInt(peliculadañada.getString(2));
                    } 
                }
                catch(SQLException ex) {
                    Logger.getLogger(ConsultaAlquiler.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(iddañado==null){
                    // busco informacion de la pelicula para registrarla como dañada
                    ResultSet peliculadevuelta;
                    sql = "SELECT Titulo,Año,Genero,Censura,Reparto,Uso,Condicion,Cantidad,Precio,Veces_Alquilada,Distribuidor,"
                        +"Precio_Pedido,Fecha_Solicitud,Fecha_Esperada,Fecha_Entrega,Estatus FROM peliculas.peliculas WHERE "
                        +"idPelicula='"+idpelis.getFirst()+"'";
                    peliculadevuelta = cxn.Consulta(sql);
                    try{ 
                        metaDatos = peliculadevuelta.getMetaData();
                        numeroColumnas = metaDatos.getColumnCount();  
                        datospeliculas = new String[numeroColumnas];
                        while (peliculadevuelta.next()){
                            for (int k=0;k<numeroColumnas;k++){
                                datospeliculas[k]= peliculadevuelta.getString(k+1);
                            }
                        }
                    }
                    catch(SQLException ex) {
                        Logger.getLogger(ConsultaAlquiler.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    // la registro aqui como dañada
                    datospeliculas[9]=Integer.toString(Integer.parseInt(datospeliculas[9])+1);
                    sql = "INSERT INTO peliculas.peliculas (Titulo,Año,Genero,Censura,Reparto,Uso,Condicion,Cantidad,Precio,"
                        +"Veces_Alquilada,Distribuidor,Precio_Pedido,Fecha_Solicitud,Fecha_Esperada,Fecha_Entrega,Estatus,idAuxiliar,Registro) "
                        +"VALUES ('"+datospeliculas[0]+"','"+datospeliculas[1]+"','"+datospeliculas[2]+"','"+datospeliculas[3]+"',"
                        +"'"+datospeliculas[4]+"','"+datospeliculas[5]+"','"+estado.getFirst().toString()+"','1',"
                        +"'"+datospeliculas[8]+"','0','"+datospeliculas[10]+"','"+datospeliculas[11]+"',"
                        +"'"+datospeliculas[12]+"','"+datospeliculas[13]+"','"+datospeliculas[14]+"','Disponible','"+idpelis.getFirst()+"','Caducado')";
                    cxn.Ejecutar(sql);
                }
                else{
                    // si existen dañadas sumo 1
                    cantid=cantid+1;
                    sql = "UPDATE peliculas.peliculas SET Cantidad='"+Integer.toString(cantid)+"' WHERE idAuxiliar='"+idpelis.getFirst()+"' AND Condicion='Dañada'";
                    cxn.Ejecutar(sql);
                }
            }
            /***************************************Sumo uno al registro de las buenas**********************************************/

            else{  // si esta buena: sumo uno a su id original
                int canti=0;
                ResultSet nuevacantidad;
                sql = "SELECT Cantidad FROM peliculas.peliculas WHERE idPelicula='"+idpelis.getFirst().toString()+"'";
                nuevacantidad = cxn.Consulta(sql);
                try{ 
                while (nuevacantidad.next())
                    canti = Integer.parseInt(nuevacantidad.getString(1));
                canti = canti+1;
                }
                catch(SQLException ex) {
                    Logger.getLogger(ConsultaAlquiler.class.getName()).log(Level.SEVERE, null, ex);
                }
                sql = "UPDATE peliculas.peliculas SET Cantidad='"+canti+"' WHERE idPelicula='"+idpelis.getFirst().toString()+"'";
                cxn.Ejecutar(sql);
            }

            /*************************************************************************************************************************/

            // registro alquileres devueltos 
            sql = "UPDATE peliculas.alquiler SET Fecha_Entrega='"+fechaentrega.getFirst().toString()+"' WHERE idAlquiler='"+idalquiler.getFirst().toString()+"'";
            cxn.Ejecutar(sql);

            /*************************************************************************************************************************/

            // registro multas del cliente
            ResultSet busquedamultas;
            sql = "SELECT Num_Multas FROM peliculas.clientes WHERE Cedula='"+cedula.getText()+"'";
            busquedamultas = cxn.Consulta(sql);
            try{ 
                while (busquedamultas.next())
                    cantidadd = Integer.parseInt(busquedamultas.getString(1));
            }
            catch(SQLException ex) {
                Logger.getLogger(ConsultaAlquiler.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(Integer.parseInt(multas.getFirst().toString())>0)
                cantidadd = cantidadd+1;
            System.out.print(multas.getFirst().toString());
            sql = "UPDATE peliculas.clientes SET Num_Multas='"+Integer.toString(cantidadd)+"' WHERE Cedula='"+cedula.getText()+"'";
            cxn.Ejecutar(sql);
            pelis.removeFirst();                      
            multas.removeFirst();                         
            idpelis.removeFirst();                 
            estado.removeFirst();                  
            fechaalquiler.removeFirst();  
            fechaentrega.removeFirst();
            idalquiler.removeFirst();         
            posicion.removeFirst();           
        }
        pregunta.setVisible(false);
        this.setVisible(false);
        new menuAlquiler().setVisible(true);
    }//GEN-LAST:event_aceptar3ActionPerformed

    private void cancelar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar3ActionPerformed
        pregunta.setVisible(false);
    }//GEN-LAST:event_cancelar3ActionPerformed

    private void aceptar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar4ActionPerformed
        error2.setVisible(false);
    }//GEN-LAST:event_aceptar4ActionPerformed

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped
        int limite = 8;
        char C=evt.getKeyChar();
        if (((C<'0')||(C>'9'))||((cedula.getText().length()== limite)))
            evt.consume();
        if (cedula.getText().length()==7)
            buscar.setEnabled(true);
        if (cedula.getText().length()<7)
            buscar.setEnabled(false);
    }//GEN-LAST:event_cedulaKeyTyped

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        try{
            int cont = 0;
            sql = "SELECT COUNT(Cedula) FROM peliculas.alquiler WHERE Cedula='"+cedula.getText()+"' AND Fecha_Entrega IS NULL";
            busqueda = cxn.Consulta(sql);
            while (busqueda.next()){
                cont = Integer.parseInt(busqueda.getString(1));  
            }
            if(cont>0){
                activacion(true);
                cedula.setEditable(false);
                buscar.setEnabled(false);
                consulta.setEnabled(true);
                lista.setEnabled(true);
                condicion.setSelectedIndex(1);
                String fecha = formatofecha.fecha();
                String desgloce[] = fecha.split("-");
                dia.setSelectedItem(desgloce[0]);
                mes.setSelectedItem(desgloce[1]);
                ano.setSelectedItem(desgloce[2]);
                sql = "SELECT c.Titulo,al.Fecha_Alquiler,c.idAuxiliar,al.idAlquiler FROM peliculas.alquiler al,"
                    +" peliculas.peliculas c WHERE al.Cedula='"+cedula.getText()+"' AND al.idPelicula=c.idauxiliar "
                    +"AND c.Estatus='Alquilada' AND al.Fecha_Entrega IS NULL";
                int ancho[] = {340,90,70,62};
                Boolean centrar[] = {false,true,true,true}; 
                consulta(sql,ancho,centrar);
            }
            else{
                error2.setLocationRelativeTo(null);
                error2.getContentPane().setBackground(new Color(222,222,222));
                error2.setVisible(true);
            }
        } 
        catch (SQLException ex){
            Logger.getLogger(DevolucionAlquiler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        this.setVisible(false);
        new menuAlquiler().setVisible(true);
    }//GEN-LAST:event_atrasActionPerformed

    private void consultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaMouseClicked
        int n = consulta.getSelectedRow();
        int m = consulta.getColumnCount();
        puntero = n;
        celdas = new String[m];
        if ((evt.getClickCount()>0)){ 
            for(int i=0;i<m;i++){
                celdas[i]=consulta.getValueAt(n,i).toString();
            }
            if(celdas[1].equals("0"))
                agregar.setEnabled(false);
            else
                agregar.setEnabled(true);
        }
    }//GEN-LAST:event_consultaMouseClicked

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        if((dia.getSelectedItem().toString().equalsIgnoreCase("..."))||(mes.getSelectedItem().toString().equalsIgnoreCase("..."))
                ||(ano.getSelectedItem().toString().equalsIgnoreCase("..."))||(condicion.getSelectedItem().toString().equalsIgnoreCase("..."))){
            error.setLocationRelativeTo(null);
            error.getContentPane().setBackground(new Color(222,222,222));
            error.setVisible(true);
        }
        else{
            String entrega = ano.getSelectedItem()+"-"+mes.getSelectedItem()+"-"+dia.getSelectedItem();
            long dias = 0;
            int mu = 0;
            Object fila [] = new Object[3];
            pelis.add(celdas[0]);     // agrego titulos a una lista
            fechaalquiler.add(celdas[1]);   // fecha de alquiler en una lista
            idpelis.add(celdas[2]);   // agrego id a una lista
            idalquiler.add(celdas[3]);
            estado.add(condicion.getSelectedItem().toString());      // agrego condicion de pelicula a una lista
            posicion.add(puntero);
            fechaentrega.add(entrega);
            // calculo de diferencia de dias
            try{
                dias = formatofecha.dias(celdas[1], entrega);
            }
            catch (ParseException ex) {
                Logger.getLogger(DevolucionAlquiler.class.getName()).log(Level.SEVERE, null, ex);
            }
            // calculo de multa
            if(dias>3){
                mu = mu +(int)(dias-3)*3;
            }
            multa = multa + mu;
            multas.add(mu);            // multa por pelicula en una lista
            totalmulta.setText(Integer.toString(multa));
            modelodemitabla();
            modelotabla.addColumn(consulta.getModel().getColumnName(0));
            modelotabla.addColumn("Condicion");
            modelotabla.addColumn("Multa (BsF.)");
            for (int i=0;i<pelis.size();i++){
                fila[0]=pelis.get(i);
                fila[1]=estado.get(i);
                fila[2]=multas.get(i);
                modelotabla.addRow(fila);
            }
            lista.setModel(modelotabla);
            DefaultTableModel temp = (DefaultTableModel) consulta.getModel();
            temp.removeRow(puntero);
            int ancho[] = {340,75,75};
            Boolean centrar[] = {false,true,true};
            for (int k=0;k<ancho.length;k++){
                lista.getColumnModel().getColumn(k).setMinWidth(ancho[k]);
                lista.getColumnModel().getColumn(k).setMaxWidth(ancho[k]);
                if(centrar[k]==true)
                    lista.getColumnModel().getColumn(k).setCellRenderer(tcr);
            }
            finalizar.setEnabled(true);
            agregar.setEnabled(false);
        }
    }//GEN-LAST:event_agregarActionPerformed

    private void borrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar2ActionPerformed
        puntero2 = lista.getSelectedRow();    
        Object aux[]={(pelis.get(puntero2)),(fechaalquiler.get(puntero2)),(idpelis.get(puntero2)),(idalquiler.get(puntero2))};
        int auxrow = Integer.parseInt(posicion.get(puntero2).toString());
        DefaultTableModel temp2 = (DefaultTableModel) consulta.getModel();
        temp2.insertRow(auxrow, aux);
        pelis.remove(puntero2);
        idpelis.remove(puntero2);
        estado.remove(puntero2);
        multas.remove(puntero2);
        idalquiler.remove(puntero2);
        fechaalquiler.remove(puntero2);
        fechaentrega.remove(puntero2);
        DefaultTableModel temp = (DefaultTableModel) lista.getModel();
        temp.removeRow(puntero2);        
        borrar2.setEnabled(false);
        if(lista.getModel().getRowCount()==0){
            modelodemitabla();
            lista.setModel(modelotabla);
            finalizar.setEnabled(false);
        }
    }//GEN-LAST:event_borrar2ActionPerformed

    private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed
        registrar.setEnabled(true);
        agregar.setEnabled(false);
        dia.setEnabled(false);
        mes.setEnabled(false);
        ano.setEnabled(false);
        condicion.setEnabled(false);
        finalizar.setEnabled(false);
        borrar2.setEnabled(false);
        consulta.setEnabled(false);
        lista.setEnabled(false);
        bandera = false;
    }//GEN-LAST:event_finalizarActionPerformed

    private void listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseClicked
        if ((evt.getClickCount() > 0)&&(bandera==true)) {
            borrar2.setEnabled(true);
        }
    }//GEN-LAST:event_listaMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DevolucionAlquiler().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar2;
    private javax.swing.JButton aceptar3;
    private javax.swing.JButton aceptar4;
    private javax.swing.JButton agregar;
    private javax.swing.JComboBox ano;
    private javax.swing.JButton atras;
    private javax.swing.JButton borrar;
    private javax.swing.JButton borrar2;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cancelar3;
    private javax.swing.JTextField cedula;
    private javax.swing.JComboBox condicion;
    private javax.swing.JTable consulta;
    private javax.swing.JComboBox dia;
    private javax.swing.JDialog error;
    private javax.swing.JDialog error2;
    private javax.swing.JButton finalizar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JDesktopPane jDesktopPane4;
    private JEImagePanel jEImagePanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable lista;
    private javax.swing.JComboBox mes;
    private javax.swing.JDialog pregunta;
    private javax.swing.JButton registrar;
    private javax.swing.JLabel totalmulta;
    // End of variables declaration//GEN-END:variables
}
