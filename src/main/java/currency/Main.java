package currency;

import currency.parser.ParserGson;
import currency.parser.ParserJackson;
import java.io.IOException;

/**
 * Створіть класи Currency, Parser, Main
 * Підключитися до NBU API
 * та вивести в консоль 3 валюти на вибір
 * @see <a href="https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json">NBU API</a>
 */

public class Main {
    public static void main(String[] args) throws IOException {
        String url = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json";
        System.out.println("GSON");
        ParserGson.parseJson(url);
        System.out.println("Jackson");
        ParserJackson.parseJson(url);
    }
}
