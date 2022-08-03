package com.example.idus.shared.dto;

import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class QueryParameter {
    private String queryName;
    private String queryValue;

    public QueryParameter(String queryName, String queryValue) {
        this.queryName = queryName;
        this.queryValue = queryValue;
    }
}
