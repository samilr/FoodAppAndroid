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
    String foodTypeFromMenu, foodToShow;
    TextView txtReceta, txtFoodTitle;
    ImageView imgFoodReceta;
    ImageView imgBack, imgExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_recetas);
        getFoodFromList();
        appComponents();
        showFoodListChoosen();
    }
    public void showFoodListChoosen() {
        switch (foodTypeFromMenu) {
            case "Desayuno":
                recetasDesayuno();
                break;
            case "Almuerzo":
                break;
            case "Merienda":
                break;
            case "Cena":
                break;
            case "Frutas":
                break;
            default:

        }
    }
    public void getFoodFromList(){
        Bundle getFood = getIntent().getExtras();
        foodToShow = getFood.getString("desayuno");
        foodTypeFromMenu = getFood.getString("tipo");
    }
    public void appComponents(){
        txtReceta = findViewById(R.id.txtReceta);
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
                imgFoodReceta.setImageResource(R.drawable.d0);
                txtReceta.setText(R.string.d0r);
                break;
            case "d1":
                imgFoodReceta.setImageResource(R.drawable.d1);
                txtReceta.setText(R.string.d1r);
                break;
            case "d2":
                break;
            case "d3":
                break;
            default:
        }
    }

}