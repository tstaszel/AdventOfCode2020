import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day3part1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("TextFileHolder/Day3input.txt"));
        int treesHit = 0;
        ArrayList<String> totalPath = new ArrayList<>();
        while (scan.hasNext()) {
            totalPath.add(scan.nextLine());
        }

        int height = totalPath.size();
        //there are 31 chars
        int width = totalPath.get(0).length();

        for (int i = 0; i < totalPath.size(); i++) {
            //the current point that I am at
            char currPoint = totalPath.get(i).charAt((i * 3) % width);
            //if it is the 'tree' tally up
            if (currPoint == '#') {
                treesHit++;
            }
        }
        System.out.println("The number of trees hit is: " + treesHit);



    }
}
