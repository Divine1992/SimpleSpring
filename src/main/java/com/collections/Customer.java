package com.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Customer {
    private List<Integer> lists;
    private Set<Integer> sets;
    private Map<Integer, Integer> maps;

    public List<Integer> getLists() {
        return lists;
    }

    public void setLists(List<Integer> lists) {
        this.lists = lists;
    }

    public Set<Integer> getSets() {
        return sets;
    }

    public void setSets(Set<Integer> sets) {
        this.sets = sets;
    }

    public Map<Integer, Integer> getMaps() {
        return maps;
    }

    public void setMaps(Map<Integer, Integer> maps) {
        this.maps = maps;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "lists=" + lists +
                ", sets=" + sets +
                ", maps=" + maps +
                '}';
    }
}
