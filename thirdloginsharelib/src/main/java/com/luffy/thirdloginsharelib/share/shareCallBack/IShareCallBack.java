package com.luffy.thirdloginsharelib.share.shareCallBack;

import com.umeng.socialize.bean.SHARE_MEDIA;

/**
 * Created by lvlufei on 2018/12/12
 *
 * @desc 友盟分享回调
 */
public interface IShareCallBack {
    /**
     * 分享成功
     *
     * @param share_media
     */
    void onSuccess(SHARE_MEDIA share_media);

    /**
     * 分享失败
     *
     * @param share_media
     */
    void onError(SHARE_MEDIA share_media);

    /**
     * 分享取消
     *
     * @param share_media
     */
    void onCancel(SHARE_MEDIA share_media);
}
