package com.jackmckenzie.scraping.bazos.entity;

import lombok.Data;

import java.util.Objects;

@Data
public class Photo {
    private String url;

    private byte[] content;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Photo photo = (Photo) o;
        return Objects.equals(url, photo.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url);
    }

    @Override
    public String toString() {
        return "Photo{" +
                "url=" + url +
                '}';
    }
}
