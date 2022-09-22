public class natural_num {
    //write a program to print natural number from 100 to 200
    public static void main(String[] args){
        // while loop
        System.out.println("here is the list of natural number from 100 to 200");
        int i = 100;
        while(i<=200){
            System.out.println(i);
            i++;
        }
        //do-while loop
        System.out.println("here is the list of natural number from 1 to 100");
        int s = 1;
        do{
            System.out.println(s);
            s++;
        }while(s<=100);
    
        //for loop
        System.out.println("here is the list of odd numberby using ");
       
        for(int n =1; n<=50; n++ ){
            System.out.println((2*n+1));

        }

    }
}
