import java.sql.SQLOutput;
import java.util.*;
public class FibonacciSequence {

    public int nthTerm(int n){
        if (n <= 1){
            return n;
        }

        return nthTerm( n - 2) + nthTerm(n-1);
    }



    public static void main(String[] args){
        System.out.println("Problem #1: Fibonacci Sequence");
        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        Scanner input = new Scanner(System.in);

        System.out.print("How many terms: ");
        int terms = input.nextInt();

        for(int i = 0; i < terms; i++){
            System.out.print(fibonacciSequence.nthTerm(i) + ", ");

        }
    }
}
