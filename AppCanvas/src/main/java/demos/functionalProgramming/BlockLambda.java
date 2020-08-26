package demos.functionalProgramming;

public class BlockLambda {
    @FunctionalInterface
    interface LambdaFunction {
        String intKind(int a);
    }

    public static void main(String[] args) {
        LambdaFunction lambdaFun = (int i) -> ((i % 2) == 0) ? "even" : "odd";

        System.out.println(lambdaFun.intKind(10));
    }
}
