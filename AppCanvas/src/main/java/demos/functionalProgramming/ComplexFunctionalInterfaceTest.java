package demos.functionalProgramming;

public class ComplexFunctionalInterfaceTest {
    public static void main(String[] args) {

        //Use Anonymous Class
        carryOutWork(new ComplexFunctionalInterface() {
            @Override
            public void doWork() {
                System.out.println("Do work in lambda exp implementation with ComplexFunctionalInterface.");
            }
        });

        //Use lambda expression
        carryOutWork(() -> System.out.println("Do work in lambda exp implementation with ComplexFunctionalInterface."));

    }

    public static void carryOutWork(ComplexFunctionalInterface cfi) {
        cfi.doWork();
    }
}