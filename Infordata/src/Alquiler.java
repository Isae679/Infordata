public class Alquiler extends Producto {
    protected int precio;

    //metodo constructor

    public Alquiler(String nombre, String direccion, int numeroEmpleados, int codigo, String modelo, int precio) {
        super(nombre, direccion, numeroEmpleados, codigo, modelo);
        this.setPrecio(precio);
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
