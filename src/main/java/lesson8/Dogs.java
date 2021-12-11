package lesson8;

public class Dogs extends Animal{

    public Dogs(String moniker, int age, String breed){

        super(moniker, age, breed);
    }

    @Override
    public void voice() {
        System.out.println(this.moniker + " гавкает");
    }
}
