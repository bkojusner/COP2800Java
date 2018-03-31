/**
 *
 * @author Blas K
 */
package javaapplication2;
import java.util.*;//scanner
public class JavaApplication2 {
    
    public static int num1 = 1;
    public static void main(String[] args) {
        Scanner userInt = new Scanner(System.in);
        int sum = 0;
        int result;
                
        while (num1 > 0){
            System.out.println("Please insert integer value, or 0 to exit");
            num1 = userInt.nextInt();
                if (0 < num1 && num1 < 6){
                    result = num1 * 2;
                    sum = sum + result;
                    System.out.println("You selected a number from category 1");
                    }
                else if (5 < num1 && num1 < 11){
                    result = (num1 * 2) + 1;
                    sum = sum + result;
                    System.out.println("You selected a number from category 2");
                    }
                else if (num1 == 0){
                    num1 = -1;
                    System.out.println("Thanks for using the program, the sum is " + sum);
                }
                else{
                    System.out.println("You inserted an unexpected value, please try again");
                    num1 = 1;
                }
            }
        }
    }