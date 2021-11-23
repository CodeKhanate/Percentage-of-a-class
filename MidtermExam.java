package midtermexam;

import java.util.Scanner;

public class MidtermExam {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
      float males;
      float females;
      int NumOfStudent = 53;
      float formulaMales, formulaFemales;

      System.out.print("Enter the number of males: ");
      males = input.nextFloat();
      
      System.out.print("Enter the number of Females: ");
      females = input.nextFloat();
      
      formulaMales = males / NumOfStudent * 100;
      formulaFemales = females / NumOfStudent * 100;
      
      System.out.println("Number of Students = " + NumOfStudent);
      System.out.println("males = " + Math.round(formulaMales * 100.0) / 100.0 + "%");
      System.out.println("females = " + Math.round(formulaFemales * 100.0) / 100.0 + "%");
    }
    
}
