package com.arnold.thibault.pste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class menu extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    //private Button lancer_trajet;
    private Button options_trajet;
    private Button choix_modules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        /*this.lancer_trajet = findViewById(R.id.lancer_trajet);

        lancer_trajet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent trajet = new Intent(getApplicationContext(), Trajet.class);
                startActivity(trajet);
                finish();
            }
        });*/

        this.options_trajet = findViewById(R.id.options_trajet);

        options_trajet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent opttrajet = new Intent(getApplicationContext(), Param.class);
                startActivity(opttrajet);
                finish();
            }
        });

        this.choix_modules = findViewById(R.id.choix_modules);

        choix_modules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chxmodules = new Intent(getApplicationContext(), choix_modules.class);
                startActivity(chxmodules);
                finish();
            }
        });



    }
    public native String stringFromJNI();
}
