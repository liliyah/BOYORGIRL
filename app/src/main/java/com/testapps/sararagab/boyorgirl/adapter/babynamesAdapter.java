package com.testapps.sararagab.boyorgirl.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.testapps.sararagab.boyorgirl.R;
import com.testapps.sararagab.dataclass.babynames;

public class babynamesAdapter extends RecyclerView.Adapter<babynamesAdapter.babynamesViewHolder> {
    private babynames[] babynamesList;

    public babynamesAdapter(babynames[] mbabynamesList) {
        this.babynamesList = mbabynamesList;
    }

    @NonNull
    @Override
    public babynamesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.recycler_item, parent, false);
        babynamesViewHolder viewHolder = new babynamesViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull babynamesViewHolder holder, int position) {
        final babynames babyname = babynamesList[position];
        holder.nameTextView.setText(babyname.getBabyname());
        holder.nameMeaningTextView.setText(babyname.getBabyNamedesc());
    }

    @Override
    public int getItemCount() {
        return babynamesList.length;
    }

    public static class babynamesViewHolder extends RecyclerView.ViewHolder {

        public TextView nameTextView;
        public TextView nameMeaningTextView;

        public babynamesViewHolder(View itemView) {
            super(itemView);
            this.nameTextView = (TextView) itemView.findViewById(R.id.textname);
            this.nameMeaningTextView = (TextView) itemView.findViewById(R.id.textnamemeaning);
        }

    }
}

