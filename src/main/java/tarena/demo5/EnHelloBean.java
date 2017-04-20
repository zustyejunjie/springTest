package tarena.demo5;

import org.springframework.stereotype.Service;

@Service("En")
//service注解 相当于在xml配置 <bean id="ehHelloBean" class="tarena.demo5.EhHelloBean"></bean>
//不做说明 id为类名 首字母小写  也可以 @Service("aaa") 这样就指明了id的值
public class EnHelloBean implements HelloBean{

	@Override
	public void say() {
		System.out.println("Hello World11");
	}

}
