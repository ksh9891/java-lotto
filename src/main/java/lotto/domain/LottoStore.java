package lotto.domain;

public class LottoStore {
    public static final int LOTTO_PURCHASE_AMOUNT = 1000;

    public LottoBundle purchase(final Money money) {
        return LottoBundle.issues(money.getMoney() / LOTTO_PURCHASE_AMOUNT);
    }
}
