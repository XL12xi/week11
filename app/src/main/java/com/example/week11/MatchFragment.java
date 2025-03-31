package com.example.week11;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import android.widget.TextView;
import java.util.List;
import java.util.stream.Collectors;

public class MatchFragment extends Fragment {

    private TextView matchListTextView;
    private DataProvider dataProvider;

    public MatchFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_match, container, false);

        matchListTextView = rootView.findViewById(R.id.matchListTextView);

        dataProvider = new DataProvider();

        List<Match> matches = dataProvider.createSampleMatches();
        String matchDetails = matches.stream()
                .map(match -> match.getHomeTeam() + " vs " + match.getAwayTeam() + "\n"
                        + match.getScore() + "\n"
                        + match.getDate() + " @ " + match.getVenue() + "\n")
                .collect(Collectors.joining("\n"));

        matchListTextView.setText(matchDetails);

        return rootView;
    }
}
