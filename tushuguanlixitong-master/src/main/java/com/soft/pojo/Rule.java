package com.soft.pojo;

public class Rule {
    private Integer id;

    private Integer borrowNum;

    private Integer limitDay;

    private String borrowLibrary;

    private Float overtimeFee;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBorrowNum() {
        return borrowNum;
    }

    public void setBorrowNum(Integer borrowNum) {
        this.borrowNum = borrowNum;
    }

    public Integer getLimitDay() {
        return limitDay;
    }

    public void setLimitDay(Integer limitDay) {
        this.limitDay = limitDay;
    }

    public String getBorrowLibrary() {
        return borrowLibrary;
    }

    public void setBorrowLibrary(String borrowLibrary) {
        this.borrowLibrary = borrowLibrary == null ? null : borrowLibrary.trim();
    }

    public Float getOvertimeFee() {
        return overtimeFee;
    }

    public void setOvertimeFee(Float overtimeFee) {
        this.overtimeFee = overtimeFee;
    }
}