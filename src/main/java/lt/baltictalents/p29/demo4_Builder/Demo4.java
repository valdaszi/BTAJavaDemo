package lt.baltictalents.p29.demo4_Builder;

public class Demo4 {

    public static void main(String[] args) {

        Car car = Car.builder()
                .setColor("black")
                .setWheels(6)
                .build();

        System.out.println(car);
        System.out.println(Car.builder().setColor("black").build());
    }
}
