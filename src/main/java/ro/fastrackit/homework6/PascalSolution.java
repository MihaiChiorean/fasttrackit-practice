package ro.fastrackit.homework6;

public class PascalSolution {
    private static Integer numberOfRows;

    PascalSolution (Integer numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    public static void displayTheTriangle() {
        int rows = numberOfRows;
        int n;

        for(int i = 0; i<numberOfRows; i++) {
            for(int j = 1; j <= rows; j++) {
                System.out.print(" ");
            }

            n = 1;

            for(int l = 0; l<= i; l++){
                System.out.print(n + " ");
                n = n + (i-l)/(l+1);
            }
            rows--;
            System.out.println();
        }
    }
}
