import java.util.*;

public class Taller8 {
    public static int polaca  (String string){
        String[] prefixStr = string.split(" "); 
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<prefixStr.length;i++){
            if(prefixStr[i].equals("+")){
                stack.push(stack.pop()+stack.pop());
            }
            else if(prefixStr[i].equals("*")){
                stack.push(stack.pop()*stack.pop());
            }
            else if(prefixStr[i].equals("-")){
                stack.push(stack.pop()-stack.pop());
            }
            else if(prefixStr[i].equals("/")){
                stack.push(stack.pop()/stack.pop());
            }
            else{
                stack.push(Integer.parseInt(prefixStr[i]));
            }
        }
        return stack.pop();
    }

    public static void menuEj2(){
        Stack<Nevera> neveras = new Stack<Nevera>(); 
        Queue<Solicitud> solicitudes = new PriorityQueue<Solicitud>();
        Scanner sn = new Scanner(System.in);
        int opcion = 0; //Guardaremos la opcion del usuario
        while(opcion != 4){
            System.out.println("Ingresar neveras (1)");
            System.out.println("Ingresar solicitud (2)");
            System.out.println("Despachar solicitudes (3)");
            System.out.println("Salir (4)");
            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Marca de la nevera?");
                    String marca = sn.nextLine();
                    neveras.push(new Nevera(neveras.peek().codigo+1,marca));
                    break;
                case 2:
                    System.out.println("cantidad de neveras?");
                    int cantidad = sn.nextInt();
                    System.out.println("nombre del almacén?");
                    String nombre = sn.nextLine();
                    solicitudes.add(new Solicitud(cantidad,nombre));
                    break;
                case 3:
                    ejercicio2(neveras,solicitudes);
                    System.out.println();
                break;
            }
        }
    }
    public static void ejercicio2(Stack neverasL, Queue solicitudesL){
        Stack<Nevera> neveras = neverasL; 
        Queue<Solicitud> solicitudes = solicitudesL;
        String entrega = "[ ";
        while(neveras.peek() != null && solicitudes.remove() != null){
            Solicitud solicitud = solicitudes.remove();
            entrega = entrega + "[(" + solicitud.nombre + " [ ";
            while(solicitud.cantidad>0){
                entrega = entrega + ", " + neveras.pop();
                solicitud.cantidad--;
            }
            entrega = entrega + "]\n";
        }
    }
}
public class Nevera
{
    int codigo;
    String marca;
    public Nevera(int codigo, String marca){
        this.codigo=codigo;
        this.marca=marca;
    }
    public String toString(){
        String string = "(" + codigo + ", " + marca + ")";  
        return string;
    }
}
public class Solicitud
{
    int cantidad;
    String nombre;
    public Solicitud(int cantidad, String nombre){
        this.cantidad = cantidad;
        this.nombre = nombre;
    }
    public String toString(){
        String string ="";
        string = string + cantidad + ", " + nombre;  
        return string;
    }
}

