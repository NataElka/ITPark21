package lesson2;

public class TheoremPythagor {

    public static void main(String[] args) {
        int totalHypotenuse = hypotenuse(5, 5);
        int totalCaht = cath1(4, 4) + cath2(3, 3);

        System.out.println(totalHypotenuse + "==" + totalCaht);
    }
    public static int hypotenuse(int num1, int num2)
    {return num1 * num2;}
    public static int cath1(int num1, int num2)
    {return num1 * num2;}
    public static int cath2(int num1, int num2)
    {return num1 * num2;}


}
