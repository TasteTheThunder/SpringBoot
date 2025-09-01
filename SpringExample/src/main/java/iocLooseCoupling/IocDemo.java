package iocLooseCoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocDemo {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationIoCLooseCoupling.xml");
        UserService userServiceWithMySQL =
                (UserService) context.getBean("userServiceWithmySQL");
        System.out.println(userServiceWithMySQL.getUserData());


        UserService userServiceWithMongo =
                (UserService) context.getBean("userServiceWithMongoDB");
        System.out.println(userServiceWithMongo.getUserData());


        UserService userServiceWithWS =
                (UserService) context.getBean("userServiceWithWebService");
        System.out.println(userServiceWithWS.getUserData());
    }
}
