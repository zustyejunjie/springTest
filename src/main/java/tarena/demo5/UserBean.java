package tarena.demo5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userbean")
public class UserBean {
	//相当于在xml中配置<bean> <property></property> </bean>
	//当该接口有多个实现类 注释Service的时候    resource后面使用name来区别
	//使用 resource 或者 autowired 注入属性的时候  就不用再写 set方法了
//	@Resource(name="En")
//	public HelloBean helloBean;
	
	
	//使用autowired 实现自动装配  spring提供 如果接口有多个实现类注释  需要使用@Qualifier注解
	@Autowired
	@Qualifier("En")
	public HelloBean helloBean;
	

	public void show(){
		helloBean.say();

	}
	

//	public void setHelloBean(HelloBean helloBean) {
//		this.helloBean = helloBean;
//	}

	
}
