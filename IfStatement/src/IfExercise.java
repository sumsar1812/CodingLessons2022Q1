import java.util.Scanner;

public class IfExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast x");
        int x = scanner.nextInt();

        if (x > 0) {
            System.out.println("x er større end 0");
        } else if(x == 0){
            System.out.println("x er samme værdi som 0");
        } else if (x == -1) {
            System.out.println("x er samme værdi som -1");
        } else {
            System.out.println("x er mindre end -1");
        }
        System.out.println("Indtast alder");
        int age = scanner.nextInt();
        if (age > 100) {
            System.out.println("Du burde være død");
        } else if (age > 60) {
            System.out.println("Tid til pension");
        } else if(age > 18) {
            System.out.println("Nu du voksen");
        } else {
            System.out.println("Du er stadig et barn");
        }

        double z = 25;
        int input = scanner.nextInt();
        if (input == 0) {
            System.out.println("Du kan ikke dividere med 0");
        } else {
            System.out.println(z / input);
        }




        /*if (x < 15) {
            System.out.println("x er større end 15");
        }

        if (smallerThan15) {
            System.out.println("x er mindre end(eller samme værdi) som 15");
        }*/


        System.out.println("Programmet slutter");


    }
}
