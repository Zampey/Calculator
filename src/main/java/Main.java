import util.Holder;

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

        float calculated = numsAsFloat[0];
        for (int i = 0; i < operations.length;i++){
            int helper = i;
            if (operations.length - i >= 1) helper++;

            switch (operations[i]){
                case '+' -> calculated += numsAsFloat[helper];
                case '-' -> calculated -= numsAsFloat[helper];
                case '*' -> calculated *= numsAsFloat[helper];
                case '/' -> calculated /= numsAsFloat[helper];
            }
        }
        System.out.print(calculated);


        //--- GUI --- //
        Frame frame = new Frame(calculated);
    }
}
