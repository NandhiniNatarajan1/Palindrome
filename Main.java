//Nandhini Natarajan
//B3

import java.util.Scanner;

public class Main 
{
	public static final String WHITE = "\u001B[0m"; 
  public static final String GREEN = "\u001B[32m";
 	public static final String RED = "\u001B[31m";

  public static void main(String[] args) 
	{
    String input;
    Scanner scan = new Scanner(System.in);
    input = scan.nextLine();
    input = validateInput (input);
   

    while(!input.equalsIgnoreCase("q"))
    {
       if (checkIfPalindrome(input)) {
          System.out.println(GREEN + input + " is a palindrome" + WHITE);
       }
       else {
         System.out.println(RED + input + " is not a palindrome" + WHITE);
       }
       input = scan.nextLine();
       input = validateInput (input);
    } 
    System.out.println("Thanks For Playing!");
    scan.close();	
	 
  }

  private static boolean checkIfPalindrome(String input) {

     if (input.length() == 0 || input.length() == 1)
     {
        return true;
     }
     if(input.charAt(0) == input.charAt(input.length()-1)) {
       return checkIfPalindrome(input.substring(1, input.length()-1));
     }
     return false;
  }

  private static boolean checkForSpecialandNumber(char c){
    if ( c >= (int) 'a' && c <= (int) 'z'){
        return false; 
    }
    else {
      return true;
    }
   }

   private static String validateInput(String input) {
    String lowerCaseInput = input.toLowerCase();
    String output = "";
     for (int i=0;i<=lowerCaseInput.length()-1;i++)
     {
       if (!checkForSpecialandNumber(lowerCaseInput.charAt(i))) {
          output = output.concat(Character.toString(lowerCaseInput.charAt(i)));
       }
     }
     return output;
   }

}