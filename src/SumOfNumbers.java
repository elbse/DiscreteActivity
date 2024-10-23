import java.util.*;
public class SumOfNumbers {

    public int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum (n -1);
    }

    public static void main( String[] args){
        Scanner input = new Scanner(System.in);

        SumOfNumbers sumCalc = new SumOfNumbers();
        System.out.println("Problem #3: Sum of Numbers");
        System.out.print("Enter N value: ");
        int n = input.nextInt();

        int result = sumCalc.sum(n);
        System.out.print("The sum of numbers from 1 to " + n + " is " + result);


    }
}
