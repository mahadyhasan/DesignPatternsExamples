package creational.singleton;

/**
 * Created by mahady on 02/05/16.
 */
public class DBSingleton {

    private static DBSingleton instance = null;

    /**
     * we are the only people that can create
     * an instance of this object
     */
    private DBSingleton() {

    }

    /**
     * Lazily loaded
     *
     * @return
     */
    public static DBSingleton getInstance() {
        if (instance == null) { //if not null then just return the instance we don't care if thread safe or not
            synchronized (DBSingleton.class) {
                if (instance == null)
                    instance = new DBSingleton();
            }
        }
        return instance;
    }


}
