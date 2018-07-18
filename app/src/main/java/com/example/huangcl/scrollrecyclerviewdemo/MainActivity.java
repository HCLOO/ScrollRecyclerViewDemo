package com.example.huangcl.scrollrecyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rv_info)
    public RecyclerView infoListView;
    @BindView(R.id.rv_status)
    public RecyclerView statusListView;
    @BindView(R.id.iv_select)
    public ImageView selectImage;
    RerucitmentInformationAdapter rerucitmentInformationAdapter;
    RerucitmentStatusAdapter rerucitmentStatusAdapter;
    List infoList=new ArrayList<>();
    List statusList=new ArrayList<>();
    boolean flag=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        initInformationData();
        initStatusData();

        rerucitmentInformationAdapter=new RerucitmentInformationAdapter(this,infoList);
        infoListView.setLayoutManager(new LinearLayoutManager(this));
        infoListView.setAdapter(rerucitmentInformationAdapter);
        rerucitmentStatusAdapter=new RerucitmentStatusAdapter(this,statusList);
        statusListView.setLayoutManager(new LinearLayoutManager(this));
        statusListView.setAdapter(rerucitmentStatusAdapter);
    }

    @OnClick({R.id.iv_select})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_select:
                if (flag) {
                    selectImage.setImageResource(R.drawable.small_image_back);
                    infoListView.setVisibility(View.GONE);
                    flag=false;
                }
                else {
                    selectImage.setImageResource(R.drawable.small_image);
                    infoListView.setVisibility(View.VISIBLE);
                    flag=true;
                }
        }
    }

    public void initInformationData() {
        if(infoList!=null)
            infoList.clear();
        for(int i=0;i<4;++i)
            infoList.add(new RecruitmentInformationModel(R.drawable.small_image,"Sun to Fri: o9 Sun to Fri: o9 Sun to Fri: o9 Sun to Fri: o9 Sun to Fri: o9"));
    }

    public void initStatusData() {
        if(statusList!=null)
            statusList.clear();
        for(int i=0;i<10;++i)
            statusList.add(new RecruitmentStatusModel("22 Sep",R.drawable.small_image,"Employer signed contract"));
    }
}
