package com.example.week11;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import android.widget.TextView;

import java.util.List;

public class TeamFragment extends Fragment {

    private TextView teamListTextView;
    private DataProvider dataProvider;

    public TeamFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_team, container, false);

        teamListTextView = rootView.findViewById(R.id.teamListTextView);

        dataProvider = new DataProvider();

        List<Team> teams = dataProvider.createSampleTeams();

        StringBuilder teamNames = new StringBuilder();
        for (Team team : teams) {
            teamNames.append(team.getName()).append("\n");
        }
        teamListTextView.setText(teamNames.toString());

        return rootView;
    }
}
