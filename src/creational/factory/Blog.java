package creational.factory;

/**
 * Created by mahady on 03/05/16.
 */
public class Blog extends Website {


    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
