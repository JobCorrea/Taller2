public class Error {
    /* public String nombre;

    public Error(String nombre) {
    this.nombre = nombre;
    }

    // this no se puede usar en método static
    public static void mostrarNombre() {
    System.out.println(this.nombre); // Error de compilación
    } manda el siguiente mensaje
    error: non-static variable this cannot be referenced from a static context*/

    public String nombre;

    public Error(String nombre) {
        this.nombre = nombre;
    }

    //CORRECTO - quitamos static
    public void mostrarError() {
        System.out.println("Nombre: " + this.nombre);
    }
}


