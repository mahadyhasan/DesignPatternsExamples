package creational.abstractfactory;

/**
 * Created by mahady on 03/05/16.
 */
public class VisaFactory extends CreditCardFactory {


    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldCreditCard();

            case PLATINUM:
                return new VisaBlackCreditCard();
        }

        return null;

    }

    @Override
    public Validator getValidator(CardType cardType) {
        return new VisaValidator();
    }

}
