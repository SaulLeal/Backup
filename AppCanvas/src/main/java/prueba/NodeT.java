package prueba;

public class NodeT<T> {

    public T data;

    public NodeT(T data) { this.data = data; }

    public void setData(T data) {
        System.out.println("Node.setData");
        this.data = data;
    }
}