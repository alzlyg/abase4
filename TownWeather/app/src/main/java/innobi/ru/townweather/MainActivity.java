package innobi.ru.townweather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_TOWN = "KeyTown";
    public static final String KEY_WIND = "KeyWind";
    public static final String KEY_WET = "KeyWet";
    public static final String KEY_PRESSURE = "KeyPressure";

    Button button;
    EditText editText;
    CheckBox chekBoxWind;
    CheckBox chekBoxWet;
    CheckBox chekBoxPressure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    private void initUI() {
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        chekBoxWind = findViewById(R.id.checkBoxWind);
        chekBoxWet = findViewById(R.id.checkBoxWet);
        chekBoxPressure = findViewById(R.id.checkBoxPressure);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TheWeatherActivity.class);
                intent.putExtra(KEY_TOWN, editText.getText().toString());
                intent.putExtra(KEY_WIND, chekBoxWind.isChecked());
                intent.putExtra(KEY_WET, chekBoxWet.isChecked());
                intent.putExtra(KEY_PRESSURE, chekBoxPressure.isChecked());
                startActivity(intent);
            }
        });
    }
}
