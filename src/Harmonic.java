import java.util.*;

public class Harmonic {

    public void sequence(int iteration){
        double sum = 0;
        for(int i = 1; i < iteration + 1; i++){

            System.out.println("1 / " + i + " = " + (double) 1 / i);
            sum += (double) 1 / i;


        }
        System.out.println("The sum is: " + sum);

    }
    public static void main(String[] args){
        System.out.println("Problem #2: Harmonic Series");
        Scanner input = new Scanner(System.in);
        Harmonic harmonic = new Harmonic();

        System.out.print("How many terms: ");
        int term = input.nextInt();
        harmonic.sequence(term);


    }

    // An = a + (n - 1) d
    //
}
