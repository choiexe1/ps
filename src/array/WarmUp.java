package array;

import java.util.Arrays;

public class WarmUp {
    public static void main(String[] args) {
        int[] a = new int[]{-5, 4, 3, 2, 1};
        int[] b = new int[]{3, 2, 1, 4, 8};

        System.out.println("solution1(a)) = " + Arrays.toString(solution1(a)));
        System.out.println("solution2(b) = " + Arrays.toString(solution2(b)));
    }

    /**
     * 원본 배열 자체 정렬
     */
    private static int[] solution1(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    /**
     * 원본 배열 복사 후 정렬
     */
    private static int[] solution2(int[] arr) {
        int[] clone = arr.clone();
        Arrays.sort(clone);
        return clone;
    }
}
