package com.luffy.thirdloginsharelib.share;

import android.app.Activity;

import com.luffy.thirdloginsharelib.share.shareCallBack.IShareCallBack;
import com.luffy.thirdloginsharelib.share.shareCallBack.ShareCallBack;
import com.umeng.socialize.ShareAction;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.BaseMediaObject;
import com.umeng.socialize.media.UMImage;
import com.umeng.socialize.media.UMWeb;

/**
 * Created by lvlufei on 2018/7/4
 *
 * @desc 分享调用者
 */
public class ShareInvoker {

    private ShareInvoker() {
    }

    public static ShareInvoker getInstance() {
        return ShareInvokerHelper.mShareInvoker;
    }

    /**
     * 静态内部类实现单例
     */
    private static class ShareInvokerHelper {
        private static ShareInvoker mShareInvoker;

        static {
            mShareInvoker = new ShareInvoker();
        }
    }

    /**
     * 分享文本
     *
     * @param context
     * @param platform
     */
    public void shareText(Activity context, SHARE_MEDIA platform, String text) {
        shareText(context, platform, text, null);
    }

    /**
     * 分享文本
     *
     * @param context
     * @param platform
     */
    public void shareText(Activity context, SHARE_MEDIA platform, String text, IShareCallBack iShareCallBack) {
        ShareAction shareAction = new ShareAction(context);
        // 平台
        shareAction.setPlatform(platform);
        // 回调
        shareAction.setCallback(ShareCallBack.getUMShareListener(context, iShareCallBack));
        //设置消息
        shareAction.withText(text);
        // 分享
        shareAction.share();
    }

    /**
     * 分享媒体
     *
     * @param context
     * @param platform
     * @param baseMediaObject
     */
    public void shareMedia(Activity context, SHARE_MEDIA platform, BaseMediaObject baseMediaObject) {
        shareMedia(context, platform, baseMediaObject, null);
    }

    /**
     * 分享媒体
     *
     * @param context
     * @param platform
     * @param baseMediaObject
     * @param iShareCallBack
     */
    public void shareMedia(Activity context, SHARE_MEDIA platform, BaseMediaObject baseMediaObject, IShareCallBack iShareCallBack) {
        ShareAction shareAction = new ShareAction(context);
        // 平台
        shareAction.setPlatform(platform);
        // 回调
        shareAction.setCallback(ShareCallBack.getUMShareListener(context, iShareCallBack));
        // 处理消息类型
        if (baseMediaObject instanceof UMWeb) {
            shareAction.withMedia((UMWeb) baseMediaObject);
        } else if (baseMediaObject instanceof UMImage) {
            shareAction.withMedia((UMImage) baseMediaObject);
        }
        // 分享
        shareAction.share();
    }

}
