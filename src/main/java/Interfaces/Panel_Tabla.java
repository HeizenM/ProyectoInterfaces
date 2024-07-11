package Interfaces;

import Datos.IngresoDAO;
import Datos.SalidaDAO;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Panel_Tabla extends javax.swing.JPanel {

    private int usuario_id;
    
    public Panel_Tabla(int usuario_id) {
        initComponents();
        this.usuario_id = usuario_id;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        scrollPane1 = new java.awt.ScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fecha", "Hora", "Serial", "Placa"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        scrollPane1.add(jScrollPane1);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ingreso");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Salida");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Ingreso y salida");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
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

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"Fecha", "Hora", "Serial", "Placa"});
        jTable1.setModel(modelo);

        IngresoDAO ingresoDAO = new IngresoDAO();
        DefaultTableModel datosIngreso = ingresoDAO.obtenerDatosIngreso(usuario_id);
        agregarDatosTabla(datosIngreso);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 
         DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"Fecha", "Hora", "Serial", "Placa"});
        jTable1.setModel(modelo);

        SalidaDAO salidaDAO = new SalidaDAO();
        DefaultTableModel datosSalida = salidaDAO.obtenerDatosSalida(usuario_id);
        agregarDatosTabla(datosSalida);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"Fecha Ingreso", "Hora Ingreso", "Serial", "Placa", "Fecha Salida", "Hora Salida"});
        jTable1.setModel(modelo);

        IngresoDAO ingresoDAO = new IngresoDAO();
        DefaultTableModel datosRelacionados = ingresoDAO.obtenerDatosRelacionados(usuario_id); // Método modificado para obtener datos relacionados
        
        // Imprimir los datos obtenidos en la consola
        for (int i = 0; i < datosRelacionados.getRowCount(); i++) {
            System.out.println("Fecha Ingreso: " + datosRelacionados.getValueAt(i, 0));
            System.out.println("Hora Ingreso: " + datosRelacionados.getValueAt(i, 1));
            System.out.println("Serial: " + datosRelacionados.getValueAt(i, 2));
            System.out.println("Placa: " + datosRelacionados.getValueAt(i, 3));
            System.out.println("Fecha Salida: " + datosRelacionados.getValueAt(i, 4));
            System.out.println("Hora Salida: " + datosRelacionados.getValueAt(i, 5));
        }
        
        agregarDatosTabla(datosRelacionados);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void agregarDatosTabla(DefaultTableModel datos) {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < datos.getRowCount(); i++) {
            Vector<Object> fila = new Vector<>();
            for (int j = 0; j < datos.getColumnCount(); j++) {
                fila.add(datos.getValueAt(i, j));
            }
            modelo.addRow(fila);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables
}
