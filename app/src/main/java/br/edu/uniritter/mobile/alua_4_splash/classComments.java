package br.edu.uniritter.mobile.alua_4_splash;

import android.os.Parcel;
import android.os.Parcelable;

public class classComments implements Parcelable {

    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;

    public classComments(int postId, int id, String name, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }

    private classComments(Parcel p) {
        this.postId =  p.readInt();
        this.id = p.readInt();
        this.name = p.readString();
        this.email = p.readString();
        this.body = p.readString();
    }

    public static final Creator<classComments> CREATOR = new Creator<classComments>() {
        @Override
        public classComments createFromParcel(Parcel in) {
            return new classComments(in);
        }

        @Override
        public classComments[] newArray(int size) {
            return new classComments[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.postId);
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.email);
        parcel.writeString(this.body);
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int userId) {
        this.postId = postId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
