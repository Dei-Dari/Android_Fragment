package com.example.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * отображает детальную информацию по нажатию на пункт списка
 */
public class DetailFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);

        TextView textViewDetail = view.findViewById(R.id.textViewDetail);
        ImageView imageViewDetail = view.findViewById(R.id.imageViewDetail);

        Bundle bundle = getArguments();
        if (bundle != null) {
            String text = bundle.getString("text");
            int imageResource = bundle.getInt("imageResource");

            textViewDetail.setText(text);
            imageViewDetail.setImageResource(imageResource);
        }

        return view;
    }
}