/*  Reem khalil   -   ID : 1505841   -   section number : BAR   -    EMAIL : rkhalil0006@stu.kau.edu.sa  */

package fcitmobile2;

import java.io.PrintWriter;

public class FCITcalls {   //  This is the 2nd linked list class ... This linked list will store objects of type FCITcall ...

    
    
    
    
    // ................. Data Members .................. //
    
    
    private FCITcall head;

    private FCITcall tail;

    
    
    
    // .................... Methods .................... //
    
    
    //  Constructor 
    
    FCITcalls() {
    }

    
    //  setter methods
    
    public void setHead(FCITcall head) {
        this.head = head;
    }

    public void setTail(FCITcall tail) {
        this.tail = tail;
    }

    
    //  getter methods
    
    public FCITcall getHead() {
        return head;
    }

    public FCITcall getTail() {
        return tail;
    }

    
    //  serves methods  ..  necessary methods for linked-list operations
    
    
    public boolean isEmpty() {   //  Method to check if list is empty
        return head == null;
    }

    
    public void printAllCalls(PrintWriter print) {   //  Method to Traverse and print nodes of linked list

        print.println("\tCalled Numbers and Duration:");
        
        if (isEmpty()){         // check if Empty
            print.println("\t\t(user has not made any calls yet)");
            return;   }
        
        FCITcall helpPtr = head;   // else ..  print the all node ..
        while (helpPtr != null){ 
            print.println( "\t" + helpPtr.getNumber() + " (" + helpPtr.getCallDuration() + ")");
            helpPtr = helpPtr.getNext();
        }
    }
    
    
    
    public void addNodeAtEmptyList(FCITcall call) {   //  Method to Adding Nodes to Empty Linked List

        call.setNext(head); 
        call.setprev(null);
        head = call ;
        tail = call ;

    }

    
    public void InsertNodeAtfront(FCITcall call) {   //  Method to Adding Nodes in front  Linked List
 
        // check if Empty
        
        if (this.isEmpty()) {      
            addNodeAtEmptyList(call);
            return;
                            }
        // else     
        
        call.setNext(head);
        call.setprev(null);
        head.setprev(call);
        head = call;

    }

    
    public void InsertNodeAtTail(FCITcall call) {   //  Method to Adding Nodes in tail  Linked List

        // check if Empty
        
        if (this.isEmpty()) {
            addNodeAtEmptyList(call);
            return;
        }

        // else   
        
        call.setNext(null);
        call.setprev(tail);

        tail.setNext(call);
        tail = call;

    }

    
    public void delete() {     //  Method to delete All node .

        head = (null);
        tail = null;
    }
}
