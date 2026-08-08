public class Mago  extends Personajes{
    public Mago (int id){
        super (id ," Mago " , "Nivel 12");
    }
     @Override
    public void realizarAccion(){
        System.out.println("El Mago lanza un hechizo de fuego");
    }


}
