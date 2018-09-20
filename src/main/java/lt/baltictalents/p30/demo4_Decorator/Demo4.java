package lt.baltictalents.p30.demo4_Decorator;

public class Demo4 {

    public static void main(String[] args) {

        Window simple = new SimpleWindow();
        System.out.println(simple.getDescription());


        // Create a decorated Window with horizontal and vertical scrollbars
        Window decoratedWindow = new HorizontalScrollBarDecorator(
                new VerticalScrollBarDecorator(simple));

        // Print the Window's description
        System.out.println(decoratedWindow.getDescription());

    }
}
