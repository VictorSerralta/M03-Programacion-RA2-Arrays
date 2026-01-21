import java.util.Scanner;

public class Pangrama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase = sc.nextLine().toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            System.out.println(frase.charAt(i));
        }

        boolean pangrama = true;

        for (char c = 'a'; c <= 'z'; c++) {
            if (!frase.contains(String.valueOf(c))) {
                pangrama = false;
                break;
            }
        }
        if (pangrama == true){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
