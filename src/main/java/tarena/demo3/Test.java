package tarena.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 依赖注入
 * @author yejunjie
 *
 */
public class Test {
	public static void main(String[] args) {
		//相当于启动了spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"tarena/demo3/applicationContext.xml");
		UserBean bean = (UserBean) ac.getBean("userBean");
		bean.show();
		
		CollectionBean cb = (CollectionBean) ac.getBean("collectionbean");
		cb.show();
	}
}
