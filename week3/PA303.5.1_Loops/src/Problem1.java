public class Problem1 {

    public static void main(String[] args) {

        //1.Print a Multiplication Table
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}
