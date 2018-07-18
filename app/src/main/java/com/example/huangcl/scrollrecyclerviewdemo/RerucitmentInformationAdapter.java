package com.example.huangcl.scrollrecyclerviewdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RerucitmentInformationAdapter extends RecyclerView.Adapter<RerucitmentInformationAdapter.ViewHolder> {

    Context mContext;
    List<RecruitmentInformationModel> dataList;

    public RerucitmentInformationAdapter(Context context,List<RecruitmentInformationModel> object) {
        mContext=context;
        dataList=object;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.layout_info_list_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        RecruitmentInformationModel model=dataList.get(position);
        holder.image.setImageResource(model.getImageId());
        holder.text.setText(model.getInfoText());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView text;
        public ViewHolder(View itemView) {
            super(itemView);
            image=(ImageView)itemView.findViewById(R.id.iv_icon);
            text=(TextView)itemView.findViewById(R.id.info_text);
        }
    }
}
