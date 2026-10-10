package com.example.moviesapp.adapters;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.moviesapp.R;
import com.example.moviesapp.models.MovieModel;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    private List<MovieModel> moviesData;
    public MovieAdapter(List<MovieModel> moviesData) {
        this.moviesData = moviesData;
    }

    @NonNull
    @Override
    public MovieAdapter.MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movies_item, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.MovieViewHolder holder, int position) {
        holder.setData(moviesData.get(position));
    }

    @Override
    public int getItemCount() {
        return moviesData.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgPoster;
        private TextView tvRatingLabel;
        private TextView tvPlanLabel;
        private TextView tvName;
        private TextView tvDate;
        private TextView tvTime;
        private TextView tvGenre;
        private TextView tvPG;
        private TextView tvType;
        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPoster = itemView.findViewById(R.id.imgPoster);
            tvRatingLabel = itemView.findViewById(R.id.tvRatingLabel);
            tvPlanLabel = itemView.findViewById(R.id.tvPlanLabel);
            tvName = itemView.findViewById(R.id.tvName);
            tvDate = itemView.findViewById(R.id.tvDate);
            tvTime = itemView.findViewById(R.id.tvTime);
            tvGenre = itemView.findViewById(R.id.tvGenre);
            tvPG = itemView.findViewById(R.id.tvPG);
            tvType = itemView.findViewById(R.id.tvType);
        }
        public void setData(MovieModel item){
            imgPoster.setImageResource(item.getPosterResId());
            tvRatingLabel.setText(String.valueOf(item.getRating()));

            // Check type of plan.
            if (item.getPlanType() == MovieModel.PlanType.FREE) {
                tvPlanLabel.setText("Free");
                tvPlanLabel.setBackgroundTintList(ContextCompat.getColorStateList(itemView.getContext(), R.color.cyan));
            } else {
                tvPlanLabel.setText("Premium");
                tvPlanLabel.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#ED8A19")));
            }

            tvName.setText(item.getTitle());
            tvDate.setText(String.valueOf(item.getReleaseYear()));
            tvTime.setText(String.valueOf(item.getRuntimeMinutes() + " Minutes"));
            tvGenre.setText(item.getGenre());
            tvPG.setText(item.getContentRating());
            tvType.setText(" |  Movie");
        }
    }
}
