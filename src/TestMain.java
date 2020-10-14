import java.util.ArrayList;
import java.util.Scanner;
//Home Page
public class TestMain{
    
    public static void main(String[]args){
        ArrayList<Food> foodlist=new ArrayList<>();
        Restuarant restuarant=new Restuarant();
        Rider riders = new Rider();
        CustomerOrder customer = new CustomerOrder();
        Admin admin = new Admin();
        int select;
        
        Scanner scr=new Scanner(System.in);
        do{
            Menumain();
            select=scr.nextInt();
            
            switch (select)
            {
                    case 1:
                    int select3;
                    do
                    {
                        admin();
                        select3=scr.nextInt();
                        
                        switch(select3)
                        {
                            case 1:
                                admin.addRider();
                                break;
                         
                            case 2:
                                admin.viewRiderList();
                                break;
                                
                            case 3:
                                admin.viewRiderList();
                                admin.deleteRider();
                                break;
                                
                            case 4:
                                restuarant.PrintOrder();
                                break;
                                
                            case 5:
                                riders.viewriderStatus();
                                break;
                            
                            case 6:
                                riders.Completed();
                                break;
                                
                            default:
                                break;
                                
                        }
                        
                    }while (select3 !=0);
                    break;
                    
                    case 4:
                    int select4;
                    do
                    {
                        rider();
                        select4=scr.nextInt();
                        switch(select4)
                        {
                            case 1:
                                riders.takeRide();
                                break;
                         
                            case 2:
                                restuarant.PrintOrder();
                                break;
                                
                            case 3:
                                riders.viewriderStatus();
                                break;
                                
                            case 4:
                                riders.confirmDelevery();
                                break;
                   
                            default:
                                break;
                        }
                        
                    }while (select4 !=0);
                    break;
                
                
                
                case 2:
                    int select1;
                    do{
                        MenuRestuarant();
                        select1=scr.nextInt();
                        switch(select1){
                         
                        case 1:
                             restuarant.as();
                             break;
                 
                        case 2:
                              restuarant.print();
                              restuarant.EditFood();
                              break;
                              
                         case 3:
                              restuarant.print();
                              restuarant.DeleteFood();
                              break;     
                              
                          case 4:
                              restuarant.PrintOrder();                   
                              break;    
                              
                          
                              
                           case 5:
                               restuarant.print();
                               break;
                               
                           case 0:
                              System.out.println("Back");
                              break;   

                          default:
                                break;
            }
        }while (select1 !=0);
                break;
                
                
                case 3:
                    int select2;
                do
                {
                    Customerorder();
                    select2=scr.nextInt();
                    switch(select2)
                    {
                        case 1:
                            restuarant.print();
                            break;
                            
                        case 2:
                            restuarant.Price();
                            break;
                            
                        case 3:
                            System.out.println("Enter your serial number");
                            scr.nextLine();
                            String ss=scr.nextLine();
                            restuarant.showstatus(ss);
                            break;
                            
                        case 0:
                            System.out.println("Back");
                            break; 
                            
                        default:
                            break;
                    }
                }while (select2 !=0);
                break;
                
                default:
                    break;
            }
            
    }while(select !=5);
    
}
          
    public static void MenuRestuarant()
    {
        System.out.println("---Menu Restuarant---");
        System.out.println("0. Back to menu main");
        System.out.println("1. Add food");
        System.out.println("2. Edit food");
        System.out.println("3. Delete food");
        System.out.println("4. Print Customer Serial Number");
        //System.out.println("5. Set Order Status");
        System.out.println("5. Show all food");
        System.out.println("--------");
        System.out.println("Select");
     }
    
    static void Menumain()
    {
        System.out.println("---Menu Main---");
        System.out.println("1. Admin");
        System.out.println("2. Restuarant");
        System.out.println("3. Customer");
        System.out.println("4. Rider");
        System.out.println("5. Exit");
    }

    static void Customerorder() 
    {
        System.out.println("---Customer Service");
        System.out.println("0.Back");
        System.out.println("1.Show all food");
        System.out.println("2.Order now");
        System.out.println("3.Show Order Status");
    }
    
    static void rider()
    {
        System.out.println("---Rider Service");
        System.out.println("0.Back");
        System.out.println("1.Deliver Now");
        System.out.println("2.Order List");
        System.out.println("3.Rider Status");
        System.out.println("4.Confirm Delevery");

    }
    
    static void admin()
    {
        System.out.println("---Admin Service");
        System.out.println("0.Back");
        System.out.println("1.Add Rider");
        System.out.println("2.View All Riders");
        System.out.println("3.Delete Rider");
        System.out.println("4.Order List");
        System.out.println("5.Delevery Status");
        System.out.println("6.Delevered Orders");
    }
}
