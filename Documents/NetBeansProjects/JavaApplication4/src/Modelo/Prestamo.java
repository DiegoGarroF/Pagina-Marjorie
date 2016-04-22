/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author JenifferHR
 */
public class Prestamo {
    
    private int numeroPrestamo;
    private String nombreUsuario;
    private String cedulaUsuario;
    private String isbnLibro; //codigo

    public Prestamo(int numeroUsuario, String nombreUsuario, String cedulaUsuario, String isbnLibro) {
        this.numeroPrestamo = numeroUsuario;
        this.nombreUsuario = nombreUsuario;
        this.cedulaUsuario = cedulaUsuario;
        this.isbnLibro = isbnLibro;
    }

    public int getNumeroPrestamo() {
        return numeroPrestamo;
    }

    public void setNumeroUsuario(int numeroUsuario) {
        this.numeroPrestamo = numeroUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setCedulaUsuario(String cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    public String getIsbnLibro() {
        return isbnLibro;
    }

    public void setIsbnLibro(String isbnLibro) {
        this.isbnLibro = isbnLibro;
    }

    public String getInformacion() {
        return "Prestamo{" + "numeroPrestamo=" + numeroPrestamo + ", nombreUsuario=" + nombreUsuario + ", cedulaUsuario=" + cedulaUsuario + ", isbnLibro=" + isbnLibro + '}';
    }
    
    
    
}
