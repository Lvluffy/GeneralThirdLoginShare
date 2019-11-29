package com.luffy.thirdloginsharelib.share.shareUI;

import android.app.Activity;

import com.umeng.socialize.ShareAction;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.utils.ShareBoardlistener;

/**
 * Created by lvlufei on 2018/7/4
 *
 * @desc 友盟分享默认对话框
 */
public class ShareDefaultDialog {

    public static void showDefaultDialog(Activity context, ShareBoardlistener mShareBoardlistener) {
        new ShareAction(context).setDisplayList(SHARE_MEDIA.QQ,
                SHARE_MEDIA.QZONE,
                SHARE_MEDIA.WEIXIN,
                SHARE_MEDIA.WEIXIN_CIRCLE)
                .addButton("复制链接", "复制链接", "umeng_socialize_copyurl", "umeng_socialize_copyurl")
                .setShareboardclickCallback(mShareBoardlistener)
                .open();
    }

    public static void showDialog(Activity context, ShareBoardlistener mShareBoardlistener) {
        new ShareAction(context).setDisplayList(SHARE_MEDIA.QQ,
                SHARE_MEDIA.QZONE,
                SHARE_MEDIA.WEIXIN,
                SHARE_MEDIA.WEIXIN_CIRCLE,
                SHARE_MEDIA.DINGTALK)
                .addButton("复制链接", "复制链接", "umeng_socialize_copyurl", "umeng_socialize_copyurl")
                .setShareboardclickCallback(mShareBoardlistener)
                .open();
    }

    public static void showDialog(Activity context, ShareBoardlistener mShareBoardlistener, SHARE_MEDIA... shareMedia) {
        new ShareAction(context)
                .setDisplayList(shareMedia)
                .addButton("复制链接", "复制链接", "umeng_socialize_copyurl", "umeng_socialize_copyurl")
                .setShareboardclickCallback(mShareBoardlistener)
                .open();
    }
}
