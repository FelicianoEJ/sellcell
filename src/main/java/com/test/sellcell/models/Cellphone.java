package com.test.sellcell.models;

import java.util.Calendar;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.lang.NonNull;

/**
 * Cellphone
 */
@Entity // This tells Hibernate to make a table out of this class
@Table(name = "cellphones")
public class Cellphone {
    @Id 
    @NonNull
    @JsonProperty("id")
    private String id;

    @Transient
    private UUID uuid;
    
    @JsonProperty("manufacturer")
    private String manufacturer;
    
    @JsonProperty("series")
    private String series;
    
    @JsonProperty("model")
    private String model;
    
    @Transient
    @JsonProperty("unixtimestamp")
    private long unixTimestamp;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "release_date")
    private Calendar releaseDate;

    @JsonProperty("description")
    private String description;

    @JsonProperty("price")
    private Double price;

    public Cellphone() {}

    public Cellphone(@JsonProperty("unixtimestamp") long unixTimestamp) {
        this.uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.releaseDate = Calendar.getInstance();
        this.releaseDate.setTimeInMillis((long)unixTimestamp*1000);
    }

    public String getId() {
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

    public Calendar getReleaseDate() {
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