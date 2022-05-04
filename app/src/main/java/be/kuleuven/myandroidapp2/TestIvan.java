package be.kuleuven.myandroidapp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TestIvan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_ivan);
    }
    public void onBackLoginButton_Clicked  (View caller)
    {
        Intent intent = new Intent(this,MainActivity.class);
        //intent.putExtra("Order",order);
        startActivity(intent);

    }
}


