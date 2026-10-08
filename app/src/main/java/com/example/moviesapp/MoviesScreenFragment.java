package com.example.moviesapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.moviesapp.adapters.MovieAdapter;
import com.example.moviesapp.databinding.FragmentMoviesScreenBinding;
import com.example.moviesapp.models.MovieModel;

public class MoviesScreenFragment extends Fragment {

    FragmentMoviesScreenBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMoviesScreenBinding.inflate(inflater, container, false);

        binding.moviesRV.setLayoutManager(new LinearLayoutManager(container.getContext()));

        var adapter = new MovieAdapter(MovieModel.generateMovies());
        binding.moviesRV.setAdapter(adapter);

        return binding.getRoot();
    }
}