package com.luffy.thirdloginsharelib.model;


import java.io.Serializable;

/**
 * Created by lvlufei on 2018/4/3
 *
 * @desc 三方登录-微博
 */
public class SinaLogin implements Serializable {

    /**
     * urank : 4
     * screen_name : 你猜
     * story_read_state : -1
     * mbrank : 0
     * weihao :
     * province : 100
     * statuses_count : 66
     * following : false
     * class : 1
     * follow_me : false
     * verified_type : -1
     * id : 3542323670
     * iconurl : http://tva3.sinaimg.cn/crop.0.0.1080.1080.50/d32391d6jw8es1hf5vgh7j20u00u0gtt.jpg
     * verified_reason_url :
     * cover_image_phone : http://ww1.sinaimg.cn/crop.0.0.640.640.640/549d0121tw1egm1kjly3jj20hs0hsq4f.jpg
     * accessToken : 2.00kMOjrD5hLIsDe95d88a15f01ThhU
     * domain :
     * avatar_hd : http://tva3.sinaimg.cn/crop.0.0.1080.1080.1024/d32391d6jw8es1hf5vgh7j20u00u0gtt.jpg
     * friends_count : 19
     * bi_followers_count : 1
     * location : 其他
     * verified_source :
     * name : 你猜
     * pagefriends_count : 0
     * verified_reason :
     * mbtype : 0
     * verified_source_url :
     * insecurity : {"sexual_content":false}
     * remark :
     * url :
     * city : 1000
     * refreshToken : 2.00kMOjrD5hLIsDe3648dc7c08Wr75C
     * gender : 你猜
     * block_app : 0
     * ptype : 0
     * block_word : 0
     * star : 0
     * status : {"created_at":"Wed Aug 02 11:45:41 +0800 2017","id":4136263550146461,"idstr":"4136263550146461","mid":"4136263550146461","can_edit":false,"text":"哎呦阅读 考虑考虑 http:\/\/t.cn\/R9xYZ8t","textLength":37,"source_allowclick":0,"source_type":1,"source":"<a href=\"http:\/\/app.weibo.com\/t\/feed\/5IyHZc\" rel=\"nofollow\">气泡阅读<\/a>","favorited":false,"truncated":false,"in_reply_to_status_id":"","in_reply_to_user_id":"","in_reply_to_screen_name":"","pic_urls":[],"geo":null,"is_paid":false,"mblog_vip_type":0,"annotations":[{"shooting":1,"client_mblogid":"a0ad7e6e-659b-411f-8f09-3709d41b272a"},{"mapi_request":true}],"reposts_count":0,"comments_count":0,"attitudes_count":0,"pending_approval_count":0,"isLongText":false,"mlevel":0,"visible":{"type":0,"list_id":0},"biz_feature":0,"hasActionTypeCard":0,"darwin_tags":[],"hot_weibo_tags":[],"text_tag_tips":[],"userType":0,"more_info_type":0,"positive_recom_flag":0,"content_auth":0,"gif_ids":"","is_show_bulletin":2,"comment_manage_info":{"comment_permission_type":-1,"approval_comment_type":0}}
     * like_me : false
     * verified : false
     * allow_all_act_msg : false
     * lang : zh-cn
     * expiration : 1525373999179
     * idstr : 3542323670
     * vclub_member : 0
     * profile_url : u/3542323670
     * credit_score : 80
     * avatar_large : http://tva3.sinaimg.cn/crop.0.0.1080.1080.180/d32391d6jw8es1hf5vgh7j20u00u0gtt.jpg
     * user_ability : 0
     * online_status : 0
     * geo_enabled : true
     * followers_count : 14
     * profile_image_url : http://tva3.sinaimg.cn/crop.0.0.1080.1080.50/d32391d6jw8es1hf5vgh7j20u00u0gtt.jpg
     * like : false
     * description :
     * access_token : 2.00kMOjrD5hLIsDe95d88a15f01ThhU
     * verified_trade :
     * uid : 3542323670
     * created_at : Tue Aug 20 18:20:28 +0800 2013
     * favourites_count : 1
     * allow_all_comment : true
     * expires_in : 1525373999179
     */

