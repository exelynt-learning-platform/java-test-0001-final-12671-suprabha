package exam;

public class NumberPyramid {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }

            // Print ascending numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print descending numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Move to next line
            System.out.println();
        }
    }
}