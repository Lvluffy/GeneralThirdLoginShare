package com.luffy.generalthirdloginshare.utils;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;

import static android.content.Context.CLIPBOARD_SERVICE;

/**
 * Created by lvlufei on 2018/1/1
 *
 * @desc 粘贴板-辅助工具
 */
public class ClipboardUtils {

    private ClipboardUtils() {

    }

    public static ClipboardUtils getInstance() {
        return ClipboardUtilsHelper.mClipboardUtils;
    }

    private static class ClipboardUtilsHelper {
        private static ClipboardUtils mClipboardUtils;

        static {
            mClipboardUtils = new ClipboardUtils();
        }
    }

    /**
     * 粘贴文本
     *
     * @param context 上下文对象
     * @param content 内容
     */
    public void clipText(Context context, String content) {
        ClipboardManager mClipboardManager = (ClipboardManager) context.getSystemService(CLIPBOARD_SERVICE);
        ClipData mClipData = ClipData.newPlainText("text", content);
        mClipboardManager.setPrimaryClip(mClipData);
    }

    /**
     * 粘贴链接
     *
     * @param context 上下文对象
     * @param content 内容
     */
    public void clipUri(Context context, String content) {
        ClipboardManager mClipboardManager = (ClipboardManager) context.getSystemService(CLIPBOARD_SERVICE);
        ClipData mClipData = ClipData.newRawUri("uri", Uri.parse(content));
        mClipboardManager.setPrimaryClip(mClipData);
    }
}
