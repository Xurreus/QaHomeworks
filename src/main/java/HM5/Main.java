package HM5;

public class Main {
        public static void main(String[] args) {
            Parrot parrot = new Parrot("Kerra", 3, true, true, 1.05);
            AdditionalPetActions actions = new AdditionalPetActions();

            System.out.println(parrot.getName());
            System.out.println(parrot.getAge());
            System.out.println(parrot.getWeight());
            System.out.println(parrot.getName() + " is Female");
            System.out.println(parrot.getSmart());

            parrot.fly();
            parrot.makeSound();
            parrot.eat();

            actions.play();
            actions.groom();
            actions.train();

        }
    }

