public class Personajes {

private int id;
private String nombre ;
private String nivel ;

public Personajes(int id ,String nombre , String nivel ) {
    this.id = id;
    this.nombre = nombre ;
    this.nivel = nivel ;

}  

public int getID(){
    return id;
    
}
public String getNombre(){
        return nombre;
        
    }
    public String getNivel(){
        return nivel;
        
    }
    public void realizarAccion (){
        System.out.println("El personaje realiza una accion general");
    }
    public void mostrarInfo (){
        System.out.println("Id :" + id + "/ Nombre :" + nombre + "/ Nivel :" + nivel);
    }

}
