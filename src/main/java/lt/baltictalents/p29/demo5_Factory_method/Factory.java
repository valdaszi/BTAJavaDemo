package lt.baltictalents.p29.demo5_Factory_method;

public class Factory {

    public static IPerson createPerson(PersonType type)
    {
        switch (type)
        {
            case Rural:
                return new Villager();

            case Urban:
                return new CityPerson();

            default:
                throw new IllegalArgumentException();
        }
    }
}
