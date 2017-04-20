package tarena.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring使用的demo
 * @author yejunjie
 *
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"tarena/demo2/applicationContext.xml");
		UserBean bean = (UserBean) ac.getBean("userBean");
		bean.show();
	}
}
