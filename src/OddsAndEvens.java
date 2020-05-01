import java.util.*;

public class OddsAndEvens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's play a game called \" Odds and Evens \"");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Hello " + name + ", which do you choose? (O)dds or (E)vens? ");
        String choice = input.next();

        if (choice.equalsIgnoreCase("O")) {
            System.out.println(name + " has picked odds! The computer will be evens.");
        } else if (choice.equalsIgnoreCase("E")) {
            System.out.println(name + " has picked evens! The computer will be odds.");
        }
        System.out.println("---------------------------------------");
        System.out.println();

        System.out.print("How many \"fingers\" are you going to play? ");
        int fingers = input.nextInt();

        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays " + computer + "\"fingers\".");
        System.out.println("---------------------------------------");
        System.out.println();

        int sum = fingers + computer;
        System.out.println(fingers + " + " + computer + " = " + sum);

        boolean result = sum % 2 == 0;

    }
}
