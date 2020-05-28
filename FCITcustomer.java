/*  Reem khalil   -   ID : 1505841   -   section number : BAR   -    EMAIL : rkhalil0006@stu.kau.edu.sa  */
package fcitmobile2;

import java.io.PrintWriter;

public class FCITcustomer { //  This is the class for the nodes of the FCITacountslinked list  ...  Each FCITcustomerobject is one node of this list ...

    
    
    
    
    // ................. Data Members .................. //
    
    
    private int ID ;
    
    private String firstName ;
    
    private String lastName ;
    
    private String phoneNumber;
    
    private double balance = 30 ; //  Customer start with a balance of 30sr, for subscribing to the service 
    
    private FCITcalls calls = new FCITcalls();
    
    private int numCalled;     // As acounter .
    
    private String[] textedNumbers = new String[10];  // to hold the history of the last ten texted numbers;  
     
    private int numTexted;    // As acounter .
    
    private static int numCustomers;  // As acounter .
    
    private FCITcustomer next;
    

    
    

   // .................... Methods .................... //
    
    
    //  Constructors 
    
    FCITcustomer(int ID, String firstName, String lastName, String phoneNumber) {
         this( ID , firstName , lastName ,  phoneNumber , null);
    }

    FCITcustomer(int ID, String firstName, String lastName, String phoneNumber , FCITcustomer next ) {
         
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.next = next ;  
    }

    FCITcustomer ()   {  
    }

  
    
   //  setter methods
    
    public void setID(int ID) {
        this.ID = ID;
    }

    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
    public void setBalance(double balance) {
        this.balance = balance;
    }

    
    public void setCalls(FCITcalls calls) {
        this.calls = calls;
    }

    
    public void setNumCalled(int numCalled) {
        this.numCalled = numCalled;
    }

    
    public void setTextedNumbers(String[] textedNumbers) {
        this.textedNumbers = textedNumbers;
    }

    
    public void setNumTexted(int numTexted) {
        this.numTexted = numTexted;
    }

    
    public static void setNumCustomers(int numCustomers) {
        FCITcustomer.numCustomers = numCustomers;
    }

    
    public void setNext(FCITcustomer next) {
        this.next = next;
    }

    
    
    //  getter methods

    public int getID() {
        return ID;
    }

    
    public String getFirstName() {
        return firstName;
    }

    
    public String getLastName() {
        return lastName;
    }

    
    public String getName() {
        return firstName +" "+ lastName;
    }
    
    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    
    public double getBalance() {
        return balance;
    }

    
    public FCITcalls getCalls() {
        return calls;
    }

    
    public int getNumCalled() {
        return numCalled;
    }

    
    public String[] getTextedNumbers() {
        return textedNumbers;
    }

    
    public int getNumTexted() {
        return numTexted;
    }

    
    public static int getNumCustomers() {
        return numCustomers;
    }

    
    public FCITcustomer getNext() {
        return next;
    }
    
    
    
    
    //  serves methods
    
    
     public static void increaseNumcustomers( ) {  // Methode  increase Num. of customers 1
        numCustomers += 1 ;
    }
    
    
     
    public void increaseNumCalled( ) {  // Methode  increase Num. of calls 1
        numCalled += 1 ;
    }
    
    
    
    public void increaseNumTexted( ) {  // Methode  increase Num. of calls 1
        numTexted += 1 ;
    }
    
    
    
    
     public void printInfo( PrintWriter print ) {  // Methode prints customer information
        
        print.println("\tName:          " + firstName +" "+ lastName );
        print.println("\tCustomer ID:   " + ID ); 
        print.println("\tPhone Number:  " + phoneNumber ); 
        print.printf("\tBalance:       %.2f"  , (balance) );
        print.println();
        print.println();
}
    
     
     
     public void printCallInfo( PrintWriter print , String callednumber , int callDuration , double callBalance , boolean terminated) {  // Methode prints Customer call information
        
        print.println("\tName:           " + firstName +" "+ lastName );
        print.println("\tPhone Number:   " + phoneNumber ); 
        print.println("\tNumber Called:  " + callednumber ); 
        print.println("\tCall Duration:  " + callDuration + " minutes" ); 
        print.printf("\tCall Cost:      %.2f"  , (callBalance) );
        print.println();
        print.printf("\tNew Balance:    %.2f"  , (balance)); 
        
        if (terminated){
        print.println();    
        print.print("\t***Call terminated due to low balance.");
        
        }
        print.println();
        print.println();
}
     
     
     
     
      public void printTextInfo( PrintWriter print , String textedNumber ) {  // Methode prints sms information
        
        print.println("\tName:           " + firstName +" "+ lastName );
        print.println("\tPhone Number:   " + phoneNumber ); 
        print.println("\tNumber Texted:  " + textedNumber );
        print.print("\tText Cost:      0.08");
        print.println();
        print.printf("	New Balance:    %.2f"  , (balance)); 
        print.println(); 
        print.println();
}
      
      
      
      public void printInfo2( PrintWriter print ) {  // Methode prints customer information After the PAYBILL
        
        print.println("\tName:          " + firstName +" "+ lastName );
        print.println("\tPhone Number:  " + phoneNumber ); 
        print.printf("\tBalance:       %.2f"  , (balance) );
        print.println();
        print.println();
}
      
      
      
      
      public void printInfo3( PrintWriter print ) {  // Methode prints customer information After the deleting 
        
        print.println("\tName:          " + firstName +" "+ lastName );
        print.println("\tCustomer ID:   " + ID ); 
        print.println("\tPhone Number:  " + phoneNumber ); 
        print.printf("\tBalance:       %.2f"  , (balance) );
        print.println("");
        print.println("\t***Account has been deleted.");
        print.println();
}
      
      
      
      
      
      public void DISPLAYDETAILS( PrintWriter print ) {  // Methode prints DETAILS 
        
        print.println("\tName:           " + firstName +" "+ lastName );
        print.println("\tCustomer ID:    " + ID ); 
        print.println("\tPhone Number:   " + phoneNumber ); 
        this.getCalls().printAllCalls(print);
        print.println("\tTexted Numbers:" );
        if (numTexted > 0 && textedNumbers[0]!= null ){
        for (int i = 0 ; i<numTexted ; i++)
            print.println("	" + textedNumbers[i] ); }
        else 
            print.println("\t	(user has not made any calls yet)");
        
        print.println();
}
}