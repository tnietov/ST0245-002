import java.util.ArrayList;
    /*
       */
    public class Gini
    {
        ArrayList<Estudiante> Estudiantes, success, failure, left, right;
        int nod, nid, noi, nii;
        double menor, mayor, aux, acumulado, val, leftIndex, rightndex, average;
        double gini = 0;
        String str, op;
        
        /**/
        public void asignacion(ArrayList<String> datos){
        Estudiantes = new ArrayList<>();
        success = new ArrayList<>();
        failure = new ArrayList<>();
        for(int i = 0; i<datos.size(); i++){
            Estudiante f = new Estudiante();
            f.asignar(datos, i);
            Estudiantes.add(f);
            if(f.success.equals("1")){
                success.add(f);
            }else failure.add(f);
        }
    }
    
    public void asignacionEstudiantes(ArrayList<Estudiante> datos){
        Estudiantes = new ArrayList<>();
        Estudiantes = datos;
        success = new ArrayList<>();
        failure = new ArrayList<>();
        for(int i = 0; i<datos.size(); i++){
            if(datos.get(i).success.equals("1")){
                success.add(datos.get(i));
            }else failure.add(datos.get(i));
        }
    }
    
    public double gini(int var){
        Estudiante estAux;
        left = new ArrayList<>();
        right = new ArrayList<>();
        nod = 0; nid = 0; noi = 0; nii = 0;
        menor = 0; mayor = 0; acumulado = 0; average = 0; val = 0;
        switch(var){
            case 1:
                for(int i = 0; i<success.size(); i++){
                    estAux = success.get(i);
                    str = success.get(i).trabaja;
                    if(str.equalsIgnoreCase("no")){
                        nid++;
                        right.add(estAux);
                    }else{
                        nii++;
                        left.add(estAux);
                    }
                }
                for(int i = 0; i<failure.size(); i++){
                    estAux = failure.get(i);
                    str = failure.get(i).trabaja;
                    if(str.equalsIgnoreCase("no")){
                        nod++;
                        right.add(estAux);
                    }else{
                        noi++;
                        left.add(estAux);
                    }
                }
                op = "no";
                gini = calcularGini(noi, nii, nod, nid);
                break;
            case 2:
                for(int i = 0; i<success.size(); i++){
                    estAux = success.get(i);
                    str = success.get(i).coleBilin;
                    if(str.equalsIgnoreCase("s")){
                        nid++;
                        right.add(estAux);
                    }else{
                        nii++;
                        left.add(estAux);
                    }
                }
                for(int i = 0; i<failure.size(); i++){
                    estAux = failure.get(i);
                    str = failure.get(i).coleBilin;
                    if(str.equalsIgnoreCase("s")){
                        nod++;
                        right.add(estAux);
                    }else{
                        noi++;
                        left.add(estAux);
                    }
                }
                op = "s";
                gini = calcularGini(noi, nii, nod, nid);
                break;
            case 3:
                for(int i = 0; i<Estudiantes.size(); i++){
                    aux = Double.parseDouble(Estudiantes.get(i).lenguaje);
                    acumulado = acumulado + aux;
                }
                average = acumulado/Estudiantes.size();
                for(int i = 0; i<success.size(); i++){
                    estAux = success.get(i);
                    val = Double.parseDouble(success.get(i).lenguaje);
                    dividirsuccess(estAux, val, average);
                }
                for(int i = 0; i<failure.size(); i++){
                    estAux = failure.get(i);
                    val = Double.parseDouble(failure.get(i).lenguaje);
                    dividirfailure(estAux, val, average);
                }
                gini = calcularGini(noi, nii, nod, nid);
                break;
            case 4:
                for(int i = 0; i<Estudiantes.size(); i++){
                    aux = Double.parseDouble(Estudiantes.get(i).mate);
                    acumulado = acumulado + aux;
                }
                average = acumulado/Estudiantes.size();
                for(int i = 0; i<success.size(); i++){
                    estAux = success.get(i);
                    val = Double.parseDouble(success.get(i).mate);
                    dividirsuccess(estAux, val, average);
                }
                for(int i = 0; i<failure.size(); i++){
                    estAux = failure.get(i);
                    val = Double.parseDouble(failure.get(i).mate);
                    dividirfailure(estAux, val, average);
                }
                gini = calcularGini(noi, nii, nod, nid);
                break;
            case 5:
                for(int i = 0; i<Estudiantes.size(); i++){
                    aux = Double.parseDouble(Estudiantes.get(i).biologia);
                    acumulado = acumulado + aux;
                }
                average = acumulado/Estudiantes.size();
                for(int i = 0; i<success.size(); i++){
                    estAux = success.get(i);
                    val = Double.parseDouble(success.get(i).biologia);
                    dividirsuccess(estAux, val, average);
                }
                for(int i = 0; i<failure.size(); i++){
                    estAux = failure.get(i);
                    val = Double.parseDouble(failure.get(i).biologia);
                    dividirfailure(estAux, val, average);
                }
                gini = calcularGini(noi, nii, nod, nid);
                break;
            case 6:
                for(int i = 0; i<Estudiantes.size(); i++){
                    aux = Double.parseDouble(Estudiantes.get(i).quim);
                    acumulado = acumulado + aux;
                }
                average = acumulado/Estudiantes.size();
                for(int i = 0; i<success.size(); i++){
                    estAux = success.get(i);
                    val = Double.parseDouble(success.get(i).quim);
                    dividirsuccess(estAux, val, average);
                }
                for(int i = 0; i<failure.size(); i++){
                    estAux = failure.get(i);
                    val = Double.parseDouble(failure.get(i).quim);
                    dividirfailure(estAux, val, average);
                }
                gini = calcularGini(noi, nii, nod, nid);
                break;
            case 7:
                for(int i = 0; i<Estudiantes.size(); i++){
                    aux = Double.parseDouble(Estudiantes.get(i).fisica);
                    acumulado = acumulado + aux;
                }
                average = acumulado/Estudiantes.size();
                for(int i = 0; i<success.size(); i++){
                    estAux = success.get(i);
                    val = Double.parseDouble(success.get(i).fisica);
                    dividirsuccess(estAux, val, average);
                }
                for(int i = 0; i<failure.size(); i++){
                    estAux = failure.get(i);
                    val = Double.parseDouble(failure.get(i).fisica);
                    dividirfailure(estAux, val, average);
                }
                gini = calcularGini(noi, nii, nod, nid);
                break;
            case 8:
                for(int i = 0; i<Estudiantes.size(); i++){
                    aux = Double.parseDouble(Estudiantes.get(i).sociales);
                    acumulado = acumulado + aux;
                }
                average = acumulado/Estudiantes.size();
                for(int i = 0; i<success.size(); i++){
                    estAux = success.get(i);
                    val = Double.parseDouble(success.get(i).sociales);
                    dividirsuccess(estAux, val, average);
                }
                for(int i = 0; i<failure.size(); i++){
                    estAux = failure.get(i);
                    val = Double.parseDouble(failure.get(i).sociales);
                    dividirfailure(estAux, val, average);
                }
                gini = calcularGini(noi, nii, nod, nid);
                break;
            case 9:
                for(int i = 0; i<Estudiantes.size(); i++){
                    aux = Double.parseDouble(Estudiantes.get(i).filo);
                    acumulado = acumulado + aux;
                }
                average = acumulado/Estudiantes.size();
                for(int i = 0; i<success.size(); i++){
                    estAux = success.get(i);
                    val = Double.parseDouble(success.get(i).filo);
                    dividirsuccess(estAux, val, average);
                }
                for(int i = 0; i<failure.size(); i++){
                    estAux = failure.get(i);
                    val = Double.parseDouble(failure.get(i).filo);
                    dividirfailure(estAux, val, average);
                }
                gini = calcularGini(noi, nii, nod, nid);
                break;
            case 10:
                for(int i = 0; i<Estudiantes.size(); i++){
                    aux = Double.parseDouble(Estudiantes.get(i).ingles);
                    acumulado = acumulado + aux;
                }
                average = acumulado/Estudiantes.size();
                for(int i = 0; i<success.size(); i++){
                    estAux = success.get(i);
                    val = Double.parseDouble(success.get(i).ingles);
                    dividirsuccess(estAux, val, average);
                }
                for(int i = 0; i<failure.size(); i++){
                    estAux = failure.get(i);
                    val = Double.parseDouble(failure.get(i).ingles);
                    dividirfailure(estAux, val, average);
                }
                gini = calcularGini(noi, nii, nod, nid);
                break;    
        }
        return gini;
    }
    private void dividirsuccess(Estudiante EstudianteAuxiliar, double valor, double umbral){
        if(valor<umbral){
         nii++;
         left.add(EstudianteAuxiliar);
        }else{ 
            nid++;
            right.add(EstudianteAuxiliar);
        }
    }
    private void dividirfailure(Estudiante EstudianteAuxiliar, double valor, double umbral){
        if(valor<umbral){
         noi++;
         left.add(EstudianteAuxiliar);
        }else{ 
            nod++;
            right.add(EstudianteAuxiliar);
        }
    }
    private double calcularGini(double noi, double nii, double nod, double nid){
        leftIndex = 1-((Math.pow(noi,2)/Math.pow((noi+nii),2))+(Math.pow(nii,2)/Math.pow((noi+nii),2)));
        rightndex = 1-((Math.pow(nod,2)/Math.pow((nod+nid),2))+(Math.pow(nid,2)/Math.pow((nod+nid),2)));
        return ((leftIndex*(noi+nii))+(rightndex*(nod+nid)))/((noi+nii)+(nod+nid));
    }
}
