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
        float[] subtotal = new float[operations.length];
        float[] subtotalB = new float[operations.length];
        int counter = 0;

        for (int j = 0; j <operations.length; j++){

            if (operations[j] == '*' || operations[j] == '/'){
                switch (operations[j]){
                    case '*' -> subtotal[j] = numsAsFloat[j] * numsAsFloat[j+1];
                    case '/' -> subtotal[j] = numsAsFloat[j] / numsAsFloat[j+1];
                }
                subtotalB[counter] = subtotal[j];
                counter++;
            }
            subtotalB[counter] = numsAsFloat[j];
            counter++;

            System.out.println(subtotalB[j]);
        }


        for (int i = 0; i < operations.length; i++) {

            int ioobFixer = i;
            char operator = operations[i];

            if ((nums.length - i) > 1) ioobFixer++;

                switch (operator) {
                    case '+' -> calculated += numsAsFloat[ioobFixer];
                    case '-' -> calculated -= numsAsFloat[ioobFixer];
                    case '*', '/' -> calculated += subtotal[i];

                }

            System.out.print(calculated + ", ");
        }
        System.out.println();
        System.out.println(calculated);
        System.out.println();


    }
}
