package org.ldv.sio;

public class AdresseEtendue {
    private String Email;
    private String Url;

    public AdresseEtendue(String email, String url) {
        Email = email;
        Url = url;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    @Override
    public String toString() {
        return "AdresseEtendue{" +'\n'+
                ", Email='" + Email + '\n' +
                ", Url='" + Url + '\n' +
                '}';
    }
}
