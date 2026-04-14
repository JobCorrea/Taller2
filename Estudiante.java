public class Estudiante {
    private String nombre;
    private int edad;

    // Constructor por defecto llama al de 2 parámetros con this()
    public Estudiante() {
        this("Sin nombre", 0); 
    }

    // Constructor con 2 parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Getters & Setters
    public String getNombre(){return nombre;}
    public void  setNombre(String nombre){this.nombre = nombre;}

    public double getEdad(){return edad;}
    public void setEdad(int edad){this.edad = edad;}

    void detalleEstudiante(){
        System.out.println("INFORMACION DE ESTUDIANTE");
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("''''''''''''''''''''''");
    }
    @Override
    public String toString(){
        return "Estudiante {Nombre ='"+nombre+"', Edad = '"+edad+"'}";
    }
}
