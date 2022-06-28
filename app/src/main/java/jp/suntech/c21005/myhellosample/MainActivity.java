package jp.suntech.c21005.myhellosample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick = findViewById(R.id.btClick);
        HelloListener listener = new HelloListener();
        btClick.setOnClickListener(listener);

        Button btClear = findViewById(R.id.btClear);
        btClear.setOnClickListener(listener);

        Button bt2Clear = findViewById(R.id.bt2Clear);
        bt2Clear.setOnClickListener(listener);
    }

    private class HelloListener implements View.OnClickListener{
        public void onClick(View view){
            EditText input = findViewById(R.id.etName);
            EditText input1 = findViewById(R.id.etHousing);
            TextView output = findViewById(R.id.tvOutput);

            int id=view.getId();
                switch(id){
                    case R.id.btClick:
                        String inputStr = input.getText().toString();
                        String inputStr1 = input1.getText().toString();
                        output.setText(inputStr1+"にお住まいの"+inputStr+"さん、こんにちは");
                        break;
                    case R.id.btClear:
                        input.setText("");
                        output.setText("");
                        break;
                    case R.id.bt2Clear:
                        input1.setText("");
                        output.setText("");
                        break;
                }
        }
    }
}