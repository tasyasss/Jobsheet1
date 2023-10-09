import java.util.Arrays;  

// public class coba {
//     public static void main(String args[])
//     {
//         // declaring and initializing 2D array
//         string arr[][]
//             = { { "hai", "halo", "woi" }, { "hai", "halo", "woi" }, { "hai", "halo", "woi" }, };
 
//         // printing 2D array
//         for (string i = 0; i < 3; i++) {
//             for (string j = 0; j < 3; j++)
//                 System.out.print(arr[i][j] + " ");
 
//             System.out.println();
//         }
//     }
// }

public class coba {  
       public static void main(String[] args)   
        {   
           // Adding String values  
           String[] colors = {"Cricket","Basketball","Football","Badminton","Tennis"};  
           // Print Original values   
           System.out.println("Entered Sports: "+Arrays.toString(colors));  
            Arrays.sort(colors); // Sorting Elements  
           // Print Sorted Values  
            System.out.println("Sorted Sports: "+Arrays.toString(colors));  
        }  
    }