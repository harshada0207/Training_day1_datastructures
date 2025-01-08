Circular queue using array

public class CircularQueue{
   int queue[];
   int front ,size;
   int capacity;
   
  #constructor
  public Circularqueue(int c)
  {
     queue=new int [c];
     capacity=c;
     size=0;
     front=0;
  }
  int getFront(){
     if(size==0)
      {return -1;}
     return queue[front];
  }
  int getRear()
  {
     if(size==0) 
     {return -1;}
     int rear=(front+size-1)%capacity;
     return queue[rear];
  }
  void enqueue(int n)
  {
     if(size==capacity)
     { 
       System.out.println("queue is full");
       return;
     }
     int rear=(front+size-1)%capacity;
     queue[rear]=n;
     size++;
   }
   void dequeue(int n)
  {
     if(size==0)
     { 
       System.out.println("queue is empty");
       return;
     }
     front=(front+1)%capacity;
     size--;
  }
}

