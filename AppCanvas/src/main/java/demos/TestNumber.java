package demos;

public class TestNumber {
    public static double sum(Number[] nums) {
        double sum = 0.0;
        for (Number num: nums) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        Number[] nums = new Number[4];

        nums[0] = (byte) 10;
        nums[1] = 10;
        nums[2] = 10f;
        nums[3] = 10d;

        System.out.println("The sum of numbers is: " + sum(nums));
    }
}
