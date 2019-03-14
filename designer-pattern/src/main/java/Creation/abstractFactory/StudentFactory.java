package Creation.abstractFactory;

/**
 * <pre>
 *    @author : orange
 *    @e-mail : 495314527@qq.com
 *    @time   : 2018/9/28 17:19
 *    @desc   : 具体学生工厂类
 *    @version: 1.0
 * </pre>
 */
public class StudentFactory implements ManFactory {
    @Override
    public Man getHuman(String type) {
        if ("dance".equals(type)) {
            return new DanceStudent();
        } else if ("sing".equals(type)) {
            return new SingStudent();
        } else {
            return null;
        }
    }
}
