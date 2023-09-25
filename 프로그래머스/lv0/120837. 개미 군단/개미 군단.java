class Solution {
    public int solution(int hp) {
       
        //if hp = 24 -> 5로 나눈 몫 : 4
        int a = hp/5;
        //24%5 = 4 /3 -> 1
        int b = (hp%5)/3;
        //24%5%3/1
        int c = ((hp%5)%3);
        return a+b+c;
    }
}