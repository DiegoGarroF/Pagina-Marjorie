package vista;

import controlador.Controlador_FRM_MantenimientoUsuarios;
/**
 *
 * @author vaio01
 */
public class Panel_Usuario extends javax.swing.JPanel {

    Controlador_FRM_MantenimientoUsuarios controlador;
    
    public Panel_Usuario() {
        initComponents();
        cargarTipo();
        deshabilitarCampos();
    }

    public void cargarTipo()
    {
       jComboBox_Tipo.removeAllItems();
       jComboBox_Tipo.addItem("Opciones"); //Como hacer para que no sea seleccionable
       jComboBox_Tipo.addItem("Usuario");
       jComboBox_Tipo.addItem("Administrador");
    }
    public void agregarEventos(Controlador_FRM_MantenimientoUsuarios controlador)
    {
      this.controlador=controlador; //para la tecla enter
    }
    public String devolverCedula()
    {
        return this.jTextField_Cedula.getText();
    }
    public void habilitarEdicion()
    {
        this.jTextField_Cedula.setEnabled(false);
        this.jTextField_NombreCompleto.setEnabled(true);
        this.jTextField_NombreUsuario.setEnabled(true);
        this.jPasswordField_Contraseña.setEnabled(true);
        this.jPasswordField_Contraseña2.setEnabled(true);
        this.jComboBox_Tipo.setEnabled(true);
    }
    public void mostrarInformacion(String arreglo[])
    {
        this.jTextField_NombreCompleto.setText(arreglo[0]);
        this.jTextField_NombreUsuario.setText(arreglo[1]);
        this.jPasswordField_Contraseña.setText(arreglo[2]);
        this.jPasswordField_Contraseña2.setText(arreglo[3]);
        this.jComboBox_Tipo.setSelectedItem(arreglo[4]);  //Muestra el item guardado que fue seleccionado
    }
    public void habilitarCampos()
    {
       this.jTextField_NombreCompleto.setEnabled(true);
       this.jTextField_NombreUsuario.setEnabled(true);
       this.jPasswordField_Contraseña.setEnabled(true);
       this.jPasswordField_Contraseña2.setEnabled(true);
       this.jComboBox_Tipo.setEnabled(true);  
    }
    public String[] devolverInformacion()
    {
        String informacion[]=new String[6];
        informacion[0]=this.jTextField_Cedula.getText();
        informacion[1]=this.jTextField_NombreCompleto.getText();
        informacion[2]=this.jTextField_NombreUsuario.getText();
        informacion[3]=this.jPasswordField_Contraseña.getText(); //Retorna la contraseña digitada pero en *****
        informacion[4]=this.jPasswordField_Contraseña2.getText(); //******
        informacion[5]=this.jComboBox_Tipo.getSelectedItem().toString();
        return informacion;
    }
    public void deshabilitarCampos()
    {
        this.jTextField_Cedula.setText("");
        this.jTextField_Cedula.setEnabled(true);
        
        this.jTextField_NombreCompleto.setText("");
        this.jTextField_NombreCompleto.setEnabled(false);
        
        this.jComboBox_Tipo.setSelectedItem("Opciones");
        this.jComboBox_Tipo.setEnabled(false);
        
        this.jTextField_NombreUsuario.setText("");
        this.jTextField_NombreUsuario.setEnabled(false);
        this.jPasswordField_Contraseña.setText("");
        this.jPasswordField_Contraseña.setEnabled(false);
        this.jPasswordField_Contraseña2.setText("");
        this.jPasswordField_Contraseña2.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Cedula = new javax.swing.JLabel();
        jLabel_NombreCompleto = new javax.swing.JLabel();
        jLabel_NombreUsuario = new javax.swing.JLabel();
        jLabel_Contraseña = new javax.swing.JLabel();
        jLabel_Contraseña2 = new javax.swing.JLabel();
        jLabel_Tipo = new javax.swing.JLabel();
        jTextField_Cedula = new javax.swing.JTextField();
        jTextField_NombreCompleto = new javax.swing.JTextField();
        jTextField_NombreUsuario = new javax.swing.JTextField();
        jPasswordField_Contraseña = new javax.swing.JPasswordField();
        jPasswordField_Contraseña2 = new javax.swing.JPasswordField();
        jComboBox_Tipo = new javax.swing.JComboBox();

        jLabel_Cedula.setText("Cédula:");

        jLabel_NombreCompleto.setText("Nombre Completo:");

        jLabel_NombreUsuario.setText("Nombre Usuario:");

        jLabel_Contraseña.setText("Contraseña:");

        jLabel_Contraseña2.setText("Repetir Contraseña:");

        jLabel_Tipo.setText("Tipo:");

        jTextField_Cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_CedulaKeyPressed(evt);
            }
        });

        jComboBox_Tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_Cedula)
                        .addGap(53, 53, 53)
                        .addComponent(jTextField_Cedula))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_NombreCompleto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_NombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_NombreUsuario)
                            .addComponent(jLabel_Contraseña))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_NombreUsuario)
                            .addComponent(jPasswordField_Contraseña)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Contraseña2)
                            .addComponent(jLabel_Tipo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField_Contraseña2)
                            .addComponent(jComboBox_Tipo, 0, 170, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Cedula)
                    .addComponent(jTextField_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_NombreCompleto)
                    .addComponent(jTextField_NombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_NombreUsuario)
                    .addComponent(jTextField_NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Contraseña)
                    .addComponent(jPasswordField_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Contraseña2)
                    .addComponent(jPasswordField_Contraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Tipo)
                    .addComponent(jComboBox_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_CedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_CedulaKeyPressed
        if(evt.getKeyCode()==10)
        {
            this.controlador.buscar();
        }
    }//GEN-LAST:event_jTextField_CedulaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox_Tipo;
    private javax.swing.JLabel jLabel_Cedula;
    private javax.swing.JLabel jLabel_Contraseña;
    private javax.swing.JLabel jLabel_Contraseña2;
    private javax.swing.JLabel jLabel_NombreCompleto;
    private javax.swing.JLabel jLabel_NombreUsuario;
    private javax.swing.JLabel jLabel_Tipo;
    private javax.swing.JPasswordField jPasswordField_Contraseña;
    private javax.swing.JPasswordField jPasswordField_Contraseña2;
    private javax.swing.JTextField jTextField_Cedula;
    private javax.swing.JTextField jTextField_NombreCompleto;
    private javax.swing.JTextField jTextField_NombreUsuario;
    // End of variables declaration//GEN-END:variables
}
