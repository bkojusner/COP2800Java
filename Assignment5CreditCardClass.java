package application5;
import java.text.NumberFormat;
/**
 *
 * @author Blas K
 */
public class CreditCardClass {
    
    private String name;
    private String number;
    private String type;
    int pin;
    
    CreditCardClass(){
        name = "Card-Name";
        number = "87x-yyy";
        type = "VISA";
        pin = 000;
    }
    
    void set_name (String new_name){
        if(new_name.length() > 7 && new_name.length() < 15){
            name = new_name;
        }        
    }
    String get_name (){
        return name;
    }
    
    void set_number (String number1){
        if(number1.length() == 7 && number1.startsWith("87")){
            number = number1;            
        }
        if(!number.endsWith("yyy")){
            String[] splitString = number.split("-");
            String end = splitString[1];
            int finalNum = Integer.parseInt(end);
            pin = finalNum;            
        }
    }
    String get_number (){
        return number;
    }
   
    void set_type (String type1){
        if("VISA".equals(type1) || "MASTER".equals(type1)){
            type = type1;
        }
    }
    String get_type (){
        return type;
    }
     
    void Display_info(){
        NumberFormat pinFormat = NumberFormat.getInstance();
        pinFormat.setMinimumIntegerDigits(3);
        
        System.out.println("Name: " + name);
        System.out.println("Number: " + number);
        System.out.println("Type: " + type);
        System.out.println("Pin: " + pinFormat.format(pin));
        System.out.println("");
    }  
}
