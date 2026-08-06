public class App {
    public static void main(String[] args) throws Exception {
        Mascota mascota1 = new Mascota();
        mascota1.nombre = "Oreo";
        mascota1.edad = 3;
        mascota1.especie = "Hamster" ;

        Mascota mascota2 = new Mascota();
        mascota2.nombre = "Milo" ;
        mascota2.edad = 5 ;
        mascota2.especie = "Perro" ;

        System.out.println("=== MASCOTA 1 ===");
        System.out.println("Nombre : "+ mascota1.nombre);
        System.out.println("Edad : "+ mascota1.edad);
        System.out.println("Especie : "+ mascota1.especie);

        System.out.println();
        System.out.println("=== MASCOTA 2 ===");
        System.out.println("Nombre : "+ mascota2.nombre);
        System.out.println("Edad : "+ mascota2.edad);
        System.out.println("Especie : "+ mascota2.especie);
    }
}
