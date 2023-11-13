import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ConverterTests {
    @Test
    fun `number 1 should equal roman number I`() {
        val converter = Converter()
        assertThat(converter.convertFromArabicToRoman(1)).isEqualTo("I")
    }

    @Test
    fun `number 2 should equal roman number II`() {
        val converter = Converter();
        assertThat(converter.convertFromArabicToRoman(2)).isEqualTo("II")
    }
}