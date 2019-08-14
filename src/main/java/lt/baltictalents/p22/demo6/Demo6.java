package lt.baltictalents.p22.demo6;

import java.io.*;
import java.net.*;

public class Demo6 {

    public static void main(String... args) throws URISyntaxException, MalformedURLException {

        URI uri = new URI("http",
                "postman-echo.com",
                "/get",
                "address=K.Baršausko g. 59, Kaunas",
                null);

        System.out.println(uri);

        URL url = uri.toURL();
        try (
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(
                                url.openStream(), "UTF-8"));

                Writer ou = new FileWriter("src/main/java/lt/baltictalents/p22/output.txt")
        ) {

            String decodedString;
            while ((decodedString = in.readLine()) != null) {
                System.out.println(decodedString);
                ou.write(decodedString + "\n");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
