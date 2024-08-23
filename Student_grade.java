import java.util.*;
class Student{
int a,b,n,sum=0,avg,total_marks;
double per;
Scanner sc = new Scanner(System.in);
void input(){
   System.out.println("Enter how many subject do you have?");
   a=sc.nextInt();
   System.out.println("Enter the full marks:");
   b=sc.nextInt();
   total_marks=a*b;
   System.out.println("Full marks: "+total_marks);
   System.out.println("Enter your obtained marks in each subject:");
   for(int i=0;i<a;i++){
      n=sc.nextInt();
      sum=sum+n;
     
      n=0;
    }
    
    per= (sum*100)/total_marks;
    
}
void show(){
 System.out.println("Total marks you have obtained is: "+sum);
 
 System.out.println("You have obtained: "+per+"%");
}

}


class Grade extends Student{
void s_grade(){
  if(per>90 && per<=100)
  {
    System.out.println("Grade O");
  }
 else if(per>80 && per<=90)
 {
    System.out.println("Grade E");
 }
 else if(per>70 && per<=80)
 {
  System.out.println("Grade A");
 }
 else if(per>60 && per<=70)
 {
  System.out.println("Grade B");
 }
 else if(per>50 && per<=60)
 {
  System.out.println("Grade C");
  }
 else if(per>40 && per<=50)
 {
  System.out.println("Grade D");
  }
  else
  {
   System.out.println("Failed!!!!");
  }


          

}


}


class Student_grade{
public static void main(String args[]){
 Grade ob = new Grade();
 ob.input();
 ob.show();
 ob.s_grade();

}
 
}
