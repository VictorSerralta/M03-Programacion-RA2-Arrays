import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.swap;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N  = sc.nextInt();
        String[] equip = new String[N];
        int[] punts = new int[N];
        for (int i = 0; i < N; i++){
            equip[i] = sc.next();
            punts[i] = sc.nextInt();
        }
        int[] fusion = new int[N];
        for (int i = 0; i < N; i++) {
            //fusion[i] = equip[i] + punts[i];
        }
        System.out.println(Arrays.toString(fusion));
        /*boolean swapped;
        for (int i = 0; i < N - 1; i++) {
            swapped = false;
            for (int j = 0; j < N - i - 1; j++) {
                if (fusion[j] > fusion[j + 1]) {
                    swap(fusion[j], fusion[j + 1]);
                    swapped = true;
                }
            }
        }

         */
    }
}
