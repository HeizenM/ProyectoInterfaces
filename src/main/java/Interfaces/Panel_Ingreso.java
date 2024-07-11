package Interfaces;

import Datos.IngresoDAO;
import Datos.PertenenciasDAO;
import Datos.TransporteDAO;
import Model.Pertenencias;
import Model.Transporte;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Panel_Ingreso extends javax.swing.JPanel {

        private PertenenciasDAO pertenenciasDAO;
        private TransporteDAO transporteDAO;
        private int usuario_id;
        private int rol_id;

    public Panel_Ingreso(int usuario_id, int rol_id) {
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

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

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Pertenencias");

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Transporte");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(253, 253, 253))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
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

            IngresoDAO ingresoDAO = new IngresoDAO();
            ingresoDAO.agregarIngreso(fechaActual, horaActual, serial, placa, usuario_id, rol_id);

            JOptionPane.showMessageDialog(this, "Ingreso guardado correctamente.");
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
