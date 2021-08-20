import java.util.Date;

public class AltaTecnologia extends Producto  {
    protected String paisOrigen;
    protected Date fechaFabricacion;

    //metodo constructor

    public AltaTecnologia(String nombre, String direccion, int numeroEmpleados,int codigo, String modelo){
        super(nombre,direccion,numeroEmpleados,codigo,modelo);
        this.setPaisOrigen(paisOrigen);
        this.setFechaFabricacion(fechaFabricacion);

    }


    //getter and setter


    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }
}
