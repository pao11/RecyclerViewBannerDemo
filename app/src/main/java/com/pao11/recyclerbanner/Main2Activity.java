package com.pao11.recyclerbanner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.pao11.recyclerbanner.banner.NormalRecyclerViewBanner;
import com.pao11.recyclerbanner.banner.RecyclerViewBannerBase;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    NormalRecyclerViewBanner banner, banner2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        banner = (NormalRecyclerViewBanner) findViewById(R.id.banner);
        banner2 = (NormalRecyclerViewBanner) findViewById(R.id.banner2);
        List<String> list = new ArrayList<>();
        list.add("http://g.hiphotos.baidu.com/image/h%3D300/sign=96159273e324b899c13c7f385e061d59/d52a2834349b033be59844a91fce36d3d539bdb5.jpg");
        list.add("http://a.hiphotos.baidu.com/image/h%3D300/sign=c3d038f5f7039245beb5e70fb794a4a8/b8014a90f603738da969c21ab81bb051f819ece3.jpg");
        list.add("http://h.hiphotos.baidu.com/image/h%3D300/sign=de13265c5d4e9258b93480eeac82d1d1/38dbb6fd5266d016de1450109c2bd40735fa35fd.jpg");
        list.add("http://h.hiphotos.baidu.com/image/h%3D300/sign=8312b0f3f0edab646b724bc0c736af81/8b13632762d0f703b6925be403fa513d2697c5e2.jpg");
        banner.initBannerImageView(list, new RecyclerViewBannerBase.OnBannerItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(Main2Activity.this, "clicked:" + position, Toast.LENGTH_SHORT).show();
            }
        });
        banner2.initBannerImageView(list);
    }

}
