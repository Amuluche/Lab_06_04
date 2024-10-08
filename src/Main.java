//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
    Random Number = new Random();
    Scanner Scanner = new Scanner(System.in);
    System.out.print("Enter a number 1-10: ");
    int num=Scanner.nextInt();

    do {System.out.print("The random number was " + Number.nextInt(11) + " and your guess was " + num );
        if (num > 0 && num < 11){break;}
    }while(num > 0);
    }
}