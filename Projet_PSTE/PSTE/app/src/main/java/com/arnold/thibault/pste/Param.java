package com.arnold.thibault.pste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Param extends AppCompatActivity {
    // Variables de parametres
    int m_night=0;
    int m_taux_fatigue=0;
    double m_distance=0.0;

    //J'en sais absolument rien XD
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_param);
    }
}
