package creational.abstractfactory;

import javax.smartcardio.Card;

/**
 * Created by mahady on 03/05/16.
 */

//AbstractFactory
public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore) {

        if (creditScore > 650) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }

    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
