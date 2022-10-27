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
    TextView txtFoodType, txtMenuTitulo0, txtMenuTitulo1, txtMenuTitulo2, txtMenuTitulo3, txtMenuSubtitulo0, txtMenuSubtitulo1, txtMenuSubtitulo2 , txtMenuSubtitulo3;
    ImageView imgMenu0, imgMenu1, imgMenu2, imgMenu3, imgBack, imgExit;
    FrameLayout fl1, fl2, fl3, fl4;

    int [] desayunosTitulo, almuerzoTitulo, meriendaTitulo, cenaTitulo, chatarraTitulo;
    int [] desayunosSubtitulo, almuerzoSubtitulo, meriendaSubtitulo, cenaSubtitulo, chatarraSubtitulo;
    int [] desayunosImagenes, almuerzoImagenes, meriendaImagenes, cenaImagenes, chatarraImagenes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);
        setArraysInfo();
        appComponents();
        getFoodChoosenFromList();
        showFoodListChoosen();

        txtFoodType.setText("MENU DE "+foodTypeFromList.toUpperCase());
    }

    public void appComponents(){
        imgMenu0 = findViewById(R.id.imgMenu0);
        imgMenu1 = findViewById(R.id.imgMenu1);
        imgMenu2 = findViewById(R.id.imgMenu2);
        imgMenu3 = findViewById(R.id.imgMenu3);

        fl1 = findViewById(R.id.fl1);
        fl2 = findViewById(R.id.fl2);
        fl3 = findViewById(R.id.fl3);
        fl4 = findViewById(R.id.fl4);

        imgBack = findViewById(R.id.imgBack);
        imgExit = findViewById(R.id.imgExitApp);

        txtFoodType = findViewById(R.id.txtFoodType);
        txtMenuTitulo0 = findViewById(R.id.txtMenuTitulo0);
        txtMenuTitulo1 = findViewById(R.id.txtMenuTitulo1);
        txtMenuTitulo2 = findViewById(R.id.txtMenuTitulo2);
        txtMenuTitulo3 = findViewById(R.id.txtMenuTitulo3);

        txtMenuSubtitulo0 = findViewById(R.id.txtMenuSubtitulo0);
        txtMenuSubtitulo1 = findViewById(R.id.txtMenuSubtitulo1);
        txtMenuSubtitulo2 = findViewById(R.id.txtMenuSubtitulo2);
        txtMenuSubtitulo3 = findViewById(R.id.txtMenuSubtitulo3);
    }
    public void showFoodListChoosen() {
        switch (foodTypeFromList) {
            case "Desayuno":
                    showBreakFastInfo();
                break;
            case "Almuerzo":
                    showAlmuerzoInfo();
                break;
            case "Merienda":
                    showMeriendaInfo();
                break;
            case "Cena":
                    showCenaInfo();
                break;
            case "Chatarra":
                showChatarraInfo();
                break;
            default:

        }
    }
    public void getFoodChoosenFromList(){
        Bundle getFood = getIntent().getExtras();
        foodTypeFromList = getFood.getString("comida");
    }
    public void goBackToListFood(View view) {
        Intent intent = new Intent(this, ListFood.class);
        startActivity(intent);
    }
    public void goToActivityFoodRecetasFl1(View view) {
        sentFood(txtMenuTitulo0.getText().toString());
    }
    public void goToActivityFoodRecetasFl2(View view) {
        sentFood(txtMenuTitulo1.getText().toString());
    }
    public void goToActivityFoodRecetasFl3(View view) {
        sentFood(txtMenuTitulo2.getText().toString());
    }
    public void goToActivityFoodRecetasFl4(View view) {
        sentFood(txtMenuTitulo3.getText().toString());
    }
    public void showBreakFastInfo(){
        setInfoToComponent(desayunosImagenes[0], desayunosImagenes[1], desayunosImagenes[2], desayunosImagenes[3], desayunosTitulo[0], desayunosTitulo[1],
                desayunosTitulo[2], desayunosTitulo[3], desayunosSubtitulo[0], desayunosSubtitulo[1], desayunosSubtitulo[2], desayunosSubtitulo[3]);
    }
    public void showAlmuerzoInfo(){
        setInfoToComponent(almuerzoImagenes[0],almuerzoImagenes[1], almuerzoImagenes[2], almuerzoImagenes[3], almuerzoTitulo[0], almuerzoTitulo[1],
                almuerzoTitulo[2], almuerzoTitulo[3], almuerzoSubtitulo[0], almuerzoSubtitulo[1], almuerzoSubtitulo[2], almuerzoSubtitulo[3]);
    }
    public void showMeriendaInfo(){
        setInfoToComponent(meriendaImagenes[0],meriendaImagenes[1], meriendaImagenes[2], meriendaImagenes[3], meriendaTitulo[0], meriendaTitulo[1],
                meriendaTitulo[2], meriendaTitulo[3], meriendaSubtitulo[0], meriendaSubtitulo[1], meriendaSubtitulo[2], meriendaSubtitulo[3]);
    }
    public void showCenaInfo(){
        setInfoToComponent(cenaImagenes[0],cenaImagenes[1], cenaImagenes[2], cenaImagenes[3], cenaTitulo[0], cenaTitulo[1],
                cenaTitulo[2], cenaTitulo[3], cenaSubtitulo[0], cenaSubtitulo[1], cenaSubtitulo[2], cenaSubtitulo[3]);
    }
    public void showChatarraInfo(){
        setInfoToComponent(chatarraImagenes[0],chatarraImagenes[1], chatarraImagenes[2], chatarraImagenes[3], chatarraTitulo[0], chatarraTitulo[1],
                chatarraTitulo[2], chatarraTitulo[3], chatarraSubtitulo[0], chatarraSubtitulo[1], chatarraSubtitulo[2], chatarraSubtitulo[3]);
    }
    public void sentFood(String foodToShow){
        Intent intent = new Intent(this, FoodRecetas.class);
        intent.putExtra("comida", foodToShow);
        intent.putExtra("comidaTipo", foodTypeFromList);
        startActivity(intent);
    }
    public void setInfoToComponent(int img, int imgDos, int imgTres, int imgCuatro, int txt, int txtDos, int txtTres, int txtCuatro, int Sub, int subDos, int subTres, int subCuatro){
        imgMenu0.setImageResource(img);
        imgMenu1.setImageResource(imgDos);
        imgMenu2.setImageResource(imgTres);
        imgMenu3.setImageResource(imgCuatro);

        txtMenuTitulo0.setText(getResources().getString(txt));
        txtMenuTitulo1.setText(getResources().getString(txtDos));
        txtMenuTitulo2.setText(getResources().getString(txtTres));
        txtMenuTitulo3.setText(getResources().getString(txtCuatro));

        txtMenuSubtitulo0.setText(getResources().getString(Sub));
        txtMenuSubtitulo1.setText(getResources().getString(subDos));
        txtMenuSubtitulo2.setText(getResources().getString(subTres));
        txtMenuSubtitulo3.setText(getResources().getString(subCuatro));

    }
    public void setArraysInfo(){
        desayunosTitulo = new int[]{R.string.d0t, R.string.d1t, R.string.d2t, R.string.d3t};
        desayunosSubtitulo = new int[]{R.string.d0s, R.string.d1s, R.string.d2s, R.string.d3s};
        desayunosImagenes = new int[]{R.drawable.d0, R.drawable.d1, R.drawable.d2, R.drawable.d3};

        almuerzoTitulo = new int[]{R.string.a0t, R.string.a1t, R.string.a2t, R.string.a3t};
        almuerzoImagenes = new int[]{R.drawable.a0, R.drawable.a1, R.drawable.a2, R.drawable.a3};
        almuerzoSubtitulo = new int[]{R.string.a0s, R.string.a1s, R.string.a2s, R.string.a3s};

        meriendaTitulo = new int[]{R.string.m0t, R.string.m1t, R.string.m2t, R.string.m3t};
        meriendaImagenes = new int[]{R.drawable.m0, R.drawable.m1, R.drawable.m2, R.drawable.m3};
        meriendaSubtitulo = new int[]{R.string.m0s, R.string.m1s, R.string.m2s, R.string.m3s};

        cenaTitulo = new int[]{R.string.c0t, R.string.c1t, R.string.c2t, R.string.c3t};
        cenaImagenes = new int[]{R.drawable.c0, R.drawable.c1, R.drawable.c2, R.drawable.c3};
        cenaSubtitulo = new int[]{R.string.c0s, R.string.c1s, R.string.c2s, R.string.c3s};

        chatarraTitulo = new int[]{R.string.ch0t, R.string.ch1t, R.string.ch2t, R.string.ch3t};
        chatarraImagenes = new int[]{R.drawable.ch0, R.drawable.ch1, R.drawable.ch2, R.drawable.ch3};
        chatarraSubtitulo  = new int[]{R.string.ch0s, R.string.ch1s, R.string.ch2s, R.string.ch3s};
    }

}