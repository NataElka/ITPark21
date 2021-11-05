public class SecondProgram {

    public static void main(String[] args) {
        int total = summa(3, 5);
        System.out.println(total);

        int minus = subtract(9, 6);
        System.out.println(minus);

        int generation = multiply(3, 9);
        System.out.println(generation);
    }
    public static int summa(int arg1, int arg2) {
        return arg1 + arg2;
    }
    public static int subtract(int arg1, int arg2) {
        return arg1 - arg2;
    }
    public static int multiply(int arg1, int arg2) {
        return arg1 * arg2;
    }
}

