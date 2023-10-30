package postapocaliptico;
public class JefeZombie extends EntidadPostApocaliptica {
    private int velocidad;
    private int instintoCazador;
    public JefeZombie(String nombre, int salud, int energia, String ubicacion, int velocidad, int instintoCazador) {
        super(nombre, salud, energia, ubicacion);
        this.velocidad = velocidad;
        this.instintoCazador = instintoCazador;
    }
    public void atacar(){
        System.out.println(nombre+" empieza a atacar...");
    }
    public void moverse(){
        System.out.println(nombre+" Moviendose al objetivo...");
    }
    @Override
    public void aplicarModificacionSalud() {
        System.out.println(nombre+": Modificando salud...");
        System.out.println("Salud actual: " + salud);
    } 
}
