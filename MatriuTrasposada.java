import java.util.Scanner;
import java.util.Arrays;

public class MatriuTrasposada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] matriu = new int[N][M];
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++) {
                matriu[i][j] = sc.nextInt();
            }
        }
        for (int i = N - 1; i >= 0; i--) {
            for (int j = M -1; j >= 0; j--) {
                System.out.print(matriu[i][j]);
                if (i != 0) System.out.print(matriu[i][j]+" ");
            }
            System.out.println();
        }

    }
}
