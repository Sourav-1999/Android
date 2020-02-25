package com.sourav.recycleractivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

public class Recycler extends AppCompatActivity {
    int[] images;
    String[] names;
    Recycler recyclerview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rview);
        images= new int[]{R.drawable.cupcake, R.drawable.jelly, R.drawable.kitkat };
        names=new String[]{"cupcake", "jelly", "kitkat"};

        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(RecyclerViewActivity.this);
        adaptor adapter=new VersionsAdapter(RecyclerViewActivity.this,getList(images,names));
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }
    private List<AndroidVersion> getList(int[] images, String[] names)
    {
        List<AndroidVersion> list=new ArrayList<>();
        for(int i=0;i<images.length;i++){
            AndroidVersion version=new AndroidVersion();
            version.setImage(images[i]);
            version.setName(names[i]);
            list.add(version);
        }
        return list;
    }
    }
}
