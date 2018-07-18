package com.example.huangcl.scrollrecyclerviewdemo;

public class RecruitmentStatusModel {

    String date;
    int imageId;
    String statusText;

    public RecruitmentStatusModel(String date,int imageId,String statusText) {
        this.date=date;
        this.imageId=imageId;
        this.statusText=statusText;
    }

    public String getDate() {
        return date;
    }

    public int getImageId() {
        return imageId;
    }

    public String getStatusText() {
        return statusText;
    }
}
