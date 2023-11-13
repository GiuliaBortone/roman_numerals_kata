class Converter {
    private val unitsMap =
        mapOf(0 to "", 1 to "I", 2 to "II", 3 to "III", 4 to "IV", 5 to "V", 6 to "VI", 7 to "VII", 8 to "VIII", 9 to "IX")
    private val tensMap = mapOf(
        10 to "X",
        20 to "XX",
        30 to "XXX",
        40 to "XL",
        50 to "L",
        60 to "LX",
        70 to "LXX",
        80 to "LXXX",
        90 to "XC"
    )
    private val hundredsMap = mapOf(
        100 to "C",
        200 to "CC",
        300 to "CCC",
        400 to "CD",
        500 to "D",
        600 to "DC",
        700 to "DCC",
        800 to "DCCC",
        900 to "CM"
    )
    private val thousandsMap = mapOf(1000 to "M", 2000 to "MM", 3000 to "MMM")


    fun convertFromArabicToRoman(arabicNumber: Int): String {
        val currentRomanNumber = ""
        return convertRecursively(arabicNumber, currentRomanNumber)
    }


    fun convertRecursively(arabicNumber: Int, oldRomanNumber: String): String {
        return if (arabicNumber / 1000 != 0) {
            convertRecursively(arabicNumber % 1000, divisibleByThousand(arabicNumber, oldRomanNumber))
        } else if (arabicNumber / 100 != 0) {
            convertRecursively(arabicNumber % 100, divisibleByHundred(arabicNumber, oldRomanNumber))
        } else if (arabicNumber / 10 != 0) {
            convertRecursively(arabicNumber % 10, divisibleByTens(arabicNumber, oldRomanNumber))
        } else {
            oldRomanNumber + unitsMap[arabicNumber]
        }
    }

    private fun divisibleByThousand(arabicNumber: Int, oldRomanNumber: String): String {
        return oldRomanNumber + thousandsMap[arabicNumber / 1000 * 1000]
    }

    private fun divisibleByHundred(arabicNumber: Int, oldRomanNumber: String): String {
        return oldRomanNumber + hundredsMap[arabicNumber / 100 * 100]
    }

    private fun divisibleByTens(arabicNumber: Int, oldRomanNumber: String): String {
        return oldRomanNumber + tensMap[arabicNumber / 10 * 10]
    }
}
