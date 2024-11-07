package pl.adrianizykowski.domekwgorach;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int licznikPolubien = 0;
    private TextView licznikPolubienTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        licznikPolubienTextView = findViewById(R.id.licznik_polubien);
        Button przyciskPolub = findViewById(R.id.przycisk_polub);
        Button przyciskUsun = findViewById(R.id.przycisk_usun);
        Button przyciskZapisz = findViewById(R.id.przycisk_zapisz);

        przyciskPolub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                licznikPolubien++;
                aktualizujLicznik();
            }
        });

        przyciskUsun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (licznikPolubien > 0) {
                    licznikPolubien--;
                }
                aktualizujLicznik();
            }
        });

        przyciskZapisz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void aktualizujLicznik() {
        licznikPolubienTextView.setText(licznikPolubien + " polubień");
    }
}
