package array;

import java.util.Arrays;
import java.util.Collections;

/**
 * 정수 배열을 하나 받습니다. 배열의 중복 값을 제거하고 배열 데이터를 내림차순으로 정렬해서 반환하는 solution() 함수를 구현하세요.
 * <p>
 * 배열 길이는 2 이상 1,000 이하 배열의 데이터 값은 -10,000 이상 10,000 이하
 */
public class 배열_제어하기 {

    public static void main(String[] args) {
        int[] arr1 = {4, 2, 2, 1, 3, 4};
        int[] arr2 = {2, 1, 1, 3, 2, 5, 4};

        System.out.println("Arrays.toString(solution(arr1)) = " + Arrays.toString(solution(arr1)));
        System.out.println("Arrays.toString(solution(arr2)) = " + Arrays.toString(solution(arr2)));
    }

    private static int[] solution(int[] arr) {
        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);

        Arrays.sort(result, Collections.reverseOrder());

        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }
}
