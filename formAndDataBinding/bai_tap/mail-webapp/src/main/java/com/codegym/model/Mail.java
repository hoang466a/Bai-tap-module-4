package com.codegym.model;

import java.security.Signature;
import java.util.HashMap;

public class Mail {
    private String language;
    private Integer pageSize;
    private Boolean spamfilter;
    private String Signature;

    public Mail(String language, Integer pageSize, Boolean spamfilter, String signature) {
        this.language = language;
        this.pageSize = pageSize;
        this.spamfilter = spamfilter;
        Signature = signature;
    }

    public Mail() {
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Boolean getSpamfilter() {
        return spamfilter;
    }

    public void setSpamfilter(Boolean spamfilter) {
        this.spamfilter = spamfilter;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String signature) {
        Signature = signature;
    }
}
