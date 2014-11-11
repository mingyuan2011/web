package mingyuan2011.webapp;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;

public class MessageTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:beans.xml");
		String string = ctx.getMessage("mingyuan", null, null);
		System.out.println(string);
		
		System.out.println(ctx.getMessage("mingyuan", null, new Locale("")));
		System.out.println(ctx.getMessage("mingyuan", null, Locale.TAIWAN));
		
		// 可以不用 IoC注册，直接使用。
		ResourceBundleMessageSource s = new ResourceBundleMessageSource();
		s.setBasename("mingyuan2011.webapp.spring.messages");
		System.out.println(s.getMessage("mingyuan", null, Locale.TAIWAN));
	}
}
