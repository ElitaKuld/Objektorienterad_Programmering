package Sprint_4.URL_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLReader {
    public static void main(String[] args) throws IOException {

        URL studentportal = new URL("https://studentportal.nackademin.se");
        BufferedReader in = new BufferedReader(new InputStreamReader(studentportal.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}