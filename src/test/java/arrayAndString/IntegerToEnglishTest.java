package arrayAndString;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class IntegerToEnglishTest {
    IntegerToEnglish inst = new IntegerToEnglish();
    @Test
    public void numberToWords() {
        String result = inst.numberToWords(12345);
        assertThat(result.toUpperCase(), is("Twelve Thousand Three Hundred Forty Five".toUpperCase()));
    }
    @Test
    public void numberToWords2() {
        String result = inst.numberToWords(10000);
        assertThat(result, is("Ten Thousand"));
    }

    @Test
    public void numberToWords3() {
        String result = inst.numberToWords(1000000);
        assertThat(result, is("One Million"));
    }
}