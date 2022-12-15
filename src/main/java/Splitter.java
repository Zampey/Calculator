import util.Holder;

import java.util.Scanner;

public class Splitter {

    public Holder split(){
        Scanner scanner = new Scanner(System.in);

        String inputExample = scanner.nextLine();
        char[] exampleChars = inputExample.toCharArray();
        String[] nums = inputExample.split("[*/+-]");
        char[] operations = new char[(nums.length)-1];

        //splitting operators from another input and putting them to array
        int operationIndex = 0;
        for (char exampleChar : exampleChars) {
            if (exampleChar == '+' || exampleChar == '-' || exampleChar == '*' || exampleChar == '/') {
                operations[operationIndex] = exampleChar;
                operationIndex++;
            }
        }
    return new Holder(nums, operations);
    }
}
