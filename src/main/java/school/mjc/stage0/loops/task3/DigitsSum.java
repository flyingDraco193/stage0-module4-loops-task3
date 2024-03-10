package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String stringNumber = t + "";
        int sum = 0;
        if (t < 0) {
            t *= -1;
        }
        for (int i = 0; i < stringNumber.length(); i++) {
            sum += t % 10;
            t /= 10;
        }
        System.out.println(sum);
    }
}
