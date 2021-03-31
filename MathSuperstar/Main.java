package KauflandExampleContest.MathSuperstar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",");

        double r1 = Double.parseDouble(input[0]) / 10;
        double h1 = Double.parseDouble(input[1]) / 10;
        double r2 = Double.parseDouble(input[2]) / 10;
        double h2 = Double.parseDouble(input[3]) / 10;

        double v1 = Math.PI * Math.pow(r1,2) * h1;
        double v2 = Math.PI * Math.pow(r2,2) * h2;

        if (v1 - v2 > 0){
            System.out.println(String.format("The first one is bigger: %.2f", v1));
        } else if (v1 - v2 < 0){
            System.out.println(String.format("The second one is bigger: %.2f", v2));
        } else {
            System.out.println(String.format("The cilinders are equal: %.2f", v1));
        }



    }
}
