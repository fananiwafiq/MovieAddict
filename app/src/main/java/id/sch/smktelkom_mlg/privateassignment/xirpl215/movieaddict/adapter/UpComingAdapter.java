package id.sch.smktelkom_mlg.privateassignment.xirpl215.movieaddict.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.privateassignment.xirpl215.movieaddict.R;
import id.sch.smktelkom_mlg.privateassignment.xirpl215.movieaddict.model.Result;

/**
 * Created by wafiq on 5/14/2017.
 */

public class UpComingAdapter extends RecyclerView.Adapter<UpComingAdapter.ViewHolder> {
    ArrayList<Result> list;
    UpComingAdapter.IUpComingAdapter mIUpComingAdapter;
    Context context;

    public UpComingAdapter(Context context, ArrayList<Result> list) {
        this.list = list;
        this.context = context;
        mIUpComingAdapter = (UpComingAdapter.IUpComingAdapter) context;
    }

    @Override
    public UpComingAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.source_list, parent, false);
        UpComingAdapter.ViewHolder vh = new UpComingAdapter.ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(UpComingAdapter.ViewHolder holder, int position) {
        Result result = list.get(position);
        holder.tvName.setText(result.title);
        holder.tvDesc.setText(result.overview);
        Glide.with(context)
                .load("http://image.tmdb.org/t/p/w500" + result.poster_path)
                .into(holder.ivPoster);
    }


    @Override
    public int getItemCount() {
        if (list != null)
            return list.size();
        return 0;
    }

    public interface IUpComingAdapter {
        void showArticles(String title, String overview, String poster_path);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvDesc;
        ImageView ivPoster;

        //top rated
        public ViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.textViewName);
            tvDesc = (TextView) itemView.findViewById(R.id.textViewDesc);
            ivPoster = (ImageView) itemView.findViewById(R.id.imageViewPoster);
        }
    }
}
