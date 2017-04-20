package tarena.demo5;

import org.springframework.stereotype.Service;


@Service("Zh")
public class ZhHelloBean implements HelloBean{

	@Override
	public void say() {
		System.out.println("你好世界");
		
	}

}
