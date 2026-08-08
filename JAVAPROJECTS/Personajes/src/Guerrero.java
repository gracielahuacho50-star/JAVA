public class Guerrero extends Personajes {
    public Guerrero(int id){
        super(id, "Guerrero","Nivel 8");

    }
    @Override
    public void realizarAccion(){
        System.out.println("El Guerrero esta protegiendo el castillo");
    }

}
