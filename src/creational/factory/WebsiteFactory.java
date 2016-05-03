package creational.factory;

/**
 * Created by mahady on 03/05/16.
 */
public class WebsiteFactory {

    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG: {
                return new Blog();
            }

            case SHOP: {
                return new Shop();
            }


            default: {
                return null;
            }
        }
    }
}