    private String urank;
    private String screen_name;
    private String story_read_state;
    private String mbrank;
    private String weihao;
    private String province;
    private String statuses_count;
    private String following;
    private String classX;
    private String follow_me;
    private String verified_type;
    private String id;
    private String iconurl;
    private String verified_reason_url;
    private String cover_image_phone;
    private String accessToken;
    private String domain;
    private String avatar_hd;
    private String friends_count;
    private String bi_followers_count;
    private String location;
    private String verified_source;
    private String name;
    private String pagefriends_count;
    private String verified_reason;
    private String mbtype;
    private String verified_source_url;
    private String remark;
    private String url;
    private String city;
    private String refreshToken;
    private String gender;
    private String block_app;
    private String ptype;
    private String block_word;
    private String star;
    private String like_me;
    private String verified;
    private String allow_all_act_msg;
    private String lang;
    private String expiration;
    private String idstr;
    private String vclub_member;
    private String profile_url;
    private String credit_score;
    private String avatar_large;
    private String user_ability;
    private String online_status;
    private String geo_enabled;
    private String followers_count;
    private String profile_image_url;
    private String like;
    private String description;
    private String access_token;
    private String verified_trade;
    private String uid;
    private String created_at;
    private String favourites_count;
    private String allow_all_comment;
    private String expires_in;

    public String getUrank() {
        return urank;
    }

    public void setUrank(String urank) {
        this.urank = urank;
    }

