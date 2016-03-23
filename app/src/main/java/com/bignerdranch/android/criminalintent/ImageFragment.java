package com.bignerdranch.android.criminalintent;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageFragment extends DialogFragment {



    public static final String ARG_IMAGE = "image";

    private ImageView mImageView;

    public static ImageFragment newInstance(String image) {
        Bundle args = new Bundle();
        args.putSerializable(ARG_IMAGE, image);

        ImageFragment fragment = new ImageFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup parent, Bundle savedInstanceState) {
        mImageView = new ImageView(getActivity());
        String location = (String) getArguments().getSerializable(ARG_IMAGE);
        Bitmap image = PictureUtils.getScaledBitmap(location, getActivity());

        mImageView.setImageBitmap(image);

        return mImageView;
    }
}
