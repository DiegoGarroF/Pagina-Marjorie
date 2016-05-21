package modelo;

import java.util.ArrayList;

/**
 *
 * @author vaio01
 */
public class MetodosUsuarios {
   
    private ArrayList <Usuario> arrayUsuario;
    String arregloInformacionConsultada[]=new String[5];
    private Usuario usuarioConsultado;
    ArchivosUsuarios archivosUsuarios;
    
    public MetodosUsuarios()
    {
        arrayUsuario=new ArrayList <Usuario>();
        usuarioConsultado=null;
        archivosUsuarios=new ArchivosUsuarios();
    }
    public void verificarArchivo()
    {
     boolean verificar=archivosUsuarios.existeArchivo();
     if(verificar)
     {
       arrayUsuario=archivosUsuarios.leerInformacionCompleta();
       System.out.println("Se cargaron los datos al archivo: usuario.");
     }else{
       archivosUsuarios.crearArchivo();
     }
    }
    public void guardarArchivo()
    {
       //archivosUsuarios.crearArchivo();
       for(int contador=0; contador<arrayUsuario.size();contador++){
           archivosUsuarios.escribirInformacionEnElArchivo(arrayUsuario.get(contador));
       }
    }
    public Usuario obtenerUsuarioConsultado()
    {
        return this.usuarioConsultado;
    }
    public void agregarUsuario(String informacion[])
    {
        Usuario temporal=new Usuario(informacion[0], informacion[1], informacion[2], informacion[3], informacion[4], informacion[5]);
        arrayUsuario.add(temporal);
    }
    
    public void mostrarInformacionUsuario()
    {
        for(int contador=0;contador<arrayUsuario.size();contador++)
        {
            System.out.println(arrayUsuario.get(contador).infoUsuario());
        }
    }
    public boolean consultar(String nombreUsuario)
    {
        boolean existe = false;
        int tamanioArray = arrayUsuario.size();
        
        for(int contador=0; contador<tamanioArray; contador++)
        {
            if(nombreUsuario.equals(arrayUsuario.get(contador).getNombreUsuario()))
            {
                usuarioConsultado = arrayUsuario.get(contador);
                existe = true;
            }
        }
           return existe;
    }
    
    public boolean existeArchivo()
    {
        return this.archivosUsuarios.existeArchivo();
    }
    
    public boolean consultarUsuario(String cedula)
    {
        boolean existe=false;
        for(int contador=0;contador<arrayUsuario.size();contador++)
        {
            if(arrayUsuario.get(contador).getCedula().equals(cedula))
            {
                arregloInformacionConsultada[0]=arrayUsuario.get(contador).getNombreCompleto();
                arregloInformacionConsultada[1]=arrayUsuario.get(contador).getNombreUsuario();
                arregloInformacionConsultada[2]=arrayUsuario.get(contador).getContraseña();
                arregloInformacionConsultada[3]=arrayUsuario.get(contador).getContraseña2();
                arregloInformacionConsultada[4]=arrayUsuario.get(contador).getTipo();
                existe=true;
            }
        }
            return existe;
    }
    
    public void modificarUsuario(String arreglo[])
    {
        for(int contador=0;contador<arrayUsuario.size();contador++)
        {
            if(arrayUsuario.get(contador).getCedula().equals(arreglo[0]))
            {
                arrayUsuario.get(contador).setNombreCompleto(arreglo[1]);
                arrayUsuario.get(contador).setNombreUsuario(arreglo[2]);
                arrayUsuario.get(contador).setContraseña(arreglo[3]);
                arrayUsuario.get(contador).setContraseña2(arreglo[4]);
                arrayUsuario.get(contador).setTipo(arreglo[5]);
            }
        }
    }
    
    public void eliminarUsuario(String arreglo[])
    {
        for(int contador=0;contador<arrayUsuario.size();contador++)
        {
            if(arrayUsuario.get(contador).getCedula().equals(arreglo[0]))
            {
                arrayUsuario.remove(contador);
            }
        }
    }
    public String[] getArregloInformacion()
    {
        return this.arregloInformacionConsultada;
    } 
    public void cargarDatosDeArchivo()
    {
        this.arrayUsuario = this.archivosUsuarios.leerInformacionCompleta();
    }
}
