import java.util.Date;

public class DiscosSolidos extends  AltaTecnologia{
    private String capacidad;
    public DiscosDuros(String nombre, String direccion, int numeroEmpleados,int codigo, String modelo, String paisOrigen, Date fechaFabricacion){
        super(nombre,direccion,numeroEmpleados,codigo,modelo,paisOrigen,fechaFabricacion);
        this.setCapacidad(capacidad);

    }


    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
}
