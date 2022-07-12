package MapTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int finall = 1;
        int i = 0;
        Map<String, Integer> count = new TreeMap<>();
        int somaA = 0;
        int somaC = 0;
        int somaB = 0;

        while (finall == 1){
            i++;
            System.out.printf("#%d Urna, cadastrar votos: %n", i);
            System.out.println("Votos candidato A: ");
            String A = "A";
            int votosA = scan.nextInt();
            somaA += votosA;
            count.put(A, somaA);
            System.out.println("Votos candidato B: ");
            String B = "B";
            int votosB = scan.nextInt();
            somaB += votosB;
            count.put(B, somaB);
            System.out.println("Votos candidato C: ");
            String C = "C";
            int votosC = scan.nextInt();
            somaC += votosC;
            count.put(C, somaC);
            System.out.println("Cadastrar novas urnas? (1 para sim/2 para não): ");
            finall = scan.nextInt();
        }
        System.out.println(count);
    }
}
