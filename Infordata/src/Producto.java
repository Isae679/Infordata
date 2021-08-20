public class Producto extends Fabricante {

    protected int Codigo;
    protected String Modelo;
    private Fabricante fabricante;
    private Proveedores proveedores;



    //metodo cosntructor

    public Producto(String nombre, String direccion, int numeroEmpleados,int codigo, String modelo,Fabricante fabricante,Proveedores proveedores) {
        super(nombre,direccion,numeroEmpleados);
         this.setCodigo(codigo);
        this.setModelo(modelo);
        this.setFabricante(fabricante);
        this.setProveedores(proveedores);
    }

    //metodo toString
    @Override
    public String toString() {
        return "Producto{" +
                "Codigo=" + Codigo +
                ", Modelo='" + Modelo + '\'' +
                '}';
    }



    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public Proveedores getProveedores() {
        return proveedores;
    }

    public void setProveedores(Proveedores proveedores) {
        this.proveedores = proveedores;
    }
}
