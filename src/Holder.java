
public class Holder {
    private String[] nums;
    private char[] operations;



    public Holder(String[] nums, char[] operations) {
        this.nums = nums;
        this.operations = operations;
    }

    public String[] getNums() {
        return nums;
    }

    public void setNums(String[] nums) {
        this.nums = nums;
    }

    public char[] getOperations() {
        return operations;
    }

    public void setOperations(char[] operations) {
        this.operations = operations;
    }
}
