package com.taotao.rest.pojo;

import java.util.List;

/**
 * Created by HM on 16/12/27.
 */
public class CatNode {


    private String url;

    private String name;

    private List items;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getItems() {
        return items;
    }

    public void setItems(List items) {
        this.items = items;
    }
}
