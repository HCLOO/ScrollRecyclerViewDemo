package com.example.huangcl.scrollrecyclerviewdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class RerucitmentStatusAdapter extends RecyclerView.Adapter<RerucitmentStatusAdapter.ViewHolder> {

    Context mContext;
    List<RecruitmentStatusModel> dataList;

    public RerucitmentStatusAdapter(Context context,List<RecruitmentStatusModel> object) {
        mContext=context;
        dataList=object;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.layout_status_list_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        RecruitmentStatusModel model=dataList.get(position);
        if(position==0) {
            holder.line.setVisibility(View.GONE);
        }
        holder.date.setText(model.getDate());
        holder.image.setImageResource(model.getImageId());
        holder.event.setText(model.getStatusText());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView date;
        ImageView image;
        TextView event;
        RelativeLayout line;
        public ViewHolder(View itemView) {
            super(itemView);
            date=(TextView)itemView.findViewById(R.id.tv_date);
            image=(ImageView)itemView.findViewById(R.id.iv_isselect);
            event=(TextView)itemView.findViewById(R.id.tv_event);
            line=(RelativeLayout) itemView.findViewById(R.id.status_line);
        }
    }
}
