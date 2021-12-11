package lesson8;

import lesson8.Animal;

public class Rat extends Animal {

    public Rat(String moniker, int age, String breed){

        super(moniker, age, breed);
    }

    @Override
    public void voice() {
        System.out.println(this.moniker + " пищит");
    }
}
