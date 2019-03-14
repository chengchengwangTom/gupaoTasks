package Creation.simpleFactory;



/**
 * <pre>
 *    @author : orange
 *    @e-mail : 495314527@qq.com
 *    @time   : 2019/3/13 14:52
 *    @desc   : 简单工厂类
 *    @version: 1.0
 * </pre>
 */
public class Factory {

    public static Man getMan(String type) {
        if ("teacher".equals(type)) {
            return new Teacher();
        } else if ("student".equals(type)) {
            return new Student();
        } else {
            return null;
        }
    }

    public static Man getMan1(Class c) {
        Man man = null;
        try {
            man = (Man)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return man;

    }


    public static void main(String[] args){

        Man teacher = Factory.getMan("teacher");
        teacher.say();

        Man student = Factory.getMan("student");
        student.say();


        Man teacher1 = Factory.getMan1(Teacher.class);
        teacher1.say();

        Man student1 = Factory.getMan1(Student.class);
        student1.say();


    }



}

