package LooseCoupling;

public class MongoDBDataSource implements DataSource {
    @Override
    public String fetchData() {
        return "User Data from MongoDB";
    }
}