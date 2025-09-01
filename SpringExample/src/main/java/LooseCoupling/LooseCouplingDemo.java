package LooseCoupling;

public class LooseCouplingDemo {
    public static void main(String[] args) {
        DataSource mysqlSource = new MySQLDataSource();
        UserService userServiceWithMySQL = new UserService(mysqlSource);
        System.out.println(userServiceWithMySQL.getUserData());

        DataSource mongoSource = new MongoDBDataSource();
        UserService userServiceWithMongo = new UserService(mongoSource);
        System.out.println(userServiceWithMongo.getUserData());

        DataSource webServiceSource = new WebServiceDataSource();
        UserService userServiceWithWS = new UserService(webServiceSource);
        System.out.println(userServiceWithWS.getUserData());
    }
}
