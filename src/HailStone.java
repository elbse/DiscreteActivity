import java.util.*;
public class HailStone {

    public void sequence(int n, int loop){

        for(int i = 0; i < loop; i++){
            if(n % 2 == 0){
                n = n / 2;
            }else{
                n = (3*n) + 1;
            }
            System.out.print(n + ", ");

        }

    }

    public static void main(String[] args){
        System.out.println("Problem #5: Hailing Stone");
        Scanner input = new Scanner(System.in);
        HailStone hailStone = new HailStone();
        System.out.print("How many iterations: ");
        int iter = input.nextInt();
        System.out.print("Value of N: ");
        int n = input.nextInt();
        hailStone.sequence(n, iter);

    }
}
