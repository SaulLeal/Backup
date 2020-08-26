package demos.functionalProgramming;

@FunctionalInterface
public interface SimpleFunctionalInterface {
    //Abstract method used in this interface
    public void doWork();

    //Abstract methods from Object Class
    public String toString();
    public boolean equals(Object o);
}
