//Bignyapti Tripathi 116152152
import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter binary:");
        String binary = input.nextLine();
        int value = bin2Dec(binary);
        System.out.println("Decimal:" + value);
    }
    public static int bin2Dec(String binaryString){
        int amount = 0;
        int value = Integer.parseInt(binaryString);
        for (int i = 0;i<binaryString.length();i++){
            amount += Math.pow(2,i) * (value%10);
            value = value/10;
        }

        return amount;
    }
}
