package vista;

import controlador.Controlador_FRM_MantenimientoUsuarios;
import javax.swing.JOptionPane;
import modelo.MetodosUsuarios;
/**
 *
 * @author vaio01
 */
public class FRM_MantenimientoUsuarios extends javax.swing.JFrame {

    MetodosUsuarios metodosUsuario;
    public Controlador_FRM_MantenimientoUsuarios controlador;
    
    public FRM_MantenimientoUsuarios(MetodosUsuarios metodosUsuario) {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Registro de Usuarios");
        controlador=new Controlador_FRM_MantenimientoUsuarios(this);
        agregarEventos();
    }
    public void agregarEventos()
    {
        this.panel_Botones1.agregarEventos(controlador);
        this.panel_Usuario1.agregarEventos(controlador);
    }
    public String devolverCedula()
    {
        return this.panel_Usuario1.devolverCedula();
    }
    public void habilitarEdicion()
    {
        this.panel_Botones1.habilitarEdicion();
        this.panel_Usuario1.habilitarEdicion();
    }
    public void mostrarInformacion(String arreglo[])
    {
        this.panel_Usuario1.mostrarInformacion(arreglo);
    }
    public void mostrarMensaje(String mensaje)
    {
        JOptionPane.showMessageDialog(null,mensaje);
    }
    public void habilitarAgregar()
    {
        this.panel_Botones1.habilitarAgregar();
        this.panel_Usuario1.habilitarCampos();
    }
    public String[] devolverInformacion()
    {
        return this.panel_Usuario1.devolverInformacion();
    }
    public void resetearGUI()
    {
        this.panel_Botones1.deshabilitarBotones();
        this.panel_Usuario1.deshabilitarCampos();
    }
   /*  public void camposVacios()
    {
        String informacion[] = this.metodosUsuario.getArregloInformacion(); // Arreglo con los datos del usuario.
        
        /* Compara que los datos no esten vacios. 
        if(informacion[0].equals("") || informacion[1].equals("") || informacion[2].equals("") || informacion[3].equals("") || informacion[4].equals("") || informacion[5].equals(""))
        {
            JOptionPane.showMessageDialog(null, "No debe dejar espacios en blanco", "", JOptionPane.WARNING_MESSAGE);
        }
    }
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Usuario1 = new vista.Panel_Usuario();
        panel_Botones1 = new vista.Panel_Botones();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_Botones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_Usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_Botones1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private vista.Panel_Botones panel_Botones1;
    private vista.Panel_Usuario panel_Usuario1;
    // End of variables declaration//GEN-END:variables
}
