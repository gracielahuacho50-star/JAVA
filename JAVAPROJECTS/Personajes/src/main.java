import java.util.ArrayList;
public class main {
    private ArrayList<Personajes> listaPersonajes;

    public main(){
        listaPersonajes = new Arraylist<>();
    }
    public void agregarGuerrero(int id){
        listaPersonajes.add(new Guerrero(id));
        System.out.println("Guerrero agregado correctamente");
    }
   public void agregarMago(int id){
        listaPersonajes.add(new Mago(id));
        System.out.println("Mago agregado correctamente");
    }


}
