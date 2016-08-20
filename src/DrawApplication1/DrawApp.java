package DrawApplication1;

import org.abhishek.traingle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawApp {
	public static void main(String[] args) {
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext factory =new ClassPathXmlApplicationContext("spring.xml");
		triangle1 t =(triangle1)factory.getBean("triangle-alias");
		t.draw();
	}
}
