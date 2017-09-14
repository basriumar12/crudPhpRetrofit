
package com.blogbasbas.crudsederhana.model;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class    DataModel {

    @SerializedName("domisili")
    private String mDomisili;
    @SerializedName("id")
    private String mId;
    @SerializedName("nama")
    private String mNama;
    @SerializedName("usia")
    private String mUsia;

    public String getDomisili() {
        return mDomisili;
    }

    public void setDomisili(String domisili) {
        mDomisili = domisili;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getNama() {
        return mNama;
    }

    public void setNama(String nama) {
        mNama = nama;
    }

    public String getUsia() {
        return mUsia;
    }

    public void setUsia(String usia) {
        mUsia = usia;
    }

}
