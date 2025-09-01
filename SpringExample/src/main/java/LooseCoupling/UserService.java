package LooseCoupling;

public class UserService {
    private DataSource dataSource;

    public UserService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String getUserData() {
        return dataSource.fetchData();
    }
}
