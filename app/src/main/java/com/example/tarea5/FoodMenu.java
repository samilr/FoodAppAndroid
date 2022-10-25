package com.example.tarea5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodMenu extends AppCompatActivity {
    String foodTypeFromList;
    TextView txtFoodType;
    ImageView imgMenu, imgMenu2, imgMenu3, imgMenu4, imgBack, imgExit;
    FrameLayout fl1, fl2, fl3, fl4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);
        appComponents();
        getFoodChoosenFromList();

    }
    public void showFoodListChoosen() {
        switch (foodTypeFromList) {
            case "Desayuno":

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
    }

    public void goBackToListFood(View view) {
        Intent intent = new Intent(this, FoodRecetas.class);
        startActivity(intent);
    }

    public void goToActivityFoodRecetas(View view) {
        Intent intent = new Intent(this, FoodRecetas.class);
        startActivity(intent);
    }

}