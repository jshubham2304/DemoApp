package com.demoapp;

import java.io.Serializable;

public class DataStorage implements Serializable {
    int i;
    int title;
    int description;
    int technologydesc;
    int womenfriend;
    int performance;
    int localediss_app;
    int outcome;
    int limit;
    int source;
    int develope;
    int year;
    int cost;
    int image1;
    int image2;

    public DataStorage(int i, int title, int description, int technologydesc, int womenfriend, int performance, int localediss_app, int outcome, int limit, int source, int develope, int year, int cost, int image1, int image2) {
        this.i = i;
        this.title = title;
        this.description = description;
        this.technologydesc = technologydesc;
        this.womenfriend = womenfriend;
        this.performance = performance;
        this.localediss_app = localediss_app;
        this.outcome = outcome;
        this.limit = limit;
        this.source = source;
        this.develope = develope;
        this.year = year;
        this.cost = cost;
        this.image1 = image1;
        this.image2 = image2;
    }


    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }

    public int getTechnologydesc() {
        return technologydesc;
    }

    public void setTechnologydesc(int technologydesc) {
        this.technologydesc = technologydesc;
    }

    public int getWomenfriend() {
        return womenfriend;
    }

    public void setWomenfriend(int womenfriend) {
        this.womenfriend = womenfriend;
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    public int getLocalediss_app() {
        return localediss_app;
    }

    public void setLocalediss_app(int localediss_app) {
        this.localediss_app = localediss_app;
    }

    public int getOutcome() {
        return outcome;
    }

    public void setOutcome(int outcome) {
        this.outcome = outcome;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getDevelope() {
        return develope;
    }

    public void setDevelope(int develope) {
        this.develope = develope;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
