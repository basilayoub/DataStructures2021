public class FibonacciProgression extends Progression{
  
  protected long prev;

  /** Constructs traditional Fibonacci starting 0,1,1,2,3,...*/
  public FibonacciProgression() {this(0,1);}
  
  /** Constructs generalized Fibonacci, with given first and second values.*/
  public FibonacciProgression(long first, long second){
    super(first);
    prev = second - first; // fictitious value preceding the first

   }

  /** Replaces (prev, current) with (current, current+prev). */
  protected void advance(){
    long temp = prev;
    prev = current;
    current += temp;

}

public void advance2(){
    long temp = prev;
    prev = current;
    current += temp;

}


public long returnCurrent(){

 return super.WhatIsCurrent(); 


}



}