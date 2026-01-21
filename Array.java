import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Arrays Invers HacerRank
        int n = sc.nextInt();
        int[] llista = new int[n];
        for (int i = 0; i < n; i++) {
            llista[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(llista[i]);
            if (i != 0) System.out.print(" ");
        }
        */
        /* Suma arrays HacerRank
        int n = sc.nextInt();
        int[] llista = new int[n];
        for (int i = 0; i < n; i++) {
            llista[i] = sc.nextInt();
        }
        int ultim = llista[n-1];
        for (int i = 0; i < n; i++) {
            System.out.print(llista[i] + ultim);
            if (i != n - 1) System.out.print(" ");
        }
        */
        /* Reduïm valors array HacerRank
        int n = sc.nextInt();
        int[] llista = new int[n];
        int minim = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            llista[i] = sc.nextInt();
            if (llista[i] <= minim) minim = llista[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(llista[i] - minim);
            if (i != n - 1) System.out.print(" ");
        }
        */
        /* int N = sc.nextInt();
        int[] array1 = new int[N];
        for (int i = 0; i < N; i++) {
            array1[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int[] array2 = new int[M];
        for (int j = 0; j < M; j++) {
            array2[j] = sc.nextInt();
        }
        int[] fusio = new int[N+M];
        for (int c = 0; c< fusio.length; c++){
            if (array1.length == c) {

            }
        }
        */
        //Fusió arrays ordenats HackerRank
        int N = sc.nextInt();
        int[] array1 = new int[N];
        for (int i = 0; i < N; i++) {
            array1[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] array2 = new int[M];
        for (int j = 0; j < M; j++) {
            array2[j] = sc.nextInt();
        }

        int[] fusion = new int[N+M];
        for (int i = 0; i < N; i++) {
            fusion[i] = array1[i];
        }
        for (int i = 0; i < M; i++) {
            fusion[i+N] = array2[i];
        }

        Arrays.sort(fusion);
        for (int n : fusion) {
            System.out.print(n + " ");
        }


        /*
        int P = sc.nextInt();
        String d = sc.next();
        int N = sc.nextInt();
        int[] vector = new int[N];
        for (int i = 0; i < N; i++) {
            vector[i] = sc.nextInt();
        }
        int[] result = new int[N];
        if (d.equals("e")) {
            for (int i = 0; i < N; i++) {
                result[i] = vector[(i + P) % N];
            }
        }
        if (d.equals("d")) {
            for (int i = 0; i < N; i++) {
                result[(i + P) % N] = vector[i];
            }
        }
        Arrays.toString(result);
        for (int n : result) {
            System.out.print(n + " ");
        }

         */
    }
}
