package com.demoapp;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class listingData {
    public static LinkedHashMap<String, List<String>> getData() {
        LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<String, List<String>>();
        {
        List<String> MainPoint1 = new ArrayList<String>();
        MainPoint1.add("SubPoint 1.1");
        MainPoint1.add("SubPoint 1.2");
        MainPoint1.add("SubPoint 1.3");
        MainPoint1.add("SubPoint 1.4");
        MainPoint1.add("SubPoint 1.5");
        expandableListDetail.put("MainPoint 1", MainPoint1);

        List<String> MainPoint2 = new ArrayList<String>();
        MainPoint2.add("SubPoint 2.1");
        MainPoint2.add("SubPoint 2.2");
        MainPoint2.add("SubPoint 2.3");
        MainPoint2.add("SubPoint 2.4");
        MainPoint2.add("SubPoint 2.5");
        expandableListDetail.put("MainPoint 2 ", MainPoint2);

        List<String> MainPoint3 = new ArrayList<String>();
        MainPoint3.add("SubPoint 3.1");
        MainPoint3.add("SubPoint 3.2");
        MainPoint3.add("SubPoint 3.3");
        MainPoint3.add("SubPoint 3.4");
        MainPoint3.add("SubPoint 3.5");
        expandableListDetail.put("MainPoint 3 ", MainPoint3);

        List<String> MainPoint4 = new ArrayList<String>();
        MainPoint4.add("SubPoint 4.1");
        MainPoint4.add("SubPoint 4.2");
        MainPoint4.add("SubPoint 4.3");
        MainPoint4.add("SubPoint 4.4");
        MainPoint4.add("SubPoint 4.5");
        expandableListDetail.put("MainPoint 4 ", MainPoint4);

        List<String> MainPoint5 = new ArrayList<String>();
        MainPoint5.add("SubPoint 5.1");
        MainPoint5.add("SubPoint 5.2");
        MainPoint5.add("SubPoint 5.3");
        MainPoint5.add("SubPoint 5.4");
        MainPoint5.add("SubPoint 5.5");
        expandableListDetail.put("MainPoint 5 ", MainPoint5);

        List<String> MainPoint6 = new ArrayList<String>();
        MainPoint6.add("SubPoint 6.1");
        MainPoint6.add("SubPoint 6.2");
        MainPoint6.add("SubPoint 6.3");
        MainPoint6.add("SubPoint 6.4");
        MainPoint6.add("SubPoint 6.5");

        expandableListDetail.put("MainPoint 6 ", MainPoint6);
    }
        return expandableListDetail;
    }
}
