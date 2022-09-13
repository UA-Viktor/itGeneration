import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        System.out.println("What is Bitcoin price today?");

        Scanner scanner = new Scanner(System.in);
        double bit = scanner.nextDouble();

        System.out.println("How much $ do you have?");
        double dol = scanner.nextDouble();

        double coin = dol / bit;
        String result = String.format("%.7f", coin);
        System.out.println("You can buy " + result + " BTC");

    }



}
