import java.util.Arrays;
import java.util.List;

/**
 * @brief (non-javadoc)
 * 
 * @author zeonghun
 * @since 230316
 */
public class Main {
    public static void main(String[] args) {
        String[] arr = { "apple", "banana", "mango" };
        List<String> list = Arrays.asList("soccer", "baseball", "golf");

        ArrayToList atl = new ArrayToList();
        atl.atl(arr);

        ListToArray lta = new ListToArray();
        lta.lta(list);
    }
}
