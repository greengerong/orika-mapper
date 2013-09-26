package com.github.greengerong;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/26/13
 * Time: 11:48 下午
 * To change this template use File | Settings | File Templates.
 */
public class Option {
    private String id;
    private String text;

    public Option(String text) {
        this.id = this.text = text;
    }

    public Option() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
