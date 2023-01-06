package currency.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class Currency {
    @JsonIgnore
    @JsonProperty("r030")
    private String r030;

    @SerializedName("txt")
    @JsonProperty("txt")
    private String currencyName;

    @SerializedName("rate")
    @JsonProperty("rate")
    private BigDecimal rate;

    @SerializedName("cc")
    @JsonProperty("cc")
    private String currencyAbbr;

    @SerializedName("exchangedate")
    @JsonProperty("exchangedate")
    private String exchangeDate;

    public Currency() {
    }

    @Override
    public String toString() {
        return "Currency{" +
                "currencyName='" + currencyName + '\'' +
                ", rate=" + rate +
                ", currencyAbbr='" + currencyAbbr + '\'' +
                ", exchangeDate='" + exchangeDate + '\'' +
                '}';
    }
}
