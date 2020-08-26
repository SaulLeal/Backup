package Zoo;

public class Peacock extends Bird {
    @Override
    public String getName() {
        return "Peacock";
    }

    public static void main(String[] args) {
        Bird bird = new Peacock();
//        Peacock bird = new Peacock();
        bird.displayInformation();
    }
}
