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
    String foodType, foodToReceta;
    TextView txtReceta, txtFoodTitle;
    ImageView imgFoodReceta;
    ImageView imgBack, imgExit;
    int desayunosTitulo [] = new int[]{R.string.d0t, R.string.d1t, R.string.d2t, R.string.d3t};
    int desayunosImagenes[] = new int[]{R.drawable.d0, R.drawable.d1, R.drawable.d2, R.drawable.d3};
    int desayunosRecetas [] = new int[]{R.string.d0r, R.string.d1r, R.string.d2r, R.string.d3r};

    int almuerzoTitulo [] = new int[]{R.string.a0t, R.string.a1t, R.string.a2t, R.string.a3t};
    int almuerzoImagenes[] = new int[]{R.drawable.a0, R.drawable.a1, R.drawable.a2, R.drawable.a3};
    int almuerzoRecetas [] = new int[]{R.string.a0r, R.string.a1r, R.string.a2r, R.string.a3r};

    int meriendaTitulo [] = new int[]{R.string.m0t, R.string.m1t, R.string.m2t, R.string.m3t};
    int meriendaImagenes[] = new int[]{R.drawable.m0, R.drawable.m1, R.drawable.m2, R.drawable.m3};
    int meriendaRecetas [] = new int[]{R.string.m0r, R.string.m1r, R.string.m2r, R.string.m3r};

    int cenaTitulo [] = new int[]{R.string.c0t, R.string.c1t, R.string.c2t, R.string.c3t};
    int cenaImagenes[] = new int[]{R.drawable.c0, R.drawable.c1, R.drawable.c2, R.drawable.c3};
    int cenaRecetas [] = new int[]{R.string.c0r, R.string.c1r, R.string.c2r, R.string.c3r};

    int chatarraTitulo [] = new int[]{R.string.ch0t, R.string.ch1t, R.string.ch2t, R.string.ch3t};
    int chatarraImagenes[] = new int[]{R.drawable.ch0, R.drawable.ch1, R.drawable.ch2, R.drawable.ch3};
    int chatarraRecetas [] = new int[]{R.string.ch0r, R.string.ch1r, R.string.ch2r, R.string.ch3r};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_recetas);
        getFoodFromList();
        appComponents();
        showFoodListChoosen();
    }

    public void appComponents(){
        txtReceta = findViewById(R.id.txtReceta);
        txtFoodTitle = findViewById(R.id.txtFoodTitle);
        imgFoodReceta = findViewById(R.id.imgFoodReceta);
        imgBack = findViewById(R.id.imgBack);
        imgExit = findViewById(R.id.imgExitApp);
        txtReceta.setMovementMethod(new ScrollingMovementMethod());
    }

    public void getFoodFromList(){
        Bundle getFood = getIntent().getExtras();
        foodType = getFood.getString("comidaTipo");
        foodToReceta = getFood.getString("comida");
    }

    public void showFoodListChoosen() {
        switch (foodType) {
            case "Desayuno":
                recetasDesayuno();
                break;
            case "Almuerzo":
                recetasAlmuerzo();
                break;
            case "Merienda":
                recetasMerienda();
                break;
            case "Cena":
                recetasCena();
                break;
            case "Chatarra":
                recetasChatarra();
                break;
            default:

        }
    }

    public void recetasDesayuno(){
        switch (foodToReceta) {
            case "YOGUR DE AVELLANAS Y VAINILLA":
                /*
                txtFoodTitle.setText(getResources().getString(desayunosTitulo[0]));
                txtReceta.setText(getResources().getString(desayunosRecetas[0]));
                imgFoodReceta.setImageResource(desayunosImagenes[0]);
                 */

                setRecetaInfo(desayunosTitulo[0], desayunosRecetas[0], desayunosImagenes[0]);
                break;
            case "TORTITAS DE AVENA CON PLÁTANO":
                /*
                txtFoodTitle.setText(getResources().getString(desayunosTitulo[1]));
                txtReceta.setText(getResources().getString(desayunosRecetas[1]));
                imgFoodReceta.setImageResource(desayunosImagenes[1]);
                 */

                setRecetaInfo(desayunosTitulo[1], desayunosRecetas[1], desayunosImagenes[1]);
                break;
            case "PUDIN DE SEMILLAS DE CHÍA":
                /*
                txtFoodTitle.setText(getResources().getString(desayunosTitulo[2]));
                txtReceta.setText(getResources().getString(desayunosRecetas[2]));
                imgFoodReceta.setImageResource(desayunosImagenes[2]);
                 */

                setRecetaInfo(desayunosTitulo[2], desayunosRecetas[2], desayunosImagenes[2]);
                break;
            case "SÁNDWICH PORTOBELLO":
                /*
                txtFoodTitle.setText(getResources().getString(desayunosTitulo[3]));
                txtReceta.setText(getResources().getString(desayunosRecetas[3]));
                imgFoodReceta.setImageResource(desayunosImagenes[3]);
                 */

                setRecetaInfo(desayunosTitulo[3], desayunosRecetas[3], desayunosImagenes[3]);
                break;
            default:
        }
    }
    public void recetasAlmuerzo(){
        switch (foodToReceta) {
            case "QUESADILLAS VEGETARIANAS":
                /*
                txtFoodTitle.setText(getResources().getString(almuerzoTitulo[0]));
                txtReceta.setText(getResources().getString(almuerzoRecetas[0]));
                imgFoodReceta.setImageResource(almuerzoImagenes[0]);
                 */

                setRecetaInfo(almuerzoTitulo[0], almuerzoRecetas[0], almuerzoImagenes[0]);
                break;
            case "MEJILLONES EN ESCABECHE":
                /*
                txtFoodTitle.setText(getResources().getString(almuerzoTitulo[1]));
                txtReceta.setText(getResources().getString(almuerzoRecetas[1]));
                imgFoodReceta.setImageResource(almuerzoImagenes[1]);
                 */

                setRecetaInfo(almuerzoTitulo[1], almuerzoRecetas[1], almuerzoImagenes[1]);
                break;
            case "ROLLITOS DE QUESO Y JAMÓN YORK":
                /*
                txtFoodTitle.setText(getResources().getString(almuerzoTitulo[2]));
                txtReceta.setText(getResources().getString(almuerzoRecetas[2]));
                imgFoodReceta.setImageResource(almuerzoImagenes[2]);
                 */

                setRecetaInfo(almuerzoTitulo[2], almuerzoRecetas[2], almuerzoImagenes[2]);
                break;
            case "TORTILLA DE ESPINACAS":
                /*
                txtFoodTitle.setText(getResources().getString(almuerzoTitulo[3]));
                txtReceta.setText(getResources().getString(almuerzoRecetas[3]));
                imgFoodReceta.setImageResource(almuerzoImagenes[3]);
                 */

                setRecetaInfo(almuerzoTitulo[3], almuerzoRecetas[3], almuerzoImagenes[3]);
                break;
            default:
        }
    }
    public void recetasMerienda(){
        switch (foodToReceta) {

            case "FLAN DE GELATINA DE FRUTAS":
                /*
                txtFoodTitle.setText(getResources().getString(meriendaTitulo[0]));
                txtReceta.setText(getResources().getString(meriendaRecetas[0]));
                imgFoodReceta.setImageResource(meriendaImagenes[0]);
             */

                setRecetaInfo(meriendaTitulo[0], meriendaRecetas[0], meriendaImagenes[0]);
                break;
            case "HUEVOS DUROS RELLENOS":
                /*
                txtFoodTitle.setText(getResources().getString(meriendaTitulo[1]));
                txtReceta.setText(getResources().getString(meriendaRecetas[1]));
                imgFoodReceta.setImageResource(meriendaImagenes[1]);
                 */

                setRecetaInfo(meriendaTitulo[1], meriendaRecetas[1], meriendaImagenes[1]);
                break;
            case "BROCHETAS DE FRUTAS":
                /*
                txtFoodTitle.setText(getResources().getString(meriendaTitulo[2]));
                txtReceta.setText(getResources().getString(meriendaRecetas[2]));
                imgFoodReceta.setImageResource(meriendaImagenes[2]);
                 */
                setRecetaInfo(meriendaTitulo[2], meriendaRecetas[2], meriendaImagenes[2]);
                break;
            case "SMOOTHIE DE MANGO":
                /*
                txtFoodTitle.setText(getResources().getString(meriendaTitulo[3]));
                txtReceta.setText(getResources().getString(meriendaRecetas[3]));
                imgFoodReceta.setImageResource(meriendaImagenes[3]);
                 */

                setRecetaInfo(meriendaTitulo[3], meriendaRecetas[3], meriendaImagenes[3]);
                break;
            default:
        }
    }
    public void recetasCena(){
        switch (foodToReceta) {
            case "PIZZA EXPRÉS DE PAN DE MOLDE":
                /*
                txtFoodTitle.setText(getResources().getString(cenaTitulo[0]));
                txtReceta.setText(getResources().getString(cenaRecetas[0]));
                imgFoodReceta.setImageResource(cenaImagenes[0]);
                 */

                setRecetaInfo(cenaTitulo[0], cenaRecetas[0], cenaImagenes[0]);
                break;
            case "QUICHÉ DE VERDURITAS Y QUESO DE BURGOS":
                /*
                txtFoodTitle.setText(getResources().getString(cenaTitulo[1]));
                txtReceta.setText(getResources().getString(cenaRecetas[1]));
                imgFoodReceta.setImageResource(cenaImagenes[1]);
                 */

                setRecetaInfo(cenaTitulo[1], cenaRecetas[1], cenaImagenes[1]);
                break;
            case "POKE HAWAIANO":
                /*
                txtFoodTitle.setText(getResources().getString(cenaTitulo[2]));
                txtReceta.setText(getResources().getString(cenaRecetas[2]));
                imgFoodReceta.setImageResource(cenaImagenes[2]);
                 */

                setRecetaInfo(cenaTitulo[2], cenaRecetas[2], cenaImagenes[2]);
                break;
            case "CROQUETAS DE BERENJENA Y BRIE":
                /*
                txtFoodTitle.setText(getResources().getString(cenaTitulo[3]));
                txtReceta.setText(getResources().getString(cenaRecetas[3]));
                imgFoodReceta.setImageResource(cenaImagenes[3]);
                 */

                setRecetaInfo(cenaTitulo[3], cenaRecetas[3], cenaImagenes[3]);
                break;
            default:
        }
    }
    public void recetasChatarra(){
        switch (foodToReceta) {
            case "PIZZA CASERA":
                /*
                txtFoodTitle.setText(getResources().getString(chatarraTitulo[0]));
                txtReceta.setText(getResources().getString(chatarraRecetas[0]));
                imgFoodReceta.setImageResource(chatarraImagenes[0]);
                 */

                setRecetaInfo(chatarraTitulo[0], chatarraRecetas[0], chatarraImagenes[0]);
                break;
            case "FISH y CHIPS":
                /*
                txtFoodTitle.setText(getResources().getString(chatarraTitulo[1]));
                txtReceta.setText(getResources().getString(chatarraRecetas[1]));
                imgFoodReceta.setImageResource(chatarraImagenes[1]);
                 */

                setRecetaInfo(chatarraTitulo[1], chatarraRecetas[1], chatarraImagenes[1]);
                break;
            case "NACHOS AUTENTICOS":
                /*
                txtFoodTitle.setText(getResources().getString(chatarraTitulo[2]));
                txtReceta.setText(getResources().getString(chatarraRecetas[2]));
                imgFoodReceta.setImageResource(chatarraImagenes[2]);
                 */

                setRecetaInfo(chatarraTitulo[2], chatarraRecetas[2], chatarraImagenes[2]);
                break;
            case "TACOS DE ATUN":
                /*
                txtFoodTitle.setText(getResources().getString(chatarraTitulo[3]));
                txtReceta.setText(getResources().getString(chatarraRecetas[3]));
                imgFoodReceta.setImageResource(chatarraImagenes[3]);
                 */

                setRecetaInfo(chatarraTitulo[3], chatarraRecetas[3], chatarraImagenes[3]);
                break;
            default:
        }
    }

    public void setRecetaInfo(int titulo, int receta, int imagenReceta){
        txtFoodTitle.setText(getResources().getString(titulo));
        txtReceta.setText(getResources().getString(receta));
        imgFoodReceta.setImageResource(imagenReceta);
    }
    public void goBackToMenu(View view) {
        Intent intent = new Intent(this, FoodMenu.class);
        startActivity(intent);
    }
    public void exitRecetas(View view) {
        final  AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("¿Estas seguro que quieres salir?")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finishAffinity();
                    }
                }).setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        builder.create();
        builder.show();
    }
}