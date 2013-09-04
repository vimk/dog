//opgave 1 fra classes and object

package dog;

import java.util.Scanner;

/**
 *
 * @author Kim Vammen
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {              
        Scanner scan = new Scanner(System.in);
        String newName; 
        String newAge;
                
        System.out.print("Indtast hundens navn: ");
        Dog d1 = new Dog(scan.nextLine());
        
        System.out.print("Indtast hundens alder: ");
        d1.setAge( Integer.parseInt(scan.nextLine()));
        
        System.out.println(d1);
                             
        
        System.out.print("Hunden har skiftet ejer og dermed navn. Det nye navn er: ");
        newName = scan.nextLine();
        d1.setName(newName);
        System.out.println(d1);
        
        
        System.out.print("Indtast antallet af år siden hunden besøgte os: ");
        newAge = scan.nextLine() + d1.age;
           
        int newAge2 = Integer.parseInt(newAge);   //konvertere til int                             
        int newAge3 = Integer.valueOf(d1.age);    // konvertere til int          
                
        System.out.println(newName + " er " + (newAge2 + newAge3) + " år gammel."); //virker ikke ... ligger 2 strings sammen :S  
                      
        }
}
