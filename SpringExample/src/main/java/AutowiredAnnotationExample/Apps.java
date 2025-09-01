package AutowiredAnnotationExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Apps {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Employees employees = context.getBean("employee", Employees.class);
        System.out.println(employees);

        Manager manager = context.getBean(Manager.class);
        System.out.println(manager);
    }
}
