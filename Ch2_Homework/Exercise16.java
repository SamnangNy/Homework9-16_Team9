/*(Simulation firing a gun) For this game, six players will play together. 
Fivebullets are put into a gun's round barrel which can hold up tosix bullets.  */

import java.util.Random;
import java.lang.String;

public class Exercise16 {
   public static void main(String[] args) {

      // For bullets
      Boolean[] bullets = new Boolean[6];

      Random rand = new Random();
      int i, j;

      // The amount of players death
      int count = 0, count_1 = 0, count_2 = 0, count_3 = 0, count_4 = 0, count_5 = 0, count_6 = 0;

      Boolean array[] = new Boolean[bullets.length];

      // For 6 players
      String[] player = { "P1", "P2", "P3", "P4", "P5", "P6" };

      // 1000 rounds
      for (i = 0; i < 1000; i++) {
         System.out.print(i + 1 + " " + "Round");
         System.out.println();
         for (j = 0; j < bullets.length; j++) {

            // For random the bullets

            Boolean a1 = rand.nextBoolean();

            // random true || false for random 5 bullets and 1 not
            bullets[j] = true;
            bullets[j] = a1;

            // Converting String's player to boolean to compare with the bullets

            array[j] = Boolean.parseBoolean(player[j]);
            array[j] = bullets[j];

            // If true , the player is dead

            if (array[j] == true) {
               System.out.print(player[j] + " " + "is dead");
               System.out.println();
               count++;
               // Counting the amount of death of each player
               if (array[0] == true) {
                  count_1++;
               } else if (array[1] == true) {
                  count_2++;
               } else if (array[2] == true) {
                  count_3++;
               } else if (array[3] == true) {
                  count_4++;
               } else if (array[4] == true) {
                  count_5++;
               } else if (array[5] == true) {
                  count_6++;
               }

            }

         }
         System.out.println();
      }
      System.out.println();

      // print the amount of death

      System.out.println("The P1 is dead for" + " " + count_1 + " " + "times");
      System.out.println("The P2 is dead for" + " " + count_2 + " " + "times");
      System.out.println("The P3 is dead for" + " " + count_3 + " " + "times");
      System.out.println("The P4 is dead for" + " " + count_4 + " " + "times");
      System.out.println("The P5 is dead for" + " " + count_5 + " " + "times");
      System.out.println("The P6 is dead for" + " " + count_6 + " " + "times");

      System.out.println("/---------------------------/");
      System.out.println();
      // Print the whole amount of death
      System.out.println("The amount of dead player is:" + count);

   }
}
