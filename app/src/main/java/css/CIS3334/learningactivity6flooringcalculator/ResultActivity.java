package css.CIS3334.learningactivity6flooringcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity
{
    public static final String RESULT = "flooring";

    Double area;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView textResultResult = findViewById(R.id.textViewResult);

        String width = getIntent().getStringExtra("width");
        String length = getIntent().getStringExtra("length");

        area = Double.parseDouble(width) * Double.parseDouble(length);

        textResultResult.setText("Width: " + width + "\nLength: " + length + "\nFlooring needed: " + area);

    }

    public void sendResultBack(View view)
    {
        Intent resultIntent = new Intent();
        resultIntent.putExtra("flooring", String.valueOf(area));
        setResult(RESULT_OK, resultIntent);
        finish();
    }

}
