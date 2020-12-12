import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Day5part2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("TextFileHolder/Day5input.txt"));
        ArrayList<String> ticket = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        //trueMax is 996
        //the missing seat is 671
        int trueMax = 0;

        while (scan.hasNextLine()) {
            ticket.add(scan.nextLine());
        }

        for (String ticketID : ticket) {

            String replacedTicketID = ticketID.replace('F', '0').replace('B', '1')
                    .replace('R', '1').replace('L', '0');
            //radix is used to convert the Binary to an Int
            int seatNumID = Integer.parseInt(replacedTicketID, 2);

            for (int i = 0; i < 996; i++) {
                map.put(seatNumID, 1);
            }
        }

        for (int j = 0; j < map.size(); j++) {
            if (!map.containsKey(j)&&j>20) {
                System.out.println("This should be missing from the list: " + j);
            }
        }

    }
}
