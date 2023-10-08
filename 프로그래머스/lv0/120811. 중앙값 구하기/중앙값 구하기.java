import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        //1 2 7 10 11 -> 5개 중 중앙값 = 3번째 -> array[2] -> length/2
        //array 정렬
        Arrays.sort(array);
        return array[array.length/2];
    }
}