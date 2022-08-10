/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theater;

/**
 *
 * @author Erika92
 */
import java.io.*;

// Helper Class (Generic node class for LinkedList)
public class Node<T> {
    T data;//Storing value of node
    Node<T> next;//Storing address of next node
    
    //Parameterized constructor to assign value
    public Node(T data) {
        this.data = data;
        this.next=null;
    }
    
}
