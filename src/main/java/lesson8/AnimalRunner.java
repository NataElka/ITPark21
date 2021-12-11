package lesson8;

public class AnimalRunner {

    public static void main(String[] args) {
        Animal Kesha = new Cats("Kesha", 4, "siberian");
        Animal Tuzik = new Dogs("Tuzik", 7, "dvorTerier");
        Animal Luna = new Rat("Luna", 1, "rex");

        Animal[] animals = new Animal[]{Kesha, Tuzik, Luna};
        for (Animal animal : animals) {
            animal.voice();
        }
    }
    }
