import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @program: Lambdatest
 * @description:
 * @author: hutingrong
 * @create: 2019-06-27 00:10
 */
public class SortTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(new String[]{"d", "c", "a"});
        /*Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });*/

        Collections.sort(list,(o1,o2)->o1.compareTo(o2));
        System.out.println(list.toString());
    }
}
