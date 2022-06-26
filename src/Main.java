import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Beef beef = new Beef();
        Noodle noodle = new Noodle();
        beef.setIsCheap(true);
        beef.setPrice(25);
        noodle.setIsCheap(false);
        noodle.setPrice(15);
        int a = 1;
        ArrayList<Integer> foodList = new ArrayList<Integer>();

        System.out.println("1.Beef's price:"+beef.getPrice());
        System.out.println("2.Noodle's price:"+noodle.getPrice());
        System.out.println("input:");
        while (a != 0){
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            if(a == 1 || a == 2){
                foodList.add(a);
            }
            else if(a != 0) {
                System.out.println("error input!");
            }
        }

        int price = 0;
        for (int i = 0; i < foodList.size(); i++){
            if (foodList.get(i) == 1){
                price = price + beef.getPrice();
            }
            else if(foodList.get(i) == 2){
                price = price + noodle.getPrice();
            }
        }
        System.out.println("原价："+price);



        int firstPrice = 0;

        for (int i = 0; i < foodList.size(); i++){
            if (foodList.get(i) == 1){
                firstPrice = firstPrice + beef.getPrice();
            }
            else if(foodList.get(i) == 2){
                firstPrice = firstPrice + noodle.getPrice();
            }
        }
        firstPrice = firstPrice - (firstPrice / 30) * 6;
        System.out.println("第一种促销："+firstPrice);

        int secondPrice = 0;

        for (int i = 0; i < foodList.size(); i++){
            if (foodList.get(i) == 1){
                secondPrice = beef.getIsCheap() ? secondPrice + beef.getPrice() / 2 : secondPrice + beef.getPrice();
            }
            else if(foodList.get(i) == 2){
                secondPrice = noodle.getIsCheap() ? secondPrice + noodle.getPrice() / 2 : secondPrice + noodle.getPrice();

            }
        }
        System.out.println("第二种促销："+secondPrice);
    }
}
