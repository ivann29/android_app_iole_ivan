package be.kuleuven.myandroidapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onConfirmLogin_Clicked  (View caller)
    {
        Intent intent = new Intent(this, AccountActivity.class);
        //intent.putExtra("Order",order);
        startActivity(intent);

    }
}