import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1part1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("TextFileHolder/Day1input.txt"));

        ArrayList<Integer> expenseReport = new ArrayList<>();

        while(scan.hasNext()){
//            System.out.println(scan.nextLine());
           expenseReport.add(Integer.parseInt(scan.nextLine()));
        }

        for(int i =0; i<expenseReport.size(); i++){
//            System.out.println(expenseReport.get(i));

            int sumOne = expenseReport.get(i);

            for( int j=0;j<expenseReport.size();j++){
                int sumTwo = expenseReport.get(j);

                if (sumOne + sumTwo == 2020){
                    System.out.println(sumOne + " + " + sumTwo + " These are the two numbers that equal 2020");
                    int multiBoth = sumOne * sumTwo;
                    System.out.println("The multiplication of both is: " + multiBoth);

                }
                else continue;
                return;
            }

        }
    }
}
