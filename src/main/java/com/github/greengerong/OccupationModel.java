package com.github.greengerong;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/26/13
 * Time: 11:39 下午
 * To change this template use File | Settings | File Templates.
 */
public class OccupationModel {
    private String text;
    private List<Option> children;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Option> getChildren() {
        return children;
    }

    public void setChildren(List<Option> children) {
        this.children = children;
    }
}
