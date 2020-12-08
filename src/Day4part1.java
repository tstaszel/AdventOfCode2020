import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day4part1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("TextFileHolder/Day4input.txt"));
        int validPassports = 0;

        StringBuilder passports = new StringBuilder();
        while (scan.hasNext()) {
            passports.append(scan.nextLine()).append("\n");
        }

        for (String pass : passports.toString().split("\n\n")) {
            var newPass = pass.replace("\n", " ");
            if (newPass.contains("byr") && newPass.contains("iyr") && newPass.contains("eyr") && newPass.contains("hgt")
                    && newPass.contains("hcl") && newPass.contains("ecl") && newPass.contains("pid")) {
                validPassports++;
            }

        }

        System.out.println("The number of valid Passports is: " + validPassports);

    }
}
