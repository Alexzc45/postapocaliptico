package postapocaliptico;
public class aliado extends EntidadPostApocaliptica{
    private int destreza ;
    private String inventario;
    public aliado(String nombre, int salud, int energia, String ubicacion, int destreza, String inventario) {
        super(nombre, salud, energia, ubicacion);
        this.destreza = destreza;
        this.inventario = inventario;
    }
    public void buscarSuministros(){
        System.out.println(nombre+" esta buscando suministros...");
    }
    public void atacar(){
        System.out.println(nombre+" comienza a atacar...");
    }
    public void moverse(){       
        System.out.println(nombre+" empieza a moverse...");
    }
    public void curarse(){
        System.out.println(nombre+" se empieza a curar...");
        System.out.println("Salud actual: " + salud);
    }
    @Override
    public void aplicarModificacionSalud(){
        System.out.println(nombre+" Modificando salud...");
        System.out.println("Salud actual: " + salud);
    }
}
    

