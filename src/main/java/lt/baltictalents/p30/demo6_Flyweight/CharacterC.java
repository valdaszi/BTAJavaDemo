package lt.baltictalents.p30.demo6_Flyweight;

public class CharacterC extends EnglishCharacter {

    public CharacterC() {
        symbol = 'C';
        width = 40;
        height = 50;
    }

    @Override
    public void printCharacter() {
        System.out.println("Symbol = " + symbol + " Width = " + width + " Height = " + height);
    }

}
