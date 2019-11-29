package com.luffy.thirdloginsharelib.login;

import android.app.Activity;

import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.bean.SHARE_MEDIA;

import java.util.Map;

/**
 * Created by lvlufei on 2018/4/3
 *
 * @desc 登录调用者
 */
public class LoginInvoker {
    public static void gotoLogin(final Activity context, final SHARE_MEDIA platform, final LoginAuthListener loginAuthListener) {
        /*判断客户端安装*/
        UMShareAPI.get(context).isInstall(context, platform);
        /*获取用户资料授权*/
        UMShareAPI.get(context).getPlatformInfo(context, platform, new UMAuthListener() {
            @Override
            public void onStart(SHARE_MEDIA share_media) {
                if (loginAuthListener != null) {
                    loginAuthListener.onStart(share_media);
                }
            }

            @Override
            public void onComplete(SHARE_MEDIA share_media, int i, Map<String, String> map) {
                if (loginAuthListener != null) {
                    loginAuthListener.onComplete(share_media, map);
                }
                /*取消授权*/
                UMShareAPI.get(context).deleteOauth(context, platform, new UMAuthListener() {
                    @Override
                    public void onStart(SHARE_MEDIA share_media) {

                    }

                    @Override
                    public void onComplete(SHARE_MEDIA share_media, int i, Map<String, String> map) {

                    }

                    @Override
                    public void onError(SHARE_MEDIA share_media, int i, Throwable throwable) {

                    }

                    @Override
                    public void onCancel(SHARE_MEDIA share_media, int i) {

                    }
                });
            }

            @Override
            public void onError(SHARE_MEDIA share_media, int i, Throwable throwable) {
                if (loginAuthListener != null) {
                    loginAuthListener.onError(share_media);
                }
            }

            @Override
            public void onCancel(SHARE_MEDIA share_media, int i) {
                if (loginAuthListener != null) {
                    loginAuthListener.onCancel(share_media);
                }
            }
        });
    }

    /**
     * 登录回调监听
     */
    public interface LoginAuthListener {

        void onStart(SHARE_MEDIA share_media);

        void onComplete(SHARE_MEDIA share_media, Map<String, String> map);

        void onError(SHARE_MEDIA share_media);

        void onCancel(SHARE_MEDIA share_media);
    }
}
