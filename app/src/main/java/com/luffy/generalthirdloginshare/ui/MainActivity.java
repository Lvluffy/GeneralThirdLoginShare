package com.luffy.generalthirdloginshare.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.luffy.generalthirdloginshare.R;
import com.luffy.generalthirdloginshare.utils.ClipboardUtils;
import com.luffy.thirdloginsharelib.login.LoginInvoker;
import com.luffy.thirdloginsharelib.model.QQLogin;
import com.luffy.thirdloginsharelib.model.SinaLogin;
import com.luffy.thirdloginsharelib.model.WechatLogin;
import com.luffy.thirdloginsharelib.share.ShareInvoker;
import com.luffy.thirdloginsharelib.share.shareType.ShareLink;
import com.luffy.thirdloginsharelib.share.shareUI.ShareDefaultDialog;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMWeb;
import com.umeng.socialize.shareboard.SnsPlatform;
import com.umeng.socialize.utils.ShareBoardlistener;

import java.lang.reflect.Type;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txt_content)
    TextView txtContent;

    String requestUrl = "https://www.baidu.com";
    String title = "分享标题";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(MainActivity.this);
    }

    /*友盟QQ分享或者授权处理*/
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        UMShareAPI.get(this).onActivityResult(requestCode, resultCode, data);
    }

    /*友盟QQ分享或者授权,内存泄漏解决方案*/
    @Override
    protected void onDestroy() {
        super.onDestroy();
        UMShareAPI.get(this).release();
    }

    @OnClick({R.id.tv_share, R.id.btn_qq_login, R.id.btn_wechat_login, R.id.btn_weibo_login})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_share:
                ShareDefaultDialog.showDialog(MainActivity.this, new ShareBoardlistener() {
                    @Override
                    public void onclick(SnsPlatform snsPlatform, SHARE_MEDIA share_media) {
                        if (snsPlatform.mShowWord.equals("复制链接")) {
                            ClipboardUtils.getInstance().clipUri(MainActivity.this, requestUrl);
                            Toast.makeText(MainActivity.this, "已复制链接到剪贴板", Toast.LENGTH_SHORT).show();
                        } else {
                            /*获取连接*/
                            UMWeb mUMWeb = ShareLink.getInstance().getUMWeb(
                                    MainActivity.this,
                                    requestUrl,
                                    title,
                                    R.mipmap.ic_launcher,
                                    "你的目光所及，就是你的人生境界。");
                            ShareInvoker.getInstance().share(MainActivity.this, share_media, mUMWeb);
                            /*分享图片*/
//                            String url = "http://i1.sinaimg.cn/ent/d/2008-06-04/U105P28T3D2048907F326DT20080604225106.jpg";
//                            UMImage mUMImage = ShareImage.getInstance().getUMImage(MainActivity.this, url);
//                            ShareInvoker.getInstance().share(MainActivity.this, share_media, mUMImage);
                        }
                    }
                });
                break;
            case R.id.btn_qq_login:
                LoginInvoker.gotoLogin(this, SHARE_MEDIA.QQ, new LoginInvoker.LoginAuthListener() {
                    @Override
                    public void onStart(SHARE_MEDIA share_media) {

                    }

                    @Override
                    public void onComplete(SHARE_MEDIA share_media, Map<String, String> map) {
                        Type type = new TypeToken<QQLogin>() {
                        }.getType();
                        Gson gson = new Gson();
                        QQLogin mQQLogin = gson.fromJson(gson.toJson(map), type);
                        txtContent.setText(mQQLogin.toString());
                    }

                    @Override
                    public void onError(SHARE_MEDIA share_media) {

                    }

                    @Override
                    public void onCancel(SHARE_MEDIA share_media) {

                    }
                });
                break;
            case R.id.btn_wechat_login:
                LoginInvoker.gotoLogin(this, SHARE_MEDIA.WEIXIN, new LoginInvoker.LoginAuthListener() {
                    @Override
                    public void onStart(SHARE_MEDIA share_media) {

                    }

                    @Override
                    public void onComplete(SHARE_MEDIA share_media, Map<String, String> map) {
                        Type type = new TypeToken<WechatLogin>() {
                        }.getType();
                        Gson gson = new Gson();
                        WechatLogin mWechatLogin = gson.fromJson(gson.toJson(map), type);
                        txtContent.setText(mWechatLogin.toString());
                    }

                    @Override
                    public void onError(SHARE_MEDIA share_media) {

                    }

                    @Override
                    public void onCancel(SHARE_MEDIA share_media) {

                    }
                });
                break;
            case R.id.btn_weibo_login:
                LoginInvoker.gotoLogin(this, SHARE_MEDIA.SINA, new LoginInvoker.LoginAuthListener() {
                    @Override
                    public void onStart(SHARE_MEDIA share_media) {

                    }

                    @Override
                    public void onComplete(SHARE_MEDIA share_media, Map<String, String> map) {
                        Type type = new TypeToken<SinaLogin>() {
                        }.getType();
                        Gson gson = new Gson();
                        SinaLogin mSinaLogin = gson.fromJson(gson.toJson(map), type);
                        txtContent.setText(mSinaLogin.toString());
                    }

                    @Override
                    public void onError(SHARE_MEDIA share_media) {

                    }

                    @Override
                    public void onCancel(SHARE_MEDIA share_media) {

                    }
                });
                break;
        }
    }
}
