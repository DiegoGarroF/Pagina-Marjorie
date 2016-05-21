package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.MetodosUsuarios;
import vista.FRM_MantenimientoUsuarios;

/**
 *
 * @author vaio01
 */
public class Controlador_FRM_MantenimientoUsuarios implements ActionListener{
    
    public MetodosUsuarios metodosUsuarios;
    FRM_MantenimientoUsuarios usuarios;
    
public Controlador_FRM_MantenimientoUsuarios(FRM_MantenimientoUsuarios usuarios)
    {
       metodosUsuarios= new MetodosUsuarios();
        this.usuarios=usuarios;
    }
  
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Agregar"))
        {
            metodosUsuarios.agregarUsuario(usuarios.devolverInformacion());
           //usuarios.camposVacios();
            usuarios.mostrarMensaje("El usuario fue registrado de forma correcta");
            metodosUsuarios.verificarArchivo();
            metodosUsuarios.guardarArchivo();
            usuarios.resetearGUI();
        }
        if(e.getActionCommand().equals("Consultar"))
        {            
            buscar();
        }
        if(e.getActionCommand().equals("Modificar"))
        {
            metodosUsuarios.modificarUsuario(usuarios.devolverInformacion());
            usuarios.mostrarMensaje("Los datos del usuario fueron modificados correctamente.");
            usuarios.resetearGUI();
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
            metodosUsuarios.eliminarUsuario(usuarios.devolverInformacion());
            usuarios.mostrarMensaje("El usuario indicado fue eliminado de forma correcta.");
            usuarios.resetearGUI();
        }
    }
    public void buscar()
    {
        if(metodosUsuarios.consultarUsuario(usuarios.devolverCedula()))
            {
                usuarios.mostrarInformacion(metodosUsuarios.getArregloInformacion());
                usuarios.habilitarEdicion();
            }
            else
            {
                usuarios.mostrarMensaje("La cédula buscada no se encuentra.");
                usuarios.habilitarAgregar();
            }
    }
}
