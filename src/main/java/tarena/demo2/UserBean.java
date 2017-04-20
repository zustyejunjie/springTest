package tarena.demo2;

public class UserBean {
	//控制反转：userBean使用HellBean，不像是过去在类中new一个，而是去spring容器中拿到
	//依赖注入：在spring容器中  UserBean注册成bean 在该bean的构造器中注入需要的参数bean
	//在该类中，使用set方法，把在spring中注入的参数得到
	
	//这里需要实例化的类 应该是接口类！！  父类接口通过子类实例化
	public HelloBean helloBean;
	
	
	public void show(){
		helloBean.say();
	}
	
	
	public void setHelloBean(HelloBean helloBean) {
		this.helloBean = helloBean;
	}
	
}