    public String getScreen_name() {
        return screen_name;
    }

    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }

    public String getStory_read_state() {
        return story_read_state;
    }

    public void setStory_read_state(String story_read_state) {
        this.story_read_state = story_read_state;
    }

    public String getMbrank() {
        return mbrank;
    }

    public void setMbrank(String mbrank) {
        this.mbrank = mbrank;
    }

    public String getWeihao() {
        return weihao;
    }

    public void setWeihao(String weihao) {
        this.weihao = weihao;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getStatuses_count() {
        return statuses_count;
    }

    public void setStatuses_count(String statuses_count) {
        this.statuses_count = statuses_count;
    }

    public String getFollowing() {
        return following;
    }

    public void setFollowing(String following) {
        this.following = following;
    }

    public String getClassX() {
        return classX;
    }

    public void setClassX(String classX) {
        this.classX = classX;
    }

    public String getFollow_me() {
        return follow_me;
    }

    public void setFollow_me(String follow_me) {
        this.follow_me = follow_me;
    }

    public String getVerified_type() {
        return verified_type;
    }

    public void setVerified_type(String verified_type) {
        this.verified_type = verified_type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIconurl() {
        return iconurl;
    }

    public void setIconurl(String iconurl) {
        this.iconurl = iconurl;
    }

    public String getVerified_reason_url() {
        return verified_reason_url;
    }

    public void setVerified_reason_url(String verified_reason_url) {
        this.verified_reason_url = verified_reason_url;
    }

    public String getCover_image_phone() {
        return cover_image_phone;
    }

    public void setCover_image_phone(String cover_image_phone) {
        this.cover_image_phone = cover_image_phone;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getAvatar_hd() {
        return avatar_hd;
    }

    public void setAvatar_hd(String avatar_hd) {
        this.avatar_hd = avatar_hd;
    }

    public String getFriends_count() {
        return friends_count;
    }

    public void setFriends_count(String friends_count) {
        this.friends_count = friends_count;
    }

    public String getBi_followers_count() {
        return bi_followers_count;
    }

    public void setBi_followers_count(String bi_followers_count) {
        this.bi_followers_count = bi_followers_count;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getVerified_source() {
        return verified_source;
    }

    public void setVerified_source(String verified_source) {
        this.verified_source = verified_source;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPagefriends_count() {
        return pagefriends_count;
    }

    public void setPagefriends_count(String pagefriends_count) {
        this.pagefriends_count = pagefriends_count;
    }

    public String getVerified_reason() {
        return verified_reason;
    }

    public void setVerified_reason(String verified_reason) {
        this.verified_reason = verified_reason;
    }

    public String getMbtype() {
        return mbtype;
    }

    public void setMbtype(String mbtype) {
        this.mbtype = mbtype;
    }

    public String getVerified_source_url() {
        return verified_source_url;
    }

    public void setVerified_source_url(String verified_source_url) {
        this.verified_source_url = verified_source_url;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public String getBlock_app() {
        return block_app;
    }

    public void setBlock_app(String block_app) {
        this.block_app = block_app;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public String getBlock_word() {
        return block_word;
    }

    public void setBlock_word(String block_word) {
        this.block_word = block_word;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getLike_me() {
        return like_me;
    }

    public void setLike_me(String like_me) {
        this.like_me = like_me;
    }

    public String getVerified() {
        return verified;
    }

    public void setVerified(String verified) {
        this.verified = verified;
    }

    public String getAllow_all_act_msg() {
        return allow_all_act_msg;
    }

    public void setAllow_all_act_msg(String allow_all_act_msg) {
        this.allow_all_act_msg = allow_all_act_msg;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getIdstr() {
        return idstr;
    }

    public void setIdstr(String idstr) {
        this.idstr = idstr;
    }

    public String getVclub_member() {
        return vclub_member;
    }

    public void setVclub_member(String vclub_member) {
        this.vclub_member = vclub_member;
    }

    public String getProfile_url() {
        return profile_url;
    }

    public void setProfile_url(String profile_url) {
        this.profile_url = profile_url;
    }

    public String getCredit_score() {
        return credit_score;
    }

    public void setCredit_score(String credit_score) {
        this.credit_score = credit_score;
    }

    public String getAvatar_large() {
        return avatar_large;
    }

    public void setAvatar_large(String avatar_large) {
        this.avatar_large = avatar_large;
    }

    public String getUser_ability() {
        return user_ability;
    }

    public void setUser_ability(String user_ability) {
        this.user_ability = user_ability;
    }

    public String getOnline_status() {
        return online_status;
    }

    public void setOnline_status(String online_status) {
        this.online_status = online_status;
    }

    public String getGeo_enabled() {
        return geo_enabled;
    }

    public void setGeo_enabled(String geo_enabled) {
        this.geo_enabled = geo_enabled;
    }

    public String getFollowers_count() {
        return followers_count;
    }

    public void setFollowers_count(String followers_count) {
        this.followers_count = followers_count;
    }

    public String getProfile_image_url() {
        return profile_image_url;
    }

    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getVerified_trade() {
        return verified_trade;
    }

    public void setVerified_trade(String verified_trade) {
        this.verified_trade = verified_trade;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getFavourites_count() {
        return favourites_count;
    }

    public void setFavourites_count(String favourites_count) {
        this.favourites_count = favourites_count;
    }

    public String getAllow_all_comment() {
        return allow_all_comment;
    }

    public void setAllow_all_comment(String allow_all_comment) {
        this.allow_all_comment = allow_all_comment;
    }

    public String getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(String expires_in) {
        this.expires_in = expires_in;
    }

    @Override
    public String toString() {
        return "SinaLogin{" +
                "urank='" + urank + '\'' +
                ", screen_name='" + screen_name + '\'' +
                ", story_read_state='" + story_read_state + '\'' +
                ", mbrank='" + mbrank + '\'' +
                ", weihao='" + weihao + '\'' +
                ", province='" + province + '\'' +
                ", statuses_count='" + statuses_count + '\'' +
                ", following='" + following + '\'' +
                ", classX='" + classX + '\'' +
                ", follow_me='" + follow_me + '\'' +
                ", verified_type='" + verified_type + '\'' +
                ", id='" + id + '\'' +
                ", iconurl='" + iconurl + '\'' +
                ", verified_reason_url='" + verified_reason_url + '\'' +
                ", cover_image_phone='" + cover_image_phone + '\'' +
                ", accessToken='" + accessToken + '\'' +
                ", domain='" + domain + '\'' +
                ", avatar_hd='" + avatar_hd + '\'' +
                ", friends_count='" + friends_count + '\'' +
                ", bi_followers_count='" + bi_followers_count + '\'' +
                ", location='" + location + '\'' +
                ", verified_source='" + verified_source + '\'' +
                ", name='" + name + '\'' +
                ", pagefriends_count='" + pagefriends_count + '\'' +
                ", verified_reason='" + verified_reason + '\'' +
                ", mbtype='" + mbtype + '\'' +
                ", verified_source_url='" + verified_source_url + '\'' +
                ", remark='" + remark + '\'' +
                ", url='" + url + '\'' +
                ", city='" + city + '\'' +
                ", refreshToken='" + refreshToken + '\'' +
                ", gender='" + gender + '\'' +
                ", block_app='" + block_app + '\'' +
                ", ptype='" + ptype + '\'' +
                ", block_word='" + block_word + '\'' +
                ", star='" + star + '\'' +
                ", like_me='" + like_me + '\'' +
                ", verified='" + verified + '\'' +
                ", allow_all_act_msg='" + allow_all_act_msg + '\'' +
                ", lang='" + lang + '\'' +
                ", expiration='" + expiration + '\'' +
                ", idstr='" + idstr + '\'' +
                ", vclub_member='" + vclub_member + '\'' +
                ", profile_url='" + profile_url + '\'' +
                ", credit_score='" + credit_score + '\'' +
                ", avatar_large='" + avatar_large + '\'' +
                ", user_ability='" + user_ability + '\'' +
                ", online_status='" + online_status + '\'' +
                ", geo_enabled='" + geo_enabled + '\'' +
                ", followers_count='" + followers_count + '\'' +
                ", profile_image_url='" + profile_image_url + '\'' +
                ", like='" + like + '\'' +
                ", description='" + description + '\'' +
                ", access_token='" + access_token + '\'' +
                ", verified_trade='" + verified_trade + '\'' +
                ", uid='" + uid + '\'' +
                ", created_at='" + created_at + '\'' +
                ", favourites_count='" + favourites_count + '\'' +
                ", allow_all_comment='" + allow_all_comment + '\'' +
                ", expires_in='" + expires_in + '\'' +
                '}';
    }
}
