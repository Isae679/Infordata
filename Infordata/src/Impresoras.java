public class Impresoras extends Producto {
    private String velocidad;

    //metodo CONSTRUCTOR
    public Impresoras(int codigo, String modelo,String velocidad){
        super( codigo,modelo);
        this.setVelocidad(velocidad);

    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }
}
