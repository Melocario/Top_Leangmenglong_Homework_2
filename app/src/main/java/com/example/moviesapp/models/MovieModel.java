package com.example.moviesapp.models;

import androidx.annotation.DrawableRes;
import com.example.moviesapp.R;

import java.util.List;

public class MovieModel {

    public enum PlanType {
        FREE, PREMIUM
    }

    private final double rating;
    private final PlanType planType;
    private final String title;
    private final int releaseYear;
    private final int runtimeMinutes;
    private final String contentRating;
    private final String genre;
    private final int posterResId;

    public MovieModel(
            double rating,
            PlanType planType,
            String title,
            int releaseYear,
            int runtimeMinutes,
            String contentRating,
            String genre,
            @DrawableRes int posterResId
    ) {
        this.rating = rating;
        this.planType = planType;
        this.title = title;
        this.releaseYear = releaseYear;
        this.runtimeMinutes = runtimeMinutes;
        this.contentRating = contentRating;
        this.genre = genre;
        this.posterResId = posterResId;
    }

    public double getRating() { return rating; }
    public PlanType getPlanType() { return planType; }
    public String getTitle() { return title; }
    public int getReleaseYear() { return releaseYear; }
    public int getRuntimeMinutes() { return runtimeMinutes; }
    public String getContentRating() { return contentRating; }
    public String getGenre() { return genre; }
    public int getPosterResId() { return posterResId; }

    public static List<MovieModel> generateMovies() {
        return List.of(
                new MovieModel(4.8, PlanType.PREMIUM, "Inception", 2010, 148, "NC-15", "Sci-Fi", R.drawable.movie_3),
                new MovieModel(0.0, PlanType.FREE, "The Dark Knight", 2008, 152, "NC-15", "Action", R.drawable.movie_4),
                new MovieModel(1.5, PlanType.PREMIUM, "Pulp Fiction", 1994, 154, "R-18", "Crime", R.drawable.movie_5),
                new MovieModel(4.1, PlanType.FREE, "Interstellar", 2014, 169, "NC-15", "Sci-Fi", R.drawable.movie_6),
                new MovieModel(0.0, PlanType.PREMIUM, "Spider-Man: Into the Spider-Verse", 2018, 117, "G", "Animation", R.drawable.movie_7),
                new MovieModel(0.8, PlanType.FREE, "Parasite", 2019, 132, "R-18", "Thriller", R.drawable.movie_8),
                new MovieModel(5.0, PlanType.PREMIUM, "The Lord of the Rings: The Fellowship of the Ring", 2001, 178, "NC-15", "Fantasy", R.drawable.movie_9),
                new MovieModel(3.7, PlanType.FREE, "Spirited Away", 2001, 125, "G", "Animation", R.drawable.movie_10),
                new MovieModel(4.3, PlanType.PREMIUM, "The Matrix", 1999, 136, "NC-15", "Sci-Fi", R.drawable.movie_11),
                new MovieModel(2.1, PlanType.FREE, "Whiplash", 2014, 106, "NC-15", "Drama", R.drawable.movie_12),
                new MovieModel(3.9, PlanType.PREMIUM, "Iron Man", 2008, 126, "NC-15", "Action", R.drawable.movie_13),
                new MovieModel(4.6, PlanType.FREE, "Coco", 2017, 105, "G", "Animation", R.drawable.movie_14),
                new MovieModel(1.2, PlanType.PREMIUM, "Blade Runner 2049", 2017, 164, "R-18", "Sci-Fi", R.drawable.movie_15),
                new MovieModel(3.4, PlanType.FREE, "Grand Budapest Hotel", 2014, 99, "NC-15", "Comedy", R.drawable.movie_16),
                new MovieModel(4.9, PlanType.PREMIUM, "The Silence of the Lambs", 1991, 118, "R-18", "Horror", R.drawable.movie_17),
                new MovieModel(2.5, PlanType.FREE, "Get Out", 2017, 104, "R-18", "Horror", R.drawable.movie_18),
                new MovieModel(3.8, PlanType.PREMIUM, "Knives Out", 2019, 130, "NC-15", "Mystery", R.drawable.movie_19),
                new MovieModel(4.4, PlanType.FREE, "Toy Story", 1995, 81, "G", "Animation", R.drawable.movie_20),
                new MovieModel(1.9, PlanType.PREMIUM, "Alien", 1979, 117, "R-18", "Sci-Fi", R.drawable.movie_21),
                new MovieModel(3.0, PlanType.FREE, "Avatar", 2009, 162, "NC-15", "Action", R.drawable.movie_22)
        );
    }
}