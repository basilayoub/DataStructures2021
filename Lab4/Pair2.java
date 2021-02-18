public class Pair2 
{
 

 private Object first;
 
 private Object second;
 
 public Pair2(Object firstElement, Object secondElement)
 {
 first = firstElement;
 second = secondElement;
 }
 public Object getFirst() { return first; }
 public Object getSecond() { return second; }

 

 public void Swap(){

   Object temp = first;
   first = second;
   second = temp; }


 
}