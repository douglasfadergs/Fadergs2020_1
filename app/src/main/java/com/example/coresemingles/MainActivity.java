package com.example.coresemingles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.coresemingles.fragmentos.CorFragmento0;
import com.example.coresemingles.fragmentos.CorFragmento1;
import com.example.coresemingles.fragmentos.CorFragmento2;
import com.example.coresemingles.fragmentos.CorFragmento3;
import com.example.coresemingles.fragmentos.CorFragmento4;
import com.example.coresemingles.fragmentos.CorFragmento5;
import com.example.coresemingles.fragmentos.CorFragmento6;
import com.example.coresemingles.fragmentos.CorFragmento7;
import com.example.coresemingles.fragmentos.CorFragmento8;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager pager;
    private PagerAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Fragment> list = new ArrayList<>();
        list.add(new CorFragmento0());
        list.add(new CorFragmento1());
        list.add(new CorFragmento2());
        list.add(new CorFragmento3());
        list.add(new CorFragmento4());
        list.add(new CorFragmento5());
        list.add(new CorFragmento6());
        list.add(new CorFragmento7());
        list.add(new CorFragmento8());

        pager = findViewById(R.id.pager);
        pagerAdapter = new DeslizarPagina(getSupportFragmentManager(),list);

        pager.setAdapter(pagerAdapter);
    }
}
