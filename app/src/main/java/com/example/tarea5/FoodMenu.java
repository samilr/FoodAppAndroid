package com.example.tarea5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class FoodMenu extends AppCompatActivity {
    String foodTypeFromList, foodReceta;
    TextView txtFoodType, txtFood1, txtFood2, txtFood3, txtFood4;
    ImageView imgMenu, imgMenu2, imgMenu3, imgMenu4, imgBack, imgExit;
    FrameLayout fl1, fl2, fl3, fl4;
    String desayuno[] = new String[]{"YOGUR DE AVELLANAS Y VAINILLA", "TORTITAS DE AVENA CON PLÁTANO"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);
        getFoodChoosenFromList();
        appComponents();
        showFoodListChoosen();
    }
    public void showFoodListChoosen() {
        switch (foodTypeFromList) {
            case "Desayuno":
                getDesayuno();
                break;
            case "almuerzo":
                break;
            case "merienda":
                break;
            case "cena":
                break;
            default:

        }
    }

    public void getFoodChoosenFromList(){
        Bundle getFood = getIntent().getExtras();
        foodTypeFromList = getFood.getString("comida");
    }

    public void appComponents(){
        imgMenu = findViewById(R.id.imgMenu);
        imgMenu2 = findViewById(R.id.imgMenu2);
        imgMenu3 = findViewById(R.id.imgMenu3);
        imgMenu4 = findViewById(R.id.imgMenu4);
        fl1 = findViewById(R.id.fl1);
        fl2 = findViewById(R.id.fl2);
        fl3 = findViewById(R.id.fl3);
        fl4 = findViewById(R.id.fl4);

        imgBack = findViewById(R.id.imgBack);
        imgExit = findViewById(R.id.imgExitApp);
        txtFoodType = findViewById(R.id.txtFoodType);
        txtFood1 = findViewById(R.id.txtFood1);
        txtFood2 = findViewById(R.id.txtFood2);
        txtFood3 = findViewById(R.id.txtFood4);
        txtFood4 = findViewById(R.id.txtFood4);
    }

    public void goBackToListFood(View view) {
        Intent intent = new Intent(this, FoodRecetas.class);
        startActivity(intent);
    }

    public void goToActivityFoodRecetas1(View view) {
        Intent intent = new Intent(this, FoodRecetas.class);
        foodReceta = txtFood1.getText().toString();

        switch (foodReceta) {
            case "YOGUR DE AVELLANAS Y VAINILLA":
                intent.putExtra("desayuno", "d0");
                break;
            case "TORTITAS DE AVENA CON PLÁTANO":
                intent.putExtra("desayuno", "d1");
                break;
            case "merienda":
                break;
            case "cena":
                break;
            default:
        }
        intent.putExtra("tipo", foodTypeFromList);
        startActivity(intent);
    }
    public void goToActivityFoodRecetas2(View view) {
        Intent intent = new Intent(this, FoodRecetas.class);
        foodReceta = txtFood2.getText().toString();

        switch (foodReceta) {
            case "TORTITAS DE AVENA CON PLÁTANO":
                intent.putExtra("desayuno", "d1");
                break;
            case "merienda":
                break;
            case "cena":
                break;
            default:
        }
        intent.putExtra("tipo", foodTypeFromList);
        startActivity(intent);
    }

    public void getDesayuno(){
        txtFood1.setText(desayuno[0]);
        imgMenu.setImageResource(R.drawable.d0);

        txtFood2.setText(desayuno[1]);
        imgMenu2.setImageResource(R.drawable.d1);
    }

}