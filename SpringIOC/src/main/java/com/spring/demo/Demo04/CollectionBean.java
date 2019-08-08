package com.spring.demo.Demo04;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 集合属性的注入
 */
public class CollectionBean {
    private String [] arrs;
    private Map map;
    private List<Person> list;
    public void setArrs(String[] arrs) {
        this.arrs = arrs;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Map getMap() {
        return map;
    }

    public void setList(List<Person> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "CollectionBean{" +
                "arrs=" + Arrays.toString(arrs) +
                ", map=" + map +
                ", list=" + list +
                '}';
    }
}
