package com.example.christmaspresents.dto;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PresentsProducer {
    private String name;
    private List<Present> presents;

    public PresentsProducer() {
        presents = new ArrayList<>();
    }
    public PresentsProducer(String name) {
        this.name = name;
        this.presents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Present> getPresents() {
        return presents;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPresents(List<Present> presents) {
        this.presents = presents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PresentsProducer that = (PresentsProducer) o;
        return Objects.equals(name, that.name) && Objects.equals(presents, that.presents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, presents);
    }

    @Override
    public String toString() {
        return name;
    }
}
