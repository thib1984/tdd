package test.tdd.conversion;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void shouldReturnIif1() {
        assertThat(Conversion.conversionArabeToRomain(1)).isEqualTo("I");
    }

    @Test
    public void shouldReturnIIif2() {
        assertThat(Conversion.conversionArabeToRomain(2)).isEqualTo("II");
    }

    @Test
    public void shouldReturnVIIIif8() {
        assertThat(Conversion.conversionArabeToRomain(8)).isEqualTo("VIII");
    }

    @Test
    public void shouldReturnIXif9() {
        assertThat(Conversion.conversionArabeToRomain(9)).isEqualTo("IX");
    }

    @Test
    public void shouldReturnXif10() {
        assertThat(Conversion.conversionArabeToRomain(10)).isEqualTo("X");
    }

    @Test
    public void shouldReturnXXif20() {
        assertThat(Conversion.conversionArabeToRomain(20)).isEqualTo("XX");
    }

    @Test
    public void shouldReturnXXXVif35() {
        assertThat(Conversion.conversionArabeToRomain(35)).isEqualTo("XXXV");
    }

    @Test
    public void shouldReturnCXXXVIIif137() {
        assertThat(Conversion.conversionArabeToRomain(137)).isEqualTo("CXXXVII");
    }

    @Test
    public void shouldReturnMif1000() {
        assertThat(Conversion.conversionArabeToRomain(1000)).isEqualTo("M");
    }

    @Test
    public void shouldReturnEmptyif0() {
        assertThat(Conversion.conversionArabeToRomain(0)).isEqualTo("");
    }

    @Test
    public void shouldReturnEmptyif5000() {
        assertThat(Conversion.conversionArabeToRomain(5000)).isEqualTo("");
    }

    @Test
    public void shouldReturnEmptyif7000() {
        assertThat(Conversion.conversionArabeToRomain(7000)).isEqualTo("");
    }

    @Test
    public void shouldReturnEmptyifMoinsUn() {
        assertThat(Conversion.conversionArabeToRomain(-1)).isEqualTo("");
    }

}
