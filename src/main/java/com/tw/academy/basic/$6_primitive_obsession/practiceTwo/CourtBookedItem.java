package com.tw.academy.basic.$6_primitive_obsession.practiceTwo;

import java.util.HashMap;

public class CourtBookedItem {

  private String courtId;
  private HashMap<String, HashMap<String, Integer>> bookedMonths;

  public CourtBookedItem(String courtId, HashMap<String, HashMap<String, Integer>> bookedMonths) {
    this.courtId = courtId;
    this.bookedMonths = bookedMonths;
  }

  public String getCourtId() {
    return courtId;
  }

  public HashMap<String, HashMap<String, Integer>> getBookedMonths() {
    return bookedMonths;
  }
}
