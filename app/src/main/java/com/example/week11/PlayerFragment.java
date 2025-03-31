package com.example.week11;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import android.widget.TextView;

import java.util.List;

public class PlayerFragment extends Fragment {

    private TextView playerListTextView;
    private DataProvider dataProvider;

    public PlayerFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_player, container, false);

        playerListTextView = rootView.findViewById(R.id.playerListTextView);

        dataProvider = new DataProvider();

        List<Player> players = dataProvider.createSamplePlayers();

        StringBuilder playerNames = new StringBuilder();
        for (Player player : players) {
            playerNames.append(player.getName()).append("\n");
        }
        playerListTextView.setText(playerNames.toString());

        return rootView;
    }
}
