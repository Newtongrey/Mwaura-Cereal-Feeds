package com.example.mwauracerealsfeeds.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;
import com.example.mwauracerealsfeeds.R;
import com.example.mwauracerealsfeeds.models.Products;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class DetailFragment extends Fragment {
    View view;
    private Button addToCartButton;
    private ImageView productImage;
    private ElegantNumberButton numberButton;
    private TextView productPrice, productDescription, productName, productLocation;
    private String productID = "", state = "Normal";



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_detail, container, false);

        productID = getActivity().getIntent().getExtras().getString("pid");

        addToCartButton =  view.findViewById(R.id.pd_add_to_cart_button);
        numberButton = view.findViewById(R.id.number_btn);
        productImage = view.findViewById(R.id.product_image_details);
        productName = view.findViewById(R.id.product_name_details);
        productDescription = view.findViewById(R.id.product_description_details);
        productPrice =  view.findViewById(R.id.product_price_details);
        productLocation = view.findViewById(R.id.product_location_details);

        getProductDetails(productID);


        return view;
    }

    private void getProductDetails(String productID) {
        DatabaseReference productsRef = FirebaseDatabase.getInstance().getReference().child("Products");

        productsRef.child(productID).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    Products products = dataSnapshot.getValue(Products.class);

                    productName.setText(products.getName());
                    productPrice.setText(products.getPrice());
                    productDescription.setText(products.getDescription());
                    productLocation.setText(products.getLocation());
                    Picasso.get().load(products.getImage()).into(productImage);
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

}

