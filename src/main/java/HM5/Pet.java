package HM5;

public class Pet {

    private int age;
    private String name;
    private double weight;
    private boolean isFemale;

    public Pet(String name, int age, double weight, boolean isFemale) {
        setName(name);
        setWeight(weight);
        this.isFemale = isFemale;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("ERROR: Invalid input for name - empty string!");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("ERROR: Invalid input for weight - " + weight);
        }
    }

    public boolean isFemale(boolean female) {
        return isFemale;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (age >= 0){
            this.age = age;
        }else {
            System.out.println("ERROR: Invalid input for age - " + age);
        }
    }

    public void eat() {
        System.out.println(name + " is eating");
    }
}

