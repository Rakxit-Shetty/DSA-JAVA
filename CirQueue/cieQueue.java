/*import java.util.*;
import java.io.*;

class myCirQueue{
   public int r,f,n=2;
    int[] a=new int[n];
    myCirQueue(){
    r=-1;
    f=-1;    
    }

    void display(){
        int i=f;
        if(r==-1 && f==-1){
        System.out.println("UNDERFLOW");
        }
        else{
            
            while(i<=r){
                System.out.println(a[i]);
                i=(i+1)%n;
            }

        }
        
    }
    void ins(int ele){
        if((f==0 && r==n-1)||(r==(f-1)%(n-1))){
            System.out.println("OVERFLOW");
        }
        else{
            if(r==-1 && f==-1){
                r=0;
                f=0;
                a[r]=ele;
                 System.out.println("INSERTED");
            }
            else if(r==n-1 && f!=0){
                r=0;
                a[r]=ele;
                 System.out.println("INSERTED");
            
            }
            else{
               r++;
                if(r<=r){

                a[r]=ele;
                System.out.println("INSERTED");
            
                }
                }
        }
    }
    void del(){
        if(r==-1 && f==-1){
            System.out.println("UNDERFLOW");
        }
        else{
            if(f==r){
                f=r=-1;
                System.out.println("DELETED");
            }
            else{
                f++;
                System.out.println("DELETED");
            }
        }
    }
}
*/
//Start

// Java program for insertion and deletion in Circular Queue
import java.util.ArrayList;

class CircularQueue
{
// Declaring the class variables.
private int size, front, rear;

// Declaring array list of integer type.
private ArrayList<Integer> queue = new ArrayList<Integer>();

// Constructor
CircularQueue(int size)
{
	this.size = size;
	this.front = this.rear = -1;
}

// Method to insert a new element in the queue.
public void enQueue(int data)
{
	
	// Condition if queue is full.
	if((front == 0 && rear == size - 1) ||
	(rear == (front - 1) % (size - 1)))
	{
		System.out.print("Queue is Full");
	}

	// condition for empty queue.
	else if(front == -1)
	{
		front = 0;
		rear = 0;
		queue.add(rear, data);
	}

	else if(rear == size - 1 && front != 0)
	{
		rear = 0;
		queue.set(rear, data);
	}

	else
	{
		rear = (rear + 1);
	
		// Adding a new element if
		if(front <= rear)
		{
			queue.add(rear, data);
		}
	
		// Else updating old value
		else
		{
			queue.set(rear, data);
		}
	}
}

// Function to dequeue an element
// form th queue.
public int deQueue()
{
	int temp;

	// Condition for empty queue.
	if(front == -1)
	{
		System.out.print("Queue is Empty");
		
		// Return -1 in case of empty queue
		return -1;
	}

	temp = queue.get(front);

	// Condition for only one element
	if(front == rear)
	{
		front = -1;
		rear = -1;
	}

	else if(front == size - 1)
	{
		front = 0;
	}
	else
	{
		front = front + 1;
	}
	
	// Returns the dequeued element
	return temp;
}

// Method to display the elements of queue
public void displayQueue()
{
	
	// Condition for empty queue.
	if(front == -1)
	{
		System.out.print("Queue is Empty");
		return;
	}

	// If rear has not crossed the max size
	// or queue rear is still greater then
	// front.
	System.out.print("Elements in the " +
					"circular queue are: ");

	if(rear >= front)
	{
	
		// Loop to print elements from
		// front to rear.
		for(int i = front; i <= rear; i++)
		{
			System.out.print(queue.get(i));
			System.out.print(" ");
		}
		System.out.println();
	}

	// If rear crossed the max index and
	// indexing has started in loop
	else
	{
		
		// Loop for printing elements from
		// front to max size or last index
		for(int i = front; i < size; i++)
		{
			System.out.print(queue.get(i));
			System.out.print(" ");
		}

		// Loop for printing elements from
		// 0th index till rear position
		for(int i = 0; i <= rear; i++)
		{
			System.out.print(queue.get(i));
			System.out.print(" ");
		}
		System.out.println();
	}
}
}

// Driver code
public class cieQueue{
public static void main(String[] args)
{
	
	// Initialising new object of
	// CircularQueue class.
	CircularQueue q = new CircularQueue(5);
	
	q.enQueue(14);
	q.enQueue(22);
	q.enQueue(13);
	q.enQueue(-6);
	
	q.displayQueue();

	int x = q.deQueue();

	// Checking for empty queue.
	if(x != -1)
	{
		System.out.print("Deleted value = ");
		System.out.println(x);
	}

	x = q.deQueue();

	// Checking for empty queue.
	if(x != -1)
	{
		System.out.print("Deleted value = ");
		System.out.println(x);
	}
	q.displayQueue();
	q.enQueue(9);
	q.enQueue(20);
	q.enQueue(5);
	q.displayQueue();
	q.enQueue(20);
}
}
//END