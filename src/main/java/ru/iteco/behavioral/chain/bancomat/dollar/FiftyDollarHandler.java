package ru.iteco.behavioral.chain.bancomat.dollar;

import ru.iteco.behavioral.chain.bancomat.banknote.BanknoteHandler;

/**
 * HundredDollarHandler.
 *
 * @author Ilya_Sukhachev
 */
public class FiftyDollarHandler extends DollarHandlerBase {

    protected String value = "50";

    public FiftyDollarHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected String getValue() {
        return value;
    }
}
