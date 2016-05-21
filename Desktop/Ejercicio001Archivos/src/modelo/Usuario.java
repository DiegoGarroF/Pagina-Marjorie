package modelo;

import java.io.Serializable;

/**
 *
 * @author vaio01
 */
public class Usuario implements Serializable{
    
    String cedula;
    String nombreCompleto;
    String nombreUsuario;
    String contraseña;
    String contraseña2;
    String tipo;

    public Usuario(String cedula, String nombreCompleto, String nombreUsuario, String contraseña, String contraseña2, String tipo) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.contraseña2 = contraseña2;
        this.tipo = tipo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getContraseña2() {
        return contraseña2;
    }

    public void setContraseña2(String contraseña2) {
        this.contraseña2 = contraseña2;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String infoUsuario() {
        return "Usuario:\n"+"Cedula= " +cedula + ",  Nombre Completo= "+nombreCompleto +",  NombreUsuario= " +nombreUsuario+",  Contraseña= " + contraseña+",  Contraseña2= "+contraseña2+",  Tipo= "+tipo;
    }
}
