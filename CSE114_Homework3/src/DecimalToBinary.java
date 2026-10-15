//Bignyapti Tripathi 116152152
import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter decimal:");
        int decimal = input.nextInt();
        String answer = conversion(decimal);
        System.out.println("Binary:"+answer);
    }
    public static String conversion(int decimal){
        String binary = "";
        String answer = "(";
        while (decimal != 0){
            if (decimal%2 == 0){
                binary += "0";
                decimal /= 2;
            }
            else{
                binary += "1";
                decimal /= 2;
            }

        }
        for (int i = binary.length()-1;i>=0;i--){
            answer += binary.charAt(i);
        }
        answer += ")"+"_"+"2";
        return answer;
	}

}
