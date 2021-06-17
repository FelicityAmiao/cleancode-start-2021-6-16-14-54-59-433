package com.tw.academy.basic.$6_primitive_obsession.practiceTwo;

import java.util.HashMap;

public class OrderInfo {

  private HashMap<String, HashMap<String, HashMap<String, Integer>>> ordered = new HashMap<>();

  public OrderInfo() {

  }

  public HashMap<String, HashMap<String, HashMap<String, Integer>>> getOrdered() {
    return ordered;
  }

  public void setOrdered(HashMap<String, HashMap<String, HashMap<String, Integer>>> ordered) {
    this.ordered = ordered;
  }
}
