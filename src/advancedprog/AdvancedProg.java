
package advancedprog;

import java.util.*;

public class AdvancedProg {

    
    ArrayList<Clerk> clerks = new ArrayList<>();
    ArrayList<Passenger> passengers = new ArrayList<>();
    ArrayList<Ticket> ticket = new ArrayList<>();
    
    public void addClerk(Clerk c){
        
        clerks.add(c);
    }
    
    public void removeClerk(Clerk c){
        
        clerks.remove(c);
    }
    
    public void addPassenger (Passenger p){
        
        passengers.add(p);
    }
    
    public void removePerson (Person p){
        
        passengers.remove(p);
    }
    public void addTicket(Ticket t){
        
        ticket.add(t);
        
    }
    
    public void removeTicket (Ticket t){
        
        ticket.remove(t);
    }
    
    
    
    
    
    
    
    
    
 boolean HasAccount (String id, String pass){
        
        boolean flag=false;
        Iterator<Clerk> itr = clerks.iterator();
        
        while(itr.hasNext()){
            
            
            
            Clerk x = itr.next();
            
            String m,n;
            m=x.getId();
            n=x.getPass();
            
       //     System.out.println(x);
            
            if((m.equals(id))|| (n.equals(pass))){
                flag =true;
            }
        }
        
        return flag;
    }
    
    //importing
    
    
    
    
    
}
