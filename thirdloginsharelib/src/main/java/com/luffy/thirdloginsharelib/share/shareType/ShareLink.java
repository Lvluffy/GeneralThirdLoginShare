package com.luffy.thirdloginsharelib.share.shareType;


import android.content.Context;

import com.umeng.socialize.media.UMImage;
import com.umeng.socialize.media.UMWeb;

/**
 * Created by lvlufei on 2018/7/4
 *
 * @desc 友盟分享链接
 */
public class ShareLink {

    private ShareLink() {
    }

    public static ShareLink getInstance() {
        return ShareLinkHelper.mShareLink;
    }

    private static class ShareLinkHelper {
        private static ShareLink mShareLink;

        static {
            mShareLink = new ShareLink();
        }
    }

    /**
     * 获取UMWeb
     *
     * @param mContext     上下文对象
     * @param shareLinkUrl 链接
     * @param shareTitle   标题
     * @param shareImgUrl  图标
     * @param shareContent 内容
     * @return
     */
    public UMWeb getUMWeb(Context mContext, String shareLinkUrl, String shareTitle, String shareImgUrl, String shareContent) {
        /*设置分享四要素*/
        /*链接*/
        UMWeb umWeb = new UMWeb(shareLinkUrl);
        /*标题*/
        umWeb.setTitle(shareTitle);
        /*图标*/
        umWeb.setThumb(new UMImage(mContext, shareImgUrl));
        /*内容*/
        umWeb.setDescription(shareContent);
        return umWeb;
    }

    /**
     * 获取UMWeb
     *
     * @param mContext     上下文对象
     * @param shareLinkUrl 链接
     * @param shareTitle   标题
     * @param shareImg     图标
     * @param shareContent 内容
     * @return
     */
    public UMWeb getUMWeb(Context mContext, String shareLinkUrl, String shareTitle, int shareImg, String shareContent) {
        /*设置分享四要素*/
        /*链接*/
        UMWeb umWeb = new UMWeb(shareLinkUrl);
        /*标题*/
        umWeb.setTitle(shareTitle);
        /*图标*/
        umWeb.setThumb(new UMImage(mContext, shareImg));
        /*内容*/
        umWeb.setDescription(shareContent);
        return umWeb;
    }
}
