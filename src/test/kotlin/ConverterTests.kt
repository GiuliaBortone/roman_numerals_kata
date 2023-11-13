import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ConverterTests {
    private val converter = Converter()

    @Test
    fun `number 1 should equal roman number I`() {
        assertThat(converter.convertFromArabicToRoman(1)).isEqualTo("I")
    }

    @Test
    fun `number 2 should equal roman number II`() {
        assertThat(converter.convertFromArabicToRoman(2)).isEqualTo("II")
    }

    @Test
    fun `number 3 should equal roman number III`() {
        assertThat(converter.convertFromArabicToRoman(3)).isEqualTo("III")
    }

    @Test
    fun `number 30 should equal roman number XXX`() {
        assertThat(converter.convertFromArabicToRoman(30)).isEqualTo("XXX")
    }

    @Test
    fun `number 33 should equal roman number XXXIII`() {
        assertThat(converter.convertFromArabicToRoman(33)).isEqualTo("XXXIII")
    }

    @Test
    fun `number 3425 should equal roman number MMMCDXXV`() {
        assertThat(converter.convertFromArabicToRoman(3425)).isEqualTo("MMMCDXXV")
    }
}