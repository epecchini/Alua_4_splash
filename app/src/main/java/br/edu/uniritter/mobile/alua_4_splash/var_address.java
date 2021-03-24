package br.edu.uniritter.mobile.alua_4_splash;

public class var_address {

    public String street;
    public String suite;
    public String city;
    public String zipcode;
    public var_geo geo;

    public var_address(String street, String suite, String city, String zipcode, var_geo geo) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = geo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public var_geo getGeo() {
        return geo;
    }

    public void setGeo(var_geo geo) {
        this.geo = geo;
    }
}
