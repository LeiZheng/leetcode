package amazon.arrayAndString;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RomanToIntegerTest {
    RomanToInteger inst = new RomanToInteger();
    @Test
    public void intToRoman1() {
        assertThat(inst.intToRoman("MCMXCIV"), is(1994));
    }
    @Test
    public void intToRoman2() {
        assertThat(inst.intToRoman("III"), is(3));
    }
}