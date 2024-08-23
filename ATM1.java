import java.util.Scanner;
class Action{
    int amt1=0;
    void withdraw(int amt,int amount){
       amt1=amt-amount;
       System.out.println("You have withdrawn : "+amount+"Rs.");
    }
    void deposit(int amt,int amount){
        amt1=amt+amount;
        System.out.println("Your have deposited: "+amount+"Rs.");
    }
}
class check_balance extends Action{
    void check(){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Want to check balance?(y/n) ");
        char ch=sc.next().charAt(0);
        //System.out.println("Want to continue your transaction?");
        
        if(ch=='y'){
        System.out.println("Your current balance is: "+amt1);
        }
        
        else if(ch=='n'){
            System.out.println("Thank you");
            System.exit(0);
        }
        else{
            System.out.println("Sorry!! Wrong Character");
        }
        
        
    }
    int retr(){
        return amt1;
    }
}

public class ATM1{
    
    public static void main(String args[]){
        int a,amt,pin,pin1,or_amt=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a pin to access your account:");
        pin1=sc.nextInt();
        check_balance ob= new check_balance();
          while(true){
        System.out.println("Enter\n1. Withdraw\n2. Deposit\n3. Check balance\n4. Exit");
        System.out.println("Enter your choice: ");
        a=sc.nextInt();
          
         switch(a){
            case 1: System.out.println("Enter the amount");
             amt=sc.nextInt();
             if(or_amt<amt){
                 System.out.println("Sorry, transaction is not possible due to insufficient amount!!");
                 continue;
             }
             if(amt>5000){
                 System.out.println("Amount is too high to withdraw(it should be less than 5000Rs.)");
                 
             }
             else {
             System.out.println("Enter the pin: ");
             pin=sc.nextInt();
             
             if(pin!=pin1){
                 System.out.println("Wrong pin");
              
             }
             else{
                 ob.withdraw(or_amt, amt);
                 ob.check();
                 or_amt=ob.retr();
             }
             }
             break;
            case 2: 
                System.out.println("Enter the amount");
             amt=sc.nextInt();
             if(amt>5000){
                 System.out.println("Amount is too high to deposit(it should be less than 5000Rs.)");
             }
             else{
             System.out.println("Enter the pin: ");
             pin=sc.nextInt();
             if(pin!=pin1){
                 System.out.println("Wrong pin");
              
             }
             else{
                 ob.deposit(or_amt, amt);
                 ob.check();
                 or_amt=ob.retr();
             }
             }
             break;
            case 3: System.out.println("Checking the balance...");
            System.out.println("Your current balance is: "+or_amt);
            break;
            case 4: System.out.println("Exit..");
            System.exit(0);
            default: System.out.println("Wrong input");
        }
          }  
    }
}
