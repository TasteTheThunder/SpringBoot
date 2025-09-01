package iocLooseCoupling;

public class WebServiceDataSource implements DataSource {
    @Override
    public String fetchData() {
        return "User Data from Web Service";
    }
}