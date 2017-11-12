/**
 * Created by mac on 12.11.17.
 */
public class Class2 implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Работаю, все в порядке!");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}