/*** S1.3 Nivell 3 exercici 1 ***/
package n3exercici1;

import java.io.*;
import java.util.*;

public class EditarCsv {
    private static String ruta;
    public EditarCsv(String ruta) throws Exception {
        setRuta(ruta);
    }

    public static String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public List<Persona> csvAList() throws Exception {
        BufferedReader bufferedReader=new BufferedReader(new FileReader(getRuta()));
        String[] s=new String[3];
        boolean endOfFile=true;
        List<Persona> list=new ArrayList<>();
        bufferedReader.readLine();
        while(endOfFile) {
           String auxString = bufferedReader.readLine();
            if(auxString!=null) {
                s=auxString.split(";");
                Persona persona=new Persona(s[0],s[1],s[2]);
                list.add(persona);
            }
            else {
                endOfFile=false;
            }
        }

        return list;
    }

    public void afegirPersonaACsv(Persona persona) throws IOException {
        String[] array=new String[3];
        array[0]=persona.getNom();
        array[1]= persona.getCognom();
        array[2]=persona.getDNI();
        StringBuilder s=new StringBuilder("");
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(getRuta(),true)));
            for (int i = 0; i < array.length; i++) {
                s.append(array[i]);
                if (i < array.length - 1) {
                    s.append(";");
                }
            }
            s.append("\n");
            System.out.println(s);
            printWriter.append(s);
            printWriter.close();
    }

    public static void imprimeixCapçalera() throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new FileReader(getRuta()));
        String[] s=new String[3];
        String auxString = bufferedReader.readLine();
        s=auxString.split(";");
        auxString="";
        for(int i=0;i<s.length;i++) {
            auxString+="_"+s[i]+"_____";
        }
        System.out.println(auxString);
    }
}
