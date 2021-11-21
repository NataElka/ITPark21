package lesson4;

public class RootSquare {
    public static void main(String[] args) {
        System.out.println(sqrt(9));
    }

    public static int sqrt(int n) {
        int x = 0;
        int y = n;
        int z = (x + y) / 2;
        int m = n;
        for (; ;){
            z = (x + y) / 2;
            if (z==m || z*z==n)
                break;
            if (z*z<n) {
                x = z;
            } else {
                y=z;
            }
            m=z;
        }
        return z;

    }
}
