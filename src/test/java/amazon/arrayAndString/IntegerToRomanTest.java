package amazon.arrayAndString;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class IntegerToRomanTest {
    IntegerToRoman inst = new IntegerToRoman();
    @Test
    public void intToRoman1() {
        assertThat(inst.intToRoman(1994), is("MCMXCIV"));
    }
    @Test
    public void intToRoman2() {
        assertThat(inst.intToRoman(58), is("LVIII"));
    }
    @Test
    public void intToRoman3() {
        assertThat(inst.intToRoman(9), is("IX"));
    }
    @Test
    public void intToRoman4() {
        assertThat(inst.intToRoman(3), is("III"));
    }

}