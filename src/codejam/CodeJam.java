package codejam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sebastian
 */
public class CodeJam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String archivoEntrada = args[0];
        String archivoSalida = archivoEntrada + ".out";
        File fichero = new File(archivoSalida);
        BufferedWriter bw;

        Map<String, String> m = new HashMap<>();

        m.put("a", "y");
        m.put("b", "h");
        m.put("c", "e");
        m.put("d", "s");
        m.put("e", "o");
        m.put("f", "c");
        m.put("g", "v");
        m.put("h", "x");
        m.put("i", "d");
        m.put("j", "u");
        m.put("k", "i");
        m.put("l", "g");
        m.put("m", "l");
        m.put("n", "b");
        m.put("o", "k");
        m.put("p", "r");
        m.put("q", "z");
        m.put("r", "t");
        m.put("s", "n");
        m.put("t", "w");
        m.put("u", "j");
        m.put("v", "p");
        m.put("w", "f");
        m.put("x", "m");
        m.put("y", "a");
        m.put("z", "q");
        m.put(" ", " ");

        try {
            bw = new BufferedWriter(new FileWriter(fichero));
            FileReader fr = new FileReader(archivoEntrada);
            BufferedReader br = new BufferedReader(fr);

            String linea, caracter;
            int i = 0;
            while ((linea = br.readLine()) != null) {
                if (i > 0) {

                    System.out.print("case #" + i + ": ");
                    bw.write("case #" + i + ": ");

                    for (int j = 0; j < linea.length(); j++) {
                        caracter = String.valueOf(linea.charAt(j));
                        bw.write(m.get(caracter));
                        System.out.print(m.get(caracter));
                    }
                    bw.write("\n");
                    System.out.println("");
                }
                i++;
            }
            fr.close();
            bw.close();

        } catch (Exception e) {
            System.out.println("Error leyendo el archivo " + archivoEntrada + " : " + e);
        }
    }

}
