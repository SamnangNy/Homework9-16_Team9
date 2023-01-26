/*(Decimal to hex) Ask the user to enter a number 
(which can be an integer number or floating-point number)
and  displays  its  corresponding  hexadecimal  value
*/
package Ch2_Homework;
import java.util.Scanner;
public class Exercise9 {
    public static void main(String[]args){
    String hexa = " ";
    int remainder;
    int decimal = 0;
char hexadec[] = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','f'};
System.out.println(" Enter Decimal value to do a hexadecimal conversion:");
Scanner input = new Scanner(System.in);
decimal = input.nextInt(); // User input number
while(decimal > 0){          // function 
remainder = decimal % 16;    // for find remainder 
hexa = hexadec[remainder]+hexa; // find hexadecimal
decimal = decimal / 16;
}
System.out.println(" Decimal to Hexadecimal is: " +hexa ); // Output


input.close(); // Closs loop
    }
}

    

