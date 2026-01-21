import java.util.Arrays;
import java.util.Scanner;

public class Histograma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pes = new int [20];
        for (int i = 0; i < 20; i++) {
            pes[i] = sc.nextInt();
        }
        Arrays.sort(pes);
        System.out.println(Arrays.toString(pes));
        int pesActual = pes[0];
        int contador = 1;
        for (int i = 1; i < pes.length; i++) {
            if (pes[i] == pesActual) {
                contador++;
            } else {
                System.out.print(pesActual + " ");
                for (int j = 0; j < contador; j++) {
                    System.out.print("-");
                }
                System.out.println();

                pesActual = pes[i];
                contador = 1;
            }
        }
        System.out.print(pesActual + " ");
        for (int j = 0; j < contador; j++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
