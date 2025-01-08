
class Stack{
  int stack[];
  int top;
  int maxsize;

  #constructor
  public Stack(int maxSize){
     this.stack=new int[maxSize];
     this.maxSize=maxSize;
     top=-1;
   }
  void push(int value){
     if(top==maxSize-1)
      {
        System.err.printIn("overflow");
        return;
      }
      stack[++top]=value;
      System.out.println("Pushed:" +value);

  }
  void pop(int value){
      if(top==-1){
         System.err.println("Stack underflow);
         return;
      }
      System.out.println("popped:" + stack[top--]);
  }
  void peek(){
       if(top!=-1)
       {System.out.println("Value : " + stack[top])};
  }
  boolean isEmpty(){
     return top=-1;
  }
}
}
