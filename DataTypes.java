import java.util.Scanner;

public class DataTypes {
    public static void result(int number) {
        number = number * 2;
        System.out.println(number);
    }
    public static void result(double number) {
        number = number * 1.5;
        System.out.println(number);
    }
    public static void result(String command) {
        command = "hello";
        System.out.println("$"+command+"$");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("int")) {
            int number = scanner.nextInt();
            result(number);
        }
        if (input.equals("real")) {
            double number = scanner.nextDouble();
            result(number);
        }
        if (input.equals("string")) {
            String command = scanner.nextLine();
            result(command);
        }
    }
}
