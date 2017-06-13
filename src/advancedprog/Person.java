package advancedprog;


public class Person {
    
    private String name;
    private double phone;
    private String id;
    
    Person(String name,String id){
        
        
        this.name = name;
        this.id = id;
    }
    Person(String name){
        
        
        this.name = name;
    }
    
    public void setName(String name){
        
        
       this.name=name;
    }
    
    public String getName(){
        
        return name;
    }
    
    public void setPhone(double phone){
        
        this.phone = phone;
    }
    
    public double getPhone(){
        
        return phone;
    }
    
    public void setID(String id){
        
        this.id = id;
    }
    
    public String getId(){
        
        return id;
    }
    
    
    
    
    
    
}
