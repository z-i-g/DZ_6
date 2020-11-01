package ru.iteco.behavioral.chain.bancomat.dollar;

import ru.iteco.behavioral.chain.bancomat.banknote.BanknoteHandler;

/**
 * HundredDollarHandler.
 *
 * @author Ilya_Sukhachev
 */
public class TenDollarHandler extends DollarHandlerBase {

    protected String value = "10";

    public TenDollarHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected String getValue() {
        return value;
    }
}
