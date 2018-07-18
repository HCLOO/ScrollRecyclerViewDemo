package com.example.huangcl.scrollrecyclerviewdemo;

public class RecruitmentInformationModel {

    int imageId;
    String infoText;

    public RecruitmentInformationModel(int imageId,String infoText) {
        this.imageId=imageId;
        this.infoText=infoText;
    }

    public int getImageId() {
        return imageId;
    }

    public String getInfoText() {
        return infoText;
    }
}
