/**
 * @program: Lambdatest
 * @description:
 * @author: hutingrong
 * @create: 2019-06-27 00:03
 */
public class ThreadTest {
    public static void main(String[] args) {
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        }).start();*/
        new Thread(() -> System.out.println("hello,lambda")).start();
    }
}
