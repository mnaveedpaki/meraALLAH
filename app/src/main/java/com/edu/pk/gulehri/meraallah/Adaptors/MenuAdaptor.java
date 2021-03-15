package com.edu.pk.gulehri.meraallah.Adaptors;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.edu.pk.gulehri.meraallah.Model.Model;
import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.UI.NamesActivity;

public class MenuAdaptor extends RecyclerView.Adapter<MenuAdaptor.MyHolder> {

    public static final String MENU_NAME = "Main_Menu";
    public static String getName;
    private final Context mContext;

    public MenuAdaptor(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public MenuAdaptor.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.single_item, parent, false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuAdaptor.MyHolder holder, int position) {
        holder.image.setImageResource(Model.menu[position].getIMAGE_ID());
        holder.name.setText(Model.menu[position].getMENU_NAME());

        holder.itemView.setOnClickListener(v -> {

            NamesAdaptor.flag = false;
            getName = holder.name.getText().toString();
            Intent intent = new Intent(mContext, NamesActivity.class);
            intent.putExtra(MENU_NAME, getName);
            mContext.startActivity(intent);

        });
    }

    @Override
    public int getItemCount() {
        return Model.menu.length;
    }

    static class MyHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);
        }
    }
}
