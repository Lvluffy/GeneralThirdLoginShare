package com.luffy.thirdloginsharelib.model;

import java.io.Serializable;

/**
 * Created by lvlufei on 2018/4/3
 *
 * @desc 三方登录-QQ
 */
public class QQLogin implements Serializable {

    /**
     * unionid : UID_806DF76DA752A6E567FCF2F968A93DEF
     * is_yellow_vip : 0
     * screen_name : 你猜
     * msg :
     * vip : 0
     * city : 你猜
     * accessToken : F33523AFCA02F551479108930C294701
     * gender : 你猜
     * province : 你猜
     * is_yellow_year_vip : 0
     * openid : 856CCD22F75323ECAFD92B6C12F635EC
     * yellow_vip_level : 0
     * profile_image_url : http://thirdqq.qlogo.cn/qqapp/1105073837/856CCD22F75323ECAFD92B6C12F635EC/100
     * access_token : F33523AFCA02F551479108930C294701
     * iconurl : http://thirdqq.qlogo.cn/qqapp/1105073837/856CCD22F75323ECAFD92B6C12F635EC/100
     * name : 你猜
     * uid : 856CCD22F75323ECAFD92B6C12F635EC
     * expiration : 1530501023995
     * expires_in : 1530501023995
     * ret : 0
     * level : 0
     */

    private String unionid;
    private String is_yellow_vip;
    private String screen_name;
    private String msg;
    private String vip;
    private String city;
    private String accessToken;
    private String gender;
    private String province;
    private String is_yellow_year_vip;
    private String openid;
    private String yellow_vip_level;
    private String profile_image_url;
    private String access_token;
    private String iconurl;
    private String name;
    private String uid;
    private String expiration;
    private String expires_in;
    private String ret;
    private String level;

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getIs_yellow_vip() {
        return is_yellow_vip;
    }

    public void setIs_yellow_vip(String is_yellow_vip) {
        this.is_yellow_vip = is_yellow_vip;
    }

    public String getScreen_name() {
        return screen_name;
    }

    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
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

    public String getIs_yellow_year_vip() {
        return is_yellow_year_vip;
    }

    public void setIs_yellow_year_vip(String is_yellow_year_vip) {
        this.is_yellow_year_vip = is_yellow_year_vip;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getYellow_vip_level() {
        return yellow_vip_level;
    }

    public void setYellow_vip_level(String yellow_vip_level) {
        this.yellow_vip_level = yellow_vip_level;
    }

    public String getProfile_image_url() {
        return profile_image_url;
    }

    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
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

    public String getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(String expires_in) {
        this.expires_in = expires_in;
    }

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "QQLogin{" +
                "unionid='" + unionid + '\'' +
                ", is_yellow_vip='" + is_yellow_vip + '\'' +
                ", screen_name='" + screen_name + '\'' +
                ", msg='" + msg + '\'' +
                ", vip='" + vip + '\'' +
                ", city='" + city + '\'' +
                ", accessToken='" + accessToken + '\'' +
                ", gender='" + gender + '\'' +
                ", province='" + province + '\'' +
                ", is_yellow_year_vip='" + is_yellow_year_vip + '\'' +
                ", openid='" + openid + '\'' +
                ", yellow_vip_level='" + yellow_vip_level + '\'' +
                ", profile_image_url='" + profile_image_url + '\'' +
                ", access_token='" + access_token + '\'' +
                ", iconurl='" + iconurl + '\'' +
                ", name='" + name + '\'' +
                ", uid='" + uid + '\'' +
                ", expiration='" + expiration + '\'' +
                ", expires_in='" + expires_in + '\'' +
                ", ret='" + ret + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
