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
        if(front==n){
            System.out.println("QUEUE IS FULL");
        }
        else{
        System.out.println("Enther the element to insert");
        int ele=sc.nextInt();

        front++;
        a[front]=ele;
        System.out.println("Element insert succesfuly");
        }
    }

    void del_front(){
        if(front==-1){
        System.out.println("QUEUE IS EMPTY");
        }
        else{
            front--;
            System.out.println("Element del sucessfuly");
        }
    }


    void ins_rear(){
        if(front==n){
            System.out.println("QUEUE IS FULL");
        }
        else{
        System.out.println("Enther the element to insert");
        int ele=sc.nextInt();

        front++;
        a[front]=ele;
        System.out.println("Element insert succesfuly");
        }
    }
    
    void del_rear(){
        if(rear==-1){
        System.out.println("QUEUE IS EMPTY");
        }
        else{
            rear++;
            System.out.println("Element del sucessfuly");
        }
    }

    void display(){
        if(front==-1 || rear==-1){
            System.out.println("QUEUE IS EMPTY");
        }else{

            for(int i=front; i<=rear;i++){
            System.out.println("ele"+a[i]);
        }
        }
        
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