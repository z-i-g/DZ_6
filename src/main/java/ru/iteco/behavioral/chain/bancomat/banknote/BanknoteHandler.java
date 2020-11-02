package ru.iteco.behavioral.chain.bancomat.banknote;

/**
 * BanknoteHandler.
 *
 * @author Ilya_Sukhachev
 */
public abstract class BanknoteHandler {

    private BanknoteHandler nextHandler;

    protected static StringBuilder cashe = new StringBuilder();

    protected BanknoteHandler(BanknoteHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public boolean validate(Banknote banknote) {

        if (banknote.getCurrency().equals(getType())) {
            return true;
        } else {
            return nextHandler != null && nextHandler.validate(banknote);
        }
    }

    public String cashe(Banknote banknote) {
        if (banknote.getCurrency().equals(getType())) {
            if (banknote.getValue() >= getValue() && banknote.getValue() % getValue() == 0) {
                return cashe.append(getValue() + "*" + banknote.getValue() / getValue()).toString();
            } else {
                cashe.append(getValue() + "*" + banknote.getValue() / getValue() + " + ");
                banknote.setValue(banknote.getValue() - banknote.getValue() / getValue() * getValue());
                return nextHandler != null ? nextHandler.cashe(banknote) : "Введенная сумма не валидна";
            }
        } else {
            return nextHandler != null ? nextHandler.cashe(banknote) : "Введенная сумма не валидна";
        }

    }

    protected abstract int getValue();

    protected abstract CurrencyType getType();
}
