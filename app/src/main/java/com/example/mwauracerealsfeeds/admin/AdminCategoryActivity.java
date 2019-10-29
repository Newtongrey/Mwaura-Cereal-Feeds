package com.example.mwauracerealsfeeds.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.mwauracerealsfeeds.R;

public class AdminCategoryActivity extends AppCompatActivity {
    private ImageView rabbit,cow,chicken,goat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        rabbit = (ImageView) findViewById(R.id.rabbit);
        cow = (ImageView) findViewById(R.id.cow);
        chicken = (ImageView) findViewById(R.id.chicken);
        goat = (ImageView) findViewById(R.id.goat);

        rabbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "rabbit feeds");
                startActivity(intent);
            }
        });


        cow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "cow feeds");
                startActivity(intent);
            }
        });


        chicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "chicken feeds");
                startActivity(intent);
            }
        });


        goat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "goat feeds");
                startActivity(intent);
            }
        });
    }
}
