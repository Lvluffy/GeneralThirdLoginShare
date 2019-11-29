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
     * 分享
     *
     * @param context
     * @param platform
     * @param baseMediaObject
     */
    public void share(Activity context, SHARE_MEDIA platform, BaseMediaObject baseMediaObject) {
        ShareAction shareAction = new ShareAction(context);
        // 平台
        shareAction.setPlatform(platform);
        // 回调
        shareAction.setCallback(ShareCallBack.getUMShareListener(context));
        // 处理消息类型
        if (baseMediaObject instanceof UMWeb) {
            shareAction.withMedia((UMWeb) baseMediaObject);
        } else if (baseMediaObject instanceof UMImage) {
            shareAction.withMedia((UMImage) baseMediaObject);
        }
        // 分享
        shareAction.share();
    }

    /**
     * 分享
     *
     * @param context
     * @param platform
     * @param baseMediaObject
     * @param mIShareCallBack
     */
    public void share(Activity context, SHARE_MEDIA platform, BaseMediaObject baseMediaObject, IShareCallBack mIShareCallBack) {
        ShareAction shareAction = new ShareAction(context);
        // 平台
        shareAction.setPlatform(platform);
        // 回调
        shareAction.setCallback(ShareCallBack.getUMShareListener(context, mIShareCallBack));
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
