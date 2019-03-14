package Creation.factory;

/**
 * <pre>
 *    @author : orange
 *    @e-mail : 495314527@qq.com
 *    @time   : 2019/3/14 22:13
 *    @desc   :
 *    @version: 1.0
 * </pre>
 */
public class BenzFactory implements Factory {
    @Override
    public Car createCar() {
        return new Bmw();
    }
}
