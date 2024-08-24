import java.util.Random;
import java.util.Scanner;
class Random_number1{
      int rand1,a;
       void generate(){
        Random rand=new Random();
       
        rand1=rand.nextInt(100)+1;
        
        //System.out.println("Random number: "+rand1);
        
        }
       Scanner sc=new Scanner(System.in);
    void input(){
        
        System.out.println("Guess any random number(between 1 to 100): ");
        a=sc.nextInt();
        if(a<0){
            System.out.println("Sorry!! you cannot enter numbers less than 0 and higher than 100");
            a=sc.nextInt();
        if(a>100){
            System.out.println("Sorry!! you cannot enter numbers less than 0 and higher than 100");
        }
        }
    }
}
class Compare extends Random_number1{
    int count=0;
    int compare1(){
         generate();
        for(int i=0;i<3;i++){
        //generate();
        input();
       
        Try_again t= new Try_again();
        if(rand1==a){
            
            System.out.println("Yes,it's matching");
            count=count+10;
           
           
            
        }
        else if(rand1>a){
            System.out.println("It's higher than "+a);
            
            
        }
        else{
            System.out.println("It's lower than "+a);
            
          
        }
        }
         //System.out.println("You have scored: "+count);
         return count;
        
    }
    
}
    class Try_again extends Compare {
        int score=0;
        void try_again(){
            
            Scanner sc=new Scanner(System.in);
            
            while(true){
            System.out.println("Want to try again?");
            char ch=sc.next().charAt(0);
            if(ch=='y'){
               
                compare1();
                 score=score+count;
                System.out.println("You have scored : "+score);
                score=0;
            }
            else if(ch=='n'){
                score=score+count;
                System.out.println("Your final score is : "+score);
                System.out.println("Thank you");
                System.exit(0);
            }
            else{
                System.out.println("You have entered a wrong character, please enter y or n");
            }
            }
          
        }
    }

        
      
        
public class Number_Game2 {
    public static void main(String args[]){
        
        System.out.println("Guess the number game......");
        System.out.println("Rule:\n1.You will get 10 points for each correct answer.\n2.You will get 3 attemps.");
        System.out.println("Start the game (y/n): ");
        Scanner sb=new Scanner(System.in);
        char c=sb.next().charAt(0);
       Try_again ob=new Try_again();
      
       if(c=='y'){
       ob.compare1();
       
       
       ob.try_again();
      
       }
       else{
           System.out.println("Thank you");
           System.exit(0);
       }
      
        
    }
    
}
