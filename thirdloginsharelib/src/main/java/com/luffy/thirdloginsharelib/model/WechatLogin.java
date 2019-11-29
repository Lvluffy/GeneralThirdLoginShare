package com.luffy.thirdloginsharelib.model;

import java.io.Serializable;

/**
 * Created by lvlufei on 2018/4/3
 *
 * @desc 三方登录-微信
 */
public class WechatLogin implements Serializable {

    /**
     * unionid : oQYQ3s5vIi_gTEP3iE_WxwCeR8Hc
     * screen_name : 你猜
     * city : 你猜
     * accessToken : 8__JV0ptD859vDjLVAruLA5TSXH1BQ8qk1CCcSI8PNFEP5pwmSDQohWEZp-3oW9hkXqLPOs8wmI9jik3sNKXHPkGxe68jSrr_Vkv9g0P94Nec
     * refreshToken : 8_ie7PNsswI9yJg7hq2QMCbzjeQ0kA8Wzj7Uxay8bzwk77pY4MnjmO3KdHZi0BFxyHNWepOkQVILW_zxAHRmP2EpWD40ocQkgKsrfw4FrC26o
     * gender : 你猜
     * province : 你猜
     * openid : oJuDivinrsQMtbwyKnb-Lr-jMDwQ
     * profile_image_url : http://thirdwx.qlogo.cn/mmopen/vi_32/YP2qZY6HZB9xpK8PJdFU1OTHPH0b24IyZAaEV7vjT8tII1UeytnZ9yrpnHYUYPvZ0RibmmwtBgejiaARG0HnSHug/132
     * country : 你猜
     * access_token : 8__JV0ptD859vDjLVAruLA5TSXH1BQ8qk1CCcSI8PNFEP5pwmSDQohWEZp-3oW9hkXqLPOs8wmI9jik3sNKXHPkGxe68jSrr_Vkv9g0P94Nec
     * iconurl : http://thirdwx.qlogo.cn/mmopen/vi_32/YP2qZY6HZB9xpK8PJdFU1OTHPH0b24IyZAaEV7vjT8tII1UeytnZ9yrpnHYUYPvZ0RibmmwtBgejiaARG0HnSHug/132
     * name : 你猜
     * uid : oQYQ3s5vIi_gTEP3iE_WxwCeR8Hc
     * expiration : 1522732678762
     * language : zh_CN
     * expires_in : 1522732678762
     */

    private String unionid;
    private String screen_name;
    private String city;
    private String accessToken;
    private String refreshToken;
    private String gender;
    private String province;
    private String openid;
    private String profile_image_url;
    private String country;
    private String access_token;
    private String iconurl;
    private String name;
    private String uid;
    private String expiration;
    private String language;
    private String expires_in;

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getScreen_name() {
        return screen_name;
    }

    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getProfile_image_url() {
        return profile_image_url;
    }

    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getIconurl() {
        return iconurl;
    }

    public void setIconurl(String iconurl) {
        this.iconurl = iconurl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(String expires_in) {
        this.expires_in = expires_in;
    }

    @Override
    public String toString() {
        return "WechatLogin{" +
                "unionid='" + unionid + '\'' +
                ", screen_name='" + screen_name + '\'' +
                ", city='" + city + '\'' +
                ", accessToken='" + accessToken + '\'' +
                ", refreshToken='" + refreshToken + '\'' +
                ", gender='" + gender + '\'' +
                ", province='" + province + '\'' +
                ", openid='" + openid + '\'' +
                ", profile_image_url='" + profile_image_url + '\'' +
                ", country='" + country + '\'' +
                ", access_token='" + access_token + '\'' +
                ", iconurl='" + iconurl + '\'' +
                ", name='" + name + '\'' +
                ", uid='" + uid + '\'' +
                ", expiration='" + expiration + '\'' +
                ", language='" + language + '\'' +
                ", expires_in='" + expires_in + '\'' +
                '}';
    }
}
