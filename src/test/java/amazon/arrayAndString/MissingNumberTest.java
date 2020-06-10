package amazon.arrayAndString;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MissingNumberTest {
    MissingNumber inst = new MissingNumber();
    @Test
    public void missingNumber() {
        int missingOne = inst.missingNumber(new int[]{9,6,4,2,3,5,7,0,1});
        assertThat(missingOne, is(8));
    }
}