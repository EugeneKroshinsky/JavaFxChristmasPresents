package com.example.christmaspresents.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

public class Request {
    private List<Producer> producers;

    public Request() {
        producers = new ArrayList<>();
    }

    public Request(List<Producer> producers) {
        this.producers = producers;
    }

    public List<Producer> getProducers() {
        return producers;
    }

    public void setProducers(List<Producer> producers) {
        this.producers = producers;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Request that = (Request) o;
        return Objects.equals(producers, that.producers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producers);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Request.class.getSimpleName() + "[", "]")
                .add("producers=" + producers)
                .toString();
    }
}
