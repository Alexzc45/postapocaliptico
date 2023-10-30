package postapocaliptico;
public class suministros extends EntidadPostApocaliptica {
    private String descripcion;
    private int cantidad;
    public suministros(String nombre, int salud, int energia, String ubicacion, String descripcion, int cantidad) {
        super(nombre, salud, energia, ubicacion);
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }
    @Override
    public void realizarAccion(){
        System.out.println(nombre+" Realizando accion...");
    }
    @Override
    public void aplicarModificacionSalud() {     
    }
}
    

