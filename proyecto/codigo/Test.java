import java.util.ArrayList;
/**
 * Esta clase contiene los metodos usados para predecir
 * si un estudiante superará el promedio, basandose en el arbol ya construido.
 * 
 * @author (Thomas Nieto, Miguel Angel Echavarria) 
 * @version (2.0)
 */
public class Test
{
    ArrayList<Estudiante> success, failure;
    Node tree;
    int TP, FP, TN, FN;
    
    /**
     * Este metodo 
     * @param datos ArrayList de los datos de testeo
     * @param root Nodo raiz
     */
    public void asignacion(ArrayList<String> datos, Node root){
        this.tree = root;
        TP = 0; FP = 0; TN = 0; FN = 0;
        success = new ArrayList<>();
        failure = new ArrayList<>();
        for(int i = 0; i<datos.size(); i++){
            Estudiante estudiante = new Estudiante();
            estudiante.asignar(datos, i);
            if(predecir(estudiante) == 1){ 
                if(estudiante.success.equals("1")){
                success.add(estudiante);
                TP++;
                }else if(estudiante.success.equals("0")){
                failure.add(estudiante);
                FP++;
                }
            }else if(predecir(estudiante) == 0){
                if(estudiante.success.equals("0")){ 
                success.add(estudiante);
                TN++;
            }else{
                failure.add(estudiante);
                FN++;
            }
        }
        }
    }
    
    public void datos(){
        System.out.println("Datos acertados: "+(TP+TN)+"\nDatos errados: "+(FP+FN)+"\nExactitud: "+exactitud()+"\nSensibilidad: "+sensibilidad()+"\nPrecisión: "+precision()+"\n");
    }
    
