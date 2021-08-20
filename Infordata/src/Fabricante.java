public class Fabricante  {
     protected String nombre;
     protected String direccion;
     protected int numeroEmpleados;


    //metodo constructor

    public Fabricante(String nombre, String direccion, int numeroEmpleados) {
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setNumeroEmpleados(numeroEmpleados);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }
}
