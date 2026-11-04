import java.util.*;

public class Chemistry {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        
        System.out.print("Enter total net charge: ");
        int c = ob.nextInt();
        
        System.out.print("Enter no. of oxygen atoms: ");
        int o = ob.nextInt();
        
        System.out.print("Enter no. of hydrogen atoms: ");
        int h = ob.nextInt();
        
        System.out.print("Enter no. of central atoms: ");
        int ca = ob.nextInt();
        
        // Using double casting to handle fractional/decimal average oxidation states accurately
        double on = (double)(c - (h * 1) - (o * -2)) / ca;
        
        System.out.println("Calculated oxidation State of central Atom = " + on);
        
        ob.close();
    }
}
