import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
public class Q2 {
    public static void main(String[] args) {
        
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Numbers");
    
    LinkedList<Integer> list= new LinkedList<Integer>();
    
    for(int i=0; i<5;i++){
        int number= sc.nextInt();
        list.add(number);
    }

    
    Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer value = it.next();
            
            if (value > 25) {
                it.remove(); // Removes the current element safely
            }
        }

        // Print the final filtered list
        System.out.println("Filtered List (Values <= 25):");
        System.out.println(list);
    }
    
}
