package vista;

import javax.swing.JOptionPane;
import modelo.MetodosUsuarios;
/**
 *
 * @author vaio01
 */
public class FRM_Login extends javax.swing.JFrame {

    MetodosUsuarios metodosUsuario;
    private FRM_VentanaPrincipal frm_VentanaPrincipal;
    
    public FRM_Login(MetodosUsuarios metodosUsuario) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Ventana Login");
        this.metodosUsuario = metodosUsuario;
    }
    public void login()
    {
        String nombreUsuario = this.jText_NombreUsuario.getText();
        /* Mediante el método consultar con el nombreUsuario, me doy cuenta si
        el usuario existe en el array de la clase MetodosUsuario. Si existe, entonces
        procede con el resto, de lo contrario no entra en el if y muestra el mensaje
        que está en el else. */
        if(metodosUsuario.consultar(nombreUsuario))
        {
            /* Guarda la contraseña que el usuario ingreso en el campo de contraseña. */
            String contrasenia = this.jPassword_Contraseña.getText();
            
            /* Con este if se compara si la contraseña ingresada es igual a la del
            usuario que se ingreso en el campo de texto nombreUsuario. Si es igual
            entonces entra en el if, y si no es igual muestra un mensaje diciendolo. */
            if(contrasenia.equals(metodosUsuario.obtenerUsuarioConsultado().getContraseña()))
            {
                 /* Cierra la ventana de login y muestra la principal. */
                this.dispose();
                    
               /* En la ventana principal existe un metodo que se llama entrarAdministrador(),
                que realiza cierta acción y no permite ver algunos componentes de la
                ventana. */
                frm_VentanaPrincipal = new FRM_VentanaPrincipal(metodosUsuario);
                frm_VentanaPrincipal.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Nombre de usuario incorrecto");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jL_NombreUsuario = new javax.swing.JLabel();
        jL_Contraseña = new javax.swing.JLabel();
        jText_NombreUsuario = new javax.swing.JTextField();
        jPassword_Contraseña = new javax.swing.JPasswordField();
        jB_Ingresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jL_NombreUsuario.setText("Nombre Usuario:");

        jL_Contraseña.setText("Contraseña:");

        jB_Ingresar.setText("Ingresar");
        jB_Ingresar.setActionCommand("");
        jB_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_IngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_NombreUsuario)
                    .addComponent(jL_Contraseña))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB_Ingresar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jText_NombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                        .addComponent(jPassword_Contraseña)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_NombreUsuario)
                    .addComponent(jText_NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_Contraseña)
                    .addComponent(jPassword_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jB_Ingresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_IngresarActionPerformed
        // TODO add your handling code here:
        login();
    }//GEN-LAST:event_jB_IngresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Ingresar;
    private javax.swing.JLabel jL_Contraseña;
    private javax.swing.JLabel jL_NombreUsuario;
    private javax.swing.JPasswordField jPassword_Contraseña;
    private javax.swing.JTextField jText_NombreUsuario;
    // End of variables declaration//GEN-END:variables
}
