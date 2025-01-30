import java.util.Scanner;

public class k{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = in.nextInt();
        System.out.println("Введите операцию: ");
        in.nextLine();
        String c = in.nextLine();
        System.out.println("Введите второе число: ");
        int b = in.nextInt();
        switch (c) {
            case "+":
                System.out.println(a + " " + c + " " + b + " = " + (a + b));
                break;
            case "-":
                System.out.println(a + " " + c + " " + b + " = " + (a - b));
                break;
            case "*":
                System.out.println(a + " " + c + " " + b + " = " + (a * b));
                break;
            default:
                System.out.println(a + " " + c + " " + b + " = " + (a / b));
                break;
        }
    }
}