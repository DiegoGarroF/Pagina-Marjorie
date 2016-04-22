/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosPrestamo;
import Vista.FRM_MantenimientoPrestamos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author JenifferHR
 */
public class Controlador_FRM_Prestamo implements ActionListener {

    FRM_MantenimientoPrestamos fRM_MantenimientoPrestamos;
    MetodosPrestamo metodosPrestamo;

    public Controlador_FRM_Prestamo(FRM_MantenimientoPrestamos fRM_MantenimientoPrestamos) {
        this.fRM_MantenimientoPrestamos = fRM_MantenimientoPrestamos;
        metodosPrestamo = new MetodosPrestamo();
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equalsIgnoreCase("Agregar")) {
            
            if (metodosPrestamo.buscarPrestamo(Integer.parseInt(metodosPrestamo.generarCodigoConsecutivo()))==false) {
                if (fRM_MantenimientoPrestamos.devolverVectorCargado()[1].equalsIgnoreCase("")
                        || fRM_MantenimientoPrestamos.devolverVectorCargado()[2].equalsIgnoreCase("")
                        || fRM_MantenimientoPrestamos.devolverVectorCargado()[3].equalsIgnoreCase("")) {

                    fRM_MantenimientoPrestamos.devolverMensaje("Debe completar los datos");

                }//fin del if
                else {
                    fRM_MantenimientoPrestamos.habilitandoAgregar();
                    metodosPrestamo.agregarPrestamo(fRM_MantenimientoPrestamos.devolverVectorCargado());
                    fRM_MantenimientoPrestamos.devolverMensaje("Agregado correctamente");
                    fRM_MantenimientoPrestamos.resetearGUI();
                }
            }//fin del if
            else {
                fRM_MantenimientoPrestamos.devolverMensaje("El prestamo ya existe");
            }

        }//fin del if

        if (e.getActionCommand().equalsIgnoreCase("Consultar")) {
            if (metodosPrestamo.buscarPrestamo(Integer.parseInt(metodosPrestamo.generarCodigoConsecutivo()))==true) {
                
                fRM_MantenimientoPrestamos.llenarCampos(metodosPrestamo.devolverVectorInformacionAlmacenada());
            }
            else{
                fRM_MantenimientoPrestamos.habilitandoAgregar();
            }
            
        }
        if (e.getActionCommand().equalsIgnoreCase("Modificar")) {
            
          if(metodosPrestamo.buscarPrestamo(Integer.parseInt(metodosPrestamo.generarCodigoConsecutivo()))==true){  
                metodosPrestamo.modificarPrestamo(fRM_MantenimientoPrestamos.devolverVectorCargado());
                fRM_MantenimientoPrestamos.devolverMensaje("Se modificó correctamente");
            }
        }
        if (e.getActionCommand().equalsIgnoreCase("Eliminar")) {
            
            if (metodosPrestamo.buscarPrestamo(Integer.parseInt(metodosPrestamo.generarCodigoConsecutivo())) == true) {
                metodosPrestamo.eliminarPrestamo(fRM_MantenimientoPrestamos.devolverVectorCargado());
                fRM_MantenimientoPrestamos.devolverMensaje("Se eliminó correctamente");
                fRM_MantenimientoPrestamos.resetearGUI();
            }
        }
    }
    

}//fin de la clase
            

