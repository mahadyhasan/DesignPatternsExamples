package creational.singleton;

/**
 * Created by mahady on 02/05/16.
 */
public class SingletonEveryDayDemo {

    public static void main(String[] args) {

        Runtime singletonRuntime = Runtime.getRuntime();
        System.out.println(singletonRuntime);

        Runtime anotherInstance = Runtime.getRuntime();
        System.out.println(anotherInstance);


        if (singletonRuntime == anotherInstance) {
            System.out.println("They are the same instance!");
        }
    }


}
