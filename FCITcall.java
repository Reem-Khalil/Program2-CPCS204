/*  Reem khalil   -   ID : 1505841   -   section number : BAR   -    EMAIL : rkhalil0006@stu.kau.edu.sa  */
package fcitmobile2;

import java.io.PrintWriter;

public class FCITcall {   //  This is the class for the nodes of the FCITcallslinked list ...  Each FCITcallobject is one node of this list ...

    
    
    
    
    // ................. Data Members .................. //
    
    
    private String number;

    private int callDuration;

    private FCITcall next;

    private FCITcall prev;

    
    
    
    
    // .................... Methods .................... //
    
    
    //  Constructors
    
    FCITcall(int callDuration, String number) {
        this.number = number;
        this.callDuration = callDuration;
    }

    FCITcall(int callDuration, String number, FCITcall next, FCITcall prev) {

        this.number = number;
        this.callDuration = callDuration;
        this.next = next;
        this.prev = prev;

    }

    
    //  setter methods
    
    public void setNumber(String number) {
        this.number = number;
    }

    public void setCallDuration(int callDuration) {
        this.callDuration = callDuration;
    }

    public void setNext(FCITcall next) {
        this.next = next;
    }

    public void setprev(FCITcall prev) {
        this.prev = prev;
    }

    
    //  getter methods
    
    public String getNumber() {
        return number;
    }

    public int getCallDuration() {
        return callDuration;
    }

    public FCITcall getNext() {
        return next;
    }

    public FCITcall getprev() {
        return prev;
    }

    
    
}
