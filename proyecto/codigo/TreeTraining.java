import java.util.ArrayList;
/**
 * Write a description of class TreeCreation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreeTraining
{
    Node root;
    Gini g, gR, gRaux, gL, gLaux;
    public TreeTraining(ArrayList<String> datos){
        g = new Gini();
        gR = new Gini();
        gRaux = new Gini();
        gL = new Gini();
        gLaux = new Gini();
        g.asignacion(datos);
    }
    public Node create(){
        g.gini(10);
        root = new Node(g.average, 10);
        
            gR.asignacionEstudiantes(g.right); 
            gR.gini(8);
            root.right = new Node(gR.average, 8); 
            
                gRaux.asignacionEstudiantes(gR.right); 
                gRaux.gini(5);
                root.right.right = new Node(gRaux.average, 5);
                
                    gLaux.asignacionEstudiantes(gRaux.left); 
                    gLaux.gini(9);
                    root.right.right.left = new Node(gLaux.average, 9); 
                    
                        root.right.right.left.right = new Node(true);
                        root.right.right.left.left = new Node(true);
                        
                    gRaux.asignacionEstudiantes(gRaux.right); 
                    gRaux.gini(3);
                    root.right.right.right = new Node(gRaux.average, 3);
                    
                        root.right.right.right.right = new Node(true);
                        root.right.right.right.left = new Node(true);
                        
                gLaux.asignacionEstudiantes(gR.left); 
                gLaux.gini(4);
                root.right.left = new Node(gLaux.average, 4);
                    gRaux.asignacionEstudiantes(gLaux.right); 
                    gRaux.gini(6);
                    root.right.left.right = new Node(gRaux.average, 6);
                        root.right.left.right.right = new Node (true);
                        gRaux.asignacionEstudiantes(gRaux.left); 
                        gRaux.gini(1);
                        root.right.left.right.left = new Node(gRaux.op, 1);
                            root.right.left.right.left.right = new Node(true);
                            root.right.left.right.left.left = new Node(false);
                    gLaux.asignacionEstudiantes(gLaux.left);
                    gLaux.gini(3);
                    root.right.left.left = new Node(gLaux.average, 3);
                        gRaux.asignacionEstudiantes(gLaux.right); 
                        gRaux.gini(5);
                        root.right.left.left.right = new Node(gRaux.average, 5);
                            root.right.left.left.right.right = new Node(true);
                            root.right.left.left.right.left = new Node(false);
                        gLaux.asignacionEstudiantes(gLaux.left); 
                        gLaux.gini(9);
                        root.right.left.left.left = new Node(gLaux.average, 9);
                            root.right.left.left.left.right = new Node(false);
                            root.right.left.left.left.left = new Node(false);
            gL.asignacionEstudiantes(g.left); 
            gL.gini(8);
            root.left = new Node(gL.average, 8);
                gLaux.asignacionEstudiantes(gL.left); 
                gLaux.gini(2);
                root.left.left = new Node(gLaux.op, 2);
                    root.left.left.right = new Node(false);
                    gLaux.asignacionEstudiantes(gLaux.left);
                    gLaux.gini(6);
                    root.left.left.left = new Node(gLaux.average, 6);
                        root.left.left.left.left = new Node(false);
                        gLaux.asignacionEstudiantes(gLaux.right); 
                        gLaux.gini(9);
                        root.left.left.left.right = new Node(gLaux.average, 9);
                            root.left.left.left.right.left = new Node(false);
                            gLaux.asignacionEstudiantes(gLaux.right); 
                            gLaux.gini(4);
                            root.left.left.left.right.right = new Node(gLaux.average, 4);
                                root.left.left.left.right.right.left = new Node(false);
                                gLaux.asignacionEstudiantes(gLaux.right); 
                                gLaux.gini(7);
                                root.left.left.left.right.right.right = new Node(gLaux.average, 7);
                                    root.left.left.left.right.right.right.right = new Node(true);
                                    root.left.left.left.right.right.right.left = new Node(false);
                gRaux.asignacionEstudiantes(gL.right); 
                gRaux.gini(6);
                root.left.right = new Node(gRaux.average, 6);
                    gR.asignacionEstudiantes(gRaux.right);
                    gR.gini(2);
                    root.left.right.right = new Node(gR.op, 2);
                        root.left.right.right.left = new Node(true);
                        gR.asignacionEstudiantes(gR.right);
                        gR.gini(7);
                        root.left.right.right.right = new Node(gR.average, 7);
                            root.left.right.right.right.left = new Node(false);
                            root.left.right.right.right.right = new Node(true);
                    gRaux.asignacionEstudiantes(gRaux.left);
                    gRaux.gini(3);
                    root.left.right.left = new Node(gRaux.average, 3);
                        root.left.right.left.left = new Node(false);
                        gRaux.asignacionEstudiantes(gRaux.right);
                        gRaux.gini(5);
                        root.left.right.left.right = new Node(gRaux.average, 5);
                            gLaux.asignacionEstudiantes(gRaux.left);
                            gLaux.gini(7);
                            root.left.right.left.right.left = new Node(gLaux.average, 7);
                                root.left.right.left.right.left.left = new Node(false);
                                gLaux.asignacionEstudiantes(gLaux.right);
                                gLaux.gini(4);
                                root.left.right.left.right.left.right = new Node(gLaux.average, 4);
                                    root.left.right.left.right.left.right.right = new Node(true);
                                    root.left.right.left.right.left.right.left = new Node(false);
                            gRaux.asignacionEstudiantes(gRaux.right);
                            gRaux.gini(4);
                            root.left.right.left.right.right = new Node(gRaux.average, 4);
                                root.left.right.left.right.right.right = new Node(true);
                                gRaux.asignacionEstudiantes(gRaux.left);
                                gRaux.gini(9);
                                root.left.right.left.right.right.left = new Node(gRaux.average, 9);
                                    root.left.right.left.right.right.left.right = new Node(true);
                                    root.left.right.left.right.right.left.left = new Node(false);
        return root;
    }
}
