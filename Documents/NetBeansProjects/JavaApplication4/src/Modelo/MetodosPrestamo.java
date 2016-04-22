/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author JenifferHR
 */
public class MetodosPrestamo {
    
    ArrayList<Prestamo> listaPrestamos;
    String informacionAlmacenadaPrestamos[];
    int posicion;

    public MetodosPrestamo() {
        
        listaPrestamos = new ArrayList<Prestamo>();
        informacionAlmacenadaPrestamos = new String[3];
        
    }
    
    public void agregarPrestamo(String informacion[])
    {
        Prestamo prestamoTemporal = new Prestamo(Integer.parseInt(informacion[0]),informacion[1],informacion[2],informacion[3]);
        listaPrestamos.add(prestamoTemporal);
    }//fin del metodo agregar
    
    public boolean buscarPrestamo(int numeroPrestamo)
    {
        boolean existencia=false;
        
        for(int contador=0; contador<listaPrestamos.size();contador++)
        {
            if(listaPrestamos.get(contador).getNumeroPrestamo()==(numeroPrestamo))
            {
                informacionAlmacenadaPrestamos[0]=""+listaPrestamos.get(contador).getNombreUsuario();
                informacionAlmacenadaPrestamos[1]=""+listaPrestamos.get(contador).getCedulaUsuario();
                informacionAlmacenadaPrestamos[2]=""+listaPrestamos.get(contador).getIsbnLibro();
                posicion=contador;
                return true;
            }
        }
        return existencia;
    }//fin del metodo buscar
    
    public void modificarPrestamo(String informacion[])
    {
        if(buscarPrestamo(Integer.parseInt(informacion[0]))==true)
        {
            listaPrestamos.get(posicion).setNombreUsuario(informacion[1]);
            listaPrestamos.get(posicion).setCedulaUsuario(informacion[2]);
            listaPrestamos.get(posicion).setIsbnLibro(informacion[3]);
        }
    }
    
    public void eliminarPrestamo(String informacion[])
    {
       if(buscarPrestamo(Integer.parseInt(informacion[0]))==true)
       {
           listaPrestamos.remove(posicion);
       }
    }
    
    public String []devolverVectorInformacionAlmacenada()
    {
        return informacionAlmacenadaPrestamos;
    }
    
    public String generarCodigoConsecutivo()
    { 
        String codigo="0000"+this.listaPrestamos.size()+1;
        
        codigo=codigo.substring(codigo.length()-5,codigo.length());
        
        return codigo;
    }
    
}//fin de la clase
