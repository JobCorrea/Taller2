public class Producto{
    private String nombre; 
    private double precio;

        //Constrctor con 2 parametros
    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    //Getters y Setters
    public String getnNombre(){return  nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}

    public double getPrecio(){return precio;}
    public void setPrecio(double precio){this.precio = precio;}

    void mostrarProducto(){
        System.out.println("|| PRODUCTO ||");
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: "+"$"+precio);
        System.out.println("'''''''''''''''''''''");

    }

    @Override
    public String toString(){
        return "Producto{Nombre='"+nombre+"',Precio='"+precio+"'}";
    }
}