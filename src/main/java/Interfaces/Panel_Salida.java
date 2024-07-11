package Interfaces;

import Datos.IngresoDAO;
import Datos.SalidaDAO;
import Datos.PertenenciasDAO;
import Datos.TransporteDAO;
import Model.Pertenencias;
import Model.Transporte;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Panel_Salida extends javax.swing.JPanel {

    private PertenenciasDAO pertenenciasDAO;
        private TransporteDAO transporteDAO;
        private int usuario_id;
        private int rol_id;

    public Panel_Salida(int usuario_id, int rol_id) {
        initComponents();
        this.usuario_id = usuario_id;
        this.rol_id = rol_id;
        pertenenciasDAO = new PertenenciasDAO();
        transporteDAO = new TransporteDAO();
        cargarDatos(usuario_id, rol_id);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        scrollPane1 = new java.awt.ScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        scrollPane2 = new java.awt.ScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Descripcion", "Serial"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        scrollPane1.add(jScrollPane1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Placa", "Marca", "Color", "Tipo"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        scrollPane2.add(jScrollPane2);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Transporte");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Pertenencias");

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salida");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(161, 161, 161))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jButton1)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formatterFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String fechaActual = fechaHoraActual.format(formatterFecha);
        String horaActual = fechaHoraActual.format(formatterHora);

        int pertenenciaSeleccionada = jTable1.getSelectedRow();
        int transporteSeleccionado = jTable2.getSelectedRow();

        if (pertenenciaSeleccionada != -1 && transporteSeleccionado != -1) {
            String serial = (String) jTable1.getValueAt(pertenenciaSeleccionada, 1);
            String placa = (String) jTable2.getValueAt(transporteSeleccionado, 0);

            System.out.println("Fecha: " + fechaActual);
            System.out.println("Hora: " + horaActual);
            System.out.println("Serial: " + serial);
            System.out.println("Placa: " + placa);
            System.out.println("Usuario ID: " + usuario_id);
            System.out.println("Rol ID: " + rol_id);

            SalidaDAO salidaDAO = new SalidaDAO();
            
            int ingresoId = salidaDAO.obtenerUltimoIngresoId(usuario_id);
            System.out.println("Ingreso ID: " + ingresoId);

            salidaDAO.agregarSalida(fechaActual, horaActual, serial, placa, usuario_id, rol_id, usuario_id);
            
            JOptionPane.showMessageDialog(this, "Salida guardado correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una pertenencia y un transporte.");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public void cargarDatos(int usuario_id, int rol_id) {
    DefaultTableModel modeloPertenencias = (DefaultTableModel) jTable1.getModel();
    modeloPertenencias.setRowCount(0); // Limpiamos la tabla antes de cargar nuevos datos
    DefaultTableModel modeloTransporte = (DefaultTableModel) jTable2.getModel();
    modeloTransporte.setRowCount(0); // Limpiamos la tabla antes de cargar nuevos datos
    
    // Cargamos las pertenencias del usuario
    DefaultTableModel modeloPertenenciasUsuario = pertenenciasDAO.obtenerDatosPertenencias(usuario_id);
    jTable1.setModel(modeloPertenenciasUsuario);
    
    // Cargamos los transportes del usuario
    DefaultTableModel modeloTransporteUsuario = transporteDAO.obtenerDatosTransporte(usuario_id);
    jTable2.setModel(modeloTransporteUsuario);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private java.awt.ScrollPane scrollPane1;
    private java.awt.ScrollPane scrollPane2;
    // End of variables declaration//GEN-END:variables
}
