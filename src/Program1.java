import java.util.*;

public class Program1 {

    public static void main(String[] args) {

        int ans;
        char op;
        int number = 10;
        int[] numbers = {11};
        for (int i = 0; i < numbers.length; i++) {
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            while (num1 > 10) {
                System.out.println("Вы ввели число больше десяти!");
                return;
            }
            op = sc.next().charAt(0);
            int num2 = sc.nextInt();
            while (num2 > 10) {
                System.out.println("Вы ввели число больше десяти!");
                return;
            }
            switch (op) {
                case '+' -> ans = num1 + num2;
                case '-' -> ans = num1 - num2;
                case '*' -> ans = num1 * num2;
                case '/' -> ans = num1 / num2;
                default -> {
                    return;
                }
            }
            System.out.print(ans);
        }
    }
}
