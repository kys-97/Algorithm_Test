import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        int pick = nums.length/2;
        int answer = 0;
        HashSet <Integer> set = new HashSet<>();

       for (int i: nums) {
            set.add(i);
        }
        if (pick >= set.size()) {
            answer = set.size();
        }
        else {
            answer = pick;
        }
        return answer;
    }
}