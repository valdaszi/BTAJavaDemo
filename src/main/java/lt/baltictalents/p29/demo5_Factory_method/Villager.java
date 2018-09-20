package lt.baltictalents.p29.demo5_Factory_method;

public class Villager implements IPerson {

    PersonType personType;

    @Override
    public String getName() {
        return "Village Person";
    }

    @Override
    public String toString() {
        return "Villager{" + getName() + "}";
    }
}
