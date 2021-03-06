package com.bm.container.module.base.Entity;

import java.io.Serializable;

import io.realm.RealmObject;

/**
 * Created by nfmomo on 17/4/11.
 */

public class CityEntity extends RealmObject implements Serializable {

    private String firstWord;
    private String id;
    private String cityName;
    private String province;
    private boolean click;


    public String getFirstWord() {
        return firstWord;
    }

    public void setFirstWord(String firstWord) {
        this.firstWord = firstWord;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setClick(boolean click) {
        this.click = click;
    }

    public boolean getClick() {
        return click;
    }
}
