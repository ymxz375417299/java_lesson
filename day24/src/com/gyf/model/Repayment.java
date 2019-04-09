package com.gyf.model;

public class Repayment {
  // 当月应还本金 principal
  private double principal;
  // 还款期数 
  private int index;
  // 当月利息 interest
  private double interest;
  // 还款日期 
  private String date;

  public Repayment() {
  }

  public Repayment(double principal, int index, double interest, String date) {
    this.principal = principal;
    this.index = index;
    this.interest = interest;
    this.date = date;
  }

  @Override
  public String toString() {
    return "Repayment{" +
      "当月本金 = " + principal +
      ", 还款期数 = " + index +
      ", 当月利息 = " + interest +
      ", 还款日期 = " + date +
      "}";
  }

  public double getPrincipal() {
    return principal;
  }

  public void setPrincipal(double principal) {
    this.principal = principal;
  }

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }

  public double getInterest() {
    return interest;
  }

  public void setInterest(double interest) {
    this.interest = interest;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }
}

