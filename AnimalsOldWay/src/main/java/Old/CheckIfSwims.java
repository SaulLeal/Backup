package Old;

import Resource.Animal;

public class CheckIfSwims implements CheckTrait{
    public boolean test(Animal a) {
        return a.canSwim();
    }
}
