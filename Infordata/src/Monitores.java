public class Monitores extends Alquiler {
    private String definicionMaxima;


    //metodo constructor


    public Monitores(String nombre, String direccion, int numeroEmpleados, int codigo, String modelo, int precio, String definicionMaxima) {
        super(nombre, direccion, numeroEmpleados, codigo, modelo, precio);
        this.setDefinicionMaxima(definicionMaxima);
    }

    public String getDefinicionMaxima() {
        return definicionMaxima;
    }

    public void setDefinicionMaxima(String definicionMaxima) {
        this.definicionMaxima = definicionMaxima;
    }
}
