//Bignyapti Tripathi 116152152
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		System.out.println("Enter the first string:");
        Scanner input = new Scanner(System.in);
        String f_string = input.nextLine();
        String one = f_string.replace(" ","");
        one = one.toUpperCase();
        System.out.println("Enter the second string:");
        String s_string = input.nextLine();
        String two = s_string.replace(" ","");
        two = two.toUpperCase();
        if (anagram(one,two)){
            System.out.println (f_string + " and " + s_string + " are anagram");
        }
        else{
            System.out.println (f_string + " and " + s_string + " are NOT anagram");
        }

    }
    public static boolean anagram(String one, String two){
        boolean truth_value=false;
        for (int i = 0; i<one.length();i++){
            for (int j = 0; j<two.length();j++){
                if (one.charAt(i) == two.charAt(j)){
                    truth_value = true;
                }

                }
            if (truth_value == false){
                break;
            }
            }
            truth_value = false;
            for (int i = 0; i<two.length();i++){
               for (int j = 0; j<one.length();j++){
                if (two.charAt(i) == one.charAt(j)){
                    truth_value = true;
                }

            }
               if (truth_value == false){
                break;
            }
        }
        return truth_value;
	}

}
