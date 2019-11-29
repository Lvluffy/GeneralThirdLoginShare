package com.luffy.thirdloginsharelib.share.shareType;


import android.content.Context;
import android.graphics.Bitmap;

import com.umeng.socialize.media.UMImage;

import java.io.File;

/**
 * Created by lvlufei on 2018/7/4
 *
 * @desc 友盟分享-图片
 */
public class ShareImage {

    private ShareImage() {
    }

    public static ShareImage getInstance() {
        return ShareImageHelper.mShareImage;
    }

    private static class ShareImageHelper {
        private static ShareImage mShareImage;

        static {
            mShareImage = new ShareImage();
        }
    }

    /**
     * 获取-UMImage-本地文件
     *
     * @param mContext 上下文对象
     * @param file     文件
     * @return
     */
    public UMImage getUMImage(Context mContext, File file) {
        UMImage umImage = new UMImage(mContext, file);
        // 图片大小压缩
        umImage.compressStyle = UMImage.CompressStyle.SCALE;
        // 设置缩略图
        umImage.setThumb(umImage);
        return umImage;
    }

    /**
     * 获取-UMImage-资源文件
     *
     * @param mContext 上下文对象
     * @param resId    文件
     * @return
     */
    public UMImage getUMImage(Context mContext, int resId) {
        UMImage umImage = new UMImage(mContext, resId);
        // 图片大小压缩
        umImage.compressStyle = UMImage.CompressStyle.SCALE;
        // 设置缩略图
        umImage.setThumb(umImage);
        return umImage;
    }

    /**
     * 获取-UMImage-Bitmap文件
     *
     * @param mContext 上下文对象
     * @param bitmap   文件
     * @return
     */
    public UMImage getUMImage(Context mContext, Bitmap bitmap) {
        UMImage umImage = new UMImage(mContext, bitmap);
        // 图片大小压缩
        umImage.compressStyle = UMImage.CompressStyle.SCALE;
        // 设置缩略图
        umImage.setThumb(umImage);
        return umImage;
    }

    /**
     * 获取-UMImage-字节流
     *
     * @param mContext 上下文对象
     * @param bytes    文件
     * @return
     */
    public UMImage getUMImage(Context mContext, byte[] bytes) {
        UMImage umImage = new UMImage(mContext, bytes);
        // 图片大小压缩
        umImage.compressStyle = UMImage.CompressStyle.SCALE;
        // 设置缩略图
        umImage.setThumb(umImage);
        return umImage;
    }

    /**
     * 获取-UMImage-网络图片
     *
     * @param mContext 上下文对象
     * @param str      文件
     * @return
     */
    public UMImage getUMImage(Context mContext, String str) {
        UMImage umImage = new UMImage(mContext, str);
        // 图片大小压缩
        umImage.compressStyle = UMImage.CompressStyle.SCALE;
        // 设置缩略图
        umImage.setThumb(umImage);
        return umImage;
    }

}
