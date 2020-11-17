import java.util.ArrayList;

public class estudiante
{
    String cod, exterior, periodo, etnia, preparacion, docenteIes, apoyoExt, cursoIesExt, simulacroIcfes, refuerzoAreas, refuerzoGeneric,trabajoPadre, trabajoMadre, numLibros, instCodDep, tipoDoc, gacion, genero, nacimiento, periodoAnt, estudiante, paisReside, deptoReside, codDepto, mcpioReside, codMcpio, areaReside, pensionColegio, educPadre, educMadre, ocupPadre, ocupMadre, estrato, sisben, pisos, internet, computador, microondas, horno, automov, dvd, nevera, celular, telefono, ingresoMen, trabaja, antecedentes, expectativas, coleCodIcfes, coleCodDaneEst, coleNombre, coleGenero, coleNaturaleza, coleCalendario, coleBilin, coleCaracter, coleCodDaneSede, coleNombreSede, coleSedePrin, coleArea, coleJornada, coleCodMcpio, coleMcpio, coleCodDpto, coleDpto, lenguaje, mate, biologia, quim, fisica, sociales, filo, ingles, desempIng, profundiza, puntProf, desempProf, exito;
    
    /*Este método recibe un arreglo de lineas 
     * para poder separar de manera sencilla
     * las variables separadas por ";" y así
     * asignarlas a los atributos ya definidos
       */
    public void asignar(ArrayList<String> info, int i){
        String[] s = info.get(i).split("[;]");
        cod = s[0];
        exterior = s[1];
        periodo = s[2];
        etnia = s[3];
        preparacion = s[4];
        docenteIes = s[5];
        apoyoExt = s[6];
        cursoIesExt = s[7];
        simulacroIcfes = s[8];
        refuerzoAreas = s[9];
        refuerzoGeneric = s[10];
        trabajoPadre = s[11];
        trabajoMadre = s[12];
        numLibros = s[13];
        instCodDep = s[14];
        tipoDoc = s[15];
        gacion = s[16];
        genero = s[17];
        nacimiento = s[18];
        periodoAnt = s[19];
        estudiante = s[20];
        paisReside = s[21];
        deptoReside = s[22];
        codDepto = s[23];
        mcpioReside = s[24];
        codMcpio = s[25];
        areaReside = s[26];
        pensionColegio = s[27];
        educPadre = s[28];
        educMadre = s[29];
        ocupPadre = s[30];
        ocupMadre = s[31];
        estrato = s[32];
        sisben = s[33];
        pisos = s[34];
        internet = s[35];
        computador = s[36];
        microondas = s[37];
        horno = s[38];
        automov = s[39];
        dvd = s[40];
        nevera = s[41];
        celular = s[42];
        telefono = s[43];
        ingresoMen = s[44]; 
        trabaja = s[45];
        antecedentes = s[46];
        expectativas = s[47];
        coleCodIcfes = s[48];
        coleCodDaneEst = s[49];
        coleNombre = s[50];
        coleGenero = s[51];
        coleNaturaleza = s[52];
        coleCalendario = s[53];
        coleBilin = s[54];
        coleCaracter = s[55];
        coleCodDaneSede = s[56];
        coleNombreSede = s[57];
        coleSedePrin = s[58];
        coleArea = s[59];
        coleJornada = s[60];
        coleCodMcpio = s[61];
        coleMcpio = s[62];
        coleCodDpto = s[63];
        coleDpto = s[64];
        lenguaje = s[65];
        mate = s[66];
        biologia = s[67];
        quim = s[68];
        fisica = s[69];
        sociales = s[70];
        filo = s[71];
        ingles = s[72];
        desempIng = s[73];
        profundiza = s[74];
        puntProf = s[75];
        desempProf = s[76];
        exito = s[77];
    }
}

