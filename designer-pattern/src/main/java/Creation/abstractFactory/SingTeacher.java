package Creation.abstractFactory;

/**
 * <pre>
 *    @author : orange
 *    @e-mail : 495314527@qq.com
 *    @time   : 2018/9/28 17:33
 *    @desc   : 会唱歌的老师
 *    @version: 1.0
 * </pre>
 */
public class SingTeacher implements Man {
    @Override
    public void say() {
        System.out.println("SingTeacher...");
    }
}
