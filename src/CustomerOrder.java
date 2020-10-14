import java.util.ArrayList;
import java.util.Scanner;

public class CustomerOrder extends EatList
{      
//Inheritance 
    public int Customerserial;
    public float Totalpayment;
    
    public int getCustomerserial(){
        return Customerserial;
    
}
    //Parent and chield class have same method name
    @Override
    public void setEatlist(Food food){              //
        eatlist.add(food);
    }
    
    public void viewTotalOrders(){
        for (int i = 0; i < eatlist.size(); i++) {
            System.out.println(eatlist.get(i).getName());
        }
    }

    public void setTotalpayment(float Totalpayment){
       this.Totalpayment=Totalpayment;
}
    
    public void input(){
        Scanner as=new Scanner(System.in);
        System.out.println("Customer Serial Number: ");
        this.Customerserial = as.nextInt();
    }
    
    public void print(){
        System.out.println("-----");
        System.out.println("Customer serial number: "+this.Customerserial+" Total payment : "+this.Totalpayment);
        for(Food m : this.eatlist){
            System.out.println("Selected Food is "+m.Name);
       }
        System.out.println();
    }
   
  
}