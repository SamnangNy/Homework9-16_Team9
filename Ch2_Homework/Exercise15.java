
import java.util.*;

public class Exercise15 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String[] pearl = { "W", "B", "W", "B", "W", "B" };

      int count = 0;
      int i;
      System.out.println("Pick the bowl:");
      String pick = input.nextLine();

      String[] bowl_1 = new String[10];
      String[] bowl_2 = new String[10];

      System.out.print("Enter the number of pearls: ");
      int temp = input.nextInt();
      int rand_1 = (int) (1 + Math.random() * temp - 1);

      System.out.print("Enter the number of pearls: ");
      int temp_1 = input.nextInt();
      int rand_2 = (int) (Math.random() * temp_1 - 1);
      int j = 0;
      System.out.println();

      while (j < 100) {
         System.out.print("Round" + j);
         System.out.println();
         if (pick.equals("bowl1")) {

            for (i = 0; i < temp; i++) {
               int rand = (int) (Math.random() * 6);

               bowl_1[i] = pearl[rand];
               System.out.println("Bowl one:" + bowl_1[i]);
            }

            System.out.println();

            String select = bowl_1[rand_1];
            if (select.equals("B")) {
               System.out.println("Your pearl is: " + select + " " + "You are dead");
            } else if (select.equals("W")) {
               System.out.println("Your pearl is: " + select + " " + "You are alive");
               count++;
            }
         }

         System.out.println();

         if (pick.equals("bowl2")) {
            for (i = 0; i < temp_1; i++) {
               int rand = (int) (Math.random() * 6);
               bowl_2[i] = pearl[rand];
               System.out.println("Bowl two:" + bowl_2[i]);
            }
            System.out.println();
            String select = bowl_2[rand_2];
            if (select.equals("B")) {
               System.out.println("Your pearl is: " + select + " " + "You are dead");
            } else if (select.equals("W")) {
               System.out.println("Your pearl is: " + select + " " + "You are alive");
               count++;
            }
         }
         j++;

      }

      float average = (float) count / j;
      System.out.println("The average of picking this bowl is:" + " " + average * 100 + "%");
      input.close();
   }

}