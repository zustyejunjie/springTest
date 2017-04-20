package tarena.demo5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 注解
 * @author yejunjie
 *
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"tarena/demo5/applicationContext.xml");
		UserBean bean = (UserBean) ac.getBean("userbean");
		bean.show();
		
	
	}
}
