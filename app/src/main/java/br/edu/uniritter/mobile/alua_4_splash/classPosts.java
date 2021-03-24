package br.edu.uniritter.mobile.alua_4_splash;

import android.os.Parcel;
import android.os.Parcelable;

public class classPosts implements Parcelable {

    private int userId;
    private int id;
    private String title;
    private String body;

    public classPosts(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    private classPosts(Parcel p) {
        this.userId =  p.readInt();
        this.id = p.readInt();
        this.title = p.readString();
        this.body = p.readString();
    }

    public static final Creator<classPosts> CREATOR = new Creator<classPosts>() {
        @Override
        public classPosts createFromParcel(Parcel in) {
            return new classPosts(in);
        }

        @Override
        public classPosts[] newArray(int size) {
            return new classPosts[size];
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
        parcel.writeString(this.body);
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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
