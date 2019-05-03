package c.morgentec.a1b;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import c.morgentec.form.FormActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, FormActivity.class);
        startActivity(intent);
        finish();

    }

}
