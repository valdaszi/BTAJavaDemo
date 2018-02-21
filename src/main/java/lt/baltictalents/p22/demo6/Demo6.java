package lt.baltictalents.p22.demo6;

import java.io.*;
import java.net.*;

public class Demo6 {

    public static void main(String... args) throws URISyntaxException, MalformedURLException {

        URI uri = new URI("https",
                "postit.lt",
                "/data",
                "address=K.Baršausko g. 59, Kaunas",
                null);

        System.out.println(uri);

        URL url = uri.toURL();
        try (
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(
                                url.openStream(), "UTF-8"));
        ) {

            String decodedString;
            while ((decodedString = in.readLine()) != null) {
                System.out.println(decodedString);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
