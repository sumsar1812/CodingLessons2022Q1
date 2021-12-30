import java.util.Scanner;

public class WhileExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = -1;
        while (input < 0) {
            System.out.println("Indtast et positivt tal");
            input = scanner.nextInt();
        }
        System.out.println("Det du skrev var et positivt tal!");
        System.out.println(input);
        System.out.println();
        System.out.println();

        int i = 0;
        while (i < 10) {
            System.out.println("Hej med dig");
            i = i + 1;
        }



    }
}
