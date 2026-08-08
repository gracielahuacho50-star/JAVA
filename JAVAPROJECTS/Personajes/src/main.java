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
 public void mostrarPersonajes(){
    if (listaPersonajes.isEmpty()){
         System.out.println("No hay personajes registrados");
          return;
    }
    for (Personajes Personajes : ListaPersonajes){
        personaje.mostrarInfo;
        personaje.realizarAccion;
        System.out.println("====================================");
    }
    
        

}
