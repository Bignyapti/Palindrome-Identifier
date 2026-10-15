//Bignyapti Tripathi 116152152
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	       System.out.println("Enter the input string:");
	       String name = input.nextLine();
	       String name1 = name.replace(" ","");
	       boolean truth_value = palindrome(name1);
	       if (truth_value){
	           System.out.println("Input string " + name + " is a palindrome");
	       }else{
	           System.out.println("Input string " + name + " is not a palindrome ");
	       }

	    }
	    public static boolean palindrome(String name1){
	        boolean truth_value = true;
	        for (int i = 0, j = name1.length()-1; i<name1.length()/2 && j >= (name1.length()/2) ;i++,j--) {
	            char c = ' ';
	            String name = name1.toUpperCase();
	                if (name.charAt(i) != name.charAt(j)){
	                  truth_value = false;
	                }

	            }
	        return truth_value;
	}

}
