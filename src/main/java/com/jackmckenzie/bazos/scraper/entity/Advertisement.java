package com.jackmckenzie.bazos.scraper.entity;

import lombok.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
public class Advertisement {
    private Integer id;

    private String url;

    private String date;

    private String title;

    private Float price;

    private String description;

    private List<Photo> photos = new ArrayList<>();

    private SubCategory subCategory;

    public void setDate(String date) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("d.M.yyyy");
        dateFormat.parse(date); // this validates the date
        this.date = date;
    }

    public void setPrice(String price) {
        this.price = Float.parseFloat(price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Advertisement that = (Advertisement) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
