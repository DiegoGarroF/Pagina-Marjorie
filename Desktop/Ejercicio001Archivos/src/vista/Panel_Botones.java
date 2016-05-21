package vista;

import controlador.Controlador_FRM_MantenimientoCursos;
import controlador.Controlador_FRM_MantenimientoEstudiantes;
import controlador.Controlador_FRM_MantenimientoUsuarios;
import controlador.Controlador_FRM_Matricula;

/**
 *
 * @author tecnologiamultimedia
 */
public class Panel_Botones extends javax.swing.JPanel {

    public Panel_Botones() {
        initComponents();
        this.btn_Agregar.setEnabled(false);
        this.btn_Modificar.setEnabled(false);
        this.btn_Eliminar.setEnabled(false);
    }
    public void agregarEventos(Controlador_FRM_MantenimientoEstudiantes controlador)
    {
        this.btn_Consultar.addActionListener(controlador);
        this.btn_Agregar.addActionListener(controlador);
        this.btn_Modificar.addActionListener(controlador);
        this.btn_Eliminar.addActionListener(controlador);
    }
    public void agregarEventos(Controlador_FRM_MantenimientoUsuarios controlador)
    {
        this.btn_Consultar.addActionListener(controlador);
        this.btn_Agregar.addActionListener(controlador);
        this.btn_Modificar.addActionListener(controlador);
        this.btn_Eliminar.addActionListener(controlador);
    }
    
    public void agregarEventos(Controlador_FRM_Matricula controlador)
    {
        this.btn_Consultar.addActionListener(controlador);
        this.btn_Agregar.addActionListener(controlador);
        this.btn_Modificar.addActionListener(controlador);
        this.btn_Eliminar.addActionListener(controlador);
    }
    
    public void agregarEventosCursos(Controlador_FRM_MantenimientoCursos controlador)
    {
        this.btn_Consultar.addActionListener(controlador);
        this.btn_Agregar.addActionListener(controlador);
        this.btn_Modificar.addActionListener(controlador);
        this.btn_Eliminar.addActionListener(controlador);
    }
    public void habilitarAgregar()
    {
        this.btn_Agregar.setEnabled(true);
    }
    public void deshabilitarBotones()
    {
        this.btn_Agregar.setEnabled(false);
        this.btn_Modificar.setEnabled(false);
        this.btn_Eliminar.setEnabled(false);
    }
    public void habilitarEdicion()
    {
        this.btn_Modificar.setEnabled(true);
        this.btn_Eliminar.setEnabled(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Consultar = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();

        btn_Consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btn_Consultar.setActionCommand("Consultar");

        btn_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        btn_Agregar.setActionCommand("Agregar");

        btn_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificar.png"))); // NOI18N
        btn_Modificar.setActionCommand("Modificar");

        btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btn_Eliminar.setActionCommand("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Consultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Eliminar)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Eliminar)
                    .addComponent(btn_Modificar)
                    .addComponent(btn_Agregar)
                    .addComponent(btn_Consultar))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Consultar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Modificar;
    // End of variables declaration//GEN-END:variables
}
