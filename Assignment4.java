package project4;
/**
 * @author Blas K
 */
public class Project4 {

    public static void main(String[] args) {
        StudentClass person1 = new StudentClass();
        person1.set_name("Alice");
        person1.set_age(17);
        person1.set_gpa(85);
        
        StudentClass person2 = new StudentClass();
        person2.set_name("Adam");
        person2.set_age(3);
        person2.set_gpa(105);
        
        StudentClass person3 = new StudentClass();
        person3.set_name("Michael");
        person3.set_age(-18);
        person3.set_gpa(40);
        
        System.out.println(" ");
        
        person1.Display_info();
        person2.Display_info();
        person3.Display_info();
    }
    
}