package com.quocnguyen.mediaplayerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        songList = (ListView) findViewById(R.id.songList);
        arrayList = new ArrayList<>();
        arrayList.add(new Music("Cảm giác yêu", "Don Nguyễn", R.raw.cam_giac_yeu));
        arrayList.add(new Music("Cầu vòng tình yêu", "Ustylez", R.raw.cau_vong_tinh_yeu));
        arrayList.add(new Music("Lời anh chưa thể nói", "Hàn Khởi", R.raw.loi_anh_chua_the_noi));
        arrayList.add(new Music("Tan", "Lương Minh Trang", R.raw.tan));

        adapter = new CustomMusicAdapter(this, R.layout.custom_music_item, arrayList);
        songList.setAdapter(adapter);
    }
}
