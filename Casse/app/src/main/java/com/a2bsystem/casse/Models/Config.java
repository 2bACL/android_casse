package com.a2bsystem.casse.Models;

public class Config {

    private long id;
    private String param;
    private String value;


    public Config() {
    }

    public Config(String param, String value) {
        this.param = param;
        this.value = value;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
