public class DemoJava {
    static {
        add(2);
    }
    static void add(int num) {
        System.out.println(num + " ");
    }
    DemoJava() {
        add(5);
    }
    static {
        add(4);
    }
    {
        add(6);
    }
    static {
        new DemoJava();
    }
    {
        add(8);
    }
    public static void main(String[] args) {
        
    }
}