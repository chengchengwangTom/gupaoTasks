package Creation.abstractFactory;

/**
 * <pre>
 *    @author : orange
 *    @e-mail : 495314527@qq.com
 *    @time   : 2018/9/28 17:34
 *    @desc   : 会跳舞的学生
 *    @version: 1.0
 * </pre>
 */
public class DanceStudent implements Man {
    @Override
    public void say() {
        System.out.println("DanceStudent...");
    }
}
