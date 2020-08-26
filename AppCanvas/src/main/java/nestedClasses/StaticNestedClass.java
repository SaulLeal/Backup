package nestedClasses;

public class StaticNestedClass {

    static String classPostfix = "Class";

    abstract static class abstractInner extends Inherit {
        String currentClass = "Abstract Inner " + classPostfix;

        public abstract void sayHi();

        public abstractInner() {
            System.out.println("Hi from " + currentClass);
        }
    }

    static final class finalInner extends abstractInner {
        String currentClass = "Final Inner " + classPostfix;;

        @Override
        public void sayHi() {
            System.out.println("Hi from " + currentClass);
        }
    }

    public static void main(String[] args) {
        finalInner obj = new finalInner();
        obj.sayHi();
    }
}
