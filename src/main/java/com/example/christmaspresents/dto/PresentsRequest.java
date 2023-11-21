package com.example.christmaspresents.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

public class PresentsRequest {
    private List<PresentsProducer> producers;

    public PresentsRequest() {
        producers = new ArrayList<>();
    }

    public PresentsRequest(List<PresentsProducer> producers) {
        this.producers = producers;
    }

    public List<PresentsProducer> getProducers() {
        return producers;
    }

    public void setProducers(List<PresentsProducer> producers) {
        this.producers = producers;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PresentsRequest that = (PresentsRequest) o;
        return Objects.equals(producers, that.producers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producers);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", PresentsRequest.class.getSimpleName() + "[", "]")
                .add("producers=" + producers)
                .toString();
    }
}
