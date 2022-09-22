
public class pattern_question {
    public static void main (String[] args){
        /*
         print the pattern
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */
        
        int a = 4;
        int b = 5;

        for( int i=1; i<=4; i++){
            for( int j=1; j<=5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //ques:2- print the pattern
        /*
         * * * * *
         *       *
         *       *
         * * * * *
         */
        System.out.println("here is the second patern");
         int c = 4;
         int d = 5;
         for(int i=1; i<=c; i++){
            for(int j=1; j<=d; j++){
                if (i==1||j==1||i==c||j==d){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
         }
         
    }
}
