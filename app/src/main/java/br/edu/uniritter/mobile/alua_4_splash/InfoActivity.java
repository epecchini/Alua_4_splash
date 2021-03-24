package br.edu.uniritter.mobile.alua_4_splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.CheckBox;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        //
        Intent it = getIntent();
        Parcelable prc = it.getParcelableExtra("obj");
        //
        if (prc instanceof classAlbums) {
            setContentView(R.layout.layout_album);
            classAlbums obj = it.getParcelableExtra("obj");
            //
            TextView tv = findViewById(R.id.tvUserId);
            tv.setText(tv.getText() + " : " + obj.getUserId());
            tv = findViewById(R.id.tvId);
            tv.setText(tv.getText() + " : " + obj.getId());
            tv = findViewById(R.id.tvTitle);
            tv.setText(tv.getText() + " : " + obj.getTitle());
        }
        if (prc instanceof classComments) {
            setContentView(R.layout.layout_comment);
            classComments obj = it.getParcelableExtra("obj");
            //
            TextView tv = findViewById(R.id.tvPostId);
            tv.setText(tv.getText() + " : " + obj.getPostId());
            tv = findViewById(R.id.tvId);
            tv.setText(tv.getText() + " : " + obj.getId());
            tv = findViewById(R.id.tvName);
            tv.setText(tv.getText() + " : " + obj.getName());
            tv = findViewById(R.id.tvEmail);
            tv.setText(tv.getText() + " : " + obj.getEmail());
            tv = findViewById(R.id.tvBody);
            tv.setText(tv.getText() + " : " + obj.getBody());
        }
        if (prc instanceof classPhotos) {
            setContentView(R.layout.layout_photo);
            classPhotos obj = it.getParcelableExtra("obj");
            //
            TextView tv = findViewById(R.id.tvAlbumId);
            tv.setText(tv.getText() + " : " + obj.getAlbumId());
            tv = findViewById(R.id.tvId);
            tv.setText(tv.getText() + " : " + obj.getId());
            tv = findViewById(R.id.tvTitle);
            tv.setText(tv.getText() + " : " + obj.getTitle());
            tv = findViewById(R.id.tvUrl);
            tv.setText(tv.getText() + " : " + obj.getUrl());
            tv = findViewById(R.id.tvThumbnailUrl);
            tv.setText(tv.getText() + " : " + obj.getThumbnailUrl());
        }
        if (prc instanceof classPosts) {
            setContentView(R.layout.layout_post);
            classPosts obj = it.getParcelableExtra("obj");
            //
            TextView tv = findViewById(R.id.tvUserId);
            tv.setText(tv.getText() + " : " + obj.getUserId());
            tv = findViewById(R.id.tvId);
            tv.setText(tv.getText() + " : " + obj.getId());
            tv = findViewById(R.id.tvTitle);
            tv.setText(tv.getText() + " : " + obj.getTitle());
            tv = findViewById(R.id.tvBody);
            tv.setText(tv.getText() + " : " + obj.getBody());
        }
        if (prc instanceof classTodos) {
            setContentView(R.layout.layout_todo);
            classTodos obj = it.getParcelableExtra("obj");
            //
            TextView tv = findViewById(R.id.tvUserId);
            tv.setText(tv.getText() + " : " + obj.getUserId());
            tv = findViewById(R.id.tvId);
            tv.setText(tv.getText() + " : " + obj.getId());
            tv = findViewById(R.id.tvTitle);
            tv.setText(tv.getText() + " : " + obj.getTitle());
            CheckBox cb = findViewById(R.id.cbCompleted);
            cb.setChecked(obj.getCompleted());
        }
        if (prc instanceof classUsers) {
            setContentView(R.layout.layout_user);
            classUsers obj = it.getParcelableExtra("obj");
            //
            TextView tv = findViewById(R.id.tvId);
            tv.setText(tv.getText() + " : " + obj.getId());
            tv = findViewById(R.id.tvName);
            tv.setText(tv.getText() + " : " + obj.getName());
            tv = findViewById(R.id.tvUsername);
            tv.setText(tv.getText() + " : " + obj.getUsername());
            tv = findViewById(R.id.tvEmail);
            tv.setText(tv.getText() + " : " + obj.getEmail());
            tv = findViewById(R.id.tvStreet);
            tv.setText(tv.getText() + " : " + obj.getAddress().getStreet());
            tv = findViewById(R.id.tvSuite);
            tv.setText(tv.getText() + " : " + obj.getAddress().getSuite());
            tv = findViewById(R.id.tvCity);
            tv.setText(tv.getText() + " : " + obj.getAddress().getCity());
            tv = findViewById(R.id.tvZipcode);
            tv.setText(tv.getText() + " : " + obj.getAddress().getZipcode());
            tv = findViewById(R.id.tvLat);
            tv.setText(tv.getText() + " : " + obj.getAddress().getGeo().getLat());
            tv = findViewById(R.id.tvLng);
            tv.setText(tv.getText() + " : " + obj.getAddress().getGeo().getLng());
            tv = findViewById(R.id.tvPhone);
            tv.setText(tv.getText() + " : " + obj.getPhone());
            tv = findViewById(R.id.tvWebsite);
            tv.setText(tv.getText() + " : " + obj.getWebsite());
            tv = findViewById(R.id.tvCmpName);
            tv.setText(tv.getText() + " : " + obj.getCompany().getName());
            tv = findViewById(R.id.tvCmpCatchPhrase);
            tv.setText(tv.getText() + " : " + obj.getCompany().getCatchPhrase());
            tv = findViewById(R.id.tvCmpBs);
            tv.setText(tv.getText() + " : " + obj.getCompany().getBs());
        }
    }
}