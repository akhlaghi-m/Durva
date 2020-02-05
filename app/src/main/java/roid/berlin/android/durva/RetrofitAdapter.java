package roid.berlin.android.durva;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RetrofitAdapter extends RecyclerView.Adapter<RetrofitAdapter.MyViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<ModelRecycler> dataModelArrayList;

    public RetrofitAdapter(Context ctx, ArrayList<ModelRecycler> dataModelArrayList){

        inflater = LayoutInflater.from(ctx);
        this.dataModelArrayList = dataModelArrayList;
    }

    @Override
    public RetrofitAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(RetrofitAdapter.MyViewHolder holder, int position) {

        Glide.with(holder.iv.getContext()).load(dataModelArrayList.get(position).getImageUrl()).into(holder.iv);

        holder.page_title.setText(dataModelArrayList.get(position).getPageTitle());
        holder.title.setText(dataModelArrayList.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return dataModelArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView page_title,title;
        ImageView iv;
        public MyViewHolder(View itemView) {
            super(itemView);

            page_title =itemView.findViewById(R.id.page_title);
            title =  itemView.findViewById(R.id.title);
            iv =  itemView.findViewById(R.id.image);
        }

    }
}
