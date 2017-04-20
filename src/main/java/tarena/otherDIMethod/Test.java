package tarena.otherDIMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/4/14 0014.
 */
public class Test {


    public static void main(String args[]) {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("tarena/otherDIMethod/applicationContext.xml");

        ApplicationContext ac = new ClassPathXmlApplicationContext(
                "tarena/demo3/applicationContext.xml");

        System.out.println("age=" + ac.getBean("son2", Son.class).getAge());
    }
}
