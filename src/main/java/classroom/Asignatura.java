package classroom;

public class Asignatura {

    public String nombre;
    private int codigoInterno;
    public int codigoExterno;
    private Tipo tipo;

    public Asignatura() {
        this("Sin nombre", Tipo.FUNDAMENTACION);
    }

    public Asignatura(int codigoInterno, int codigoExterno, Tipo tipo) {
        this("Sin nombre", codigoInterno, codigoExterno,tipo);
    }

    public Asignatura(int codigoExterno, Tipo tipo) {
        this("Sin nombre", 0, codigoExterno,tipo);
    }

    public Asignatura(String nombre, Tipo tipo) {
        this(nombre, 0, 0,tipo);
    }

    public Asignatura(String nombre, int codigoInterno, int codigoExterno,Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    public void cambiarDatos(int codigoInterno, int codigoExterno, String nombre,Tipo tipo) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public void setCodigoExterno(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    public void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }
    
    public void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
    }
}
