import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day5part1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("TextFileHolder/Day5input.txt"));
        ArrayList<String> ticket = new ArrayList<>();
        int trueMax = 0;

        while (scan.hasNextLine()) {
            ticket.add(scan.nextLine());
        }

        for (String ticketID : ticket) {


            String replacedTicketID = ticketID.replace('F', '0').replace('B', '1')
                    .replace('R', '1').replace('L', '0');
                                                         //radix is used to convert the Binary to an Int
            int curMax = Integer.parseInt(replacedTicketID, 2);

            if (curMax > trueMax){
                trueMax = curMax;
            }
        }

        System.out.println("The biggest seat ID is: " + trueMax);

    }
}
