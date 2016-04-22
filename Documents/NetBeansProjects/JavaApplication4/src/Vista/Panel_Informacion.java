/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author JenifferHR
 */
public class Panel_Informacion extends javax.swing.JPanel {

    String informacion[];
    
    public Panel_Informacion() {
        initComponents();
        informacion = new String[4];
    }

    public String[] devolverVectorInformacion()
    {
        informacion[0]=jT_NumPrestamo.getText();
        informacion[1]=jT_NombreUsuario.getText();
        informacion[2]=jT_Cedula.getText();
        informacion[3]=jT_IsbnLibro.getText();
        
        return informacion;
    }
    //metodo para llenar los jtext y poder mostrar la informacion
    public void llenarInformacionJT(String informacionAlmacenadaPrestamo[])
    {
        jT_NombreUsuario.setText(informacionAlmacenadaPrestamo[0]);
        jT_Cedula.setText(informacionAlmacenadaPrestamo[1]);
        jT_IsbnLibro.setText(informacionAlmacenadaPrestamo[2]);
    }       
    
    public void cargarConsecutivo(String consecutivo)
    {
        jT_NumPrestamo.setText(consecutivo);
    }
    
    public void estadoInicialBotones()
    {
        jT_NumPrestamo.setEnabled(true);
        jT_NombreUsuario.setEnabled(false);
        jT_Cedula.setEnabled(false);
        jT_IsbnLibro.setEnabled(false);
    }
    
    public void habilitarAgregar()
    {
         jT_NumPrestamo.setEnabled(true);
        jT_NombreUsuario.setEnabled(true);
        jT_Cedula.setEnabled(true);
        jT_IsbnLibro.setEnabled(true);
    }
    public void resetearInterfaz()
    {
        jT_NombreUsuario.setText("");
        jT_Cedula.setText("");
        jT_IsbnLibro.setText("");
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jT_NumPrestamo = new javax.swing.JTextField();
        jT_NombreUsuario = new javax.swing.JTextField();
        jT_Cedula = new javax.swing.JTextField();
        jT_IsbnLibro = new javax.swing.JTextField();

        jLabel1.setText("Número prestamo");

        jLabel2.setText("Nombre del usuario");

        jLabel3.setText("Cédula");

        jLabel4.setText("ISBN del libro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jT_IsbnLibro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(jT_Cedula, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jT_NumPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jT_NumPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jT_NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jT_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jT_IsbnLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jT_Cedula;
    private javax.swing.JTextField jT_IsbnLibro;
    private javax.swing.JTextField jT_NombreUsuario;
    private javax.swing.JTextField jT_NumPrestamo;
    // End of variables declaration//GEN-END:variables
}
