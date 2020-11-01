package ru.iteco.behavioral.chain.bancomat.ruble;

import ru.iteco.behavioral.chain.bancomat.banknote.Banknote;
import ru.iteco.behavioral.chain.bancomat.banknote.BanknoteHandler;
import ru.iteco.behavioral.chain.bancomat.banknote.CurrencyType;

public abstract class RubleHandlerBase extends BanknoteHandler {

    private CurrencyType type = CurrencyType.RUB;

    protected RubleHandlerBase(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean validate(Banknote banknote) {
        if (banknote.getCurrency().equals(type) && banknote.getValue().equals(getValue())) {
            return true;
        }
        return super.validate(banknote);
    }

    @Override
    public void cashe(Banknote banknote) {
        if (banknote.getCurrency().equals(type) && banknote.getValue() % getValue() == 0) {
            System.out.println();
        }
        super.cashe(banknote);
    }

    protected abstract int getValue();
}
