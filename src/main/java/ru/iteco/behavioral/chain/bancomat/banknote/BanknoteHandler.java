package ru.iteco.behavioral.chain.bancomat.banknote;

/**
 * BanknoteHandler.
 *
 * @author Ilya_Sukhachev
 */
public abstract class BanknoteHandler {

    private BanknoteHandler nextHandler;

    protected BanknoteHandler(BanknoteHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public boolean validate(Banknote banknote) {
        return nextHandler != null && nextHandler.validate(banknote);
    }

    public void cashe(Banknote banknote) {
        if (nextHandler != null) {
            nextHandler.cashe(banknote);
        }
    }
}
