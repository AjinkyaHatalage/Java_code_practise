package challenges.games;

import java.util.Scanner;

public class FillingTheBlanks {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lets create a story !");
        System.out.println("Enter an adjective ");
        String adjective = scanner.next();

        System.out.println("Enter a season of the year ");
        String season=scanner.next();

        System.out.println("Enter a whole number :");
        int number = scanner.nextInt();

        scanner.close();

        System.out.println("On a(n) "+ adjective +" "+season + "day, I drink minimum of " + number +"cups of coffee.");

    }
}
