import java.util.*;
public class GreatestCommonDivisor {

   public int gcd (int n1, int n2){

      if (n2 == 0){
         return n1;
      }
   return gcd(n2, n1 % n2);
}

public void values(int n1, int n2){
   int result = gcd(n1, n2);

   System.out.println("The Greatest Common Divisor of " + n1 + " and " + n2 + " is: " + result);
   }

   public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      GreatestCommonDivisor gcdCalc = new GreatestCommonDivisor();
      System.out.println("Problem #4: Greatest Common Divisor");

      System.out.print("Enter the first number : ");
      int number1 = input.nextInt();
      System.out.print("Enter the second number : ");
      int number2 = input.nextInt();

      gcdCalc.values(number1, number2);



   }
}
