/**
 * Created by mac on 12.11.17.
 */
import java.util.Scanner;

public class Class1 implements Runnable {

    @Override
    public void run() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();
            System.out.println("Сумма: " + (a + b));
        }
    }
}
