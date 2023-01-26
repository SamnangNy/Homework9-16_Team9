/*(Game:  scissor,  rock,  paper)  Write  a  program  that  plays  
the  popular  scissor-rock-paper  game.  
(A scissor  can  cut  a  paper,  a  rock  can  knock  a  scissor, 
 and  a  paper  can  wrap  a  rock.)  
 The  program randomly  generates  a  number  0,  1,  or 2  
 representing  scissor,  rock,  and  paper.  The  program  asks  
 the user to enter a number 0, 1, or 2 and displays a message indicating whether
  the user or the computer wins, loses, or draws. 
  The program will allow a user to play until they win. */

import java.util.*;

public class Exercise13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = { "Scissor", "Rock", "Paper" };

        // for user Input number
        System.out.println("Please input your number = ");
        int Enter = input.nextInt();

        // radom between 0 and 2
        int i = (int) (Math.random() * 3);

        if (Enter == i) {
            System.out.printf("compter is %s. You is %s. It is a Draw.", words[i], words[Enter]);
        }

        else if (Enter - i == 1) {
            System.out.printf("compter is %s. You is %s. You wins.", words[i], words[Enter]);
        }

        else if (Enter - i == -2) {
            System.out.printf("compter is %s. You is %s. You wins.", words[i], words[Enter]);
        }

        else if (Enter - i != 1) {
            System.out.printf("compter is %s. You is %s. You loses.", words[i], words[Enter]);
        }

        input.close();

    }
}
