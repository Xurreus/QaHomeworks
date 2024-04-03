package HM5;

public class Parrot extends Pet {

    private boolean isSmart;

    public Parrot(String name, int age, boolean isSmart, boolean isFemale, double weight) {
        super(name, age, weight, isFemale);
        this.isSmart = isSmart;
    }

    public boolean getSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    public void makeSound() {
        System.out.println(super.getName() + " Speaks!");
    }

    public void fly() {
        System.out.println(super.getName() + " is flying.");
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + " is eating seeds");
    }
}
