import java.util.*;
class TS{
  int[] arr;
  int size;
  int top1, top2;
 
  TS(int n){
    size = n;
    arr = new int[n];
    top1 = n / 2 + 1;
    top2 = n / 2;
  }
 
  void push1(int x){

    if (top1 > 0){
      top1--;
      arr[top1] = x;
    }
    else{
      System.out.print("Stack Overflow"
                       + " By element :" +  x +"\n");
      return;
    }
  }
 
  void push2(int x){
 
    if (top2 < size - 1){
      top2++;
      arr[top2] = x;
    }
    else{
      System.out.print("Stack Overflow"
                       + " By element :" +  x +"\n");
      return;
    }
  }
 

  int pop1(){
    if (top1 <= size / 2)
    {
      int x = arr[top1];
      top1++;
      return x;
    }
    else{
      System.out.print("Stack UnderFlow");
      System.exit(1);
    }
    return 0;
  }
 
  int pop2()
  {
    if (top2 >= size / 2 + 1)
    {
      int x = arr[top2];
      top2--;
      return x;
    }
    else
    {
      System.out.print("Stack UnderFlow");
      System.exit(1);
    }
    return 1;
  }
};
class Stack{
  public static void main(String[] args){
    TS ts = new TS(5);
    ts.push1(5);
    ts.push2(10);
    ts.push2(15);
    ts.push1(11);
    ts.push2(7);
    ts.push2(40);
    System.out.print("Popped element from stack2 is "
                     + ": " +  ts.pop2()
                     +"\n");
  }
}