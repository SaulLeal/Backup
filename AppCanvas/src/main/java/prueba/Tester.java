package prueba;

public class Tester {
    public static void main(String[] args) {
        MyNode mn = new MyNode(5);
        NodeT n = (MyNode)mn;         // A raw type - compiler throws an unchecked warning
        n.setData("Hello");
        System.out.println(mn.data);
    }
}
