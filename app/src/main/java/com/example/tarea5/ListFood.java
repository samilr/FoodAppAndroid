package com.example.tarea5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.Arrays;
import java.util.List;

public class ListFood extends AppCompatActivity {
    Spinner spFood;
    List<String> list = Arrays.asList("Desayuno", "Almuerzo", "Merienda", "Cena", "Frutas");
    String foodChoosen;
    ImageView imgContinue, imgBack, imgExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);
        appComponents();
    }
    public void goToActivityFoodInfo(View view) {
        foodChoosen = spFood.getSelectedItem().toString();
        Intent intent = new Intent(this, FoodMenu.class);
        intent.putExtra("comida", foodChoosen);
        startActivity(intent);
    }

    public void appComponents(){
        spFood = findViewById(R.id.spFood);
        imgContinue = findViewById(R.id.imgContinue);
        imgBack = findViewById(R.id.imgBack);
        imgExit = findViewById(R.id.imgExitApp);

        ArrayAdapter<String> adapter = new ArrayAdapter<String> (this ,
                android.R. layout. simple_spinner_dropdown_item, list);
        spFood.setAdapter(adapter);
    }

}