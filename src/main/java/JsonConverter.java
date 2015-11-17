package main.java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import main.java.com.cloudrail.utils.Node.JsonObjectNode;
import main.java.com.cloudrail.utils.Visitor.PrintVistor;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonConverter {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {

            Object obj = parser.parse(new FileReader("src/main/resources/test.json"));

            JSONObject jsonObject = (JSONObject) obj;

            PrintVistor vistor = new PrintVistor();
            System.out.println((new JsonObjectNode(jsonObject)).accept(vistor,0));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}