import java.util.Arrays;
import java.util.List;

/**
 * @brief 리스트를 배열로 변환하는 메소드
 * 
 * @param list 배열로 변환할 리스트
 * 
 * @author zeonghun
 * @since 230316
 */
public class ListToArray {
    public void lta(List<String> list) {
        int arrSize = list.size(); // 리스트에 들어있는 원소 수
        String arr[] = list.toArray(new String[arrSize]); // 리스트를 배열로 변환
        System.out.println(Arrays.toString(arr));
    }
}
