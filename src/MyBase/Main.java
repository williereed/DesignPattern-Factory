package MyBase;

public class Main {

    public static void main(String[] args) {

        Dog dog = null;

        // demonstrate registering a dog outside the getDog method
        DogFactory.Register(new Mutt());
        DogFactory.Register(new SiberianHusky());

        for (int i = 0; i < 3; i++) {
            dog = DogFactory.getDog("Poodle");
            if (dog.getWeight() == 0) {
                dog.setWeight(5);
            }
            dog.speak();

            dog = DogFactory.getDog("Rottweiler");
            if (dog.getWeight() == 0) {
                dog.setWeight(75);
            }
            dog.speak();

            dog = DogFactory.getDog("SiberianHusky");
            if (dog.getWeight() == 0) {
                dog.setWeight(125);
            }
            dog.speak();

            dog = DogFactory.getDog("Mutt");
            if (dog.getWeight() == 0) {
                dog.setWeight(15);
            }
            dog.speak();
        }
    }
}
