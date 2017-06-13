
package advancedprog;


public class Ticket {
    
    private double price;
    private String from;
    private String to;
    
    private int quantity;
    private boolean status;
    
    Ticket(String to, String from,int quantity,double price){
        
        this.price = price;
        this.from = from;
        this.to = to;
        this.quantity = quantity;
    }
    
    public void setFrom(String from){
        
        this.from = from;
    }
    public void edtq(String from, String to, int quantity ){
        
        this.from = from;
        this.to = to;
        this.quantity = this.quantity - quantity;
    }
    
    public String getFrom(){
        
        return from;
    }
    
    public void setTo(String to){
        
        this.to = to;
    }
    
    public String getTo(){
        
        return to;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;

    }
    
   
    public void setQuantity(int quantity){
    this.quantity=quantity;
    if (getQuantity()==0){
    setStatus(false);}
    }
     public int getQuantity() {
           return quantity;
    }
    
    public void setPrice(double price ){
        
        this.price=price;
    }
    
    public double getPrice(){
        
        return price;
    }
}
