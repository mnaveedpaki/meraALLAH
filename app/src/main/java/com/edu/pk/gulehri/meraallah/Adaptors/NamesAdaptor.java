package com.edu.pk.gulehri.meraallah.Adaptors;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.edu.pk.gulehri.meraallah.Model.Model;
import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.UI.DetailActivity;
import com.edu.pk.gulehri.meraallah.UI.NamesActivity;

public class NamesAdaptor extends RecyclerView.Adapter<NamesAdaptor.NamesHolder> {

    public static final String ITEM_NAME = "Item Name";
    public static boolean flag;
    private final Context mContext;

    public NamesAdaptor(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public NamesAdaptor.NamesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.name_view, parent, false);
        return new NamesHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NamesAdaptor.NamesHolder holder, int position) {

        try {
            if (flag) {
                Intent intent = ((Activity) mContext).getIntent();
                String nameOfMenu = intent.getStringExtra("MenuName");

                if (nameOfMenu.equals("Asma Ul Husna")) {
                    holder.nameArabic.setText(Model.ALLAH[position].getALLAH_NAMES_ARABIC());
                    holder.nameEnglish.setText(Model.ALLAH[position].getALLAH_NAMES_ENGLISH());
                } else if (nameOfMenu.equals("Asma Ul Rasool")) {
                    holder.nameArabic.setText(Model.MUHAMMAD[position].getMUHAMMAD_NAMES_ARABIC());
                    holder.nameEnglish.setText(Model.MUHAMMAD[position].getMUHAMMAD_NAMES_ENGLISH());
                }

            } else {
                if (NamesActivity.clickedItem.equals("Asma Ul Husna")) {
                    holder.nameArabic.setText(Model.ALLAH[position].getALLAH_NAMES_ARABIC());
                    holder.nameEnglish.setText(Model.ALLAH[position].getALLAH_NAMES_ENGLISH());
                } else if (NamesActivity.clickedItem.equals("Asma Ul Rasool")) {
                    holder.nameArabic.setText(Model.MUHAMMAD[position].getMUHAMMAD_NAMES_ARABIC());
                    holder.nameEnglish.setText(Model.MUHAMMAD[position].getMUHAMMAD_NAMES_ENGLISH());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(mContext, DetailActivity.class);
            intent.putExtra("menuName", NamesActivity.clickedItem);
            intent.putExtra("itemPosition", position);
            intent.putExtra(ITEM_NAME, holder.nameEnglish.getText());
            mContext.startActivity(intent);
        });
        if (Model.position == position){
            holder.carLayout.setBackgroundColor(ContextCompat.getColor(mContext, R.color.white));
        }
        else
            holder.carLayout.setBackgroundColor(ContextCompat.getColor(mContext, R.color.card_color));
    }


    @Override
    public int getItemCount() {

        try {
            if (flag) {
                Intent intent = ((Activity) mContext).getIntent();
                String menuName = intent.getStringExtra("MenuName");

                if (menuName.equals("Asma Ul Husna")) {
                    return Model.ALLAH.length;
                } else return Model.MUHAMMAD.length;
            } else {
                if (NamesActivity.clickedItem.equals("Asma Ul Husna")) {
                    return Model.ALLAH.length;
                } else return Model.MUHAMMAD.length;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    static class NamesHolder extends RecyclerView.ViewHolder {

        LinearLayout carLayout;
        TextView nameArabic, nameEnglish;

        public NamesHolder(@NonNull View itemView) {
            super(itemView);

            carLayout = itemView.findViewById(R.id.cardLayout);
            nameArabic = itemView.findViewById(R.id.nameArabic);
            nameEnglish = itemView.findViewById(R.id.nameEnglish);

        }
    }

}
