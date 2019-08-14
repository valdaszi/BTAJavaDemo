package lt.baltictalents.p29.demo5_Factory_method;

public class CityPerson implements IPerson {

    PersonType personType;

    @Override
    public String getName() {
        return "City Person";
    }

    @Override
    public String toString() {
        return "CityPerson{" + getName() + "}";
    }
}
