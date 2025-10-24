import java.util.Stack;

public class StackEx1 {
    public static void main(String[] args) {
      Stack<String> stack = new Stack();  

      stack.push("Apple");
      stack.push("Banana");
      stack.push("Cherry");

      System.out.println("Top Element: "+stack.peek());
      System.out.println("Removed: "+stack.pop());
      System.out.println("Stack after pop: "+stack);
      System.out.println("Stack size: "+stack.size());
      System.out.println("Is stack is Empty: "+stack.isEmpty());
      System.out.println("Search: "+stack.search("Apple")); //tells the object location how far to it in from top location
    }                                                         //how many pops away element is from top
}                                                             //if element is not found returns -1

//stack is used in undo /redo in editors :- Every action we performed in added in to stack
// Used in browser history:- when we go to new page it added to stack