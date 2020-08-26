package demos.functionalProgramming;

@FunctionalInterface
public interface ComplexFunctionalInterface extends SimpleFunctionalInterface {
    default public void doSomeWork(){
        System.out.println("Doing some work in interface impl...");
    }
    default public void doSomeOtherWork(){
        System.out.println("Doing some other work in interface impl...");
    }
}
