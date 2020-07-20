package arrayAndString;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        boolean isOverflow = true;
        for(int i = digits.length - 1; i >= 0; i --) {
            if(digits[i] + (isOverflow ? 1 : 0 ) == 10) {
                digits[i] = 0;
                isOverflow = true;
            }
            else {
                digits[i] += (isOverflow ? 1 : 0 );
                isOverflow = false;
            }
        }
        if(isOverflow) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            for(int i = 1; i < digits.length; i ++) {
                newDigits[i + 1] = digits[i];
            }
            digits = newDigits;
        }
        return digits;
    }
}
