import java.util.Scanner;

public class Splitter {

    public Holder split(){

        Scanner scanner = new Scanner(System.in);

        String inputExample = scanner.nextLine();
        char[] exampleChars = inputExample.toCharArray();

        String[] nums = inputExample.split("[*/+-]");

        char[] operations = new char[(nums.length)-1];
        int operationIndex = 0;

        //splitting operators from another input and putting them to array
        for (char exampleChar : exampleChars) {
            if (exampleChar == '+' || exampleChar == '-' || exampleChar == '*' || exampleChar == '/') {
                operations[operationIndex] = exampleChar;
                operationIndex++;
            }
        }
    return new Holder(nums, operations);
    }




}
