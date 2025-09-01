package AutowireByConstructorExample;

public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    //u can remove setter or kept as it is
    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println("Car Details: " + specification.toString());
    }
}
