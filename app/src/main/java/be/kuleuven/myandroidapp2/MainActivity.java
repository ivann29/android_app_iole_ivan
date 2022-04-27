package be.kuleuven.myandroidapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onLoginButton_Clicked  (View caller)
    {
        Intent intent = new Intent(this, LoginActivity.class);
        //intent.putExtra("Order",order);
        startActivity(intent);

    }

    public void onSignUpButton_Clicked  (View caller)
    {
        Intent intent = new Intent(this, SignUpActivity.class);
       // intent.putExtra("Order",order);
        startActivity(intent);

    }
}