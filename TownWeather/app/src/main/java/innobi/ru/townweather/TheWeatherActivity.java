package innobi.ru.townweather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TheWeatherActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theweather);

        textView = findViewById(R.id.textView);
        String town = getIntent().getExtras().getString(MainActivity.KEY_TOWN);
        Boolean booleanWind = getIntent().getExtras().getBoolean(MainActivity.KEY_WIND);
        Boolean booleanWet = getIntent().getExtras().getBoolean(MainActivity.KEY_WET);
        Boolean booleanPressure = getIntent().getExtras().getBoolean(MainActivity.KEY_PRESSURE);

        String res;
        if (!town.isEmpty()) {
            res = "Погода в городе - " + town + "\n";
            res += "Температура -3\n";
            res += "Пасмурно, небольшой снег\n";
            if (booleanWind) res += "Ветер 3-6 м/с\n";
            if (booleanWet) res += "Относительная влажность 84%\n";
            if (booleanPressure) res += "Давление 762 мм рт. ст.";
        } else res = "Пожалуйста укажите город";
        textView.setText(res);
    }
}
