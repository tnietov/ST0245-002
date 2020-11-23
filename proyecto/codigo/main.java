import java.util.Scanner;
import java.util.ArrayList;
public class main
{
    
    public static void main(String[] args){
        try{
        Node root;
        TreeTraining tree;
        Test t;
        LeerArchivo a = new LeerArchivo(); LeerArchivo b = new LeerArchivo();
        root = new Node();
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("archivo de entrenamiento");
        String archTrain= teclado.nextLine();
        System.out.println("archivo de testeo");
        String archTest= teclado.nextLine();
        
        a.leerArchivo(archTrain); b.leerArchivo(archTest);
        tree = new TreeTraining(a.getDatos());
        root = tree.create();
        
        
        t = new Test();
        t.asignacion(b.getDatos(), root);
        t.datos();
       }
       catch (Exception e){
           e.printStackTrace();
        }
    }
 }
