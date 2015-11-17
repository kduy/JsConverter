package main.java;

import java.io.*;

import main.java.com.cloudrail.utils.Node.JsonObjectNode;
import main.java.com.cloudrail.utils.Visitor.PrintVistor;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonConverter {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {
            // read json input
            Object obj = parser.parse(new FileReader("src/main/resources/test.json"));

            // convert
            JSONObject jsonObject = (JSONObject) obj;
            PrintVistor vistor = new PrintVistor();
            String convertedJson = (new JsonObjectNode(jsonObject)).accept(vistor,0);

            // write output
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.json"));
            bw.write(convertedJson);
            bw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}