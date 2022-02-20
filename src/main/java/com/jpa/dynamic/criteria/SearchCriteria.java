package com.jpa.dynamic.criteria;

import com.jpa.dynamic.constant.SearchOperation;

public class SearchCriteria {
    private String key;
    private Object value;
    private SearchOperation searchOperation;

    public SearchCriteria() {
    }

    public SearchCriteria(String key, Object value, SearchOperation searchOperation) {
        this.key = key;
        this.value = value;
        this.searchOperation = searchOperation;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public SearchOperation getSearchOperation() {
        return searchOperation;
    }

    public void setSearchOperation(SearchOperation searchOperation) {
        this.searchOperation = searchOperation;
    }
}
