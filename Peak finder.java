import java.util.*;

public class Peak {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = ob.nextInt();
        
        int[] a = new int[n];
        
        
        for (int x = 0; x < n; x++) {
            System.out.print("Enter number " + (x + 1) + ": ");
            a[x] = ob.nextInt();
        }
        
 //Array with only one element
        if (n == 1) {
            System.out.println("Peak found at index 0 with value = " + a[0]);
        }                     // Check Left Boundary
        if (a[0] > a[1]) {
            System.out.println("Peak found at index 0 with value = " + a[0]);
        }
        
 // Check Middle Elements
for (int x = 1; x < n - 1; x++) {
    if (a[x] > a[x - 1] && a[x] > a[x + 1]) {
                System.out.println("Peak found at index " + x + " with value = " + a[x]);
            }
        }
     

 // Check Right Boundary 
        if (a[n - 1] > a[n - 2]) {
            System.out.println("Peak found at index " + (n - 1) + " with value = " + a[n - 1]);
        }
    }
}
