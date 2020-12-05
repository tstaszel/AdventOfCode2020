import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day2part2 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scan = new Scanner(new File("TextFileHolder/Day2input.txt"));
        ArrayList<String> passwords = new ArrayList<>();
        int validPasswords = 0;

        while(scan.hasNext()){
            passwords.add(scan.nextLine());
        }

        for (String word: passwords) {
            String[] passwordArray = word.split(" ");
            String[] limiters = passwordArray[0].split("-");
            char neededChar = passwordArray[1].charAt(0);
            String password = passwordArray[2];

            int minLimit = Integer.parseInt(limiters[0]);
            int maxLimit = Integer.parseInt(limiters[1]);

                if (password.charAt(minLimit-1) == neededChar ^ password.charAt(maxLimit-1) == neededChar) {
                    validPasswords++;
                }


        }
        System.out.println("The number of Valid Passwords is: " + validPasswords);

    }
}
