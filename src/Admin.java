
import java.util.ArrayList;
import java.util.Scanner;


public class Admin {
    
    ArrayList<Rider> riderList=new ArrayList<>();
    
    Scanner input = new Scanner(System.in);
    
    public void addRider()
    {
        System.out.println("Input Rider Name: ");
        String name = input.nextLine();
        System.out.println("Input Rider Serial Code: ");
        String Serial = input.nextLine();
        Rider rider = new Rider(name,Serial);
        riderList.add(rider);
    }
    
    public void deleteRider()
    {
     String deletefood;
     int up=0;
     System.out.println("Enter Serial code of Rider to delete");
     
     deletefood=input.nextLine();
    
    for(int i=0;i<riderList.size(); i++)
    {
            if(riderList.get(i).getCode().equals(deletefood))
            {
                up++;
                riderList.remove(i);
                System.out.println("delete finish");
                break;
            }
           
    }      
    if (up==0)
    {
           System.out.println("No rider is found"+deletefood);
    }
}
    
    public void viewRiderList()
    {
        for(int i = 0; i<riderList.size();i++)
        {
            System.out.println(riderList.get(i).getCode()+ " " +riderList.get(i).getName());
        }
    }
    
}
