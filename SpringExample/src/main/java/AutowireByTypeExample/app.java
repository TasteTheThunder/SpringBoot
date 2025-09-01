package AutowireByTypeExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("autowireByType.xml");
        Car myCar = (Car) context.getBean("myCar");
        myCar.displayDetails();
    }
}
