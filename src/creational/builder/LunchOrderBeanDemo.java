package creational.builder;

/**
 * Created by mahady on 02/05/16.
 */
public class LunchOrderBeanDemo {


    public static void main(String[] args) {
        LunchOrderBean lunchOrderBean = new LunchOrderBean();

        LunchOrderTele lunchOrderTele = new LunchOrderTele("Wheat", "Lettuce", "Mustard", "Chickent");
//
//        lunchOrderBean.setBread("Wheat");
//        lunchOrderBean.setCondiments("Lettuce");
//        lunchOrderBean.setDressing("Mustard");
//        lunchOrderBean.setMeat("Chicken");

        System.out.println(lunchOrderTele.getBread());
        System.out.println(lunchOrderTele.getCondiments());
        System.out.println(lunchOrderTele.getDressing());
        System.out.println(lunchOrderTele.getMeat());
    }

}
