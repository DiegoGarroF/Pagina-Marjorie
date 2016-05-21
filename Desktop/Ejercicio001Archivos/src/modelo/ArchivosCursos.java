package modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author vaio01
 */
public class ArchivosCursos {
    ObjectOutputStream archivoSalida;
    ObjectInputStream archivoEntrada;

    public ArchivosCursos() {
   }

 public void crearArchivo(){
      try
      {
         archivoSalida=new ObjectOutputStream(new FileOutputStream("cursos.dat"));
         System.out.println("El archivo 'cursos', ha sido creado.");
      }
      catch(Exception e)
      {
          System.out.println("Error al crear el archivo: "+e);
      }
    }
    
    public void escribirInformacionEnElArchivo(Cursos cursos){
      try
      {
         archivoSalida.writeObject(cursos);
         System.out.println("Se escribió la información de forma correcta en: cursos");
      }
      catch(Exception e)
      {
          System.out.println("Error al escribir en el archivo: "+e);
      }
    }
    public String leerInformacion()
    {
     Cursos cursos=null;
      try
      {
        archivoEntrada=new ObjectInputStream(new FileInputStream("cursos.dat"));
        cursos=(Cursos)archivoEntrada.readObject();
      }
      catch(Exception e)
      {
          System.out.println("Error al leer información del archivo: "+e);
      }
        return cursos.getInformacion();
    }
   
    public ArrayList<Cursos> leerInformacionCompleta()
    {
      ArrayList<Cursos>arrayCursos=new ArrayList<Cursos>();
      try
      {
        archivoEntrada=new ObjectInputStream(new FileInputStream("cursos.dat"));
        while(true)
        {
          arrayCursos.add((Cursos)archivoEntrada.readObject());
        }
      }
      catch(Exception e)
      {
          System.out.println("Fin del archivo: "+e);
      }
        return arrayCursos;
    }
    public boolean existeArchivo()
    {
      boolean existe=false;
      try{
        archivoEntrada=new ObjectInputStream(new FileInputStream("cursos.dat"));
        existe=true;
      }
      catch(Exception e)
      {
          System.out.println("No existe el archivo "+e);
      }
      return existe;
    }
}
