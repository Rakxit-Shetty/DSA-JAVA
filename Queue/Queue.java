import java.util.*;
import java.io.*;

class myQueue{
    int rear,front;
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> a=new  ArrayList<>();

    myQueue(){
        rear=front=-1;
        //front=-1; 
    }
    void enqueue(){
    
        System.out.println("Enter the element");
        if(front==-1)
        front=0;
        
        
        int ele=sc.nextInt();
        rear++;
        a.add(rear,ele);
        System.out.println("element inserted:");
    }

    void dequeue(){
        if(front==-1){
            System.out.println("Empty Queue");
            rear=-1;
            front=-1;
        }
        else{
            System.out.println("Element "+a.get(front)+" is deleted");
            front++;
            if(front>rear)
            {
                rear=-1;
            front=-1;
            }

        }
        
    }

    void display(){
        if(rear==-1){
                System.out.println("Empty queue");
        }else{

            for(int i=front;i<=rear;i++){
            System.out.println("Element is :"+a.get(i));

        }
        }
        
    }
}

public class Queue{
    public static void main(String args[]){

 Scanner sc=new Scanner(System.in);
            int run=1,choice;
        
            myQueue my=new myQueue();
        while(run==1){
            System.out.println("1.enqueue\n 2.dequeue\n 3.Display\n Enter your choice:");
            choice=sc.nextInt();
            switch(choice){
                case 1: 
                my.enqueue(); break;
                case 2: 
                my.dequeue(); 
                break;
                case 3:
                my.display(); break;
            }
            System.out.println("do you want to continue ?: press 1 to cntnu");
            run=sc.nextInt();
        }
    }
}