package br.edu.uniritter.mobile.alua_4_splash;

import android.os.Parcel;
import android.os.Parcelable;

public class classTodos implements Parcelable {

    private int userId;
    private int id;
    private String title;
    private boolean completed;

    public classTodos(int userId, int id, String title, boolean completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    private classTodos(Parcel p) {
        this.userId =  p.readInt();
        this.id = p.readInt();
        this.title = p.readString();
        this.completed = p.readBoolean();
    }

    public static final Creator<classTodos> CREATOR = new Creator<classTodos>() {
        @Override
        public classTodos createFromParcel(Parcel in) {
            return new classTodos(in);
        }

        @Override
        public classTodos[] newArray(int size) {
            return new classTodos[size];
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
        parcel.writeBoolean(this.completed);
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

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
