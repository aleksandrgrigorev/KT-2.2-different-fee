import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun fee_card1_shouldAddFee() {
        //arrange
        val transactionThisMonth = 75600
        val cardType = 1
        val amount = 100

        //act
        val result = fee(
            transactionThisMonth = transactionThisMonth,
            amount = amount,
            cardType = cardType
        )

        //assert
        assertEquals("2000", result)
    }

    @Test
    fun fee_card1_shouldNotAddFee() {
        //arrange
        val transactionThisMonth = 74000
        val cardType = 1
        val amount = 100

        //act
        val result = fee(
            transactionThisMonth = transactionThisMonth,
            amount = amount,
            cardType = cardType
        )

        //assert
        assertEquals("0", result)
    }

    @Test
    fun fee_card2() {
        //arrange
        val transactionThisMonth = 75600
        val cardType = 2
        val amount = 100

        //act
        val result = fee(
            transactionThisMonth = transactionThisMonth,
            amount = amount,
            cardType = cardType
        )

        //assert
        assertEquals("0", result)
    }

    @Test
    fun fee_card3() {
        //arrange
        val transactionThisMonth = 75600
        val cardType = 3
        val amount = 100

        //act
        val result = fee(
            transactionThisMonth = transactionThisMonth,
            amount = amount,
            cardType = cardType
        )

        //assert
        assertEquals("0", result)
    }
}