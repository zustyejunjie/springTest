package tarena.demo1;

//使用工厂模式  在spring中，工厂的功能由spring代替
//使用工厂类来获得子类   使用哪个实现类  在这里控制
public class BeanFactory {
	public HelloBean getHello(){
		return new EnHelloBean();
		//return new ZhHelloBean();
		
	}
}
