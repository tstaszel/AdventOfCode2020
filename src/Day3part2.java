import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day3part2 {
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
        int treesObtained1 = TreeCounter(1, 1, totalPath);
        int treesObtained2 = TreeCounter(3, 1, totalPath);
        int treesObtained3 = TreeCounter(5, 1, totalPath);
        int treesObtained4 = TreeCounter(7, 1, totalPath);
        int treesObtained5 = TreeCounter(1, 2, totalPath);
        long totalTreesHit = (long) treesObtained1 * (long) treesObtained2 * (long) treesObtained3 * (long) treesObtained4 * (long) treesObtained5;
        System.out.println(treesObtained1);
        System.out.println(treesObtained2);
        System.out.println(treesObtained3);
        System.out.println(treesObtained4);
        System.out.println(treesObtained5);

        System.out.println("The number of trees hit is: " + totalTreesHit);
    }

    public static int TreeCounter(int right, int down, ArrayList<String> totalPath) {
        int treesHit = 0;
        int height = totalPath.size();
        //there are 31 chars
        int width = totalPath.get(0).length();

        for (int i = down, j = right; i < totalPath.size(); i += down, j += right) {
            //the current point that I am at
            char currPoint = totalPath.get(i).charAt((i * width+j) % width);
            //if it is the 'tree' tally up
            if (currPoint == '#') {
                treesHit++;
            }
        }

        return treesHit;
    }

}
