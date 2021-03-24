package br.edu.uniritter.mobile.alua_4_splash;

import android.os.Parcel;
import android.os.Parcelable;

public class classUsers implements Parcelable {

    private int id;
    private String name;
    private String username;
    private String email;
    private String phone;
    private String website;
    private var_address address;
    private var_company company;

    public classUsers(int id, String name, String username, String email, var_address address, String phone, String website, var_company company) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.company = company;
    }

    private classUsers(Parcel p) {
        this.id = p.readInt();
        this.name = p.readString();
        this.username = p.readString();
        this.email = p.readString();
        this.address= new var_address(
                p.readString(),
                p.readString(),
                p.readString(),
                p.readString(),
                new var_geo(
                        p.readString(),
                        p.readString()));
        this.phone = p.readString();
        this.website = p.readString();
        this.company = new var_company(
                p.readString(),
                p.readString(),
                p.readString());
    }

    public static final Creator<classUsers> CREATOR = new Creator<classUsers>() {
        @Override
        public classUsers createFromParcel(Parcel in) { return new classUsers(in); }

        @Override
        public classUsers[] newArray(int size) { return new classUsers[size]; }
    };

    @Override
    public int describeContents() { return 0; }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.username);
        parcel.writeString(this.email);
        parcel.writeString(this.address.street);
        parcel.writeString(this.address.suite);
        parcel.writeString(this.address.city);
        parcel.writeString(this.address.zipcode);
        parcel.writeString(this.address.geo.lat);
        parcel.writeString(this.address.geo.lng);
        parcel.writeString(this.phone);
        parcel.writeString(this.website);
        parcel.writeString(this.company.name);
        parcel.writeString(this.company.catchPhrase);
        parcel.writeString(this.company.bs);
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public var_address getAddress() { return address; }

    public void setAddress(var_address address) { this.address = address; }

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone; }

    public String getWebsite() { return website; }

    public void setWebsite(String website) { this.website = website; }

    public var_company getCompany() { return company; }

    public void setCompany(var_company company) { this.company = company; }
}
