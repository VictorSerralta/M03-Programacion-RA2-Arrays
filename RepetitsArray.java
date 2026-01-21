import java.util.Arrays;
import java.util.Scanner;

public class RepetitsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] partits = new int [20];
        for (int i = 0; i < N; i++) {
            partits [sc.nextInt()-1]++;
        }
        System.out.println(Arrays.toString(partits));
        int max = -1;
        for (int i = 0; i < partits.length; i++) {
            if (max == -1) {
                max = i;
            } else {
                if (partits[i] > partits[max]) {
                    max = i;
                }
            }
        }
        System.out.println(max + 1);
    }
}
