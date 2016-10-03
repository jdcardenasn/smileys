
package smileys;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Juan
 */
public class Smileys {
    public static void printStars(int times) {
            for (int i = 0; i < times; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    public static void main(String[] args) {
      ArrayList<String> greetings = new ArrayList<>();
        greetings.add("Hei");
        greetings.add("Hallo");
        greetings.add("Hi");

        for (String greet: greetings) {
            System.out.println(greet);
        }
        int[] values = new int[] {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < values.length; i++) {
            values[i] = values[i] * 2;
        }

        for (int value: values) {
            System.out.println(value);
        }
        String characterString = "saippuakauppias";
        for (int i = 0; i < characterString.length(); i++) {
            if (characterString.charAt(i) == 'a') {
                System.out.println("Hip!");
            }
        }
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter characterString: ");
        String characterString1 = reader.nextLine();

        printStars(characterString1.length());
        System.out.println(characterString1);
        printStars(characterString1.length());
    }    
}
