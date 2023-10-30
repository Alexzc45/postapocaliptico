package postapocaliptico;
public class Superviviente extends EntidadPostApocaliptica {
    private int destreza;
    private int inventario;
    public Superviviente(String nombre, int salud, int energia, String ubicacion, int destreza, int inventario) {
        super(nombre, salud, energia, ubicacion);
        this.destreza = destreza;
        this.inventario = inventario;
    }
    public void  buscarSuministros(){
        System.out.println(nombre+" esta buscando suministros...");    
    }
    public void atacar(){
        System.out.println(nombre+" comienza el ataque...");
    }
    public void defender(){
        System.out.println(nombre+" empieza a defenderse...");       
    }
    public void curarse(){      
        System.out.println(nombre+ ": Curandose...");
        System.out.println("Salud actual: " + salud);       
    }   
    @Override
    public void aplicarModificacionSalud() {
    }
}
    

