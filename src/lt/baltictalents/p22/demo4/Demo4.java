package lt.baltictalents.p22.demo4;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Demo4 {

    public static void main(String... args) throws URISyntaxException, MalformedURLException {

        //URI uri = new URI("http://example.com/hello world");
        URI uri = new URI("http", "example.com", "/hello world", null);

        System.out.println(uri);

        URL url = uri.toURL();
        System.out.println(url);

        System.out.println(url.toURI());
    }
}
