 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_FRM_Prestamo;
import Modelo.MetodosPrestamo;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author JenifferHR
 */
public class FRM_MantenimientoPrestamos extends javax.swing.JFrame {

    Controlador_FRM_Prestamo controlador;
    MetodosPrestamo metodosPrestamo;
    
    public FRM_MantenimientoPrestamos() {
        initComponents();
        metodosPrestamo = new MetodosPrestamo();
        Controlador_FRM_Prestamo controlador = new Controlador_FRM_Prestamo(this);
        recibiendoControlador(controlador);
        cargarConsecutivo();
        estadoInicioBtn();
    }
    

    public void recibiendoControlador(ActionListener controlador)
    {
        panel_Botones1.recibirControlador(controlador);
    }
    public String[] devolverVectorCargado()
    {
        return panel_Informacion1.devolverVectorInformacion();
    }
    public void devolverMensaje(String msj)
    {
        JOptionPane.showMessageDialog(null,msj);
    }
    
    public void cargarConsecutivo()
    {
        panel_Informacion1.cargarConsecutivo(metodosPrestamo.generarCodigoConsecutivo());
    }
    public void llenarCampos(String informacionAlmacenadaPrestamo[])
    {
        panel_Informacion1.llenarInformacionJT(informacionAlmacenadaPrestamo);
    } 
    public void estadoInicioBtn()
    {
        panel_Informacion1.estadoInicialBotones();
    }
    
    public void habilitandoAgregar()
    {
        panel_Informacion1.habilitarAgregar();
    }
    public void resetearGUI()
    {
        panel_Informacion1.resetearInterfaz();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Botones1 = new Vista.Panel_Botones();
        panel_Informacion1 = new Vista.Panel_Informacion();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_Informacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_Botones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_Informacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_Botones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRM_MantenimientoPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_MantenimientoPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_MantenimientoPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_MantenimientoPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_MantenimientoPrestamos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.Panel_Botones panel_Botones1;
    private Vista.Panel_Informacion panel_Informacion1;
    // End of variables declaration//GEN-END:variables
}
