package edu.csteitz01bellarmine.stormy.adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import edu.csteitz01bellarmine.stormy.R;
import edu.csteitz01bellarmine.stormy.Weather.Hour;
import edu.csteitz01bellarmine.stormy.databinding.HourlyListItemBinding;


public class HourlyAdapter extends RecyclerView.Adapter<HourlyAdapter.ViewHolder> {

    private List<Hour> hours;
    private Context context;

    public HourlyAdapter(List<Hour> hours, Context context) {
        this.hours = hours;
        this.context = context;
    }

    @NonNull
    @Override
    public HourlyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        HourlyListItemBinding binding = DataBindingUtil
                .inflate(LayoutInflater.from(parent.getContext()),
                        R.layout.hourly_list_item,
                        parent,
                        false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Hour hour = hours.get(position);
        holder.hourlyListItemBinding.setHour(hour);

    }

    @Override
    public int getItemCount() {
        return hours.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        // Binding Variables
        public HourlyListItemBinding hourlyListItemBinding;

        // Create a constructor to do view lookups for each subview
        public ViewHolder(HourlyListItemBinding hourlylayoutBinding) {
            super(hourlylayoutBinding.getRoot());
            hourlyListItemBinding = hourlylayoutBinding;
        }
    }
}






