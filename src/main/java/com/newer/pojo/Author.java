package com.newer.pojo;

import java.io.Serializable;

/**
 * @author shining
 */
public class Author implements Serializable{

    private Integer auid;
    private String name;

    public Integer getAuid() {
        return auid;
    }

    public void setAuid(Integer auid) {
        this.auid = auid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
