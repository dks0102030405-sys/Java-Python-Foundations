import java.util.*;

public class PeriodicTable {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        
        // Element names array (1 to 20)
        String n[] = {
            "Hydrogen", "Helium", "Lithium", "Beryllium", "Boron", "Carbon", "Nitrogen", 
            "Oxygen", "Fluorine", "Neon", "Sodium", "Magnesium", "Aluminium", "Silicon", 
            "Phosphorus", "Sulfur", "Chlorine", "Argon", "Potassium", "Calcium"
        };
        
        // Chemical symbols array (1 to 20)
        String s[] = {
            "H", "He", "Li", "Be", "B", "C", "N", 
            "O", "F", "Ne", "Na", "Mg", "Al", "Si", 
            "P", "S", "Cl", "Ar", "K", "Ca"
        };
        
        // Periodic Group numbers array (1 to 20)
        int g[] = {
            1, 18, 1, 2, 13, 14, 15, 16, 17, 18, 
            1, 2, 13, 14, 15, 16, 17, 18, 1, 2
        };
        
        // Periodic Period numbers array (1 to 20)
        int p[] = {
            1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 
            3, 3, 3, 3, 3, 3, 3, 3, 4, 4
        };
        
        // Pauling Electronegativity values array (1 to 20)
        double e[] = {
            2.20, 0.0, 0.98, 1.57, 2.04, 2.55, 3.04, 3.44, 3.98, 0.0, 
            0.93, 1.31, 1.61, 1.90, 2.19, 2.58, 3.16, 0.0, 0.82, 1.00
        };
        
        System.out.print("Enter atomic number: ");
        int a = ob.nextInt();
        
        // Your clean bound constraint checking logic from page 2
        if (a > 0 && a <= 20) {
            System.out.println("Name: " + n[a - 1]);
            System.out.println("Symbol: " + s[a - 1]);
            System.out.println("Position: ");
            System.out.println("Group: " + g[a - 1]);
            System.out.println("Period: " + p[a - 1]);
            System.out.println("Pauling electronegativity: " + e[a - 1]);
        } else {
            System.out.println("Element out of current matrix scope");
        }
    }
}
