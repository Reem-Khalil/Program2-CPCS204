/*  Reem khalil   -   ID : 1505841   -   section number : BAR   -    EMAIL : rkhalil0006@stu.kau.edu.sa  */
package fcitmobile2;

import java.io.PrintWriter;

public class FCITacounts {   /*  This is the main linked list class ...  This linked list will store objects of type FCITcustomer ...  */
    
    
    
    
    // ................. Data Members .................. //
    
    
    private FCITcustomer head;

    
    
    
    // .................... Methods .................... //
    
    
    //  Constructor 
    
    FCITacounts() {
        head = null;
    }
 
    
    //  setter method
    
    public void setHead(FCITcustomer head) {
        this.head = head;
    }

    
    //  getter method
    
    public FCITcustomer getHead() {
        return head;
    }

    
    
    //  serves methods .. necessary methods for linked-list operations 
    
    
    public boolean isEmpty() {  //  Method to check if list is empty
        return head == null;
    }

    
    
    public void printAllCustomer(PrintWriter print) {   //  Method to Traverse and print linked list

        FCITcustomer helpPtr = head;
        while (helpPtr != null) {           // Traverse to correct insertion point

            print.println("\tName:          " + helpPtr.getFirstName() + " " + helpPtr.getLastName());
            print.println("\tCustomer ID:   " + helpPtr.getID());
            print.println("\tPhone Number:  " + helpPtr.getPhoneNumber());
            print.printf("\tBalance:       %.2f", (helpPtr.getBalance()));
            print.println();
            helpPtr = helpPtr.getNext();  // Step one node over
        }
    }

    
    
    public void add(FCITcustomer newCustomer) {   //  Method to Adding Nodes to a sorted Linked List

        
        // First //  we take care of Insertion into an empty list OR Insertion at the front of a non-empty list
        if (head == null || head.getID() > newCustomer.getID()) {
            newCustomer.setNext(head);                              // Point the new node to its successor
            head = newCustomer;                                    //  Point the predecessor node to the new node
            return;
        }

        // ELSE //  the insertion spot is somewhere later in the list  So traverse list to correct location and insert!
        FCITcustomer helpPtr = head;
        while (helpPtr.getNext() != null) {

            if (helpPtr.getNext().getID() > newCustomer.getID()) {
                break;    // we found our spot and break out of the while loop
            }
            helpPtr = helpPtr.getNext(); // Step one node over
        }

        newCustomer.setNext(helpPtr.getNext());             // Point the new node to its successor
        helpPtr.setNext(newCustomer);                      //  Point the predecessor node to the new node

    }

    
    
    
    public void delete(int ID) {     //  Method to delete specific node .

        
        if (!isEmpty()) {
            if (head.getID() == ID) // if “ID” is in the first node
            {
                head = head.getNext();
            } else {                 // ELSE, ID is (possibly) elsewhere in the list
                FCITcustomer help_ptr = head;

                while (help_ptr.getNext() != null) {

                    if (help_ptr.getNext().getID() == ID) {
                        help_ptr.setNext(help_ptr.getNext().getNext());
                        break;
                    }
                    help_ptr = help_ptr.getNext();
                }
            }
        }
    }

    
    
    
    public boolean search(int data) {   // 2 methods to check If the record is found in the accounts linked-list
        return search(head, data);
    }

    private boolean search(FCITcustomer p, int ID) {

        // We need to traverse...so we need a help ptr
        FCITcustomer helpPtr = p;

        while (helpPtr != null) {
            if (helpPtr.getID() == ID) {
                return true;
            }
            helpPtr = helpPtr.getNext();
        }
        return false;
    }

    
    
    
    public FCITcustomer findNode(int ID) {   // 2 methods to check If the record is found in the accounts linked-list & return the node 
        return findNode(head, ID);
    }

    private static FCITcustomer findNode(FCITcustomer p, int ID) {

        // We need to traverse...so we need a help ptr
        FCITcustomer helpPtr = p;
        
        while (helpPtr != null) {
            if (helpPtr.getID() == ID) {
                return helpPtr;   // return the node 
            }
            helpPtr = helpPtr.getNext();
        }
        return null;
    }
    
    
    

    public void ModifyNodes( PrintWriter print ) {   // 2 methods to Modify node that have a balance less than the SMS rate (0.08 sr) in the accounts linked-list 
        ModifyNodes(head , print);
    }

    private void ModifyNodes(FCITcustomer head , PrintWriter print) {

        
        print.println("\tThe following bills have been paid:");
        boolean paid = false ;
        
        // We need to traverse...so we need a help ptr
        FCITcustomer helpPtr = head;

        // Traverse to correct insertion point
        while (helpPtr != null) {

            if (helpPtr.getBalance() < 0.08) {  // check if there are accounts have a balance less than the SMS rate (0.08 sr)
                
                paid = true;
                helpPtr.setBalance(30);   // the balance will be reset to 30sr
                helpPtr.getCalls().delete(); // and the call/SMS history will be reset
                helpPtr.setTextedNumbers(new String [10]); 
                print.println("\t>ID #" +helpPtr.getID()+ " ("+helpPtr.getName()+")" );
            
            }  
            
                // Step one node over
                helpPtr = helpPtr.getNext();
            }
        if (!paid)
            print.println("\t\tNo bills were paid. All accounts had a balance greater than zero.");
        
        }
}
    
    
   