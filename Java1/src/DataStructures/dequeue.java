package DataStructures;

import java.util.ArrayList;
import java.util.List;
 
public class dequeue {
 
    private List<Integer> deque = new ArrayList<Integer>();
     
    public void insertFront(int item){
        //add element at the beginning of the queue
        System.out.println("adding at front: "+item);
        deque.add(0,item);
        System.out.println(deque);
    }
     
    public void insertRear(int item){
        //add element at the end of the queue
        System.out.println("adding at rear: "+item);
        deque.add(item);
        System.out.println(deque);
    }
     
    public void removeFront(){
        if(deque.isEmpty()){
            System.out.println("Deque underflow!! unable to remove.");
            return;
        }
        //remove an item from the beginning of the queue
        int rem = deque.remove(0);
        System.out.println("removed from front: "+rem);
        System.out.println(deque);
    }
     
    public void removeRear(){
        if(deque.isEmpty()){
            System.out.println("Deque underflow!! unable to remove.");
            return;
        }
        //remove an item from the beginning of the queue
        int rem = deque.remove(deque.size()-1);
        System.out.println("removed from rear: "+rem);
        System.out.println(deque);
    }
     
    public int peakFront(){
        //gets the element from the front without removing it
        int item = deque.get(0);
        System.out.println("Element at first: "+item);
        return item;
    }
     
    public int peakRear(){
        //gets the element from the rear without removing it
        int item = deque.get(deque.size()-1);
        System.out.println("Element at rear: "+item);
        return item;
    }
     
    public static void main(String a[]){
         
        dequeue deq = new dequeue();
        
        deq.insertFront(11);
        deq.insertRear(44);
        deq.removeFront();
        deq.removeFront();
        deq.removeFront();
        deq.insertFront(22);
        deq.insertFront(99);
        deq.insertRear(55);
        deq.insertFront(33);
        deq.removeRear();
        deq.insertRear(90);
        deq.insertFront(450);
        deq.peakRear();
        deq.peakFront();
    }
}
