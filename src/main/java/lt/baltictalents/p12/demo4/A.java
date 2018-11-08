package lt.baltictalents.p12.demo4;

public interface A {

    long pow2();
}

class BBB {

    void a() {

//        class Vidine implements A {
//
//            @Override
//            public long pow2() {
//                return 100;
//            }
//        }
//
//        A kazkas = new Vidine();

        A kazkas = new A()  {

            @Override
            public long pow2() {
                return 200;
            }
        };


        System.out.println(kazkas.pow2());

    }

}