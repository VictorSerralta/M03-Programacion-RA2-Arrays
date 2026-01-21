import java.util.Arrays;
import java.util.Scanner;

public class SumaMatrius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] matriu = new int[N][M];
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                matriu[i][j] = sc.nextInt();
            }
        }
        int N2 = sc.nextInt();
        int M2 = sc.nextInt();
        int [][] matriu2 = new int[N2][M2];
        for (int i = 0; i < N2; i++){
            for (int j = 0; j < M2; j++){
                matriu2[i][j] = sc.nextInt() + matriu[i][j];
                System.out.print(matriu2[i][j]+" ");
            }
            System.out.println();
        }

    }
}
