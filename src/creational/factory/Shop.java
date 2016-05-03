package creational.factory;

/**
 * Created by mahady on 03/05/16.
 */
public class Shop extends Website {


    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
