package Resource;

public class Animal {
    private String species;
    private boolean canHoop;
    private boolean canSwim;
    private int age;

    public Animal(int age) {
        super();
        this.age = age;
    }
    public Animal(String speciesName, boolean hopper, boolean swimmer) {
        species = speciesName;
        canHoop = hopper;
        canSwim = swimmer;
    }

    public String toString() {
        return species;
    }
    public boolean canHop() {
        return canHoop;
    }
    public boolean canSwim() {
        return canSwim;
    }
    public int getAge() {
        return age;
    }
}