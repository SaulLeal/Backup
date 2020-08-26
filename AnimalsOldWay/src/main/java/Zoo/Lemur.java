package Zoo;

public class Lemur extends Primate implements HasTail {

    @Override
    public boolean isTailStriped() {
        return false;
    }

    public int age = 10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());

        Primate primate = lemur;
        System.out.println(primate.hasHair());

//        Will throw an ClassCastException if babyPrimate is not actually an instance of Lemur
        Primate babyPrimate = new Primate();
        if (babyPrimate instanceof Lemur) {
            Lemur babyLemur = (Lemur) babyPrimate;
            System.out.println("Correct cast: " + babyLemur.age);
        }

        Lemur youngLemur = (Lemur) primate;
        System.out.println(--youngLemur.age);
    }
}
