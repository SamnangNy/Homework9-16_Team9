/* (Hex  to  decimal)  Ask theuser  to  enter  a  hexadecimal number  
(which  can  be  an  integer  number  or floating-point number)
and displays its corresponding decimal value.*/

package Ch2_Homework;
import java.util.Scanner;
public class Exercise10 {
    public static void main(String[]args){
        System.out.println("Enter Hexadecimal number for a Decimal converison");
        Scanner input = new Scanner(System.in);
        String digits = " 0123456789ABCDEF " ; 
        int decimal = 0;
        String hexa = " ";
        hexa = input.nextLine();
        hexa = hexa.toUpperCase(); //for the input all in uppercase
        char count;
        int counting;
        for(int i = 0; i<hexa.length(); i++){
            count = hexa.charAt(i); //count contain hexa data of each character
            counting = digits.indexOf(count);
            decimal = decimal*16 + counting;
        }
        System.out.println("The conversion of Hexadecimal to Decimal has a value of: " + decimal);
        input.close();
    }
}