package application5;
/**
 *
 * @author Blas K
 */
public class Application5 {
    public static void main(String[] args) {
        CreditCardClass[] ccclass_array = new CreditCardClass[4];
        for(int i=0; i<ccclass_array.length; i++){
            ccclass_array[i] = new CreditCardClass();
        }
        
        ccclass_array[0].set_name("Card");
        ccclass_array[0].set_number("123");
        ccclass_array[0].set_type("VIS");
       
        ccclass_array[1].set_name("Card2_holder");
        ccclass_array[1].set_number("872-192");
        ccclass_array[1].set_type("MASTER");
       
        ccclass_array[2].set_name("");
        ccclass_array[2].set_number("879-211");
        ccclass_array[2].set_type("VISA");
       
        ccclass_array[3].set_name("Card4_holder_COP");
        ccclass_array[3].set_number("234-632");
        ccclass_array[3].set_type("");
        
        for(int i=0;i<ccclass_array.length;i++){
            System.out.println("Card" + (i+1));
            ccclass_array[i].Display_info();
        }
              
    }
    
}
