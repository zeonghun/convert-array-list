import java.util.Arrays;
import java.util.List;

/**
 * @brief 배열을 리스트로 변환하는 메소드
 * 
 * @param arr 리스트로 변환할 배열
 * 
 * @author zeonghun
 * @since 230316
 */
public class ArrayToList {
    public void atl(String[] arr) {
        List<String> list = Arrays.asList(arr); // 배열을 리스트로 변환
        System.out.println(list);
    }
}
