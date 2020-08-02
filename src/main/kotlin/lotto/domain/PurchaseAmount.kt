package lotto.domain

const val LOTTO_TICKET_PRICE = 1000;

data class PurchaseAmount(val purchasePrice: Int) {
    fun isUnderCountOfLottoTicket(size: Int): Boolean {
        return size < countOfLottoTicket()
    }

    private fun countOfLottoTicket(): Int {
        return purchasePrice / LOTTO_TICKET_PRICE
    }
}
