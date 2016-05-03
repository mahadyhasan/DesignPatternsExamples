package creational.abstractfactory;

/**
 * Created by mahady on 03/05/16.
 */
public class AmexPlatinumValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
