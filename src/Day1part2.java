import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1part2 {
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

                for (int k=0;k<expenseReport.size();k++){
                    int sumThree = expenseReport.get(k);

                    if (sumOne + sumTwo + sumThree == 2020){
                        System.out.println(sumOne + " + " + sumTwo + " +" + sumThree + " These are the three numbers that equal 2020");
                        long multiBoth = (long) sumOne * sumTwo* sumThree;
                        System.out.println("The multiplication of those three is: " + multiBoth);

                    }
                    else continue;
                    return;

                }
            }

        }
    }
}
