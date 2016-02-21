package com.erikbjorvik.googlecloudnotater;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.view.View;

import com.example.erikbjorvik.myapplication.backend.myApi.MyApi;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;

import java.io.IOException;

public class NyttNotatActivity extends AppCompatActivity {

    private static MyApi myApiService = null;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nytt_notat);
    }

    public void nyttNotat(View view) {
        Log.i("Info:", "Legger til nytt notat.");
        new EndpointsAsyncTask().execute(new Pair<Context, String>(this, "Manfred"));
    }

}
