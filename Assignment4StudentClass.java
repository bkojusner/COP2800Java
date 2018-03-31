package project4;
/**
 *
 * @author Blas K
 */
public class StudentClass {    
    private String name;
    private int age;
    private int gpa;
      
    void set_name(String name1){
        name = name1;
    }
    
    void set_age(int age1){
        if(age1 >= 16 && age1 <= 20){
            age = age1;
        }
        else{
            System.out.println("this age is out of range");
            age = 16;
        }
    }
    
    void set_gpa(int gpa1){
        if(gpa1 >= 50 && gpa1 <= 100){
            gpa = gpa1;
        }
        else{
            System.out.println("this gpa is out of range");
            gpa = 80;
        }
    }
    
    void Display_info(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }
}