package tarena.demo3;

public class UserBean {

	public HelloBean helloBean;
	public String name;
	
	//1：通过构造方式注入
//	public UserBean(HelloBean helloBean,String name){
//		this.helloBean = helloBean;
//		this.name = name;
//	}
	
	public void show(){
		helloBean.say();
		System.out.println(name);
	}
	
	//2：这是通过set方式注入
	public void setHelloBean(HelloBean helloBean) {
		this.helloBean = helloBean;
	}
	public void setName(String name){
		this.name = name;
	}
	
}
