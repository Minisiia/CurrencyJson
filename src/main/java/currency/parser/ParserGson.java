package currency.parser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import currency.entity.Currency;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class ParserGson {
    public static void parseJson(String url) throws IOException {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(new URL(url).openStream()));
        Currency[] currencies = gson.fromJson(jsonReader, Currency[].class);
        for (int i = 0; i < 3; i++) {
            System.out.println(currencies[i]);
        }
    }
}
