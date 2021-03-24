package br.edu.uniritter.mobile.alua_4_splash;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class FirstActivity extends AppCompatActivity
        implements Response.Listener<JSONArray>,
        Response.ErrorListener {

    List<classAlbums> albums =  new ArrayList<>();
    List<classComments> comments =  new ArrayList<>();
    List<classPhotos> photos =  new ArrayList<>();
    List<classPosts> posts =  new ArrayList<>();
    List<classTodos> todos =  new ArrayList<>();
    List<classUsers> users =  new ArrayList<>();
    String btnTag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        TextView tv = (TextView) findViewById(R.id.textView4);
        Intent it = getIntent();
        String txt = it.getStringExtra("nomeInformado");
        tv.setText(txt);
    }

    public void abrirMainActivity(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void abrirLoginActivity(View view){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void onClick(View view) {
        LinearLayout ll = findViewById(R.id.LayoutItens);
        ll.removeAllViews();

        albums.clear();
        comments.clear();
        photos.clear();
        posts.clear();
        todos.clear();
        users.clear();

        RequestQueue queue = Volley.newRequestQueue(this);

        Button btn = (Button) view;
        btnTag = btn.getTag() + "";
        String url = "https://jsonplaceholder.typicode.com/" + btn.getTag();

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, this, this);

        queue.add(jsonArrayRequest);
    }

    @Override
    public void onResponse(JSONArray response) {
        try {
            TextView tv = (TextView) findViewById(R.id.textView4);
            //
            switch (btnTag) {
                case "albums":
                    for (int i = 0; i < response.length(); i++) {
                        JSONObject json = response.getJSONObject(i);
                        classAlbums obj = new classAlbums(
                                json.getInt("userId"),
                                json.getInt("id"),
                                json.getString("title"));
                        albums.add(obj);
                    }
                    Toast.makeText(this, "qtd:" + albums.size(), Toast.LENGTH_LONG).show();
                    LinearLayout llalbums = findViewById(R.id.LayoutItens);
                    for (classAlbums objAlbums : albums) {
                        Button bt = new Button(this);
                        bt.setText(objAlbums.getTitle());
                        bt.setTag(objAlbums);
                        bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                           public void onClick(View v) {
                                Button btn = (Button) v;
                                classAlbums album = (classAlbums) btn.getTag();
                                Intent intent = new Intent(getApplicationContext(), InfoActivity.class);
                                intent.putExtra("obj", album);
                                startActivity(intent);
                            }
                        });
                        llalbums.addView(bt);
                    }
                    break;
                case "comments":
                    for (int i = 0; i < response.length(); i++) {
                        JSONObject json = response.getJSONObject(i);
                        classComments obj = new classComments(
                                json.getInt("postId"),
                                json.getInt("id"),
                                json.getString("name"),
                                json.getString("email"),
                                json.getString("body"));
                        comments.add(obj);
                    }
                    Toast.makeText(this, "qtd:" + comments.size(), Toast.LENGTH_LONG).show();
                    LinearLayout llcomments = findViewById(R.id.LayoutItens);
                    for (classComments objComments : comments) {
                        Button bt = new Button(this);
                        bt.setText(objComments.getName());
                        bt.setTag(objComments);
                        bt.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Button btn = (Button) v;
                                classComments comment = (classComments) btn.getTag();
                                Intent intent = new Intent(getApplicationContext(), InfoActivity.class);
                                intent.putExtra("obj", comment);
                                startActivity(intent);
                            }
                        });
                        llcomments.addView(bt);
                    }
                    break;
                case "photos":
                    for (int i = 0; i < response.length(); i++) {
                        JSONObject json = response.getJSONObject(i);
                        classPhotos obj = new classPhotos(
                                json.getInt("albumId"),
                                json.getInt("id"),
                                json.getString("title"),
                                json.getString("url"),
                                json.getString("thumbnailUrl"));
                        photos.add(obj);
                    }
                    Toast.makeText(this, "qtd:" + photos.size(), Toast.LENGTH_LONG).show();
                    LinearLayout llphotos = findViewById(R.id.LayoutItens);
                    for (classPhotos objPhotos : photos) {
                        Button bt = new Button(this);
                        bt.setText(objPhotos.getTitle());
                        bt.setTag(objPhotos);
                        bt.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Button btn = (Button) v;
                                classPhotos photo = (classPhotos) btn.getTag();
                                Intent intent = new Intent(getApplicationContext(), InfoActivity.class);
                                intent.putExtra("obj", photo);
                                startActivity(intent);
                            }
                        });
                        llphotos.addView(bt);
                    }
                    break;
                case "posts":
                    for (int i = 0; i < response.length(); i++) {
                        JSONObject json = response.getJSONObject(i);
                        classPosts obj = new classPosts(
                                json.getInt("userId"),
                                json.getInt("id"),
                                json.getString("title"),
                                json.getString("body"));
                        posts.add(obj);
                    }
                    Toast.makeText(this, "qtd:" + posts.size(), Toast.LENGTH_LONG).show();
                    LinearLayout llposts = findViewById(R.id.LayoutItens);
                    for (classPosts objPosts : posts) {
                        Button bt = new Button(this);
                        bt.setText(objPosts.getTitle());
                        bt.setTag(objPosts);
                        bt.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Button btn = (Button) v;
                                classPosts post = (classPosts) btn.getTag();
                                Intent intent = new Intent(getApplicationContext(), InfoActivity.class);
                                intent.putExtra("obj", post);
                                startActivity(intent);
                            }
                        });
                        llposts.addView(bt);
                    }
                    break;
                case "todos":
                    for (int i = 0; i < response.length(); i++) {
                        JSONObject json = response.getJSONObject(i);
                        classTodos obj = new classTodos(
                                json.getInt("userId"),
                                json.getInt("id"),
                                json.getString("title"),
                                json.getBoolean("completed"));
                        todos.add(obj);
                    }
                    Toast.makeText(this, "qtd:" + todos.size(), Toast.LENGTH_LONG).show();
                    LinearLayout lltodos = findViewById(R.id.LayoutItens);
                    for (classTodos objTodos : todos) {
                        Button bt = new Button(this);
                        bt.setText(objTodos.getTitle());
                        bt.setTag(objTodos);
                        bt.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Button btn = (Button) v;
                                classTodos todo = (classTodos) btn.getTag();
                                Intent intent = new Intent(getApplicationContext(), InfoActivity.class);
                                intent.putExtra("obj", todo);
                                startActivity(intent);
                            }
                        });
                        lltodos.addView(bt);
                    }
                    break;
                case "users":
                    for (int i = 0; i < response.length(); i++) {
                        JSONObject json = response.getJSONObject(i);
                        //
                        JSONObject add = json.getJSONObject("address");
                        JSONObject geo = add.getJSONObject("geo");
                        JSONObject cmp = json.getJSONObject("company");
                        //
                        classUsers obj = new classUsers(
                                json.getInt("id"),
                                json.getString("name"),
                                json.getString("username"),
                                json.getString("email"),
                                new var_address( add.getString("street"),
                                        add.getString("suite"),
                                        add.getString("city"),
                                        add.getString("zipcode"),
                                        new var_geo(
                                                geo.getString("lat"),
                                                geo.getString("lng"))
                                ),
                                json.getString("phone"),
                                json.getString("website"),
                                new var_company(
                                        cmp.getString("name"),
                                        cmp.getString("catchPhrase"),
                                        cmp.getString("bs")));
                        users.add(obj);
                    }
                    Toast.makeText(this, "qtd:" + users.size(), Toast.LENGTH_LONG).show();
                    LinearLayout llusers = findViewById(R.id.LayoutItens);
                    for (classUsers objUsers: users) {
                        Button bt = new Button(this);
                        bt.setText(objUsers.getUsername());
                        bt.setTag(objUsers);
                        bt.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Button btn = (Button) v;
                                classUsers user = (classUsers) btn.getTag();
                                Intent intent = new Intent(getApplicationContext(), InfoActivity.class);
                                intent.putExtra("obj", user);
                                startActivity(intent);
                            }
                        });
                        llusers.addView(bt);
                    }
                    break;
            }
        } catch (JSONException e) {
            Log.e("erro", e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void onErrorResponse(VolleyError error) {
        String msg = error.getMessage();
        Toast.makeText(this.getApplicationContext(),"deu erro: "+msg,Toast.LENGTH_LONG).show();
    }
}