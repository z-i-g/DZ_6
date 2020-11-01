package ru.iteco.behavioral.chain.bancomat;

import ru.iteco.behavioral.chain.bancomat.banknote.Banknote;
import ru.iteco.behavioral.chain.bancomat.banknote.BanknoteHandler;
import ru.iteco.behavioral.chain.bancomat.dollar.FiftyDollarHandler;
import ru.iteco.behavioral.chain.bancomat.dollar.TenDollarHandler;
import ru.iteco.behavioral.chain.bancomat.ruble.ThousandRubleHandler;

/**
 * Bancomat.
 *
 * @author Ilya_Sukhachev
 */
public class Bancomat {
    private BanknoteHandler handler;

    public Bancomat() {
        handler = new ThousandRubleHandler(null);
        handler = new TenDollarHandler(handler);
        handler = new FiftyDollarHandler(handler);
//        handler = new HundredDollarHandler(handler);
    }

    public boolean validate(Banknote banknote) {
        return handler.validate(banknote);
    }
}
