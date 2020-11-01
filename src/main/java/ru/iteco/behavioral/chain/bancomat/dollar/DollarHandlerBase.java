package ru.iteco.behavioral.chain.bancomat.dollar;

import ru.iteco.behavioral.chain.bancomat.banknote.Banknote;
import ru.iteco.behavioral.chain.bancomat.banknote.BanknoteHandler;
import ru.iteco.behavioral.chain.bancomat.banknote.CurrencyType;

/**
 * TenRubleHandler.
 *
 * @author Ilya_Sukhachev
 */
public abstract class DollarHandlerBase extends BanknoteHandler {

    private final CurrencyType type = CurrencyType.USD;

    protected DollarHandlerBase(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean validate(Banknote banknote) {
        if (banknote.getCurrency().equals(type) && banknote.getValue().equals(getValue())) {
            return true;
        }
        return super.validate(banknote);
    }

    protected abstract String getValue();
}
