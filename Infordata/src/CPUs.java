import java.util.Date;

public class CPUs extends AltaTecnologia {
    private String memoriaPrinc;


    //metodo constructor
    public CPUs(String nombre, String direccion, int numeroEmpleados,int codigo, String modelo, String paisOrigen, Date fechaFabricacion,String memoriaPrinc){
        super(nombre,direccion,numeroEmpleados,codigo,modelo,paisOrigen,fechaFabricacion);
        this.setMemoriaPrinc(memoriaPrinc);

    }

    public String getMemoriaPrinc() {
        return memoriaPrinc;
    }

    public void setMemoriaPrinc(String memoriaPrinc) {
        this.memoriaPrinc = memoriaPrinc;
    }
}
