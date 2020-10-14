import java.util.ArrayList;
import java.util.Scanner;

public class Restuarant
{
    ArrayList<Food> foodlist=new ArrayList<>();
    ArrayList<CustomerOrder> customerorder=new ArrayList<>();
    ArrayList<FoodStatus> foodcustomer=new ArrayList<>();
    
    Food  Food;                             
    public CustomerOrder CustomerOrder;
    public int SelectFood;
    Scanner scr=new Scanner(System.in);
    
    public Restuarant(){
        
    }
    
    public void as(){
        System.out.println("Enter number of food add in menu");
        int n=scr.nextInt();
        for (int i=0; i<n; i++){
           Food food = new Food();
           food.input();
           foodlist.add(food);
        }
        
    }
    
    public void print(){
        for (int i=0; i<foodlist.size(); i++){
            System.out.println((i+1)+" ."+foodlist.get(i).detail());
        }
    }
   
    public void Price(){
        int PriceFood=0;
        int Totalpayment=0;
        int number;
        CustomerOrder customer=new CustomerOrder();
        customer.input();
        customerorder.add(customer);
        for (int i=0; ; i++){
            System.out.println("Select Food for customer "+customer.Customerserial+" No of food "+(i+1)+"\nElse 0 for finish");
            SelectFood=scr.nextInt();
            if(SelectFood==0){
                
                customer.setTotalpayment(Totalpayment);
                System.out.println("Total Payment");
                System.out.println(Totalpayment);
                System.out.println("Thank you sir,see you again");
                break;
            }
            else{
                
                System.out.println("Enter total number of the food1");
                number=scr.nextInt();
                Food food=foodlist.get(SelectFood -1);
                customer.setEatlist(food);
                PriceFood=food.Price*number;
                
                String CS = Integer.toString(customer.Customerserial);
                String SF = Integer.toString(SelectFood);
                FoodStatus fs= new FoodStatus(CS, "preparing",SF );
                foodcustomer.add(fs);
                
                
            }
            Totalpayment+=PriceFood;
            System.out.println("Order finish");
            System.out.println("Payment"+(i+1)+"is:");
            System.out.println(" "+PriceFood);
            System.out.println("To Finish Your Order Enter 0\nElse Continue...");
        }

    }

    public void PrintOrder(){
        for (int i=0; i <customerorder.size(); i++){
            customerorder.get(i).print();
        }
    }
    
    public String EditName(){
        System.out.println("Enter Name edit: ");
        
        return scr.nextLine();
    }

    public int EditPrice(){
        System.out.println("Enter Price edit: ");
        return scr.nextInt();
    }

    public void EditFood(){
        String namefood;
        int up=0;
        System.out.println("Enter Name food to fix ");
        
        namefood=scr.nextLine();
         for(int i=0;i<foodlist.size(); i++){
            if(foodlist.get(i).getName().equals(namefood)){
              up++;
              int want;
              System.out.println("What do you want:\n1.Update oder status\n2.Update Name\n3.Update price");
              want=scr.nextInt();
              if(want==1){
                 System.out.println("Enter customer serial no :");
                         String csserial;
                         scr.nextLine();
                                 
                         csserial=scr.nextLine();
                         System.out.println("Enter the Food code");
                        String code = scr.nextLine();
                         orderStatus(csserial,code);
              }
              else if(want == 2){
                  System.out.println("Enter the edited name: ");
                  
                  scr.nextLine();
            foodlist.get(i).setName(EditName());
              }else if(want==3) {
                  System.out.println("Enter the edited price: ");
                  
                  scr.nextLine();
                 foodlist.get(i).setPrice(EditPrice()); 
              } 
             
            
            break;
         }
           
       } if (up==0){
           System.out.println("no food name is "+namefood);
           
}

}
    
    public void DeleteFood(){
     String deletefood;
     int up=0;
     System.out.println("Enter name food to delete");
     
     deletefood=scr.nextLine();
    
    for(int i=0;i<foodlist.size(); i++)
    {
            if(foodlist.get(i).getName().equals(deletefood))
            {
                up++;
                foodlist.remove(i);
                System.out.println("delete finish");
                break;
            }
           
    }      
    if (up==0)
    {
           System.out.println("no food name is "+deletefood);
           
    }
}
 
    public void orderStatus(String ccs,String code ){
        for(int i = 0; i<foodcustomer.size(); i++){
            
                if( foodcustomer.get(i).getCustomerserial().equals(ccs) && foodcustomer.get(i).getfoodCode().equals(code) ){
                    
                                   //update food status
                        showstatus(ccs);
                        int k=0;
                        do{
                        System.out.println("What is the status\n0.Back\n1.Preparing\n2.Ready\n3.On the way");
                        k=scr.nextInt();
                        
                        String s="";
        
                        if(k==1){
                            s = "Preparing";
                            foodcustomer.get(i).setStatus(s);
                            
                        }
                        else if(k==2){
                            s = "Ready";
                            foodcustomer.get(i).setStatus(s);
                            
                        }
                        else if(k==3){
                            s = "On the way";
                            foodcustomer.get(i).setStatus(s);
                            
                        }
                            
                        
                        }
                        while(k != 0);
                        System.out.println("Updated status------");
                        showstatus(ccs);
                }
        }
        
        
    }
    
    public void showstatus(String CSSerial){
        System.out.println("Customer Serial --- Food -------- Status");
        for(int i = 0; i<foodcustomer.size(); i++){
        if(foodcustomer.get(i).getCustomerserial().equals( CSSerial) )
        {
                    
        System.out.println(foodcustomer.get(i).getCustomerserial()+" --- "+ foodcustomer.get(i).getfoodCode()+" ------ "+foodcustomer.get(i).getStatus());
                
        }
        }
 }
}