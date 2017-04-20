package tarena.demo1;

public class UserBean {
	public void show(){
		BeanFactory fc = new BeanFactory();
		//父类接口通过子类来实例化
		HelloBean bean = fc.getHello();
		bean.say();
	}
}
