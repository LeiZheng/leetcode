package amazon.arrayAndString;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ProductofArrayExceptSelfTest {
    ProductofArrayExceptSelf inst = new ProductofArrayExceptSelf();
    @Test
    public void productExceptSelf() {
        int[] ret = inst.productExceptSelf(new int[] {1,2,3,4});
        assertThat(ret, is(new int[]{24,12,8,6}));;
    }
}