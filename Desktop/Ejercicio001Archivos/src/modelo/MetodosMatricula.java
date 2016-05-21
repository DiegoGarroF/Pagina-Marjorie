package modelo;

import controlador.Controlador_FRM_Matricula;
import java.util.ArrayList;
import vista.FRM_Matricula;
/**
 *
 * @author vaio01
 */
public class MetodosMatricula {
    
    private ArrayList <Matricula> arrayMatricula;
    String arregloInformacionConsultada[]=new String[4];
    Controlador_FRM_Matricula controlador;
    MetodosCursos metodosCursos;
    MetodosEstudiantes metodosEstudiantes;
    FRM_Matricula frm_Matricula;
    ArchivosMatricula archivosMatricula;
    
    public MetodosMatricula(MetodosEstudiantes metodosEstudiantes,MetodosCursos metodosCursos,Controlador_FRM_Matricula controlador, FRM_Matricula frm_Matricula){
     arrayMatricula=new ArrayList<Matricula>();
     this.metodosCursos=metodosCursos;
     this.metodosEstudiantes=metodosEstudiantes;
     this.controlador=controlador;
     this.frm_Matricula=frm_Matricula;
     archivosMatricula=new ArchivosMatricula();
  
    }
    public void verificarArchivo()
    {
     boolean verificar=archivosMatricula.existeArchivo();
     if(verificar)
     {
       arrayMatricula=archivosMatricula.leerInformacionCompleta();
       System.out.println("Se cargaron los datos al archivo: matricula.");
     }else{
       archivosMatricula.crearArchivo();
     }
    }
    public void guardarArchivo()
    {
       archivosMatricula.crearArchivo();
       for(int contador=0; contador<arrayMatricula.size();contador++){
           archivosMatricula.escribirInformacionEnElArchivo(arrayMatricula.get(contador));
       }
    }
    public void agregarMatricula(String informacion[])
    {
        Matricula temporal=new Matricula(informacion[0], informacion[1], informacion[2],true);
        arrayMatricula.add(temporal);
    }
    
    public void mostrarInformacion()
    {
      for(int contador=0;contador<arrayMatricula.size();contador++)
        {
          System.out.println(arrayMatricula.get(contador).infoMatricula());
        }
    }
    public boolean consultarMatricula(String codigo)
    {
        boolean existe=false;
        
        for(int contador=0;contador<arrayMatricula.size();contador++)
        {
            if(arrayMatricula.get(contador).getCodigo().equals(codigo)&&(arrayMatricula.get(contador).getEstado()==true))
            {
                arregloInformacionConsultada[0]=codigo;
                arregloInformacionConsultada[1]=arrayMatricula.get(contador).getCedula();
                metodosEstudiantes.consultarEstudiante(arrayMatricula.get(contador).getCedula());
                arregloInformacionConsultada[2]=metodosEstudiantes.getArregloInformacion()[0];
                arregloInformacionConsultada[3]=arrayMatricula.get(contador).getSigla();
                frm_Matricula.agregarInformacionTabla(arregloInformacionConsultada);
                existe=true;
            }
        }
        return existe;
    }
    
    public void modificarMatricula(String arreglo[])
    {
        for(int contador=0;contador<arrayMatricula.size();contador++)
        {
            if(arrayMatricula.get(contador).getCodigo().equals(arreglo[0]))
            {
                arrayMatricula.get(contador).setCedula(arreglo[1]);
                arrayMatricula.get(contador).setSigla(arreglo[2]);
            }
        }
    }
    public void eliminarMatricula1(String arreglo[])
    {
      for(int contador=0;contador<arrayMatricula.size();contador++)
        {
            if(arrayMatricula.get(contador).getCodigo().equals(arreglo[0]))
            {
                arrayMatricula.get(contador).setEstado(false);
            }
        }
    }
    public void eliminarMatricula(String arreglo[])
    {
        for(int contador=0;contador<arrayMatricula.size();contador++)
        {
            if(arrayMatricula.get(contador).getCodigo().equals(arreglo[0]))
            {
                arrayMatricula.remove(contador);
            }
        }
    }
    
    public String[] getArregloInformacion()
    {
        return this.arregloInformacionConsultada;
    } 
    
    public String devolverCodigo(){
        String codigo="0000";
        if(arrayMatricula.size()==0)
        {
          codigo+=1;
        }else{
         int numero=Integer.parseInt(arrayMatricula.get(arrayMatricula.size()-1).getCodigo());
         numero++;
         codigo="0000"+numero;
        }
        codigo=codigo.substring(codigo.length()-5,codigo.length());
        return codigo;
    }
}

