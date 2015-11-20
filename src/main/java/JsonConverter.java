package main.java;

import java.io.*;

import main.java.com.cloudrail.utils.Node.JsonObjectNode;
import main.java.com.cloudrail.utils.Visitor.PrintVistor;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonConverter {
    public static void main(String[] args) {

        if (args.length < 2){
            System.err.println("java -jar <jar path> <input> <output>");
            System.exit(1);
        }

        JSONParser parser = new JSONParser();

        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));

            String line ;

            StringBuilder jsonBlock = new StringBuilder("");
            while ((line = br.readLine())!= null){
                if (line.startsWith("//")|| line.startsWith("#")|| line.startsWith("```")){
                    if (!jsonBlock.toString().equals("")){
                        convertThenWriteJson(parser, bw, jsonBlock);
                        jsonBlock = new StringBuilder("");
                    }
                    bw.newLine();
                    bw.write(line);
                    bw.newLine();
                } else{
                    jsonBlock.append(line.trim());
                }
            }

            if (!jsonBlock.toString().equals(""))
                convertThenWriteJson(parser, bw, jsonBlock);
            br.close();
            bw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void convertThenWriteJson(JSONParser parser, BufferedWriter bw, StringBuilder jsonBlock) throws ParseException, IOException {
        JSONObject jsonObject;
        PrintVistor visitor;
        String convertedJson;
        jsonObject = (JSONObject)parser.parse(jsonBlock.toString());
        visitor = new PrintVistor();
        convertedJson = (new JsonObjectNode(jsonObject)).accept(visitor,0);

        bw.write(formatJson(convertedJson));
        bw.newLine();
    }

    private static String formatJson(String convertedJson) {
        return convertedJson.replaceAll(":(\t)+", ":");
    }

}