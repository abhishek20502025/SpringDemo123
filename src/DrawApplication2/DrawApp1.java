package DrawApplication2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DrawApplication1.triangle1;

public class DrawApp1 {
	public static void main(String[] args) {
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext factory =new ClassPathXmlApplicationContext("spring.xml");
		triangle2 t =(triangle2)factory.getBean("triangle2");
		t.draw();
	}
}
