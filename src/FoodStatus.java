public class FoodStatus
{
    public String Customerserial="";
    public String foodCode="";
    public String status="Preparing";

    //Constructor
    public FoodStatus(String customerSerial, String status,String foodCode){
        this.Customerserial=customerSerial;
        this.status=status;
        this.foodCode = foodCode;
    }

    public String getCustomerserial(){
        return this.Customerserial;
    }

    public void setStatus(String s){
        this.status = s;
    }

    public String getStatus(){
        return this.status;
    }

    public String getfoodCode(){
        return this.foodCode;
    }  
     
}