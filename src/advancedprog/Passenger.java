
package advancedprog;
import java.util.*;

public class Passenger extends Person {
    
    private double cash;
    ArrayList<Ticket> ticket = new ArrayList<Ticket>();
    
    public Passenger(String name,double cash){
        
        super(name);
        this.cash = cash;
        
    }
    
    public void addTicket(Ticket b) {
        ticket.add(b);
    }

    public void Remove(Ticket b) {
        ticket.remove(b);
    }
    public void setCash(double cash){
        
        this.cash = this.cash + cash;
    }
    
    
    public double getCash(){
        
        return cash;
    }
    
    
    
    public String getName(){
        
         return super.getName();
    }

    
    
}
