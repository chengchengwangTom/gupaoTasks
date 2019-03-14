package Creation.factory;

/**
 * <pre>
 *    @author : orange
 *    @e-mail : 495314527@qq.com
 *    @time   : 2019/3/14 22:18
 *    @desc   :
 *    @version: 1.0
 * </pre>
 */
public class Client {

    public static void main(String[] args){
        Factory benzFactory = new BenzFactory();
        Car car = benzFactory.createCar();
        car.run();
        Factory bmwFactory = new BmwFactory();
        Car car1 = bmwFactory.createCar();
        car1.run();
    }
}
