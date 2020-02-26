package com.sourav.recycleractivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.List;
import java.util.zip.Deflater;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class VersionAdapter extends RecyclerView.Adapter<VersionAdapter.VersionHolder>{

    public VersionAdapter(Context context, List<AndroidVersion> list) {
        this.context = context;
        this.list = list;
    }

    private Context context;
    private List<AndroidVersion> list;
    private AlertDialog.Builder builder;

    @NonNull
    @Override
    public VersionHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.single_card,parent, false);
        return new VersionHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final VersionHolder holder, final int position) {
        holder.getName().setText(list.get(position).getName());
        holder.getImage().setImageResource(list.get(position).getImage());

        holder.getName().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                builder = new AlertDialog.Builder(context);
                builder.setCancelable(false);
                builder.setTitle("Logout");
                builder.setMessage("Are You Sure?");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Deflater activity = null;
                        activity.finish();
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which   ) {
                        dialog.dismiss();
                    }
                });



                /*Toast.makeText(context, "position : " + position +
                                " Name : " +list.get(position).getName(),
                        Toast.LENGTH_SHORT).show();
                Snackbar snackbar = Snackbar
                        .make(holder.getLayout(), "Welcome to AndroidHive", Snackbar.LENGTH_LONG);

                snackbar.show();*/

            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class VersionHolder extends RecyclerView.ViewHolder{

        public VersionHolder(@NonNull View itemView){
            super(itemView);
        }

        TextView getName(){
            return itemView.findViewById(R.id.textView);
        }
        ImageView getImage(){
            return itemView.findViewById(R.id.imageView);
        }
        ConstraintLayout getLayout(){
            return itemView.findViewById(R.id.single_card);
        }
    }

}
