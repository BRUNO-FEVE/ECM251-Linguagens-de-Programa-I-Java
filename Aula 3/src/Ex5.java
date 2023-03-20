import java.util.*;
import java.io.*;


public class Ex5 {
    /*5. Crie um algoritmo capaz de ler dez palavras quaisquer, gravadas em um arquivo texto, e as apresente no console em ordem inversa do arquivo. */
    public static void main(String[] args) throws Exception {
        File arquivo = new File("src/Ex5.txt");
        Scanner sc = new Scanner(arquivo);

        BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
        String[] palavras = leitor.readLine().split(" ");

        String ordemInvertida = "";

        for (int i=0; i<palavras.length; i++) {
            ordemInvertida += palavras[(palavras.length-i)-1] + " ";
        }

        System.out.println(ordemInvertida);

        sc.close();
        leitor.close();
    }
}

