import java.util.*;

public class Achievement {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        int m[] = new int[5];
        
        System.out.println("Enter marks of 5 subjects:");
 for (int x = 0; x < m.length; x++) 
{
      m[x] = ob.nextInt();
        }
        
// Bubble Sort
for (int x = 0; x < m.length - 1; x++)
 {

   for (int y = 0; y < m.length - 1 - x; y++) 
{
                
    if (m[y] < m[y + 1]) 
{ 
         int a = m[y];
         m[y] = m[y + 1];
         m[y + 1] = a;
                }
            }
        }
        
        System.out.println("Marks in descending order are:");

 for (int z = 0; z < m.length; z++) 
{
            System.out.println(m[z]);
        }
                              // Percentage Calculation
 double p = 0.0;
 for (int x = 0; x < m.length; x++) 
{
       p += m[x];
        }
       
 p = p / 5.0;
        System.out.println("Percentage = " + p);
        
 // Grading Criteria
 if (p >= 90.0) 
{
            System.out.println("Distinction");
        } 
else if (p >= 80.0 && p<90.0) {
            System.out.println("First Class");
        } 
else {
            System.out.println("Needs Improvement");
        }
    }
}
