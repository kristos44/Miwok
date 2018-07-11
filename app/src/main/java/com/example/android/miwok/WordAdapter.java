package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by krzysztof on 07.03.18.
 */

public class WordAdapter<W> extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(@NonNull Context context, @NonNull List<Word> words, int colorResourceId) {
        super(context, 0, words);

        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        final Word word = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(word.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(word.getDefaultTranslation());

        int imageResourceId = word.getImageResourceId();
        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        if(imageResourceId != 0) {
            image.setImageResource(imageResourceId);
        } else {
            image.setVisibility(View.GONE);
        }

        LinearLayout listItemLinearLayout = (LinearLayout) listItemView.findViewById(R.id.list_item_linear_layout);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        listItemLinearLayout.setBackgroundColor(color);

//        listItemLinearLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), word.getSoundResourceId());
//                mediaPlayer.start();
//            }
//        });

        return listItemView;
    }
}
