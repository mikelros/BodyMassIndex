package es.mbi.mikel.mbi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    private EditText height;
    private EditText weight;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        height = (EditText) findViewById(R.id.editTextHeight);
        weight = (EditText) findViewById(R.id.editTextWeight);
        result = (TextView) findViewById(R.id.textViewResult);
    }

    public void calculate(View view){
        float heightNumber = Float.parseFloat(height.getText().toString());
        float weightNumber = Float.parseFloat(weight.getText().toString());
        float imc = operations(heightNumber, weightNumber);
        result.setText(String.valueOf(imc));
    }

    private float operations(float height, float weight) {
        float result = 0.0f;
        result = weight / (float) Math.pow(height, 2);
        return result;
    }
}
