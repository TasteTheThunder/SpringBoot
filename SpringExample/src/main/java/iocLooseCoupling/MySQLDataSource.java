package iocLooseCoupling;

// A - MySQL, PostgreSQL
// B - Web Service, MongoDB

public class MySQLDataSource implements DataSource {
    @Override
    public String fetchData() {
        return "User Data from MySQL Database";
    }
}

