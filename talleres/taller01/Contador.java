
import java.util.*;
public class Contador {
    private int cuenta;
    private final String id;
    private int pregunta;
    Scanner scan = new Scanner(System.in);
    /**
     * Se inicializan las variables globales en el constructor de manera que no posean valores nulos o 0s.
     */
    public Contador(String id) {
        this.cuenta = 0;
        this.id = id ;
    }

    /**
     * El método incrementar incrementa el contador en una unidad.
     *
     *(opcional: se podria pasar un parametro "cantidad" para incrementar esa cantidad de unidades).
     */
    public void incrementar(int valor) {
        
        
        for(int i = 0; i>=0; i++){
            
            System.out.println("¿Desea incrementar el contador?");
            System.out.println("Si: 1... No: 2");
            pregunta = scan.nextInt();
            if (pregunta == 1){
                this.cuenta += valor;
            }
            if(pregunta == 2){
                System.out.println("Ah bueno :3");
                break;
            } 
            scan.nextInt();
        }
        
        
    }

    /*
    Se podría implementar un metodo decrementar para hacer la operacion inversa de incrementar.
    */
    public void decrementar(int valor) {
        
        
        for(int i = 0; i>=0; i++){
            System.out.println("¿Desea decrementar el contador?");
            System.out.println("Si: 1... No: 2");
            pregunta = scan.nextInt();
            if (pregunta == 1){
                this.cuenta =- valor;
                
            }
            if(pregunta == 2){
                System.out.println("Ah bueno :3");
                break;
            } 
            scan.nextInt();
        }
        
        
    }

    /**
     * El método incrementos nos muestra en que valor se encuentra la cuenta actualmente.
     * @return el numero actual de la cuenta
     */
    public int incrementos() {
       return this.cuenta;
    }

    
     /**
    * toString se encargará de convertir el contador en un tipo cadena
    * para su posterior visualización
    * se debe de mostrar el estado del contador y su id
    *
    * @return una cadena que contiene el id del contador y su cuenta
    */
    public String toString() {
        return this.id + "\n" + this.cuenta;
    }
}