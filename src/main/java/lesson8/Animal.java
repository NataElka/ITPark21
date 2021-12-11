package lesson8;

public abstract class Animal {

    protected String moniker;
    protected int age;
    protected String breed;

    public Animal(String moniker, int age, String breed) {
        this.moniker = moniker;
        this.age = age;
        this.breed = breed;
    }
    public abstract void voice();
}
