package com.example.ex13_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static String[] arrayName = {"Ảnh 1", "Ảnh 2", "Ảnh 3"};
    public static int[] imageName = {R.drawable.anh1, R.drawable.anh2, R.drawable.anh3};
    GridView gridViewDemo;

    Adapter adapterDanhSach;
    ArrayList<image> arrimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridViewDemo = (GridView) findViewById(R.id.grid1);
        arrimage = new ArrayList<image>();

        adapterDanhSach = new Adapter(MainActivity.this, R.layout.list_item, arrimage);
        gridViewDemo.setAdapter(adapterDanhSach);


        for (int i = 0; i < imageName.length; i++) {
            image myimage = new image();
            myimage.setName(arrayName[i]);
            myimage.setImg(imageName[i]);
            arrimage.add(myimage);

            adapterDanhSach.notifyDataSetChanged();
        }

        gridViewDemo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                Intent intent1 = new Intent(MainActivity.this, Sub.class);

                Bundle bundle = new Bundle();
                bundle.putInt("TITLE", position);
                intent1.putExtras(bundle);
                startActivity(intent1);
            }
        });
    }
}