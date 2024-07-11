package Interfaces;

import Datos.UsuarioDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Login extends javax.swing.JFrame {

    private Timer timer;
    private int intentosFallidos = 0;
    private static final int LIMITE_INTENTOS_FALLIDOS = 3;
    
    public Login() {
        initComponents();
        timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            jPasswordField1.setEchoChar('●');
            timer.stop();
        }
    });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnIngresar = new javax.swing.JButton();
        btnVisitante = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_sena.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel2)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("LOGIN");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Tipo de documento");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Contraseña");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Numero de indentidad");

        jComboBox1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C.C.", "T.I", "Pasaporte" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextField1.setBorder(null);

        jPasswordField1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPasswordField1.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(0, 102, 102));

        jSeparator2.setForeground(new java.awt.Color(0, 102, 102));

        btnIngresar.setBackground(new java.awt.Color(0, 102, 102));
        btnIngresar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorder(null);
        btnIngresar.setBorderPainted(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnVisitante.setBackground(new java.awt.Color(0, 102, 102));
        btnVisitante.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnVisitante.setForeground(new java.awt.Color(255, 255, 255));
        btnVisitante.setText("Visitante");
        btnVisitante.setBorder(null);
        btnVisitante.setBorderPainted(false);
        btnVisitante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisitanteActionPerformed(evt);
            }
        });

        btnRegistrarse.setBackground(new java.awt.Color(0, 102, 102));
        btnRegistrarse.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.setBorder(null);
        btnRegistrarse.setBorderPainted(false);
        btnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("¿No estas registrado?");

        btnMostrar.setBackground(new java.awt.Color(0, 102, 102));
        btnMostrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMostrar.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(419, 419, 419))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(494, 494, 494))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(381, 381, 381))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(54, 54, 54)
                                .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(btnVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(242, 242, 242))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 560, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 700, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        String tipoDocumento = jComboBox1.getSelectedItem().toString();
        String numeroDocumento = jTextField1.getText();
        String contraseña = new String(jPasswordField1.getPassword());

        UsuarioDAO usuarioDAO = new UsuarioDAO();

        // Verificar las credenciales del usuario
        if (usuarioDAO.verificarCredenciales(tipoDocumento, numeroDocumento, contraseña)) {
            // Si las credenciales son válidas, obtener el ID del usuario
            int usuarioId = usuarioDAO.obtenerDatosUsuario(tipoDocumento, numeroDocumento, contraseña);

            System.out.println("usuarioID: " + usuarioId);
            // Aquí puedes proceder con el ID del usuario según sea necesario
            // Por ejemplo, puedes abrir una nueva ventana o realizar otras acciones en función del ID del usuario

            int rolId = usuarioDAO.obtenerRolId(tipoDocumento, numeroDocumento, contraseña);
            System.out.println("rolID: " + rolId);
            
            Login_Ingreso ingreso = new Login_Ingreso();
            ingreso.loginSuccess(usuarioId, rolId);
            ingreso.setVisible(true);
            ingreso.setLocationRelativeTo(null);
            this.dispose();

            intentosFallidos = 0;
        } else {
            // Si las credenciales son incorrectas, mostrar un mensaje de error
            intentosFallidos++;
            if (intentosFallidos >= LIMITE_INTENTOS_FALLIDOS) {
                JOptionPane.showMessageDialog(this, "Bloqueo por intentos fallidos.", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(this, "Credenciales incorrectas. Por favor, inténtelo de nuevo.", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed

        Login_Registro Registro = new Login_Registro();
        Registro.setVisible(true);
        Registro.pack();
        Registro.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisitanteActionPerformed

        Ingreso_Visitante visitante = new Ingreso_Visitante();
        visitante.setVisible(true);
        visitante.pack();
        visitante.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_btnVisitanteActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
         
        jPasswordField1.setEchoChar((char) 0);
        if (!timer.isRunning()) {
            timer.start();
        }
        
    }//GEN-LAST:event_btnMostrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnVisitante;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
