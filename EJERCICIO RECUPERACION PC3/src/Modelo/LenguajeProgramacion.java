package Modelo;

public class LenguajeProgramacion {
    private int añoCreacion;
    private String caracteristicaPrincipal;
    private String nombre;
    private String utilizacion;

    public LenguajeProgramacion(int anioCreacion, String caracteristicaPrincipal, String nombre, String utilizacion) {
        this.añoCreacion = anioCreacion;
        this.caracteristicaPrincipal = caracteristicaPrincipal;
        this.nombre = nombre;
        this.utilizacion = utilizacion;
    }

    public int getAnioCreacion() {
        return añoCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.añoCreacion = anioCreacion;
    }

    public String getCaracteristicaPrincipal() {
        return caracteristicaPrincipal;
    }

    public void setCaracteristicaPrincipal(String caracteristicaPrincipal) {
        this.caracteristicaPrincipal = caracteristicaPrincipal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUtilizacion() {
        return utilizacion;
    }

    public void setUtilizacion(String utilizacion) {
        this.utilizacion = utilizacion;
    }

    @Override
    public String toString() {
        return 
                "añoCreacion=" + añoCreacion +
                ", caracteristicaPrincipal='" + caracteristicaPrincipal + '\'' +
                ", nombre='" + nombre + '\'' +
                ", utilizacion='" + utilizacion + '\'';
    }
}