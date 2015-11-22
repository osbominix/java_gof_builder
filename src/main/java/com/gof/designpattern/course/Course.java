package com.gof.designpattern.course;

/**
 * Created by yl3 on 22.11.15.
 */
public class Course {

    private String type = "";

    private String topic = "";

    private String entryTime = "";

    private String price = "";

    public void setType(String type) {
        this.type = type;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void printDetails() {
        System.out.println("course type: " + type);
        System.out.println("course topic: " + topic);
        System.out.println("course entry time: " + entryTime);
        System.out.println("course price: " + price);
    }
}
