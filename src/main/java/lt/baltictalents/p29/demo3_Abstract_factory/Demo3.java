package lt.baltictalents.p29.demo3_Abstract_factory;

public class Demo3 {

    public static void main(String[] args) throws Exception {

        IGUIFactory factory = null;

        final String appearance = randomAppearance();	// Current operating system

        factory = createFactoryFrom(appearance);

        final IButton button = factory.createButton();

        button.paint();

    }

    public static IGUIFactory createFactoryFrom(String appearance) throws Exception {
        if (appearance.equals("OSX")) {
            return new OSXFactory();
        } else if(appearance.equals("Windows")) {
            return new WinFactory();
        } else {
            throw new Exception("No such operating system");
        }
    }

    /**
     * This is just for the sake of testing this program, and doesn't have to do
     * with Abstract Factory pattern.
     * @return
     */
    public static String randomAppearance() {
        final String[] appearanceArray = new String[3];

        appearanceArray[0] = "OSX";
        appearanceArray[1] = "Windows";
        appearanceArray[2] = "error";

        final java.util.Random random = new java.util.Random();

        final int randomNumber = random.nextInt(3);

        return appearanceArray[randomNumber];
    }
}
