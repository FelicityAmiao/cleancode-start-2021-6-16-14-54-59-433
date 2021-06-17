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

  public HashMap<String, HashMap<String, Integer>> saveOneOrderInfo(String id, HashMap<String, HashMap<String, Integer>> monthMap) {
      return getOrdered().put(id, monthMap);
  }

  public HashMap<String, HashMap<String, Integer>> getBookedItemsByCourtId(String id) {
      return getOrdered().getOrDefault(id, null);
  }
}
