package com.jackmckenzie.bazos.scraper.entity;

import lombok.Data;

import java.util.Objects;

@Data
public class SubCategory {
    private String url;

    private String title;

    private MainCategory mainCategory;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SubCategory that = (SubCategory) o;
        return Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url);
    }
}
