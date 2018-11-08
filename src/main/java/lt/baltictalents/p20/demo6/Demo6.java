package lt.baltictalents.p20.demo6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Demo of ObjectInputStream, ObjectOutputStream
 */
public class Demo6 {

    public static void main(String... args) {

        List<A> list = new ArrayList<>();

        B b = new B("abrikosas", 100);

        list.add(new A("obuolys", b, new B("apelsinas", 200)));
        list.add(new A("slyva", new B("citrina", 300), b));


        write(list);

        read();

        writeNode();

        Node root = readNode();

        System.out.println(root.getName());
        System.out.println("left: " + root.getLeft().getName());
        System.out.println("right: " + root.getRight().getName());

    }

    static void write( List<A> list) {
        try (
                ObjectOutput ou = new ObjectOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream("src/main/java/lt/baltictalents/p20/output.txt")))
        ) {
            ou.writeUTF("Abrakadabra");
            ou.writeObject(list);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void read() {
        try (
                ObjectInput in = new ObjectInputStream(
                        new BufferedInputStream(
                                new FileInputStream("src/main/java/lt/baltictalents/p20/output.txt")))
        ) {

            System.out.println(in.readUTF());

            Object object = in.readObject();
            if (object instanceof List) {
                List<A> list2 = (List<A>) object;
                System.out.println("elementų: " + list2.size());
                for (A a : list2) {
                    System.out.println(a);
                }
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();

        }

    }

    static void writeNode() {
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");

        a.setLeft(b);
        a.setRight(c);

        b.setLeft(d);
        b.setRight(e);

        e.setRight(a);

        try (
                ObjectOutput ou = new ObjectOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream("src/main/java/lt/baltictalents/p20/output.txt")))
        ) {
            ou.writeObject(a);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static Node readNode() {
        try (
                ObjectInput in = new ObjectInputStream(
                        new BufferedInputStream(
                                new FileInputStream("src/main/java/lt/baltictalents/p20/output.txt")))
        ) {

            Node node = (Node) in.readObject();
            return node;

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();

        }
        return null;
    }
}

class Node implements Serializable {

    String name;

    Node left;

    Node right;

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

