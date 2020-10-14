import java.util.Scanner;

public class Food
{
    public int Code;
    public String Name;
    public int Price;
    
    Scanner scr=new Scanner(System.in);
    
    public Food(int Code,String Name,int Price){
        this.Code=Code;
        this.Name=Name;
        this.Price=Price;
    }
    
    public Food(){
    }

    public void input(){
              
        System.out.println("Enter Food Code");
        this.Code=Integer.parseInt(scr.nextLine());
        System.out.println("Enter Food Name");
        this.Name=scr.nextLine();
        System.out.println("Enter Food Price");
        this.Price=Integer.parseInt(scr.nextLine());
    }
    
    public void payment(){
        System.out.println("Price: "+Price);
        
    }
    
    public String detail(){
        return Code+" "+Name+" "+Price ;
        
    }
    
    public int getCode(){
        return Code;
    }
    
    public String getName(){
        return Name;
    }
    
    public float getPrice(){
        return Price;
    }
         
    public void setCode(int Code){
        this.Code=Code;
    }
    
    public void setName(String Name){
        this.Name=Name;
    }
    
    public void setPrice(int Price){
        this.Price=Price;
    }
   

}
