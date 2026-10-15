//Bignyapti Tripathi 116152152
public class Emirp {

	public static void main(String[] args) {
		int i = 0;
	       int j = 12;
	       while (i < 101){
	           if(non_palindrome(j) && prime(j)){
	               System.out.print(j + " ");
	               i += 1;
	           }
	           j += 1;
	       }
	    }
	    public static boolean non_palindrome(int n){
	            String number = Integer.toString(n);
	            boolean truth_value = true;
	            String o_number = "";
	            for(int j = number.length()-1; j>=0; j--){
	                o_number += number.charAt(j);

	            }
	            if(number.equals(o_number)){
	                truth_value = false;

	            }
	            return truth_value;
	    }
	    public static boolean prime(int n){
	        boolean truth_value = true;
	        String number = Integer.toString(n);
	        String o_number = "";
	        for (int j = number.length()-1;j>=0;j--) {
	            o_number += number.charAt(j);
	        }
	        int b_number = Integer.parseInt(o_number);
	        for (int i = 2;i<n;i++) {
	            if (n % i == 0) {
	                truth_value = false;
	                break;
	            }
	        }
	        for (int j = 2;j<b_number;j++){
	            if (b_number%j == 0){
	                truth_value = false;
	                break;
	            }
	        }
	        return truth_value;
	}

}
