package utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;

public class JsonReader extends JSONObject{
        public JsonReader(String filepath) {
                try {
                        Object obj = new JSONParser().parse(new FileReader(filepath));
                        this.putAll((JSONObject) obj);
                } catch (IOException | ParseException e) {
                        throw new RuntimeException(e);
                }
        }


}