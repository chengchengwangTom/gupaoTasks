package Creation.abstractFactory;

/**
 * <pre>
 *    @author : orange
 *    @e-mail : 495314527@qq.com
 *    @time   : 2018/9/28 17:17
 *    @desc   : 具体老师工厂类
 *    @version: 1.0
 * </pre>
 */
public class TeacherFactory implements ManFactory {

    @Override
    public Man getHuman(String type) {
        if ("dance".equals(type)) {
            return new DanceTeacher();
        } else if ("sing".equals(type)) {
            return new SingTeacher();
        } else {
            return null;
        }
    }
}
