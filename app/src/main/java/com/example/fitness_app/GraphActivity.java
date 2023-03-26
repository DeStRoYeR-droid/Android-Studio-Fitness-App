package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class GraphActivity extends AppCompatActivity {
    BarChart chart;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.graph_layout);

        chart = findViewById(R.id.bar_chart);

        ArrayList<BarEntry> entries = new ArrayList<>();
        for (int i = 1; i <= 10; i++){
            BarEntry entry = new BarEntry(i, (float) i * 10);
            entries.add(entry);
        }
        BarDataSet dataSet = new BarDataSet(entries, "test");
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        dataSet.setDrawValues(false);

        chart.setData(new BarData(dataSet));
    }
}