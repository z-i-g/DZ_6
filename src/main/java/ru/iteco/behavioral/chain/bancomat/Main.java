package ru.iteco.behavioral.chain.bancomat;

import ru.iteco.behavioral.chain.bancomat.banknote.Banknote;
import ru.iteco.behavioral.chain.bancomat.banknote.CurrencyType;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        Bancomat bancomat = new Bancomat();
        Banknote banknote = new Banknote(CurrencyType.USD, 100);

        System.out.println(bancomat.validate(banknote));

    }
}