    private double exactitud(){
        return (double)(TP+TN)/(TP+TN+FP+FN);
    }
    private double sensibilidad(){
        return (double)(TP)/(TP+FN);
    }
    private double precision(){
        return (double)(TP)/(TP+FP);
    }
    private int predecir(Estudiante estudiante){
        Node current = tree;
        return decidir(current, estudiante);
    }
    private int decidir(Node current, Estudiante estudiante){
        /*if(current.right == null && current.left == null){
            return current.leaf;
        }*/
        if(Double.parseDouble(estudiante.ingles) < current.val){
            current = current.left;
            if(Double.parseDouble(estudiante.sociales) < current.val){
                current = current.left;
                if(estudiante.coleBilin.equalsIgnoreCase(current.var)){
                    current = current.right;
                    if(current.leaf == false){
                        return 0;
                    }
                }else{
                    current = current.left;
                    if(Double.parseDouble(estudiante.quim) < current.val){
                        current = current.left;
                        if(current.leaf == false){
                            return 0;
                        }
                    }else{
                        current = current.right;
                        if(Double.parseDouble(estudiante.filo) < current.val){
                            current = current.left;
                            if(current.leaf == false){
                                return 0;
                            }
                        }else{
                            current = current.right;
                            if(Double.parseDouble(estudiante.mate) < current.val){
                                current = current.left;
                                if(current.leaf == false){
                                    return 0;
                                }
                            }else{
                                current = current.right;
                                if(Double.parseDouble(estudiante.fisica) < current.val){
                                    current = current.left;
                                    if(current.leaf == false){
                                        return 0;
                                    }
                                }else{ 
                                    current = current.right;
                                if(current.leaf == true){
                                    return 1;
                                }
                            }
                            }
                        }
                    }
                }
            }else{
                current = current.right;
                if(Double.parseDouble(estudiante.quim) < current.val){
                    current = current.left;
                    if(Double.parseDouble(estudiante.lenguaje) < current.val){
                        current = current.left;
                        if(current.leaf == false){
                            return 0;
                        }
                    }else{
                        current = current.right;
                        if(Double.parseDouble(estudiante.biologia) < current.val){
                            current = current.left;
                            if(Double.parseDouble(estudiante.fisica) < current.val){
                                current = current.left;
                                if(current.leaf == false){
                                    return 0;
                                }
                            }else{
                                current = current.right;
                                if(Double.parseDouble(estudiante.mate) < current.val){
                                    current = current.left;
                                    if(current.leaf == false){
                                        return 0;
                                    }
                                }else{
                                    current = current.right;
                                    if(current.leaf == true){
                                        return 1;
                                    }
                                }
                            }
                        }else{
                            current = current.right;
                            if(Double.parseDouble(estudiante.mate) < current.val){
                                current = current.left;
                                if(Double.parseDouble(estudiante.filo) < current.val){
                                    current = current.left;
                                    if(current.leaf == false){
                                        return 0;
                                    }
                                }else{
                                    current = current.right;
                                    if(current.leaf == true){
                                        return 1;
                                    }
                                }
                            }else{
                                current = current.right;
                                if(current.leaf == true){
                                        return 1;
                                    }
                            }
                        }
                    }
                }else{
                    current = current.right;
                    if(estudiante.coleBilin.equalsIgnoreCase(current.var)){
                        current = current.right;
                        if(Double.parseDouble(estudiante.fisica) < current.val){
                            current = current.left;
                            if(current.leaf == false){
                                return 0;
                            }
                        }else{
                            current = current.right;
                            if(current.leaf == true){
                                return 1;
                            }
                        }
                    }else{
                        current = current.left;
                        if(current.leaf == true){
                            return 1;
                        }
                    }
                }
            }
        }else{
            current = current.right;
            if(Double.parseDouble(estudiante.sociales) < current.val){
                current = current.left;
                if(Double.parseDouble(estudiante.mate) < current.val){
                    current = current.left;
                    if(Double.parseDouble(estudiante.lenguaje) < current.val){
                        current = current.left;
                        if(Double.parseDouble(estudiante.filo) < current.val){
                            current = current.left;
                            if(current.leaf == false){
                                return 0;
                            }
                        }else{
                            current = current.right;
                            if(current.leaf == false){
                                return 0;
                            }
                        }
                    }else{
                        current = current.right;
                        if(Double.parseDouble(estudiante.biologia) < current.val){
                            current = current.left;
                            if(current.leaf == false){
                                return 0;
                            }
                        }else{
                            current = current.right;
                            if(current.leaf == true){
                                return 1;
                            }
                        }
                    }
                }else{
                    current = current.right;
                    if(Double.parseDouble(estudiante.quim) < current.val){
                        current = current.left;
                        if(estudiante.trabaja.equalsIgnoreCase(current.var)){
                            current = current.right;
                            if(current.leaf == true){
                                return 1;
                            }
                        }else{
                            current = current.left;
                            if(current.leaf == false){
                                return 0;
                            }
                        }
                    }else{
                        current = current.right;
                            if(current.leaf == true){
                                return 1;
                            }
                    }
                }
            }else{
                current = current.right;
                if(Double.parseDouble(estudiante.biologia) < current.val){
                    current = current.left;
                    if(Double.parseDouble(estudiante.filo) < current.val){
                        current = current.left;
                        if(current.leaf == true){
                                return 1;
                            }
                    }else{
                        current = current.right;
                        if(current.leaf == true){
                                return 1;
                            }
                    }
                }else{
                    current = current.right;
                    if(Double.parseDouble(estudiante.lenguaje) < current.val){
                        current = current.left;
                        if(current.leaf == true){
                                return 1;
                            }
                    }else{
                        current = current.right;
                        if(current.leaf == true){
                                return 1;
                            }
                    }
                }
            }
        }
        /*switch(decision){
            case 1:
                if(estudiante.trabaja.equalsIgnoreCase("no")){
                    current = current.right;
                    decidir(current, current.dec, estudiante);
                }else{
                    current = current.left;
                    decidir(current, current.dec, estudiante);
                }
                break;
            case 2:
                if(estudiante.coleBilin.equalsIgnoreCase("s")){
                    current = current.right;
                    decidir(current, current.dec, estudiante);
                }else{
                    current = current.left;
                    decidir(current, current.dec, estudiante);
                }
                break;
            case 3:
                if(Double.parseDouble(estudiante.lenguaje) >= current.val){
                    current = current.right;
                    decidir(current, current.dec, estudiante);
                }else{
                    current = current.left;
                    decidir(current, current.dec, estudiante);
                }
                break;
            case 4:
                if(Double.parseDouble(estudiante.mate) >= current.val){
                    current = current.right;
                    decidir(current, current.dec, estudiante);
                }else{
                    current = current.left;
                    decidir(current, current.dec, estudiante);
                }
                break;
            case 5:
                if(Double.parseDouble(estudiante.biologia) >= current.val){
                    current = current.right;
                    decidir(current, current.dec, estudiante);
                }else{
                    current = current.left;
                    decidir(current, current.dec, estudiante);
                }
                break;
            case 6:
                if(Double.parseDouble(estudiante.quim) >= current.val){
                    current = current.right;
                    decidir(current, current.dec, estudiante);
                }else{
                    current = current.left;
                    decidir(current, current.dec, estudiante);
                }
                break;
            case 7:
                if(Double.parseDouble(estudiante.fisica) >= current.val){
                    current = current.right;
                    decidir(current, current.dec, estudiante);
                }else{
                    current = current.left;
                    decidir(current, current.dec, estudiante);
                }
                break;
            case 8:
                if(Double.parseDouble(estudiante.sociales) >= current.val){
                    current = current.right;
                    decidir(current, current.dec, estudiante);
                }else{
                    current = current.left;
                    decidir(current, current.dec, estudiante);
                }
                break;
            case 9:
                if(Double.parseDouble(estudiante.filo) >= current.val){
                    current = current.right;
                    decidir(current, current.dec, estudiante);
                }else{
                    current = current.left;
                    decidir(current, current.dec, estudiante);
                }
                break;
            case 10:
                if(Double.parseDouble(estudiante.ingles) >= current.val){
                    current = current.right;
                    decidir(current, current.dec, estudiante);
                }else{
                    current = current.left;
                    decidir(current, current.dec, estudiante);
                }
                break;
        }*/
        return 2;
    }
}
