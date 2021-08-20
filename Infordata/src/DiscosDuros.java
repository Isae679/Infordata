import java.util.Date;

public class DiscosDuros extends  Alquiler  {
    private String capacidad;


    //metodo constructor


    public DiscosDuros(String nombre, String direccion, int numeroEmpleados, int codigo, String modelo, int precio, String capacidad) {
        super(nombre, direccion, numeroEmpleados, codigo, modelo, precio);
        this.capacidad = capacidad;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
}
