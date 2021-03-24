package br.edu.uniritter.mobile.alua_4_splash;

public class var_geo {

    public String lat;
    public String lng;

    public var_geo(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setSLng(String lng) {
        this.lng = lng;
    }
}
