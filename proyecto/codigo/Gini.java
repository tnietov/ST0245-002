    import java.util.ArrayList;
    public class Gini
    {
        ArrayList<estudiante> estudiantes, exito, fracaso, izquierda, derecha;
        int nod, nid, noi, nii;
        double menor, mayor, aux, acumulado, val, Iizq, Ider, medio;
        double gini = 0;
        String str;
        
        public void asignacion(ArrayList<String> datos){
        estudiantes = new ArrayList<>();
        exito = new ArrayList<>();
        fracaso = new ArrayList<>();
        for(int i = 0; i<datos.size(); i++){
            estudiante f = new estudiante();
            f.asignar(datos, i);
            estudiantes.add(f);
            if(f.exito.equals("1")){
                exito.add(f);
            }else fracaso.add(f);
        }
    }
    public void asignacionEstudiantes(ArrayList<estudiante> datos){
        exito = new ArrayList<>();
        fracaso = new ArrayList<>();
        for(int i = 0; i<datos.size(); i++){
            if(datos.get(i).exito.equals("1")){
                exito.add(datos.get(i));
            }else fracaso.add(datos.get(i));
        }
    }
    
    public double gini(int var){
        estudiante estAux;
        izquierda = new ArrayList<>();
        derecha = new ArrayList<>();
        nod = 0; nid = 0; noi = 0; nii = 0;
        menor = 0; mayor = 0; acumulado = 0; medio = 0; val = 0;
        switch(var){
            case 1:
                for(int i = 0; i<exito.size(); i++){
                    estAux = exito.get(i);
                    str = exito.get(i).numLibros;
                    if(str.equalsIgnoreCase("11 A 25 LIBROS") || str.equalsIgnoreCase("26 A 100 LIBROS")){
                        nid++;
                        derecha.add(estAux);
                    }else{
                        nii++;
                        izquierda.add(estAux);
                    }
                }
                for(int i = 0; i<fracaso.size(); i++){
                    estAux = fracaso.get(i);
                    str = fracaso.get(i).numLibros;
                    if(str.equalsIgnoreCase("11 A 25 LIBROS") || str.equalsIgnoreCase("26 A 100 LIBROS")){
                        nod++;
                        derecha.add(estAux);
                    }else{
                        noi++;
                        izquierda.add(estAux);
                    }
                }
                gini = calcularGini(noi, nii, nod, nid);
                break;
            case 2:
                for(int i = 0; i<exito.size(); i++){
                    estAux = exito.get(i);
                    str = exito.get(i).internet;
                    if(str.equalsIgnoreCase("si")){
                        nid++;
                        derecha.add(estAux);
                    }else{
                        nii++;
                        izquierda.add(estAux);
                    }
                }
                for(int i = 0; i<fracaso.size(); i++){
                    estAux = fracaso.get(i);
                    str = fracaso.get(i).internet;
                    if(str.equalsIgnoreCase("si")){
                        nod++;
                        derecha.add(estAux);
                    }else{
                        noi++;
                        izquierda.add(estAux);
                    }
                }
                gini = calcularGini(noi, nii, nod, nid);
                break;
            case 3:
                for(int i = 0; i<exito.size(); i++){
                    estAux = exito.get(i);
                    str = exito.get(i).trabaja;
                    if(str.equalsIgnoreCase("no")){
                        nid++;
                        derecha.add(estAux);
                    }else{
                        nii++;
                        izquierda.add(estAux);
                    }
                }
                for(int i = 0; i<fracaso.size(); i++){
                    estAux = fracaso.get(i);
                    str = fracaso.get(i).trabaja;
                    if(str.equalsIgnoreCase("no")){
                        nod++;
                        derecha.add(estAux);
                    }else{
                        noi++;
                        izquierda.add(estAux);
                    }
                }
                gini = calcularGini(noi, nii, nod, nid);
                break;
            case 6:
                for(int i = 0; i<estudiantes.size(); i++){
                    aux = Double.parseDouble(estudiantes.get(i).lenguaje);
                    acumulado = acumulado + aux;
                }
                medio = acumulado/estudiantes.size();
                for(int i = 0; i<exito.size(); i++){
                    estAux = exito.get(i);
                    val = Double.parseDouble(exito.get(i).lenguaje);
                    dividirExito(estAux, val, 51.71287619047619);
                }
                for(int i = 0; i<fracaso.size(); i++){
                    estAux = fracaso.get(i);
                    val = Double.parseDouble(fracaso.get(i).lenguaje);
                    dividirFracaso(estAux, val, 51.71287619047619);
                }
                gini = calcularGini(noi, nii, nod, nid);
                break;
            case 7:
                for(int i = 0; i<estudiantes.size(); i++){
                    aux = Double.parseDouble(estudiantes.get(i).mate);
                    acumulado = acumulado + aux;
                }
                medio = acumulado/estudiantes.size();
                for(int i = 0; i<exito.size(); i++){
                    estAux = exito.get(i);
                    val = Double.parseDouble(exito.get(i).mate);
                    dividirExito(estAux, val, 52.1204);
                }
                for(int i = 0; i<fracaso.size(); i++){
                    estAux = fracaso.get(i);
                    val = Double.parseDouble(fracaso.get(i).mate);
                    dividirFracaso(estAux, val, 52.1204);
                }
                gini = calcularGini(noi, nii, nod, nid);
                break;
            case 8:
                for(int i = 0; i<estudiantes.size(); i++){
                    aux = Double.parseDouble(estudiantes.get(i).biologia);
                    acumulado = acumulado + aux;
                }
                medio = acumulado/estudiantes.size();
                for(int i = 0; i<exito.size(); i++){
                    estAux = exito.get(i);
                    val = Double.parseDouble(exito.get(i).biologia);
                    dividirExito(estAux, val, 49.664028571428574);
                }
                for(int i = 0; i<fracaso.size(); i++){
                    estAux = fracaso.get(i);
                    val = Double.parseDouble(fracaso.get(i).biologia);
                    dividirFracaso(estAux, val, 49.664028571428574);
                }
                gini = calcularGini(noi, nii, nod, nid);
                break;
            case 9:
                for(int i = 0; i<estudiantes.size(); i++){
                    aux = Double.parseDouble(estudiantes.get(i).quim);
                    acumulado = acumulado + aux;
                }
                medio = acumulado/estudiantes.size();
                for(int i = 0; i<exito.size(); i++){
                    estAux = exito.get(i);
                    val = Double.parseDouble(exito.get(i).quim);
                    dividirExito(estAux, val, 50.53515238095238);
                }
                for(int i = 0; i<fracaso.size(); i++){
                    estAux = fracaso.get(i);
                    val = Double.parseDouble(fracaso.get(i).quim);
                    dividirFracaso(estAux, val, 50.53515238095238);
                }
                gini = calcularGini(noi, nii, nod, nid);
                break;
            case 10:
                for(int i = 0; i<estudiantes.size(); i++){
                    aux = Double.parseDouble(estudiantes.get(i).fisica);
                    acumulado = acumulado + aux;
                }
                medio = acumulado/estudiantes.size();
                for(int i = 0; i<exito.size(); i++){
                    estAux = exito.get(i);
                    val = Double.parseDouble(exito.get(i).fisica);
                    dividirExito(estAux, val, 49.11242857142857);
                }
                for(int i = 0; i<fracaso.size(); i++){
                    estAux = fracaso.get(i);
                    val = Double.parseDouble(fracaso.get(i).fisica);
                    dividirFracaso(estAux, val, 49.11242857142857);
                }
                gini = calcularGini(noi, nii, nod, nid);
                break;
            case 11:
                for(int i = 0; i<estudiantes.size(); i++){
                    aux = Double.parseDouble(estudiantes.get(i).sociales);
                    acumulado = acumulado + aux;
                }
                medio = acumulado/estudiantes.size();
                for(int i = 0; i<exito.size(); i++){
                    estAux = exito.get(i);
                    val = Double.parseDouble(exito.get(i).sociales);
                    dividirExito(estAux, val, 49.94950476190476);
                }
                for(int i = 0; i<fracaso.size(); i++){
                    estAux = fracaso.get(i);
                    val = Double.parseDouble(fracaso.get(i).sociales);
                    dividirFracaso(estAux, val, 49.94950476190476);
                }
                gini = calcularGini(noi, nii, nod, nid);
                break;
            case 12:
                for(int i = 0; i<estudiantes.size(); i++){
                    aux = Double.parseDouble(estudiantes.get(i).filo);
                    acumulado = acumulado + aux;
                }
                medio = acumulado/estudiantes.size();
                for(int i = 0; i<exito.size(); i++){
                    estAux = exito.get(i);
                    val = Double.parseDouble(exito.get(i).filo);
                    dividirExito(estAux, val, 45.35156190476191);
                }
                for(int i = 0; i<fracaso.size(); i++){
                    estAux = fracaso.get(i);
                    val = Double.parseDouble(fracaso.get(i).filo);
                    dividirFracaso(estAux, val, 45.35156190476191);
                }
                gini = calcularGini(noi, nii, nod, nid);
                break;
            case 13:
                for(int i = 0; i<estudiantes.size(); i++){
                    aux = Double.parseDouble(estudiantes.get(i).ingles);
                    acumulado = acumulado + aux;
                }
                medio = acumulado/estudiantes.size();
                for(int i = 0; i<exito.size(); i++){
                    estAux = exito.get(i);
                    val = Double.parseDouble(exito.get(i).ingles);
                    dividirExito(estAux, val, 52.33902857142857);
                }
                for(int i = 0; i<fracaso.size(); i++){
                    estAux = fracaso.get(i);
                    val = Double.parseDouble(fracaso.get(i).ingles);
                    dividirFracaso(estAux, val, 52.33902857142857);
                }
                gini = calcularGini(noi, nii, nod, nid);
                break;    
        }
        return gini;
    }
    private void dividirExito(estudiante estudianteAuxiliar, double valor, double umbral){
        if(valor<umbral){
         nii++;
         izquierda.add(estudianteAuxiliar);
        }else{ 
            nid++;
            derecha.add(estudianteAuxiliar);
        }
    }
    private void dividirFracaso(estudiante estudianteAuxiliar, double valor, double umbral){
        if(valor<umbral){
         noi++;
         izquierda.add(estudianteAuxiliar);
        }else{ 
            nod++;
            derecha.add(estudianteAuxiliar);
        }
    }
    private double calcularGini(double noi, double nii, double nod, double nid){
        Iizq = 1-((Math.pow(noi,2)/Math.pow((noi+nii),2))+(Math.pow(nii,2)/Math.pow((noi+nii),2)));
        Ider = 1-((Math.pow(nod,2)/Math.pow((nod+nid),2))+(Math.pow(nid,2)/Math.pow((nod+nid),2)));
        return ((Iizq*(noi+nii))+(Ider*(nod+nid)))/((noi+nii)+(nod+nid));
    }
}
