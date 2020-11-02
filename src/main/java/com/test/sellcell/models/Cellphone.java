package com.test.sellcell.models;

import java.util.Date;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cellphone
 */
public class Cellphone {
    private final UUID id;
    private final String manufacturer;
    private final String series;
    private final String model;
    private final long unixTimestamp;
    private final Date releaseDate;
    private final String description;
    private final Double price;

    public Cellphone(
        @JsonProperty("id") UUID id, 
        @JsonProperty("manufacturer") String manufacturer,
        @JsonProperty("series") String series, 
        @JsonProperty("model") String model,
        @JsonProperty("unixtimestamp") long unixTimestamp, 
        @JsonProperty("description") String description, 
        @JsonProperty("price") Double price
    ) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.series = series;
        this.model = model;
        this.unixTimestamp = unixTimestamp;
        this.releaseDate = new Date((long)unixTimestamp*1000);
        this.description = description;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public long getUnixTimestamp() {
        return unixTimestamp;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public String getModel() {
        return model;
    }

    public String getSeries() {
        return series;
    }

    public String getManufacturer() {
        return manufacturer;
    }

}