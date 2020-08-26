package demos.functionalProgramming;

public class SimpleFunctionalInterfaceTest {
    public static void main(String[] args) {

        //Use Anonymous Class
        carryOutWork(new SimpleFunctionalInterface() {
            @Override
            public void doWork() {
                System.out.println("Do work in SimpleFun implementation.");
            }
        });

        //Use lambda expression
        carryOutWork(() -> System.out.println("Do work in lambda exp implementation."));

        SimpleFunctionalInterface demo = () -> System.out.println("Test with a variable");
        demo.doWork();

    }

    public static void carryOutWork(SimpleFunctionalInterface sfi) {
        sfi.doWork();
    }
}
