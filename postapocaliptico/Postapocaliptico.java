package postapocaliptico;
public class Postapocaliptico {
    public static void main(String[] args) {
       
        Superviviente superviviente1 = new Superviviente("Superviviente 1", 100, 50, "Ubicacion1", 30, 20);
        Superviviente superviviente2 = new Superviviente("Superviviente 2", 90, 45, "Ubicacion2", 25, 15);
        zombie zombie1 = new zombie("Zombie 1", 50, 30, "Ubicacion3", 20, 10);
        zombie zombie2 = new zombie("Zombie 2", 80, 50, "Ubicacion4", 40, 30);
        aliado aliado1 = new aliado("Aliado 1", 100, 100, "Ubicacion5", 50, "Inventario1");
        JefeZombie jefeZombie1 = new JefeZombie("Jefe Zombie 1", 150, 100, "Ubicacion6", 70, 40);
        suministros suministros1 = new suministros("Suministros 1", 0, 0, "Ubicacion7", "Descripción1", 5);
        suministros suministros2 = new suministros("Suministros 2", 0, 0, "Ubicacion8", "Descripción2", 10);
        superviviente2.buscarSuministros();
        System.out.println("-------------------");
        aliado1.moverse();
        System.out.println("-------------------");
        jefeZombie1.atacar();
        System.out.println("-------------------");
        superviviente2.curarse();
        System.out.println("-------------------");
        suministros2.realizarAccion();
        System.out.println("-------------------");
        superviviente1.mostraInformacion();
        System.out.println("-------------------");
        suministros2.mostraInformacion();
        System.out.println("-------------------");
        zombie1.mostraInformacion();
        System.out.println("-------------------");
        zombie2.mostraInformacion();
        System.out.println("-------------------");
        aliado1.mostraInformacion();
        System.out.println("-------------------");
        jefeZombie1.mostraInformacion();
        System.out.println("-------------------");
        suministros1.mostraInformacion();
        System.out.println("-------------------");
        suministros2.mostraInformacion();
    }
}
