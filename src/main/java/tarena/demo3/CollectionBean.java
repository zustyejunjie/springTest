package tarena.demo3;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
/**
 * 通过set方式注入集合的值 demo
 * @author yejunjie
 *
 */
public class CollectionBean {
	private List<String> city;
	private Set<String> name;
	private Map<String, Object> books;
	private Properties params;

	public void setParams(Properties params) {
		this.params = params;
	}

	public void setBooks(Map<String, Object> books) {
		this.books = books;
	}

	public void setName(Set<String> name) {
		this.name = name;
	}

	public void setCity(List<String> city) {
		this.city = city;
	}

	public void show() {
		System.out.println("##List城市信息##");
		for (String s : city) {
			System.out.println(s);
		}
		System.out.println("##Set朋友信息##");
		for (String s : name) {
			System.out.println(s);
		}
		System.out.println("##Map图书信息##");
		Set<String> keys = books.keySet();
		for (String key : keys) {
			System.out.println(key + " : " + books.get(key));
		}
		System.out.println("##Properties数据库连接参数信息##");
		Set<Object> ids = params.keySet();
		for (Object id : ids) {
			System.out.println(id + " : " + params.getProperty(id.toString()));
		}
	}
}
