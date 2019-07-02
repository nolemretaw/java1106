import java.util.function.BiConsumer;
import java.util.logging.XMLFormatter;

/**
 * @program: Lambdatest
 * @description:
 * @author: hutingrong
 * @create: 2019-07-03 00:40
 */
public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        GreetingService greetingService = message1 -> System.out.println("hello" + message1);
//        (1,9) ->BiConsumer<x,y>
    }
}
