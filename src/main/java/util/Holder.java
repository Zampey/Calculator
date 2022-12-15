package util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Holder {
    private String[] nums;
    private char[] operations;

    public Holder(String[] nums, char[] operations) {
        this.nums = nums;
        this.operations = operations;
    }
}
