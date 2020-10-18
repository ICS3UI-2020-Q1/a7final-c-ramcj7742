import java.util.Scanner;
/**
 * will calculate the sum of an integer parameter called number. If this sum is divisible by 7, we will call this number valid and return true back to the user.
 * @author Jaden Ramcharan
 */
public class Main {

  public static int checkCode(int userNum){
    //variables for determining amount of digits and total
    int digits = 0;
    int total = 0;
    //gets total number of all digits added together
    for(int i = userNum; i > 0; i /= 10){
      digits = i % 10;
      total = total + digits;
    }
    //checks if total is divisable by 7 and either returns true or false
    if(total % 7 == 0){
      System.out.println("true");
      return total;
    }else
    System.out.println("false"); 
    return 0;
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates scanner for user input
    Scanner input = new Scanner(System.in);

    //gets number from user
    int userNum = input.nextInt();

    //starts checkCode method
    checkCode(userNum);
    
  }
}
