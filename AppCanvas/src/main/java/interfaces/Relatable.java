package interfaces;

public interface Relatable {
    public int isLargerThan(Relatable other);

    default Relatable findLargest(Relatable object1, Relatable object2) {
        if ((object1).isLargerThan(object2) > 0)
            return object1;
        else
            return object2;
    }

    default Relatable findSmallest(Relatable object1, Relatable object2) {
        if ((object1).isLargerThan(object2) < 0)
            return object1;
        else
            return object2;
    }

    default boolean isEqual(Relatable object1, Relatable object2) {
        if ( (object1).isLargerThan(object2) == 0)
            return true;
        else
            return false;
    }
}
