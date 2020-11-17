import java.util.ArrayList;
public class main
{
    
    public static void main(String[] args){
        try{
        String s = "lite.csv";
        ArrayList<estudiante> datos;
        leer a = new leer();
        Gini g = new Gini();
        a.leerArchivo(s);
        g.asignacion(a.getDatos());
        g.gini(13);
        //System.out.println("lenguajes");
        //System.out.println("matemáticas");
        //System.out.println("biología");
        //System.out.println("química");
        //System.out.println("física");
        //System.out.println("sociales");
        //System.out.println("filosofía");
        System.out.println("ingles");
        System.out.println(g.medio);
        System.out.println(g.gini);
        System.out.println(g.nid);
        System.out.println(g.nii);
        System.out.println(g.nod);
        System.out.println(g.noi);
        g.asignacionEstudiantes(g.derecha);
        g.gini(11);
        System.out.println(g.medio);
        System.out.println(g.gini);
        System.out.println(g.nid);
        System.out.println(g.nii);
        System.out.println(g.nod);
        System.out.println(g.noi);
        g.asignacionEstudiantes(g.derecha);
        g.gini(7);
        System.out.println(g.medio);
        System.out.println(g.gini);
        System.out.println(g.nid);
        System.out.println(g.nii);
        System.out.println(g.nod);
        System.out.println(g.noi);
        g.asignacionEstudiantes(g.derecha);
        g.gini(9);
        System.out.println(g.medio);
        System.out.println(g.gini);
        System.out.println(g.nid);
        System.out.println(g.nii);
        System.out.println(g.nod);
        System.out.println(g.noi);
        g.asignacionEstudiantes(g.derecha);
        g.gini(6);
        System.out.println(g.medio);
        System.out.println(g.gini);
        System.out.println(g.nid);
        System.out.println(g.nii);
        System.out.println(g.nod);
        System.out.println(g.noi);
       }
       catch (Exception e){
           e.printStackTrace();
        }
    }
 }
