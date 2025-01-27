package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 프로그래머스 https://school.programmers.co.kr/learn/courses/30/lessons/68644
 * <p>입력 [2,1,3,4,1] 출력 [2,3,4,5,6,7]</p>
 * <p>입력 [5,0,2,7] 출력 [2,5,7,9,12]</p>
 */
public class 두_개_뽑아서_더하기 {
    public static void main(String[] args) {
        int[] numbers1 = new int[]{2, 1, 3, 4, 1};
        int[] numbers2 = new int[]{5, 0, 2, 7};

        System.out.println("Arrays.toString(solution(numbers1)) = " + Arrays.toString(solution(numbers1)));
        System.out.println("Arrays.toString(solution(numbers2)) = " + Arrays.toString(solution(numbers2)));
    }

    private static int[] solution(int[] arr) {
        // 중복 제거를 위한 셋 자료구조
        Set<Integer> set = new HashSet<>();

        // arr의 두 수를 선택하기 위해 중첩 반복문 사용
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                set.add(arr[i] + arr[j]);
            }
        }

        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
