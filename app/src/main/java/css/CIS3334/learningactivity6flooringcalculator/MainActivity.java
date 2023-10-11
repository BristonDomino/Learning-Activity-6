package css.CIS3334.learningactivity6flooringcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    EditText editTextWidth;

    EditText  editTextLength;

    final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextLength = findViewById(R.id.editTextLength);
        editTextWidth = findViewById(R.id.editTextWidth);
    }


    public void showResult(View view)
    {
        String width = editTextWidth.getText().toString();
        String length = editTextLength.getText().toString();

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("width", width);
        intent.putExtra("length", length);
        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK)
        {
            String flooring = data.getStringExtra("flooring");
        }


    }
}