package com.github.greengerong;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/26/13
 * Time: 11:39 下午
 * To change this template use File | Settings | File Templates.
 */
public class Occupation {
    private String name;
    private List<String> activities;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    public List<String> getActivities() {
        return activities;
    }
}
