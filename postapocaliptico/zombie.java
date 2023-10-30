package postapocaliptico;
public class zombie extends EntidadPostApocaliptica {
    private int velocidad;
    private int instintoCazador;
    public zombie(String nombre, int salud, int energia, String ubicacion, int velocidad, int instintoCazador) {
        super(nombre, salud, energia, ubicacion);
        this.velocidad = velocidad;
        this.instintoCazador = instintoCazador;
    }
    public void atacar(){
        System.out.println(nombre+" esta atacando...");
    }
    public void moverse(){
        System.out.println(nombre+" esta moviendose...");
    }
    @Override
    public void aplicarModificacionSalud() {    
    }  
}

    

