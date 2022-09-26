import java.util.Scanner;
public class marksheet {
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);
 
    // write a program to find out whether  a student is pass or fail if it required  total 40% and at least 33% 
    //in each subject and take marks as an input from user
     System.out.println("enter the marks of maths");
    byte maths = input.nextByte();
    System.out.println("enter the marks of english");

    byte english  = input.nextByte();
    System.out.println("enter the marks of hindi");
     byte hindi = input.nextByte();
   float avg = (maths + english + hindi)/3.0f;
   System.out.println("you have score  :"+ avg);
      if(avg >=44 && maths>=33 && hindi>=33 && english>=33){
          System.out.println("congraluation ,you have been promoted to next class");
 } else{
   System.out.println("sorry , you have not been promated to next class");
}
 
}
}

