package Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException, NumberFormatException {
       try {
           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           String num = reader.readLine();
           int x = Integer.parseInt(num);

           double sqrt = Math.sqrt(x);
           int currentValue = x;
           int multiplier = 2;
           while (currentValue > 1 && multiplier <= sqrt)
           {
               if (currentValue % multiplier == 0)
               {
                   System.out.print(multiplier + " ");
                   currentValue /= multiplier;
               }
               else if (multiplier == 2)
               {
                   multiplier++;
               }
               else
               {
                   multiplier += 2;
               }
           }
           if (currentValue != 1)
           {
               System.out.print(currentValue);
           }
       } catch(NumberFormatException e) {
           System.out.println("Ошибка! Введите целое число.");
       }
    }
}
