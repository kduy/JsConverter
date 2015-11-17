package main.java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import main.java.com.cloudrail.utils.Node.JsonArrayNode;
import main.java.com.cloudrail.utils.Node.JsonObjectNode;
import main.java.com.cloudrail.utils.Visitor.PrintVistor;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonSimpleExample {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {

            Object obj = parser.parse(new FileReader("/Users/kidio/IdeaProjects/JsonConverter/src/main/resources/sample_input.json"));

            JSONObject jsonObject = (JSONObject) obj;
/*

            String name = (String) jsonObject.get("name");
            System.out.println(name);

            long age = (Long) jsonObject.get("age");
            System.out.println(age);

            // loop array
            JSONArray msg = (JSONArray) jsonObject.get("messages");
            Iterator<String> iterator = msg.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
*/
            PrintVistor vistor = new PrintVistor();
            /*Iterator<Map.Entry<String, Object>> iterator = jsonObject.entrySet().iterator();
            while (iterator.hasNext()) {
                //System.out.println(iterator.next().getValue() instanceof JSONArray); // instanceof JSONArray
                Object temp = iterator.next().getValue();
                if (temp instanceof JSONArray){
                    (new JsonArrayNode((JSONArray) temp)).accept(vistor);
                }
            }*/
            System.out.println((new JsonObjectNode(jsonObject)).accept(vistor));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}