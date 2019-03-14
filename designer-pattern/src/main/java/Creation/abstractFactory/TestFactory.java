package Creation.abstractFactory;

/**
 * <pre>
 *    @author : orange
 *    @e-mail : 495314527@qq.com
 *    @time   : 2018/9/28 17:38
 *    @desc   :
 *    @version: 1.0
 * </pre>
 */
public class TestFactory {
    
    public static void main(String[] args){
        ManFactory studentFactory = new StudentFactory();
        Man dance = studentFactory.getHuman("dance");
        dance.say();

        ManFactory teacherFactory = new TeacherFactory();
        Man sing = teacherFactory.getHuman("sing");
        sing.say();
    }
}
