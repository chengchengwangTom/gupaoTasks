package Creation.abstractFactory;

/**
 * <pre>
 *    @author : orange
 *    @e-mail : 495314527@qq.com
 *    @time   : 2018/9/28 17:35
 *    @desc   : 会唱歌的学生
 *    @version: 1.0
 * </pre>
 */
public class SingStudent implements Man {
    @Override
    public void say() {
        System.out.println("singStudent...");
    }
}
