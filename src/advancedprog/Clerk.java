
package advancedprog;
public class Clerk extends Person {
    
    private String pw;
    private double money;
    public Clerk(String name, String id, String pw,double money){
        
        super(name,id);
        this.pw = pw;
        this.money = money;
    }
    //********************
    
    public Clerk(String name, String id, String pw){
        
        super(name,id);
        this.pw = pw;
       
    }
    public void setPass(String pw){
        
        this.pw=pw;
    }
    
    public String getPass(){
        
        return pw;
    }
    
    public void setMoney(double money){
        
        this.money=money+this.money;
    }
    
    public double getMoney(){
        
        return money;
    }
    
    
    
    
    //===========
    
    
    
    @Override
    public String toString(){
        return "Clerk name is "+super.getName()+" and the id is "+super.getId();
    }
    
}
