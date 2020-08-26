package Resource;

public class Lion extends Animal {

    public Lion(int age) {
        super(age);
    }

    public Lion() {
        this(4);
    }

    private void roar() {
        System.out.println("The " +getAge()+ " years old lion says: Roar!");
    }
}
