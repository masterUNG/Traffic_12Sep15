package appewtc.masterung.traffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Show Title
        showTitle();

        //Show Image
        showImage();

    }   // Main Method

    private void showImage() {
        int intImage = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        ImageView imageView = (ImageView) findViewById(R.id.imvDetail);
        imageView.setImageResource(intImage);
    }

    private void showTitle() {
        String strTitle = getIntent().getStringExtra("Title");
        TextView titleTextView = (TextView) findViewById(R.id.txtDetailTitle);
        titleTextView.setText(strTitle);
    }

}   // Main Class
