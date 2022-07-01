import org.apache.commons.lang3.StringUtils;

import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Something:");
        String userInput = scanner.nextLine();
        System.out.println("You entered: "+ userInput);
        String reversedStatement = StringUtils.reverse(userInput);

        if( StringUtils.isNumeric(userInput)){
            System.out.println(userInput+" is a number");
        } else System.out.println(" is not a number");

        if (StringUtils.isAllUpperCase(userInput)) {
            System.out.println(StringUtils.lowerCase(userInput));
            String lowCase= StringUtils.lowerCase(userInput);
            System.out.println(lowCase + " has been turned to lowerCase");

        } else
            System.out.printf(StringUtils.upperCase(userInput+  " has been turned to UPPERCASE"));







    }
    }
