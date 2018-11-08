package lt.baltictalents.p15.demo3;

public class Main {

    @FunctionalInterface
    interface Converter<F, T> {

        T convert(F from);

        //int getCounter();

        default int getSomething() {
            return 100;
        }

    }

    private int counter = 0;

    public static void main(String[] args) {
        new Main().start();
    }

    //int num = 10;

    private void start() {
        int num = 10;

        Converter<Integer, String> stringConverter =
                from -> {
                    this.inc();
                    return String.valueOf(from + num);
                };

//                new Converter<Integer, String>() {
//                    @Override
//                    public String convert(Integer from) {
//                        Main.this.inc();
//                        return String.valueOf(from + num + getSomething());
//                    }
//
//                    @Override
//                    public int getSomething() {
//                        return -100;
//                    }
//                };

        String result = stringConverter.convert(2);
        System.out.println("result = " + result);

        //num = 0;

        result = stringConverter.convert(-2);
        System.out.println("result = " + result);

        //System.out.println(stringConverter.getCounter());
        System.out.println(counter);
    }

    private void inc() {
        counter++;
    }
}
