/*(Hex  to  binary)  Ask  the  user  to  enter  a  hexadecimal  
number  (which  can  be  an  integer  number  or floating-point number) 
and displays its corresponding binary value. */


import java.util.Scanner;
public class Exercise11 {
    public static void main(String[]args){
        System.out.println("Enter Hexadecimal number for a Binary converison");
        Scanner input = new Scanner(System.in);
        String digits = "0123456789ABCDEF"; 
        int decimal = 0;
        String hexa = "";
        int module, j = 1;
        int binary = 0;
        hexa = input.nextLine();
        hexa = hexa.toUpperCase(); //for the input all in uppercase
        char count;
        int counting;
        for(int i = 0; i<hexa.length(); i++){
            count = hexa.charAt(i); //count contain hexa data of each character
            counting = digits.indexOf(count);
            decimal = decimal*16 + counting;
        }
        System.out.println(decimal);
        while(decimal != 0){
            module = decimal % 2; //find the module of decimal which the answer is only 0 and 1
            decimal /= 2; //find the answer to continue the loop until it 0
            binary += module * j; // find the binary by taking the module multiply by i
            j= j* 10;
        }
    System.out.println("The conversion is finished! The binary is: "+binary);
    input.close();

}
}

