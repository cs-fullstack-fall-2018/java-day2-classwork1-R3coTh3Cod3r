import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String awesome = "very awesome";
        String alright = "okay";
        Scanner responseInput = new Scanner(System.in);

        System.out.println("How awesome is Kenn and Kevin?");
         alright = responseInput.nextLine();

         while (!responseInput.equals(awesome)){
            System.out.println("Response");
           awesome = responseInput.nextLine();
    }
}        }
