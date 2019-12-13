package com.luffy.thirdloginsharelib.share.shareCallBack;

import android.content.Context;
import android.widget.Toast;

import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;

/**
 * Created by lvlufei on 2019/11/28
 *
 * @name 友盟分享回调
 * @desc
 */
public class ShareCallBack {

    /**
     * 获取分享回调
     *
     * @param mContext
     * @return
     */
    public static UMShareListener getUMShareListener(final Context mContext) {
        return new UMShareListener() {
            @Override
            public void onStart(SHARE_MEDIA share_media) {

            }

            @Override
            public void onResult(SHARE_MEDIA share_media) {
                Toast.makeText(mContext, "分享成功", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(SHARE_MEDIA share_media, Throwable throwable) {
                Toast.makeText(mContext, "分享失败", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancel(SHARE_MEDIA share_media) {
                Toast.makeText(mContext, "分享取消", Toast.LENGTH_SHORT).show();
            }
        };
    }

    /**
     * 获取分享回调
     *
     * @param mContext
     * @param mIShareCallBack
     * @return
     */
    public static UMShareListener getUMShareListener(final Context mContext, final IShareCallBack mIShareCallBack) {
        return new UMShareListener() {
            @Override
            public void onStart(SHARE_MEDIA share_media) {

            }

            @Override
            public void onResult(SHARE_MEDIA share_media) {
                Toast.makeText(mContext, "分享成功", Toast.LENGTH_SHORT).show();
                if (mIShareCallBack != null) {
                    mIShareCallBack.onSuccess(share_media);
                }
            }

            @Override
            public void onError(SHARE_MEDIA share_media, Throwable throwable) {
                Toast.makeText(mContext, "分享失败", Toast.LENGTH_SHORT).show();
                if (mIShareCallBack != null) {
                    mIShareCallBack.onError(share_media);
                }
            }

            @Override
            public void onCancel(SHARE_MEDIA share_media) {
                Toast.makeText(mContext, "分享取消", Toast.LENGTH_SHORT).show();
                if (mIShareCallBack != null) {
                    mIShareCallBack.onCancel(share_media);
                }
            }
        };
    }
}
