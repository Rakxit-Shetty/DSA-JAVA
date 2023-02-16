import java.util.*;
import java.io.*;

class myDqueue{
    int[] a=new int[5];
    Scanner sc=new Scanner(System.in);
    int n,rear,front;
    
    myDqueue(){
    n=a.length;
    rear=front=-1;

    }

    void ins_frnt(){
        if((front==0 && rear==n-1) || front==rear+1){
            System.out.println("QUEUE IS FULL");
        }
        else if((front==-1)&&(rear==-1)){
            front=rear=0;
            System.out.println("Enther the element to insert");
        int ele=sc.nextInt();
        a[front]=ele;
        System.out.println("Element insert succesfuly");

        }
        else if(front==0){
        front=n-1;
        System.out.println("Enther the element to insert");
        int ele=sc.nextInt();
        a[front]=ele;
        System.out.println("Element insert succesfuly");
        }
        else{
            System.out.println("Enther the element to insert");
        int ele=sc.nextInt();
        front--;
        a[front]=ele;
        System.out.println("Element insert succesfuly");
        }
        }
    

    void del_front(){
        if((front==-1) &&(rear==-1)){
        System.out.println("QUEUE IS EMPTY");
        }
        else if(front==rear){
            front--; rear--;
            System.out.println("Element del sucessfuly");
        }
        else if(front==(n-1)){
            front=0;
            System.out.println("Element del sucessfuly");
        }
        else{
            System.out.println("Element del sucessfuly");
            front++;
        }
    }



    void ins_rear(){
        if((front==0 && rear==n-1) || (front==rear+1)){
            System.out.println("QUEUE IS FULL");
        }
        else if((front==-1) && (rear==-1)){
        System.out.println("Enter the element to insert");
        int ele=sc.nextInt();

        rear=0;
        a[rear]=ele;
        System.out.println("Element insert succesfuly");
        }
        else if(rear==n-1){
        System.out.println("Enter the element to insert");
        int ele=sc.nextInt();

        rear=0;
        a[rear]=ele;
        System.out.println("Element insert succesfuly");

        }
        else{
            System.out.println("Enter the element to insert");
        int ele=sc.nextInt();
            rear++;
            a[rear]=ele;
        }
    }
    
    void del_rear(){
        if((rear==-1) && (front==-1)){
        System.out.println("QUEUE IS EMPTY");
        }
        else if(front==rear){
            rear=-1; front=-1;
            System.out.println("Element del sucessfuly");
        }
        else if(rear==0){
            rear=n-1;
            System.out.println("Element del sucessfuly");
        }
        else{
            System.out.println("Element del sucessfuly");
            rear--;
        }
    }

    void display(){
         int i=front;    
    System.out.println("\nElements in a deque are: ");    
        
    while(i!=rear)    
    {    
        System.out.println(a[i]);   
        i=(i+1)%n;    
    }    
     System.out.println(a[rear]); 
        
    }


}

public class DQueue{
    public static void main(String args[]){
        myDqueue my=new myDqueue();
        my.display();
        my.ins_frnt();
        my.ins_frnt();
        my.ins_frnt();
        my.display();
    }
}