package com.example.blacckkiller.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.

public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);


        String[] forercastarray = {
                "Hoy", "soliado","22/23",

        };

        List<String> forescast = new ArrayList<String>(Arrays.asList(forercastarray));
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forescast,
                R.id.expandableListView,

                forescast
        );

        ListView lista = (ListView) rootView.findViewById(R.id.list_View_forecast_texView);
        lista.setAdapter(adapter);


        return rootView;
    }
}
 */