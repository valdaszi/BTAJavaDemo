package lt.baltictalents.p15.demo3;

public class Main {

    //@FunctionalInterface
    interface Converter<F, T> {

        T convert(F from);

//        int getCounter();

    }

    int counter = 0;

    public static void main(String[] args) {
        new Main().start();
    }

    void start() {
        final int num = 10;

        Converter<Integer, String> stringConverter =
                from -> {
                    this.inc();
                    return String.valueOf(from + num);
                };

//                new Converter<Integer, String>() {
//                    @Override
//                    public String convert(Integer from) {
//                        this.inc(); // klaida!!!
//                        return String.valueOf(from + num);
//                    }
//                };




//                new Converter<Integer, String>() {
//                    int counter = 0;
//
//                    @Override
//                    public String convert(Integer from) {
//                        this.counter++;
//                        return String.valueOf(from + num);
//                    }
//
//                    @Override
//                    public int getCounter() {
//                        return this.counter;
//                    }
//                };


        String result = stringConverter.convert(2);
        System.out.println("result = " + result);

        result = stringConverter.convert(-2);
        System.out.println("result = " + result);

        //System.out.println(stringConverter.getCounter());
        System.out.println(counter);
    }

    void inc() {
        counter++;
    }
}
