package com.tw.academy.basic.$6_primitive_obsession.practiceTwo;


import java.util.HashMap;

public class OrderService {

    private HashMap<String, HashMap<String, HashMap<String, Integer>>> ordered = new HashMap<>();
    private OrderInfo orderInfo = new OrderInfo();

    public String order(String id, String month, String time) {
        String[] timeArr = time.split("~");

        if (hasBeenOrdered(id, month, timeArr)){
            return "Error: something wrong, please call the manager.";
        }

        HashMap<String, Integer> timeMap = new HashMap<>();
        timeMap.put("max", Integer.parseInt(timeArr[1].split(":")[0]));
        timeMap.put("min", Integer.parseInt(timeArr[0].split(":")[0]));
        HashMap<String, HashMap<String, Integer>> monthMap = new HashMap<>();
        monthMap.put(month, timeMap);
        getOrdered().put(id, monthMap);
        return "Success! You can use the No." + id + " court during " + month + " " + time + ".";
    }

    public Boolean hasBeenOrdered(String id, String month, String[] timeArr) {
        HashMap<String, HashMap<String, Integer>> countHasBook = getOrdered().getOrDefault(id, null);
        if (countHasBook == null) {
            return false;
        }
        HashMap<String, Integer> countHasBookInThisMonth = countHasBook.getOrDefault(month, null);
        if (countHasBookInThisMonth == null) {
            return false;
        }
        if (isToBeOrderedMinTimeHourInsideBookingTime(timeArr, countHasBookInThisMonth)) {
            return true;
        }
        if (isToBeOrderedMaxTimeHourInsideBookingDate(timeArr, countHasBookInThisMonth)) {
            return true;
        }
        return false;
    }

    private boolean isToBeOrderedMaxTimeHourInsideBookingDate(String[] timeArr, HashMap<String, Integer> countHasBookInThisMonth) {
        return countHasBookInThisMonth.get("min") <= getToBeOrderedMaxTimeHour(timeArr)
            && getToBeOrderedMaxTimeHour(timeArr) <= countHasBookInThisMonth.get("max");
    }

    private boolean isToBeOrderedMinTimeHourInsideBookingTime(String[] timeArr, HashMap<String, Integer> countHasBookInThisMonth) {
        return countHasBookInThisMonth.get("min") <= getToBeOrderedMinTimeHour(timeArr)
            && getToBeOrderedMinTimeHour(timeArr) <= countHasBookInThisMonth.get("max");
    }

    private Integer getToBeOrderedMinTimeHour(String[] timeArr) {
        return Integer.parseInt(timeArr[0].split(":")[0]);
    }

    private Integer getToBeOrderedMaxTimeHour(String[] timeArr) {
        return Integer.parseInt(timeArr[1].split(":")[0]);
    }

    /**
     * 已预定
     */
    public HashMap<String, HashMap<String, HashMap<String, Integer>>> getOrdered() {
        return orderInfo.getOrdered();
    }

    /* other functions */
}
