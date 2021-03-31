package KauflandExampleContest.BarStar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beers = 200;
        int wine = 300;

        int beersDeliveries = 0;
        int wineDeliveries = 0;

        int beerOrders = 0;
        int wineOrders = 0;

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] inputTokens = input.split(": ");

            String type = inputTokens[0];
            int quantity = Integer.parseInt(inputTokens[1]);

            if (type.equals("Beers") || type.equals("Beer")) {
                if (quantity >= 0){
                    beersDeliveries++;
                    beers += quantity;
                } else {
                    if (beers - Math.abs(quantity) < 0){
                        System.out.println("Not enough beer!");
                    }else {
                        beerOrders++;
                        beers -= Math.abs(quantity);
                    }
                }
            }

            if (type.equals("Wines") || type.equals("Wine")) {
                if (quantity >= 0){
                    wineDeliveries++;
                    wine += quantity;
                } else {
                    if (wine - Math.abs(quantity) < 0){
                        System.out.println("Not enough wine!");
                    }else {
                        wineOrders++;
                        wine -= Math.abs(quantity);
                    }
                }
            }


            input = scanner.nextLine();
        }

        System.out.println(String.format("Wines: %d",wine));
        System.out.println(String.format("Deliveries: %d",wineDeliveries));
        System.out.println(String.format("Orders: %d",wineOrders));
        System.out.println(String.format("Beers: %d",beers));
        System.out.println(String.format("Deliveries: %d",beersDeliveries));
        System.out.println(String.format("Orders: %d",beerOrders));
    }
}
