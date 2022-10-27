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

    int desayunosTitulo [] = new int[]{R.string.d0t, R.string.d1t, R.string.d2t, R.string.d3t};
    int desayunosSubtitulo[] = new int[]{R.string.d0s, R.string.d1s, R.string.d2s, R.string.d3s};
    int desayunosImagenes[] = new int[]{R.drawable.d0, R.drawable.d1, R.drawable.d2, R.drawable.d3};

    int almuerzoTitulo [] = new int[]{R.string.a0t, R.string.a1t, R.string.a2t, R.string.a3t};
    int almuerzoImagenes[] = new int[]{R.drawable.a0, R.drawable.a1, R.drawable.a2, R.drawable.a3};
    int almuerzoSubtitulo [] = new int[]{R.string.a0s, R.string.a1s, R.string.a2s, R.string.a3s};

    int meriendaTitulo [] = new int[]{R.string.m0t, R.string.m1t, R.string.m2t, R.string.m3t};
    int meriendaImagenes[] = new int[]{R.drawable.m0, R.drawable.m1, R.drawable.m2, R.drawable.m3};
    int meriendaSubtitulo [] = new int[]{R.string.m0s, R.string.m1s, R.string.m2s, R.string.m3s};

    int cenaTitulo [] = new int[]{R.string.c0t, R.string.c1t, R.string.c2t, R.string.c3t};
    int cenaImagenes[] = new int[]{R.drawable.c0, R.drawable.c1, R.drawable.c2, R.drawable.c3};
    int cenaSubtitulo [] = new int[]{R.string.c0s, R.string.c1s, R.string.c2s, R.string.c3s};

    int chatarraTitulo [] = new int[]{R.string.ch0t, R.string.ch1t, R.string.ch2t, R.string.ch3t};
    int chatarraImagenes[] = new int[]{R.drawable.ch0, R.drawable.ch1, R.drawable.ch2, R.drawable.ch3};
    int chatarraSubtitulo [] = new int[]{R.string.ch0s, R.string.ch1s, R.string.ch2s, R.string.ch3s};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);
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
        imgMenu0.setImageResource(desayunosImagenes[0]);
        imgMenu1.setImageResource(desayunosImagenes[1]);
        imgMenu2.setImageResource(desayunosImagenes[2]);
        imgMenu3.setImageResource(desayunosImagenes[3]);

        txtMenuTitulo0.setText(getResources().getString(desayunosTitulo[0]));
        txtMenuTitulo1.setText(getResources().getString(desayunosTitulo[1]));
        txtMenuTitulo2.setText(getResources().getString(desayunosTitulo[2]));
        txtMenuTitulo3.setText(getResources().getString(desayunosTitulo[3]));

        txtMenuSubtitulo0.setText(getResources().getString(desayunosSubtitulo[0]));
        txtMenuSubtitulo1.setText(getResources().getString(desayunosSubtitulo[1]));
        txtMenuSubtitulo2.setText(getResources().getString(desayunosSubtitulo[2]));
        txtMenuSubtitulo3.setText(getResources().getString(desayunosSubtitulo[3]));
    }
    public void showAlmuerzoInfo(){
        imgMenu0.setImageResource(almuerzoImagenes[0]);
        imgMenu1.setImageResource(almuerzoImagenes[1]);
        imgMenu2.setImageResource(almuerzoImagenes[2]);
        imgMenu3.setImageResource(almuerzoImagenes[3]);

        txtMenuTitulo0.setText(getResources().getString(almuerzoTitulo[0]));
        txtMenuTitulo1.setText(getResources().getString(almuerzoTitulo[1]));
        txtMenuTitulo2.setText(getResources().getString(almuerzoTitulo[2]));
        txtMenuTitulo3.setText(getResources().getString(almuerzoTitulo[3]));

        txtMenuSubtitulo0.setText(getResources().getString(almuerzoSubtitulo[0]));
        txtMenuSubtitulo1.setText(getResources().getString(almuerzoSubtitulo[1]));
        txtMenuSubtitulo2.setText(getResources().getString(almuerzoSubtitulo[2]));
        txtMenuSubtitulo3.setText(getResources().getString(almuerzoSubtitulo[3]));
    }
    public void showMeriendaInfo(){
        imgMenu0.setImageResource(meriendaImagenes[0]);
        imgMenu1.setImageResource(meriendaImagenes[1]);
        imgMenu2.setImageResource(meriendaImagenes[2]);
        imgMenu3.setImageResource(meriendaImagenes[3]);

        txtMenuTitulo0.setText(getResources().getString(meriendaTitulo[0]));
        txtMenuTitulo1.setText(getResources().getString(meriendaTitulo[1]));
        txtMenuTitulo2.setText(getResources().getString(meriendaTitulo[2]));
        txtMenuTitulo3.setText(getResources().getString(meriendaTitulo[3]));

        txtMenuSubtitulo0.setText(getResources().getString(meriendaSubtitulo[0]));
        txtMenuSubtitulo1.setText(getResources().getString(meriendaSubtitulo[1]));
        txtMenuSubtitulo2.setText(getResources().getString(meriendaSubtitulo[2]));
        txtMenuSubtitulo3.setText(getResources().getString(meriendaSubtitulo[3]));
    }
    public void showCenaInfo(){
        imgMenu0.setImageResource(cenaImagenes[0]);
        imgMenu1.setImageResource(cenaImagenes[1]);
        imgMenu2.setImageResource(cenaImagenes[2]);
        imgMenu3.setImageResource(cenaImagenes[3]);

        txtMenuTitulo0.setText(getResources().getString(cenaTitulo[0]));
        txtMenuTitulo1.setText(getResources().getString(cenaTitulo[1]));
        txtMenuTitulo2.setText(getResources().getString(cenaTitulo[2]));
        txtMenuTitulo3.setText(getResources().getString(cenaTitulo[3]));

        txtMenuSubtitulo0.setText(getResources().getString(cenaSubtitulo[0]));
        txtMenuSubtitulo1.setText(getResources().getString(cenaSubtitulo[1]));
        txtMenuSubtitulo2.setText(getResources().getString(cenaSubtitulo[2]));
        txtMenuSubtitulo3.setText(getResources().getString(cenaSubtitulo[3]));
    }
    public void showChatarraInfo(){
        imgMenu0.setImageResource(chatarraImagenes[0]);
        imgMenu1.setImageResource(chatarraImagenes[1]);
        imgMenu2.setImageResource(chatarraImagenes[2]);
        imgMenu3.setImageResource(chatarraImagenes[3]);

        txtMenuTitulo0.setText(getResources().getString(chatarraTitulo[0]));
        txtMenuTitulo1.setText(getResources().getString(chatarraTitulo[1]));
        txtMenuTitulo2.setText(getResources().getString(chatarraTitulo[2]));
        txtMenuTitulo3.setText(getResources().getString(chatarraTitulo[3]));

        txtMenuSubtitulo0.setText(getResources().getString(chatarraSubtitulo[0]));
        txtMenuSubtitulo1.setText(getResources().getString(chatarraSubtitulo[1]));
        txtMenuSubtitulo2.setText(getResources().getString(chatarraSubtitulo[2]));
        txtMenuSubtitulo3.setText(getResources().getString(chatarraSubtitulo[3]));
    }

    public void sentFood(String foodToShow){
        Intent intent = new Intent(this, FoodRecetas.class);
        intent.putExtra("comida", foodToShow);
        intent.putExtra("comidaTipo", foodTypeFromList);
        startActivity(intent);
    }

}