package DrawApplication3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DrawApplication2.triangle2;

public class DrawApp3 {
	public static void main(String[] args) {
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext factory =new ClassPathXmlApplicationContext("spring.xml");
		Triangle3 t =(Triangle3)factory.getBean("triangle3");
		t.draw();
	}
}
