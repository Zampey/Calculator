import util.Holder;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Frame frame = new Frame(20);
        Splitter splitter = new Splitter();
        Holder output = splitter.split();

        String[] nums = output.getNums();
        char[] operations = output.getOperations();

        //parsování stringu na floaty
        Float[] numsAsFloat = Arrays.stream(nums).map(Float::valueOf).toArray(Float[]::new);

        float valueHolder = numsAsFloat[0];
        for (int i = 0; i < operations.length;i++){
            int helper = i;
            if (operations.length - i >= 1) helper++;
            switch (operations[i]){
                case '+' -> valueHolder += numsAsFloat[helper];
                case '-' -> valueHolder -= numsAsFloat[helper];
                case '*' -> valueHolder *= numsAsFloat[helper];
                case '/' -> valueHolder /= numsAsFloat[helper];
            }
        }
        System.out.print(valueHolder);


        //--- GUI --- //
        //Frame frame = new Frame(valueHolder);
    }
}
