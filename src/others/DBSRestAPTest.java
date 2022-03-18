package others;

import jdk.nashorn.internal.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class DBSRestAPTest {
    public static void main(String[] args) throws IOException {
        executeRestCall("India");
    }

    private static void executeRestCall(String country) throws IOException {

        URL url = new URL("https://jsonmock.hackerrank.com/api/countries?name="+country);

// Open a connection(?) on the URL(??) and cast the response(???)
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

// Now it's "open", we can set the request method, headers etc.
        connection.setRequestProperty("accept", "application/json");

// This line makes the request
        InputStream responseStream = connection.getInputStream();

// Manually converting the response body InputStream to APOD using Jackson
        BufferedReader reader = new BufferedReader(new InputStreamReader(responseStream));
        String json = reader.readLine();
        System.out.println(json);



// Finally we have the response




    }
}