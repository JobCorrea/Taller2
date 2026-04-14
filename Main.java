public class Main {
    

    public static void main(String[] args) {
        Producto pro = new Producto("Ventilador", 100000);
        pro.mostrarProducto();

        Estudiante study = new Estudiante("Isabel", 23);
        study.detalleEstudiante();

        Error p = new Error("Ya no ahi ERROR");
        p.mostrarError();
    }
}
