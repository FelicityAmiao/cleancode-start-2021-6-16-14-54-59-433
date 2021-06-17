package com.tw.academy.basic.$6_primitive_obsession.practiceTwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderInfo {

  private List<CourtBookedItem> courtBookedItems = new ArrayList<>();

  public OrderInfo() {

  }

  public void saveOneOrderInfo(String id, HashMap<String, HashMap<String, Integer>> monthMap) {
    CourtBookedItem courtBookedItem = findCourtBookedItemByCourtId(id);
    if(courtBookedItem != null) {
      saveCurrentMonthMapToSameCourt(monthMap, courtBookedItem);
      return;
    }
    saveNewCourtBookedItem(id, monthMap);
  }

  private void saveNewCourtBookedItem(String id, HashMap<String, HashMap<String, Integer>> monthMap) {
    courtBookedItems.add(new CourtBookedItem(id, monthMap));
  }

  private void saveCurrentMonthMapToSameCourt(HashMap<String, HashMap<String, Integer>> monthMap, CourtBookedItem courtBookedItem) {
    courtBookedItem.getBookedMonths().putAll(monthMap);
  }

  private CourtBookedItem findCourtBookedItemByCourtId(String courtId) {
    CourtBookedItem result = null;
    for (CourtBookedItem courtBookedItem : courtBookedItems) {
      if (courtBookedItem.getCourtId().equals(courtId)) {
        result = courtBookedItem;
      }
    }
    return result;
  }

  public HashMap<String, HashMap<String, Integer>> getBookedItemsByCourtId(String id) {
    for (CourtBookedItem courtBookedItem : courtBookedItems) {
      if(courtBookedItem.getCourtId().equals(id)) {
        return courtBookedItem.getBookedMonths();
      }
    }
    return null;
  }
}
