package br.edu.uniritter.mobile.alua_4_splash;

import android.os.Parcel;
import android.os.Parcelable;

public class classPhotos implements Parcelable {

    private int albumId;
    private int id;
    private String title;
    private String url;
    private String thumbnailUrl;

    public classPhotos(int albumId, int id, String title, String url, String thumbnailUrl) {
        this.albumId = albumId;
        this.id = id;
        this.title = title;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
    }

    private classPhotos(Parcel p) {
        this.albumId =  p.readInt();
        this.id = p.readInt();
        this.title = p.readString();
        this.url = p.readString();
        this.thumbnailUrl = p.readString();
    }

    public static final Creator<classPhotos> CREATOR = new Creator<classPhotos>() {
        @Override
        public classPhotos createFromParcel(Parcel in) {
            return new classPhotos(in);
        }

        @Override
        public classPhotos[] newArray(int size) {
            return new classPhotos[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.albumId);
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.url);
        parcel.writeString(this.thumbnailUrl);
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
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

    public void setTilte(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }
}
