import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Splitter splitter = new Splitter();
        Holder output = splitter.split();

        String[] nums = output.getNums();
        char[] operations = output.getOperations();

        float[] numsAsFloat = new float[nums.length];
        for (int j = 0; j < nums.length; j++) {
            numsAsFloat[j] = Float.parseFloat(nums[j]);
        }

        System.out.println(Arrays.toString(output.getNums()));
        System.out.println(Arrays.toString(output.getOperations()));


        float calculated = numsAsFloat[0];

        for (int i = 0; i < operations.length; i++) {
                char operator = operations[i];
                char nextOperator =operations[i+1];

            if ((nums.length - i) > 1) {



                switch (operator) {
                    case '+' -> calculated += numsAsFloat[i + 1];
                    case '-' -> calculated -= numsAsFloat[i + 1];
                    case '*' -> calculated *= numsAsFloat[i + 1];
                    case '/' -> calculated /= numsAsFloat[i + 1];

                }
            } else {

                switch (operator) {
                    case '+' -> calculated += numsAsFloat[i];
                    case '-' -> calculated -= numsAsFloat[i];
                    case '*' -> calculated *= numsAsFloat[i];
                    case '/' -> calculated /= numsAsFloat[i];
                }
            }

            System.out.println(calculated);
        }
    }
}
