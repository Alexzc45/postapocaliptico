package postapocaliptico;
public abstract class EntidadPostApocaliptica {
    protected String nombre;
    protected int salud;
    protected int energia;
    protected String ubicacion;
    public EntidadPostApocaliptica(String nombre, int salud, int energia, String ubicacion) {
        this.nombre = nombre;
        this.salud = salud;
        this.energia = energia;
        this.ubicacion = ubicacion;
    }
    public void mostraInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Salud: " + salud);
        System.out.println("Energia: " + energia);
        System.out.println("Ubicacion: " + ubicacion);
    }
    public void realizarAccion(){
        System.out.println("Realizando accion...");
    }
    public void modificadorSalud(){
        System.out.println("Modificando salud...");
        System.out.println("Salud actual: " + salud);       
    }
    public abstract void aplicarModificacionSalud(); 
}
