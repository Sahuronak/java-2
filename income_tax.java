import java.util.Scanner;
public class income_tax {
    // calculate income tax paid by an employee to the government as per the income slab
    //2.5 -5.0L    - 5%
    //5.0 - 10.0L  - 20%
    // above 10.0L -30%
    //there is no tax below 2.5L take input amount as a input from  the user
public static void main (String[] args){
Scanner input = new Scanner (System.in);
 float tax = 0;
 System.out.println("enter your income");
 float income = input.nextFloat();
 if (income<2.5){
    tax = tax +0;
    System.out.println("tax is not impose on you");

 }else if(income>2.5f && income<5f){
    tax = tax + 0.05f * (income - 2.5f);
 }else if(income>5f && income<10.0f) {
    tax = tax + 0.05f * (5.0f -2.5f);
   tax = tax + 0.05f * (income - 5.0f);
 }else if (income>10.0f){
    tax = tax + 0.05f * (5.0f -2.5f);
    tax = tax + 0.05f * (10.0f -5.0f);
    tax = tax + 0.05f * (income - 10.0f);

 }
 System.out.println("the total tax Paid to the system is :"+ tax);

}
}
