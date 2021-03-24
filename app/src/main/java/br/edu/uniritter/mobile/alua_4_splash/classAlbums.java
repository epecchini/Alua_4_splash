package br.edu.uniritter.mobile.alua_4_splash;

import android.os.Parcel;
import android.os.Parcelable;

public class classAlbums implements Parcelable {

    private int userId;
    private int id;
    private String title;

    public classAlbums(int userId, int id, String title) {
        this.userId = userId;
        this.id = id;
        this.title = title;
    }

    private classAlbums(Parcel p) {
        this.userId =  p.readInt();
        this.id = p.readInt();
        this.title = p.readString();
    }

    public static final Creator<classAlbums> CREATOR = new Creator<classAlbums>() {
        @Override
        public classAlbums createFromParcel(Parcel in) {
            return new classAlbums(in);
        }

        @Override
        public classAlbums[] newArray(int size) {
            return new classAlbums[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.userId);
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
