package lesson8;

public class Cats extends Animal{

    public Cats(String moniker, int age, String breed){

        super(moniker, age, breed);
    }

    @Override
    public void voice() {
        System.out.println(this.moniker + " мяукает");
    }
}
