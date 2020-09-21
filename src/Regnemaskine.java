import java.util.Scanner;

public class Regnemaskine{

    public static void main (String[] args) {
        int result=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Skriv det tegn du vil bruge (+, -, *, /)");
        //System.out.println("" + input.nextLine());
        String tegn = input.nextLine();

        System.out.println("Skriv det først tal");
        int a = input.nextInt();

        System.out.println("Skriv det næste tal");
        int b = input.nextInt();
        input.close();

        if (tegn.equals("+")){
            result = a + b;
        }
        if (tegn.equals("-")){
            result = a - b;
        }
        if (tegn.equals("/")){
            result = a / b;
        }
// HVorfor fjerner du min *.
        // Nu er min regnemaskine vildt ringe...
        System.out.println("Resultat: " + a + tegn + b + " = " + result);
    }
}
