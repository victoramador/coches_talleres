public class Persona {
    private String dni;
    private String numSeguridadSocial;
    private String nombre;
    private String apellidos;
    private int edad;
    private double salario;

    public Persona(String dni, String numSeguridadSocial, String nombre, String apellidos, int edad, double precio) {
        this.dni = dni;
        this.numSeguridadSocial = numSeguridadSocial;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.salario = precio;
    }

    public String getDni() {
        return dni;
    }

    public String getNumSeguridadSocial() {
        return numSeguridadSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNumSeguridadSocial(String numSeguridadSocial) {
        this.numSeguridadSocial = numSeguridadSocial;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", numSeguridadSocial='" + numSeguridadSocial + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }
}
