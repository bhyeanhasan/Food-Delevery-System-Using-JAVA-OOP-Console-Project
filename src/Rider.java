
import java.util.ArrayList;
import java.util.Scanner;

public class Rider {
    
    private String name;
    private String code;
    
    ArrayList<Delevery> DeleveryList = new ArrayList<>();
    ArrayList<Delevery> DeleveryDone = new ArrayList();
    
    Scanner input = new Scanner(System.in);
    
    public void takeRide()
    {
        System.out.println("Input Rider Code: ");
        String Ride = input.nextLine();
        System.out.println("Input Customer Code of the percel: ");
        String OrderCode = input.nextLine();
        Delevery deliver = new Delevery(Ride,OrderCode);
        DeleveryList.add(deliver);
    }
    
    public void confirmDelevery()
    {
        System.out.println("Input Rider Code: ");
        String Ride = input.nextLine();
        System.out.println("Input Customer Code of the Delevered percel: ");
        String OrderCode = input.nextLine();
        Delevery deliveryDone = new Delevery(Ride,OrderCode);
        
        for (int i = 0; i < DeleveryList.size(); i++) {
            if(DeleveryList.get(i).getCustomer().equals(OrderCode) && DeleveryList.get(i).getRideBy().equals(Ride))
            {
                DeleveryList.remove(i);
                DeleveryDone.add(deliveryDone);
                System.out.println("Delevery Successfull");
            }
        }
        
    }
    
    public void Completed()
    {
        for (int i = 0; i < DeleveryDone.size(); i++) {
            System.out.println("Rider "+DeleveryDone.get(i).getRideBy() +"Successfully Delevered "+DeleveryDone.get(i).getCustomer()+" Cutomer Percel" );
        }
        
        if(DeleveryDone.size() == 0)
        {
            System.out.println("No Delevey Today");
        }
    }
    
    public void viewriderStatus()
    {
        for (int i = 0; i < DeleveryList.size(); i++) {
            
            System.out.println("Rider "+DeleveryList.get(i).getRideBy() +" is Delevering "+DeleveryList.get(i).getCustomer()+" Cutomer Percel" );
            
        }
    }
    
    
    public Rider() {
    }
    
    public Rider(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
   
}
