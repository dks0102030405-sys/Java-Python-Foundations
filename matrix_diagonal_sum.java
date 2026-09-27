import java.util.*;

public class Matrix {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        int m[][] = new int[3][3];

        System.out.println("Enter 9 integers :");

        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                m[r][c] = ob.nextInt();
            }
        }

        // Diagonal sum calculation
        int s = 0;
        for (int r = 0; r < m.length; r++) {
            s += m[r][r];
        }

        System.out.println("Sum of elements of main diagonal = " + s);
    }
}