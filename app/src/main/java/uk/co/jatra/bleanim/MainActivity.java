package uk.co.jatra.bleanim;

import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView bleanim = (ImageView)findViewById(R.id.bleanim);
        AnimatedVectorDrawableCompat avdc = AnimatedVectorDrawableCompat.create(this, R.drawable.bleanim);
        bleanim.setImageDrawable(avdc);
        avdc.start();
    }
}
