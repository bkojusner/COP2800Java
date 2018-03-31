package assignmentnum3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @authors Zach & Blas
 */
public class AssignmentNum3 {
    public static void main(String[] args) {
        
        try{
            File textinput = new File ("C:/InputFile.txt");
            ArrayList <String> numbers;
            try (Scanner sc = new Scanner (textinput)) {
                numbers = new ArrayList<>();
                while (sc.hasNextLine()) {
                    String fileInputLine = sc.nextLine();
                    numbers.add(fileInputLine);
                }               
            }
                        
            try (PrintWriter writer = new PrintWriter ("C:/output.txt")) {               
                int total = countNumbersInFile(numbers);
                int max = maximumInFile(numbers);
                int min = minimumInFile(numbers);
                double avg = averageInFile(numbers);
                
                writer.println("Counter: "+ total + " numbers");
                writer.println("Maximum Value: "+ max);
                writer.println("Minimum Value: "+ min);
                writer.println("Average Value: "+ avg);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("ERROR");
        }
    }   
    public static int countNumbersInFile(ArrayList<String> NumFile){       
        return NumFile.size();       
    }
    public static int maximumInFile (ArrayList<String> NumFile){        
        int maxList = Integer.parseInt(NumFile.get(0));
        for (int i=1; i<NumFile.size(); i++){
            int num = Integer.parseInt(NumFile.get(i));
            if (num > maxList){
                maxList = num;
            }
        }
        return maxList;
    }
    public static int minimumInFile (ArrayList<String> NumFile){
        int minList =Integer.parseInt(NumFile.get(0));
        for (int i=1; i<NumFile.size(); i++){
            int num = Integer.parseInt(NumFile.get(i));
            if (minList > num){
                minList = num;
            }
        }
        return minList;
    }
    public static double averageInFile (ArrayList<String> NumFile){
        double sum = 0;
        for (int i=0; i<NumFile.size(); i++){
            int num = Integer.parseInt(NumFile.get(i));
            sum = sum + num;
        }
        double avgNum = sum/NumFile.size();
        return avgNum;
    }
}
