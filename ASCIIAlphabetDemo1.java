/**
 * ASCII Alphabet Project
 * @author John Doe Per 2
 */

import java.util.Scanner; 
  
class Alphabet 
{ 
 
    // draws the letter A
    // makes use of the \\ escape sequence that results in a single \ symbol
    public static void drawA() 
    { 
        System.out.println("    /     ");
        System.out.println("   / \\    ");
        System.out.println("  /---\\   ");
        System.out.println(" /     \\  ");
        System.out.println("/       \\ ");
    } 
    
    // draws the letter B
    // makes use of the \" escape sequence that results in a single " symbol
    public static void drawB() 
    { 
        System.out.println("\"\"\"\"\"\"\"\"\"");
        System.out.println("\"       \"");
        System.out.println("\"\"\"\"\"\"\"\"\"");
        System.out.println("\"       \"");
        System.out.println("\"\"\"\"\"\"\"\"\"");
    }   
    
    // draws the letter C
    public static void drawC() 
    { 
        System.out.println("stub"); 
    }  
    
}// end of Alphabet class 
  
/////////////////////////////////////////////// 
  
public class ASCIIAlphabetDemo1 
{ 
     
    public static void main(String[] args) 
    { 
        Alphabet.drawA();
        printBlankLines();
        Alphabet.drawB();
        printBlankLines();
        
        Scanner keyboard = new Scanner(System.in);    // obtains user input
        System.out.print("Enter a word or phrase: ");
        String userInput = keyboard.nextLine();       // whole line of user input
        
        for (int i = 0; i < userInput.length(); i++)  // parsing user's inputted string
        {
            String nextLetter = userInput.substring(i, i + 1); // one character at a time
            
            if (nextLetter.equals("a") || nextLetter.equals("A"))
            {
                Alphabet.drawA();
            }
            else if (nextLetter.equals("b"))
            {
                Alphabet.drawB();
            }
            else
            {
                System.out.println("unknown letter");
            }
            
        }// end of for loop
        
    }// end of main method
    
    // displays blank lines
    public static void printBlankLines()
    {
        System.out.print("\n\n\n");
    }
     
}// end of class

