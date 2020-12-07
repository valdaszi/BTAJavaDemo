package lt.baltictalents.uzdaviniai;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Adresas {

    @SerializedName("post_code")
    @Expose
    private String postCode;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("street")
    @Expose
    private String street;
    @SerializedName("number")
    @Expose
    private String number;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("municipality")
    @Expose
    private String municipality;
    @SerializedName("post")
    @Expose
    private String post;
    @SerializedName("mailbox")
    @Expose
    private String mailbox;

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getMailbox() {
        return mailbox;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    @Override
    public String toString() {
        return "Pašto kodas ='" + postCode + '\'' +
                "\nAdresas='" + address + '\'' +
                "\nMiestas='" + city + '\'' +
                "\nSavivaldybė='" + municipality + '\'' +
                "\nPaštas='" + post + '\'';
    }
}