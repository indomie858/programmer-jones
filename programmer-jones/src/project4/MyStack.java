/**
 * @author Gaven Grantz
 * May 1, 2018
 * Source - MyStack.java
 * Description: This interface is implemented by StackList, StackArray, and StackJava.
 */

package project4;


public interface MyStack {
    void push(Room obj);

    Room pop();

    Room peek();

    boolean empty();
}
