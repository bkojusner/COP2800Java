package project.pkg2;

/**
 *
 * @author Blas K
 */
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arrayOne = new int[10];
        int i = 0;
        while (i >= 0 && i < arrayOne.length){
            arrayOne[i] = (int)(Math.random() * 100);
            i++;
        }
        for(int x = 0; x < arrayOne.length; x++){
            System.out.println("Value of index " + x + " is " + arrayOne[x]);
        }
        int count = 0;
        for(int numOne = 0; numOne < arrayOne.length; numOne++){
            if (arrayOne[numOne] >= 40 && arrayOne[numOne] <= 70){
                count = count + 1;
            }
        }
        System.out.println("We have " + count + " numbers between 40 and 70");
    }
    
}
