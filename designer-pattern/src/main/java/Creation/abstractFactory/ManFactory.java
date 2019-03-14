package Creation.abstractFactory;

/**
 * <pre>
 *    @author : orange
 *    @e-mail : 495314527@qq.com
 *    @time   : 2018/9/28 17:15
 *    @desc   : 抽象工厂接口
 *    @version: 1.0
 * </pre>
 */
public interface ManFactory {

    Man getHuman(String type);
}
