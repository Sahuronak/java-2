import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
    //print the factorial of the given number
    Scanner input = new Scanner(System.in);
    System.out.println("enter the number");
    int n = input.nextInt();
    long factorial = 1;
    int i = 1;
    for(i=1; i<=n; i++){
    factorial*=i;
    }
    System.out.printf("factorial of %d = %d",n ,factorial);
    }
}
