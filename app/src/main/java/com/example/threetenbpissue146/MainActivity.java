package com.example.threetenbpissue146;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import org.threeten.bp.zone.ZoneRulesProvider;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.main_text);

        try {
            Set<String> availableZoneIds = ZoneRulesProvider.getAvailableZoneIds();
            textView.setText("Available zone IDs: " + availableZoneIds.size());
        } catch (Error e) {
            StringWriter out = new StringWriter();
            e.printStackTrace(new PrintWriter(out));
            textView.setText(out.getBuffer());
            textView.setTextColor(Color.RED);
        }
    }
}