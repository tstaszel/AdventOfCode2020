import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day4part2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("TextFileHolder/Day4input.txt"));
        int validPassports = 0;

        StringBuilder passports = new StringBuilder();
        while (scan.hasNext()) {
            passports.append(scan.nextLine()).append("\n");
        }
        //attempting Regex style of pattern matching
        Pattern byr = Pattern.compile("byr:(19[2-9][0-9]|200[0-2])", Pattern.CASE_INSENSITIVE);
        Pattern iyr = Pattern.compile("iyr:20(1[0-9]|20)", Pattern.CASE_INSENSITIVE);
        Pattern eyr = Pattern.compile("eyr:20(2[0-9]|30)", Pattern.CASE_INSENSITIVE);
        Pattern hgt = Pattern.compile("hgt:((59|6[0-9]|7[0-6])in|1([5-8][0-9]|9[0-3])cm)", Pattern.CASE_INSENSITIVE);
        Pattern hcl = Pattern.compile("hcl:#[0-9a-f]{6}", Pattern.CASE_INSENSITIVE);
        Pattern ecl = Pattern.compile("ecl:(amb|blu|brn|gry|grn|hzl|oth)", Pattern.CASE_INSENSITIVE);
        Pattern pid = Pattern.compile("pid:[0-9]{9}", Pattern.CASE_INSENSITIVE);


        for (String pass : passports.toString().split("\n\n")) {
            var newPass = pass.replace("\n", " ");


            if (patternMatch(byr, newPass) && patternMatch(iyr, newPass) && patternMatch(eyr, newPass) &&
                    patternMatch(hgt, newPass) && patternMatch(hcl, newPass) && patternMatch(ecl, newPass) &&
                    patternMatch(pid, newPass)) {
                validPassports++;
            }

        }
        System.out.println("The number of Valid Passports is: " + validPassports);

    }


    public static boolean patternMatch(Pattern pat, String string) {
        return pat.matcher(string).find();
    }
}
