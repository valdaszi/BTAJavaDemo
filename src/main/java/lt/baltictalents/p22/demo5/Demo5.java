package lt.baltictalents.p22.demo5;

import java.net.URI;
import java.net.URISyntaxException;

public class Demo5 {

    public static void main(String... args) throws URISyntaxException {

        URI uri = new URI("https://jonas:slaptas@example.com:443/hello%20world/api?id=100&abc=yes#block");

        System.out.println("Scheme: " + uri.getScheme());
        System.out.println("Authority: " + uri.getAuthority());
        System.out.println("UserInfo: " + uri.getUserInfo());
        System.out.println("Host: " + uri.getHost());
        System.out.println("Port: " + uri.getPort());
        System.out.println("Path: " + uri.getPath());
        System.out.println("Query: " + uri.getQuery());
        System.out.println("Fragment: " + uri.getFragment());
    }
}
