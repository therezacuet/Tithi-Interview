package com.android.tithiinterview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.android.tithiinterview.R;
import com.android.tithiinterview.model.ChildModel;

import java.util.ArrayList;

public class DisSpinnerAdapter extends ArrayAdapter<String> {

    private final LayoutInflater mInflater;
    private final Context mContext;
    private final ArrayList<ChildModel> items;
    private final int mResource;

    public DisSpinnerAdapter(@NonNull Context context, @LayoutRes int resource,
                             @NonNull ArrayList objects) {
        super(context, resource, 0, objects);

        mContext = context;
        mInflater = LayoutInflater.from(context);
        items = objects;
        mResource = resource;
    }
    @Override
    public View getDropDownView(int position, @Nullable View convertView,
                                @NonNull ViewGroup parent) {
        return createItemView(position, convertView, parent);
    }

    @Override
    public @NonNull View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return createItemView(position, convertView, parent);
    }

    private View createItemView(int position, View convertView, ViewGroup parent){

        final View view = mInflater.inflate(
                R.layout.item_spinner, parent, false);

        TextView name = (TextView) view.findViewById(R.id.tvName);
        ChildModel data = items.get(position);
        name.setText(data.getName());

        return view;
    }
}