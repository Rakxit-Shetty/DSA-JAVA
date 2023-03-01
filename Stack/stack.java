import java.util.*;
import java.io.*;
//Stack
class mystack{
         
        public int top;
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> a= new ArrayList<Integer>();

        mystack(){
            top=-1;
        }

         void Show(){
        if(a.isEmpty()){
            System.out.println("STACK is empty");
        }
        else{
            System.out.println("Elements are:");
        for(int i=top;i>=0;i--)
         System.out.println(a.get(i));
    }
    }
        void pop(){
        if(top==-1){
            System.out.println("STACK is Empty ");
        }
        else{
            System.out.println("stack pop sucess ele: "+a.get(top)+" poped");
            top--;
        }
    }

    void push(){
    System.out.println("Enter number to push");
    int ele=sc.nextInt();
        top++;
        a.add(top,ele);
    }

    }
    
public class stack{

    public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
            int run=1,choice;
        
            mystack my=new mystack();
        while(run==1){
            System.out.println("1.push\n2.pop\n3.Display\nEnter your choice:");
            choice=sc.nextInt();

            switch(choice){
                case 1: 
                my.push(); break;
                case 2: 
                my.pop(); 
                break;
                case 3:
                my.Show(); break;

            }
            System.out.println("do you want to continue?: press 1 to cntn");
            run=sc.nextInt();

        }
        
    }
    
    
    
}