package Creation.simpleFactory;



/**
 * <pre>
 *    @author : orange
 *    @e-mail : 495314527@qq.com
 *    @time   : 2019/3/13 14:50
 *    @desc   : 定义一个学生类，实现人类接口
 *    @version: 1.0
 * </pre>
 */
public class Student implements Man{


    @Override
    public void say() {
        System.out.println("i am a student!");
    }
}
