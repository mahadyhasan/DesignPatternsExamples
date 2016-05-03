package creational.singleton;

/**
 * Created by mahady on 02/05/16.
 */
public class DBSingletonDemo {

    public static void main(String[] args) {
        long timebefore = 0;
        long timeafter = 0;

        timebefore = System.currentTimeMillis();
        DBSingleton instance = DBSingleton.getInstance();
        timeafter = System.currentTimeMillis();
        System.out.println(instance);
        System.out.println(timeafter - timebefore);



        timebefore = System.currentTimeMillis();
        DBSingleton anotherInstance = DBSingleton.getInstance(); //receives the same instance
        timeafter = System.currentTimeMillis();
        System.out.println(anotherInstance);
        System.out.println(timeafter - timebefore);
    }
}
