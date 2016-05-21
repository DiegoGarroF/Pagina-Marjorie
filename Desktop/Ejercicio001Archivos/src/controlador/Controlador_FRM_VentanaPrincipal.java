package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.MetodosUsuarios;
import vista.FRM_MantenimientoCursos;
import vista.FRM_MantenimientoEstudiantes;
import vista.FRM_MantenimientoUsuarios;
import vista.FRM_Matricula;

/**
 *
 * @author tecnologiamultimedia
 */
public class Controlador_FRM_VentanaPrincipal implements ActionListener{

    FRM_MantenimientoEstudiantes frm_MantenimientoEstufiantes;
    FRM_MantenimientoCursos frm_MantenimientoCursos;
    FRM_Matricula frm_Matricula;
    FRM_MantenimientoUsuarios usuarios;
    MetodosUsuarios metodosUsuario;
    
    public Controlador_FRM_VentanaPrincipal(MetodosUsuarios metodosUsuario)
    {
        frm_MantenimientoEstufiantes= new FRM_MantenimientoEstudiantes();
        frm_MantenimientoCursos= new FRM_MantenimientoCursos();
        frm_Matricula=new FRM_Matricula(frm_MantenimientoEstufiantes, frm_MantenimientoCursos);
        this.metodosUsuario = metodosUsuario;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Salir"))
        {
            System.exit(0);
        }
        if(e.getActionCommand().equals("Estudiantes"))
        {
            frm_MantenimientoEstufiantes.setVisible(true);    
        }
        if(e.getActionCommand().equals("Cursos"))
        {
            frm_MantenimientoCursos.setVisible(true);
        }
        if(e.getActionCommand().equals("Matricula"))
        {
            frm_Matricula.setVisible(true);
            frm_Matricula.colocarCodigo();
        }
    }
    
}//Fin de la clase Controlador_FRM_VentanaPrincipal












