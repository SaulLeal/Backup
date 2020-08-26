package demos.functionalProgramming;

@FunctionalInterface
interface LambdaFunction {
    void call();
    public String toString();
    public boolean equals(Object o);
}

public class FirstLambda {
    public static void main(String[] args) {
        LambdaFunction lambda = () -> System.out.println("Hello world Lambda");
        lambda.call();

        LambdaFunction anonymous = new LambdaFunction() {
            public void call() {
                System.out.println("Hello world Anonymous");
            }
        };
        anonymous.call();
    }
}