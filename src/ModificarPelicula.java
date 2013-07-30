import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModificarPelicula extends javax.swing.JFrame {
    Conexion cxn;
    Manejofechas formatofecha;
    Image cd;
    Boolean Activar = true;
    String sql;
    String sql2;
    String Fechaa1;
    String Fechaa2;
    String Fechaa3;
    String [] Fila;
    Boolean band1;
    Boolean band2;
    Boolean band3;
    ResultSet busqueda;
    ResultSet conteo;
    ResultSetMetaData metaDatos;
    String dias[]={"...","1","2","3","4","5","6","7","8","9","10","11","12","13",
        "14","15","16","17","18","19","20","21","22","23","24","25","26","27","28"}; 
    public ModificarPelicula() {
        initComponents();
        setLocationRelativeTo(null);
        cxn = new Conexion();
        formatofecha = new Manejofechas();
        cd = Toolkit.getDefaultToolkit().getImage("src/Imagenes/cd.png");
        this.setIconImage(cd);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        advertencia1 = new javax.swing.JDialog();
        aceptar1 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        cancelar1 = new javax.swing.JButton();
        advertencia2 = new javax.swing.JDialog();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        aceptar2 = new javax.swing.JButton();
        advertencia3 = new javax.swing.JDialog();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        aceptar3 = new javax.swing.JButton();
        cancelar3 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        error = new javax.swing.JDialog();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        aceptar4 = new javax.swing.JButton();
        advertencia4 = new javax.swing.JDialog();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        aceptar5 = new javax.swing.JButton();
        jEImagePanel1 = new JEImagePanel();
        Atras = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel9 = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        ID = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Ano = new javax.swing.JTextField();
        Precio = new javax.swing.JTextField();
        Genero = new javax.swing.JComboBox();
        Reparto = new javax.swing.JTextField();
        Pelicula = new javax.swing.JTextField();
        Censura = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        Cantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Condicion = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        Dia1 = new javax.swing.JComboBox();
        Mes1 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Dia2 = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        Mes2 = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Dia3 = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        Mes3 = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Estatus = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        Distribuidor = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        Predido = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        Uso = new javax.swing.JComboBox();
        Aano1 = new javax.swing.JComboBox();
        Aano2 = new javax.swing.JComboBox();
        Aano3 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Eliminar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();

        advertencia1.setMinimumSize(new java.awt.Dimension(290, 150));
        advertencia1.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        advertencia1.setResizable(false);
        advertencia1.getContentPane().setLayout(null);

        aceptar1.setText("Aceptar");
        aceptar1.setFocusPainted(false);
        aceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar1ActionPerformed(evt);
            }
        });
        advertencia1.getContentPane().add(aceptar1);
        aceptar1.setBounds(30, 70, 90, 30);

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-warning.png"))); // NOI18N
        advertencia1.getContentPane().add(jLabel25);
        jLabel25.setBounds(10, 10, 40, 40);

        jLabel26.setText("¿Esta seguro que desea eliminar");
        advertencia1.getContentPane().add(jLabel26);
        jLabel26.setBounds(60, 20, 210, 14);

        jLabel27.setText("este registro?");
        advertencia1.getContentPane().add(jLabel27);
        jLabel27.setBounds(100, 40, 120, 14);

        cancelar1.setText("Cancelar");
        cancelar1.setFocusPainted(false);
        cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar1ActionPerformed(evt);
            }
        });
        advertencia1.getContentPane().add(cancelar1);
        cancelar1.setBounds(160, 70, 90, 30);

        advertencia2.setMinimumSize(new java.awt.Dimension(300, 150));
        advertencia2.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        advertencia2.setResizable(false);
        advertencia2.getContentPane().setLayout(null);

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-error.png"))); // NOI18N
        advertencia2.getContentPane().add(jLabel28);
        jLabel28.setBounds(10, 10, 40, 40);

        jLabel29.setText("Existe uno o mas campos vacios");
        advertencia2.getContentPane().add(jLabel29);
        jLabel29.setBounds(60, 20, 220, 14);

        aceptar2.setText("Aceptar");
        aceptar2.setFocusPainted(false);
        advertencia2.getContentPane().add(aceptar2);
        aceptar2.setBounds(80, 50, 80, 30);

        advertencia3.setMinimumSize(new java.awt.Dimension(290, 150));
        advertencia3.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        advertencia3.setResizable(false);
        advertencia3.getContentPane().setLayout(null);

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-warning.png"))); // NOI18N
        advertencia3.getContentPane().add(jLabel30);
        jLabel30.setBounds(10, 10, 40, 40);

        jLabel31.setText("¿Esta seguro que desea modificar");
        advertencia3.getContentPane().add(jLabel31);
        jLabel31.setBounds(60, 20, 220, 14);

        aceptar3.setText("Aceptar");
        aceptar3.setFocusPainted(false);
        aceptar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar3ActionPerformed(evt);
            }
        });
        advertencia3.getContentPane().add(aceptar3);
        aceptar3.setBounds(40, 70, 90, 30);

        cancelar3.setText("Cancelar");
        cancelar3.setFocusPainted(false);
        cancelar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar3ActionPerformed(evt);
            }
        });
        advertencia3.getContentPane().add(cancelar3);
        cancelar3.setBounds(160, 70, 90, 30);

        jLabel32.setText("este registro?");
        advertencia3.getContentPane().add(jLabel32);
        jLabel32.setBounds(100, 40, 120, 14);

        error.setMinimumSize(new java.awt.Dimension(300, 130));
        error.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        error.setResizable(false);
        error.getContentPane().setLayout(null);

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-error.png"))); // NOI18N
        error.getContentPane().add(jLabel33);
        jLabel33.setBounds(0, 10, 50, 40);

        jLabel34.setText("Esta pelicula no se encuentra registrada");
        error.getContentPane().add(jLabel34);
        jLabel34.setBounds(50, 20, 240, 14);

        aceptar4.setText("Aceptar");
        aceptar4.setFocusPainted(false);
        aceptar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar4ActionPerformed(evt);
            }
        });
        error.getContentPane().add(aceptar4);
        aceptar4.setBounds(100, 50, 90, 30);

        advertencia4.setMinimumSize(new java.awt.Dimension(270, 140));
        advertencia4.setModal(true);
        advertencia4.setResizable(false);
        advertencia4.getContentPane().setLayout(null);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/windows-error.png"))); // NOI18N
        advertencia4.getContentPane().add(jLabel35);
        jLabel35.setBounds(10, 10, 32, 40);

        jLabel36.setText("Fecha erronea");
        advertencia4.getContentPane().add(jLabel36);
        jLabel36.setBounds(50, 20, 120, 14);

        aceptar5.setText("Aceptar");
        aceptar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar5ActionPerformed(evt);
            }
        });
        advertencia4.getContentPane().add(aceptar5);
        aceptar5.setBounds(80, 50, 90, 30);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar registro de peliculas");
        setResizable(false);

        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.png"))); // NOI18N
        jEImagePanel1.setLayout(null);

        Atras.setText("Atras");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });
        jEImagePanel1.add(Atras);
        Atras.setBounds(570, 620, 70, 30);

        jDesktopPane1.setBackground(new java.awt.Color(175, 213, 240));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 153)));

        jLabel9.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Modificar Registro");
        jLabel9.setBounds(160, 10, 290, 25);
        jDesktopPane1.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Buscar.setText("Buscar");
        Buscar.setFocusPainted(false);
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        Buscar.setBounds(350, 60, 90, 30);
        jDesktopPane1.add(Buscar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Borrar.setText("Borrar");
        Borrar.setEnabled(false);
        Borrar.setFocusPainted(false);
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });
        Borrar.setBounds(350, 90, 90, 30);
        jDesktopPane1.add(Borrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane2.setBackground(new java.awt.Color(175, 213, 240));
        jDesktopPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)), "Busqueda:"));

        ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IDKeyTyped(evt);
            }
        });
        ID.setBounds(120, 20, 130, 30);
        jDesktopPane2.add(ID, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("ID Pelicula");
        jLabel24.setBounds(30, 20, 80, 30);
        jDesktopPane2.add(jLabel24, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane2.setBounds(30, 50, 290, 70);
        jDesktopPane1.add(jDesktopPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane3.setBackground(new java.awt.Color(175, 213, 240));
        jDesktopPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)), "Registro:"));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Nombre de pelicula:");
        jLabel10.setBounds(30, 20, 136, 30);
        jDesktopPane3.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Reparto:");
        jLabel6.setBounds(30, 60, 61, 30);
        jDesktopPane3.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Genero:");
        jLabel4.setBounds(30, 100, 55, 30);
        jDesktopPane3.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Condicion:");
        jLabel8.setBounds(360, 220, 90, 30);
        jDesktopPane3.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Estatus:");
        jLabel3.setBounds(30, 220, 70, 30);
        jDesktopPane3.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Fecha de pedido (dd/mm/aaaa):");
        jLabel11.setBounds(30, 260, 225, 30);
        jDesktopPane3.add(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Ano.setEnabled(false);
        Ano.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AnoKeyTyped(evt);
            }
        });
        Ano.setBounds(460, 100, 60, 30);
        jDesktopPane3.add(Ano, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Precio.setEnabled(false);
        Precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PrecioKeyTyped(evt);
            }
        });
        Precio.setBounds(100, 140, 120, 30);
        jDesktopPane3.add(Precio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Genero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Comedia", "Romance", "Accion", "Terror", "Ciencia Ficcion", "Drama" }));
        Genero.setEnabled(false);
        Genero.setBounds(100, 100, 120, 30);
        jDesktopPane3.add(Genero, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Reparto.setEnabled(false);
        Reparto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RepartoKeyTyped(evt);
            }
        });
        Reparto.setBounds(100, 60, 420, 30);
        jDesktopPane3.add(Reparto, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Pelicula.setEnabled(false);
        Pelicula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PeliculaKeyTyped(evt);
            }
        });
        Pelicula.setBounds(180, 20, 340, 30);
        jDesktopPane3.add(Pelicula, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Censura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "A", "B", "C", "D" }));
        Censura.setEnabled(false);
        Censura.setBounds(320, 100, 50, 30);
        jDesktopPane3.add(Censura, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Censura:");
        jLabel5.setBounds(240, 100, 62, 30);
        jDesktopPane3.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Cantidad.setEnabled(false);
        Cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CantidadKeyTyped(evt);
            }
        });
        Cantidad.setBounds(100, 180, 50, 30);
        jDesktopPane3.add(Cantidad, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Cantidad:");
        jLabel7.setBounds(30, 180, 67, 30);
        jDesktopPane3.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Condicion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Nueva", "Buena", "Dañada" }));
        Condicion.setEnabled(false);
        Condicion.setBounds(440, 220, 80, 30);
        jDesktopPane3.add(Condicion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Uso:");
        jLabel2.setBounds(220, 220, 40, 30);
        jDesktopPane3.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Dia1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Dia1.setEnabled(false);
        Dia1.setBounds(280, 260, 50, 30);
        jDesktopPane3.add(Dia1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Mes1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        Mes1.setEnabled(false);
        Mes1.setBounds(370, 260, 50, 30);
        jDesktopPane3.add(Mes1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("-");
        jLabel12.setBounds(330, 260, 40, 30);
        jDesktopPane3.add(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("-");
        jLabel13.setBounds(420, 260, 40, 30);
        jDesktopPane3.add(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Fecha esperada (dd/mm/aaaa):");
        jLabel14.setBounds(30, 300, 220, 30);
        jDesktopPane3.add(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Dia2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Dia2.setEnabled(false);
        Dia2.setBounds(280, 300, 50, 30);
        jDesktopPane3.add(Dia2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("-");
        jLabel15.setBounds(330, 300, 40, 30);
        jDesktopPane3.add(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Mes2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        Mes2.setEnabled(false);
        Mes2.setBounds(370, 300, 50, 30);
        jDesktopPane3.add(Mes2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("-");
        jLabel16.setBounds(420, 300, 40, 30);
        jDesktopPane3.add(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Fecha de entrega (dd/mm/aaaa):");
        jLabel17.setBounds(30, 340, 232, 30);
        jDesktopPane3.add(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Dia3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Dia3.setEnabled(false);
        Dia3.setBounds(280, 340, 50, 30);
        jDesktopPane3.add(Dia3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("-");
        jLabel18.setBounds(330, 340, 40, 30);
        jDesktopPane3.add(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Mes3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        Mes3.setEnabled(false);
        Mes3.setBounds(370, 340, 50, 30);
        jDesktopPane3.add(Mes3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("-");
        jLabel19.setBounds(420, 340, 40, 30);
        jDesktopPane3.add(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Distribuidor:");
        jLabel20.setBounds(200, 180, 100, 30);
        jDesktopPane3.add(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Estatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Pedido", "Disponible", "Vendido", "Alquilado" }));
        Estatus.setEnabled(false);
        Estatus.setBounds(100, 220, 100, 30);
        jDesktopPane3.add(Estatus, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Año:");
        jLabel21.setBounds(410, 100, 33, 30);
        jDesktopPane3.add(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Distribuidor.setEnabled(false);
        Distribuidor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DistribuidorKeyTyped(evt);
            }
        });
        Distribuidor.setBounds(310, 180, 210, 30);
        jDesktopPane3.add(Distribuidor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Precio:");
        jLabel22.setBounds(30, 140, 47, 30);
        jDesktopPane3.add(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Predido.setEnabled(false);
        Predido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PredidoKeyTyped(evt);
            }
        });
        Predido.setBounds(410, 140, 110, 30);
        jDesktopPane3.add(Predido, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Precio (pedido):");
        jLabel23.setBounds(290, 140, 120, 30);
        jDesktopPane3.add(jLabel23, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Uso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Alquiler", "Venta" }));
        Uso.setEnabled(false);
        Uso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsoActionPerformed(evt);
            }
        });
        Uso.setBounds(260, 220, 80, 30);
        jDesktopPane3.add(Uso, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Aano1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        Aano1.setEnabled(false);
        Aano1.setBounds(460, 260, 60, 30);
        jDesktopPane3.add(Aano1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Aano2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        Aano2.setEnabled(false);
        Aano2.setBounds(460, 300, 60, 30);
        jDesktopPane3.add(Aano2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Aano3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        Aano3.setEnabled(false);
        Aano3.setBounds(460, 340, 60, 30);
        jDesktopPane3.add(Aano3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane3.setBounds(30, 140, 550, 380);
        jDesktopPane1.add(jDesktopPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CD-ROM.png"))); // NOI18N
        jLabel1.setBounds(470, 40, 90, 90);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSeparator1.setBounds(30, 130, 550, 10);
        jDesktopPane1.add(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Eliminar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x.png"))); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.setEnabled(false);
        Eliminar.setFocusPainted(false);
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        Eliminar.setBounds(90, 530, 150, 40);
        jDesktopPane1.add(Eliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Modificar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar.png"))); // NOI18N
        Modificar.setText("Modificar");
        Modificar.setEnabled(false);
        Modificar.setFocusPainted(false);
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        Modificar.setBounds(370, 530, 150, 40);
        jDesktopPane1.add(Modificar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jEImagePanel1.add(jDesktopPane1);
        jDesktopPane1.setBounds(30, 20, 610, 590);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        this.setVisible(false);
        new GestionInventario().setVisible(true);
    }//GEN-LAST:event_AtrasActionPerformed

    private void RepartoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RepartoKeyTyped
        int limite = 160;
        char C = evt.getKeyChar();
        char D = 39;
        if ((Reparto.getText().length() == limite) || (C == D)) {
            evt.consume();
        }
    }//GEN-LAST:event_RepartoKeyTyped

    private void PeliculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PeliculaKeyTyped
        int limite = 60;
        char C = evt.getKeyChar();
        char D = 39;
        if ((Pelicula.getText().length() == limite) || (C == D)) {
            evt.consume();
        }
    }//GEN-LAST:event_PeliculaKeyTyped
      
    private void accion(Boolean Activar){
        Aano1.setEnabled(Activar);
        Aano2.setEnabled(Activar);
        Aano3.setEnabled(Activar);
        Ano.setEnabled(Activar);
        Dia1.setEnabled(Activar);
        Dia2.setEnabled(Activar);
        Dia3.setEnabled(Activar);
        Mes1.setEnabled(Activar);
        Mes2.setEnabled(Activar);
        Mes3.setEnabled(Activar);
        Uso.setEnabled(Activar);
        Reparto.setEnabled(Activar);
        Pelicula.setEnabled(Activar);
        Censura.setEnabled(Activar);
        Estatus.setEnabled(Activar);
        Genero.setEnabled(Activar);
        Borrar.setEnabled(Activar);
        Predido.setEnabled(Activar);
        Precio.setEnabled(Activar);
        Modificar.setEnabled(Activar);
        Eliminar.setEnabled(Activar);
        Cantidad.setEnabled(Activar);
        Distribuidor.setEnabled(Activar);
        Buscar.setEnabled(!Activar);
        ID.setEditable(!Activar);
    }
      
    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        try{
            int Conteo = 0;
            sql2 = "SELECT COUNT(idPelicula) FROM peliculas.peliculas WHERE idPelicula='"+ID.getText()+"'";
            conteo = cxn.Consulta(sql2);
            while (conteo.next()){
                Conteo=Integer.parseInt(conteo.getString(1));
            }
            if(Conteo>0){    
                accion(Activar);
                sql = "SELECT Titulo,Reparto,Genero,Censura,Año,Precio,Precio_Pedido,Cantidad,Distribuidor,Estatus,Uso,Condicion,"
                     +"Fecha_Solicitud,Fecha_Esperada,Fecha_Entrega FROM peliculas.peliculas WHERE idPelicula='"+ID.getText()+"'";
                busqueda = cxn.Consulta(sql);
                metaDatos = busqueda.getMetaData();
                int numeroColumnas = metaDatos.getColumnCount();
                Fila = new String[numeroColumnas];
                while (busqueda.next()){
                    for (int j=0;j<numeroColumnas;j++){
                        Fila[j]= busqueda.getString(j+1);  
                    }
                }
                Pelicula.setText(Fila[0]);
                Reparto.setText(Fila[1]);
                Genero.setSelectedItem(Fila[2]);
                Censura.setSelectedItem(Fila[3]);
                Ano.setText(Fila[4]);
                Precio.setText(Fila[5]);
                Predido.setText(Fila[6]);
                Cantidad.setText(Fila[7]);
                Distribuidor.setText(Fila[8]);
                Estatus.setSelectedItem(Fila[9]);
                Uso.setSelectedItem(Fila[10]);
                Condicion.setSelectedItem(Fila[11]);
                String[] Fecha1 = Fila[12].split("-");
                String[] Fecha2 = Fila[13].split("-");
                Dia1.setSelectedItem(Fecha1[2]);
                Dia2.setSelectedItem(Fecha2[2]);
                Mes1.setSelectedItem(Fecha1[1]);
                Mes2.setSelectedItem(Fecha2[1]);
                Aano1.setSelectedItem(Fecha1[0]);
                Aano2.setSelectedItem(Fecha2[0]);
                if(Fila[14]!=null){
                    String[] Fecha3 = Fila[14].split("-");
                    Dia3.setSelectedItem(Fecha3[2]);
                    Mes3.setSelectedItem(Fecha3[1]);
                    Aano3.setSelectedItem(Fecha3[0]);
                }
            }
            else{
                error.setLocationRelativeTo(null);
                error.getContentPane().setBackground(new Color(222,222,222));
                error.setVisible(true);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(ModificarPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        accion(!Activar);
        Condicion.removeAllItems();
        Condicion.addItem("...");
        Condicion.addItem("Nueva");
        Condicion.addItem("Buena");
        Condicion.addItem("Dañada");
        Condicion.setEnabled(false);
        Dia1.setSelectedIndex(0);
        Dia2.setSelectedIndex(0);
        Dia3.setSelectedIndex(0);
        Mes1.setSelectedIndex(0);
        Mes2.setSelectedIndex(0);
        Mes3.setSelectedIndex(0);
        Estatus.setSelectedIndex(0);
        Uso.setSelectedIndex(0);
        Condicion.setSelectedIndex(0);
        Genero.setSelectedIndex(0);
        Censura.setSelectedIndex(0);
        Pelicula.setText("");
        Reparto.setText("");
        Ano.setText("");
        Precio.setText("");
        Predido.setText("");
        Cantidad.setText("");
        Distribuidor.setText("");
        Aano1.setSelectedIndex(0);
        Aano2.setSelectedIndex(0);
        Aano3.setSelectedIndex(0);
        ID.setText("");
    }//GEN-LAST:event_BorrarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        advertencia1.setLocationRelativeTo(null);
        advertencia1.getContentPane().setBackground(new Color(222,222,222));
        advertencia1.setVisible(true);
    }//GEN-LAST:event_EliminarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        if((Pelicula.getText()!=null)&&(Reparto.getText()!=null)&&(!Genero.getSelectedItem().toString().equalsIgnoreCase("..."))&&
        (!Censura.getSelectedItem().toString().equalsIgnoreCase("..."))&&(Ano.getText()!=null)&&(Precio.getText()!=null)&&
        (Predido.getText()!=null)&&(Cantidad.getText()!=null)&&(Distribuidor.getText()!=null)&&(!Estatus.getSelectedItem().toString().equalsIgnoreCase("..."))&&
        (!Uso.getSelectedItem().toString().equalsIgnoreCase("..."))&&(!Condicion.getSelectedItem().toString().equalsIgnoreCase("..."))&&
        (!Dia1.getSelectedItem().toString().equalsIgnoreCase("..."))&&(!Dia2.getSelectedItem().toString().equalsIgnoreCase("..."))&&
        (!Mes1.getSelectedItem().toString().equalsIgnoreCase("..."))&&(!Mes2.getSelectedItem().toString().equalsIgnoreCase("..."))&&
        (!Aano1.getSelectedItem().toString().equalsIgnoreCase("..."))&&(!Aano2.getSelectedItem().toString().equalsIgnoreCase("..."))){
            Fechaa1 = Aano1.getSelectedItem().toString()+"-"+Mes1.getSelectedItem().toString()+"-"+Dia1.getSelectedItem().toString();
            Fechaa2 = Aano2.getSelectedItem().toString()+"-"+Mes2.getSelectedItem().toString()+"-"+Dia2.getSelectedItem().toString();
            Fechaa3 = Aano3.getSelectedItem().toString()+"-"+Mes3.getSelectedItem().toString()+"-"+Dia3.getSelectedItem().toString();
            band1 = formatofecha.formato(Fechaa1);
            band2 = formatofecha.formato(Fechaa2);
            band3 = false;
            if((!Aano3.getSelectedItem().toString().equalsIgnoreCase("..."))&&(!Mes3.getSelectedItem().toString().equalsIgnoreCase("..."))
            &&(!Dia3.getSelectedItem().toString().equalsIgnoreCase("..."))){
                band3 = formatofecha.formato(Fechaa3);
            }
            if((band1==false)&&(band2==false)&&(band3==false)){
                advertencia3.setLocationRelativeTo(null);
                advertencia3.getContentPane().setBackground(new Color(222,222,222));
                advertencia3.setVisible(true);
            }
            else{
                advertencia4.setLocationRelativeTo(null);
                advertencia4.getContentPane().setBackground(new Color(222,222,222));
                advertencia4.setVisible(true);                
            }
        }
        else{
            advertencia2.setLocationRelativeTo(null);
            advertencia2.getContentPane().setBackground(new Color(222,222,222));
            advertencia2.setVisible(true);
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void aceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar1ActionPerformed
        sql = "DELETE FROM peliculas.peliculas WHERE idPelicula='"+ID.getText()+"'";
        cxn.Ejecutar(sql);
        advertencia1.setVisible(false);
        this.setVisible(false);
        new GestionInventario().setVisible(true);
    }//GEN-LAST:event_aceptar1ActionPerformed

    private void cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar1ActionPerformed
        advertencia1.setVisible(false);
    }//GEN-LAST:event_cancelar1ActionPerformed

    private void aceptar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar3ActionPerformed
        if((!Aano3.getSelectedItem().toString().equalsIgnoreCase("..."))&&(!Mes3.getSelectedItem().toString().equalsIgnoreCase("..."))
        &&(!Dia3.getSelectedItem().toString().equalsIgnoreCase("..."))){
            sql = "UPDATE peliculas.peliculas SET Fecha_Entrega='"+Fechaa3+"' WHERE idPelicula='"+ID.getText()+"'";
            cxn.Ejecutar(sql);
        }
        else{
            sql = "UPDATE peliculas.peliculas SET Fecha_Entrega=NULL WHERE idPelicula='"+ID.getText()+"'";
            cxn.Ejecutar(sql);
        }
        sql = "UPDATE peliculas.peliculas SET Titulo='"+Pelicula.getText()+"',Reparto='"+Reparto.getText()+"',"
             +"Genero='"+Genero.getSelectedItem().toString()+"',Censura='"+Censura.getSelectedItem().toString()+"',"
             +"Año='"+Ano.getText()+"',Precio='"+Precio.getText()+"',Precio_Pedido='"+Predido.getText()+"',"
             +"Cantidad='"+Cantidad.getText()+"',Distribuidor='"+Distribuidor.getText()+"',Estatus='"+Estatus.getSelectedItem().toString()+"',"
             +"Uso='"+Uso.getSelectedItem().toString()+"',Condicion='"+Condicion.getSelectedItem().toString()+"',"
             +"Fecha_Solicitud='"+Fechaa1+"',Fecha_Esperada='"+Fechaa2+"' WHERE idPelicula='"+ID.getText()+"'";
        cxn.Ejecutar(sql);
        advertencia3.setVisible(false);
        this.setVisible(false);
        new GestionInventario().setVisible(true);
    }//GEN-LAST:event_aceptar3ActionPerformed

    private void cancelar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar3ActionPerformed
        advertencia3.setVisible(false);
    }//GEN-LAST:event_cancelar3ActionPerformed

    private void aceptar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar4ActionPerformed
        error.setVisible(false);
        ID.setText("");
    }//GEN-LAST:event_aceptar4ActionPerformed

    private void AnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AnoKeyTyped
        int limite = 4;
        char C=evt.getKeyChar();
        if (((Ano.getText().length()== limite))||((C<'0')||(C>'9')))
            evt.consume();
    }//GEN-LAST:event_AnoKeyTyped

    private void IDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDKeyTyped
        int limite = 7;
        char C=evt.getKeyChar();
        if (((ID.getText().length()== limite))||((C<'0')||(C>'9')))
            evt.consume();
    }//GEN-LAST:event_IDKeyTyped

    private void DistribuidorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DistribuidorKeyTyped
        int limite = 50;
        char C=evt.getKeyChar();
        char D = 39;
        if ((Distribuidor.getText().length()== limite)||(C == D))
            evt.consume();
    }//GEN-LAST:event_DistribuidorKeyTyped

    private void PrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrecioKeyTyped
        int limite = 7;
        char C=evt.getKeyChar();
        if (((Precio.getText().length()== limite))||((C<'0')||(C>'9')))
            evt.consume();
    }//GEN-LAST:event_PrecioKeyTyped

    private void PredidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PredidoKeyTyped
        int limite = 7;
        char C=evt.getKeyChar();
        if (((Predido.getText().length()== limite))||((C<'0')||(C>'9')))
            evt.consume();
    }//GEN-LAST:event_PredidoKeyTyped

    private void CantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantidadKeyTyped
        int limite = 4;
        char C=evt.getKeyChar();
        if (((Cantidad.getText().length()== limite))||((C<'0')||(C>'9')))
            evt.consume();
    }//GEN-LAST:event_CantidadKeyTyped

    private void aceptar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar5ActionPerformed
        advertencia4.setVisible(false);
    }//GEN-LAST:event_aceptar5ActionPerformed

    private void UsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsoActionPerformed
        if(Uso.getSelectedItem().toString().equals("Alquiler")){
            Condicion.removeAllItems();
            Condicion.addItem("...");
            Condicion.addItem("Buena");
            Condicion.addItem("Dañada");
            Condicion.setEnabled(true);
        }
        else if(Uso.getSelectedItem().toString().equals("Alquiler")){
            Condicion.removeAllItems();
            Condicion.addItem("...");
            Condicion.addItem("Nueva");
            Condicion.addItem("Dañada");
            Condicion.setEnabled(true);
        }
    }//GEN-LAST:event_UsoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ModificarPelicula().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Aano1;
    private javax.swing.JComboBox Aano2;
    private javax.swing.JComboBox Aano3;
    private javax.swing.JTextField Ano;
    private javax.swing.JButton Atras;
    private javax.swing.JButton Borrar;
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JComboBox Censura;
    private javax.swing.JComboBox Condicion;
    private javax.swing.JComboBox Dia1;
    private javax.swing.JComboBox Dia2;
    private javax.swing.JComboBox Dia3;
    private javax.swing.JTextField Distribuidor;
    private javax.swing.JButton Eliminar;
    private javax.swing.JComboBox Estatus;
    private javax.swing.JComboBox Genero;
    private javax.swing.JTextField ID;
    private javax.swing.JComboBox Mes1;
    private javax.swing.JComboBox Mes2;
    private javax.swing.JComboBox Mes3;
    private javax.swing.JButton Modificar;
    private javax.swing.JTextField Pelicula;
    private javax.swing.JTextField Precio;
    private javax.swing.JTextField Predido;
    private javax.swing.JTextField Reparto;
    private javax.swing.JComboBox Uso;
    private javax.swing.JButton aceptar1;
    private javax.swing.JButton aceptar2;
    private javax.swing.JButton aceptar3;
    private javax.swing.JButton aceptar4;
    private javax.swing.JButton aceptar5;
    private javax.swing.JDialog advertencia1;
    private javax.swing.JDialog advertencia2;
    private javax.swing.JDialog advertencia3;
    private javax.swing.JDialog advertencia4;
    private javax.swing.JButton cancelar1;
    private javax.swing.JButton cancelar3;
    private javax.swing.JDialog error;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
