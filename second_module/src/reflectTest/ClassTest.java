package reflectTest;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.security.spec.ECField;
import java.util.Date;

public class ClassTest {
    public static void main(String[] args) {
        //获取class对象
        try {
            Class c1 = Class.forName("reflectTest.Employee");   // 第1种，forName 方式获取Class对象
            Class c2 = Employee.class;      // 第2种，直接通过类获取Class对象
            Employee employee = new Employee("小明", "18", "写代码", 1, "Java攻城狮", 100000);
            Class c3 = employee.getClass();    // 第3种，通过调用对象的getClass()方法获取Class对象

            if (c1 == c2 && c1 == c3) {     // 可以通过 == 比较Class对象是否为同一个对象
                System.out.println("c1、c2、c3 为同一个对象");
                System.out.println(c1);     // class reflect.Employee
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
    @Test
    public void test(){
        //利用反射创建对象
        try {
            Class c = Date.class;
            Date date1 = (Date)c.getConstructor().newInstance();
            System.out.println(date1);
            long timestamp = date1.getTime();
            Constructor constructor = c.getConstructor(long.class);
            Date date2 = (Date)constructor.newInstance(timestamp);
            System.out.println(date2);

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
