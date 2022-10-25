package com.example.tarea5;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FoodRecetas extends AppCompatActivity {
    String foodFromMenu, foodToShow;
    TextView txtReceta, txtFoodName, txtFoodTitle;
    ImageView imgFoodReceta;
    ImageView imgBack, imgExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_recetas);
        getFoodFromList();
        appComponents();
        getFoodFromList();

        //   txtReceta.setText("sa");
    }
    public void showFoodListChoosen() {
        switch (foodFromMenu) {
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
    public void getFoodFromList(){
        Bundle getFood = getIntent().getExtras();
        foodFromMenu = getFood.getString("comida");
        foodToShow = getFood.getString("comidaReceta");
    }
    public void appComponents(){
        txtReceta = findViewById(R.id.txtReceta);
        txtFoodName = findViewById(R.id.txtFoodName);
        txtFoodTitle = findViewById(R.id.txtFoodTitle);
        imgFoodReceta = findViewById(R.id.imgFoodReceta);
        imgBack = findViewById(R.id.imgBack);
        imgExit = findViewById(R.id.imgExitApp);
        txtReceta.setMovementMethod(new ScrollingMovementMethod());
    }

    public void goBackToMenu(View view) {
        Intent intent = new Intent(this, FoodMenu.class);
        startActivity(intent);
    }
    public void recetasDesayuno(){
        switch (foodToShow) {
            case "d0":
                break;
            case "d1":
                break;
            case "d2":
                break;
            case "d3":
                break;
            default:
        }
    }

}