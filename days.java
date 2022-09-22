import java.util.Scanner;
public class days {
    //write the code in java program to run the week days in java 
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of the week day");
        System.out.println("1- monday , 2- tuesday, 3- wednesday, 4- thursday , 5 friday , 6- saturday");
        int day = input.nextInt();
        
            switch (day) {
                case 1->System.out.println("monday");
                case 2->System.out.println("tuesday");
                case 3->System.out.println("wednesday");
                case 4->System.out.println("thursday");
                case 5->System.out.println("friday");
                case 6->System.out.println("saturday");
                
                
                

            }
        

    }
}
