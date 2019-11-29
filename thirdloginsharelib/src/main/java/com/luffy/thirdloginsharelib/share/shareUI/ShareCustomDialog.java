package com.luffy.thirdloginsharelib.share.shareUI;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;

import com.luffy.thirdloginsharelib.R;
import com.umeng.socialize.bean.SHARE_MEDIA;

/**
 * Created by lvlufei on 2018/4/3
 *
 * @desc 分享自定义对话框
 */
public class ShareCustomDialog {
    private View shareView;
    private ShareCustomDialog.DBAlertDialog shareDialog;
    SharePlatformCallBack sharePlatformCallBack;

    public ShareCustomDialog(Activity context) {
        shareDialog = new ShareCustomDialog.DBAlertDialog(context);
        shareView = LayoutInflater.from(context).inflate(R.layout.layout_share, null);
        shareView.findViewById(R.id.layout_pyq).setOnClickListener(new ShareClickListener());
        shareView.findViewById(R.id.layout_qqkj).setOnClickListener(new ShareClickListener());
        shareView.findViewById(R.id.layout_wb).setOnClickListener(new ShareClickListener());
        shareView.findViewById(R.id.layout_wx).setOnClickListener(new ShareClickListener());
        shareView.findViewById(R.id.layout_qq).setOnClickListener(new ShareClickListener());
    }

    /**
     * 显示
     */
    public ShareCustomDialog show() {
        shareDialog.show();
        return this;
    }

    /**
     * 取消
     */
    public ShareCustomDialog dismiss() {
        shareDialog.dismiss();
        return this;
    }

    /**
     * 分享board 点击监听
     */
    class ShareClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            dismiss();
            int clickId = v.getId();
            if (clickId == R.id.layout_pyq) {
                if (sharePlatformCallBack != null) {
                    sharePlatformCallBack.sendPlatform(SHARE_MEDIA.WEIXIN_CIRCLE);
                }
            } else if (clickId == R.id.layout_qqkj) {
                if (sharePlatformCallBack != null) {
                    sharePlatformCallBack.sendPlatform(SHARE_MEDIA.QZONE);
                }
            } else if (clickId == R.id.layout_wb) {
                if (sharePlatformCallBack != null) {
                    sharePlatformCallBack.sendPlatform(SHARE_MEDIA.SINA);
                }
            } else if (clickId == R.id.layout_wx) {
                if (sharePlatformCallBack != null) {
                    sharePlatformCallBack.sendPlatform(SHARE_MEDIA.WEIXIN);
                }
            } else if (clickId == R.id.layout_qq) {
                if (sharePlatformCallBack != null) {
                    sharePlatformCallBack.sendPlatform(SHARE_MEDIA.QQ);
                }
            }
        }
    }

    public interface SharePlatformCallBack {
        void sendPlatform(SHARE_MEDIA platform);
    }

    public ShareCustomDialog setSharePlatformCallBack(SharePlatformCallBack sharePlatformCallBack) {
        this.sharePlatformCallBack = sharePlatformCallBack;
        return this;
    }

    /**
     * 自定义的Dialog
     */
    public class DBAlertDialog extends AlertDialog {

        protected DBAlertDialog(Context context) {
            super(context);
        }

        public void show() {
            try {
                if (getContext() instanceof Activity) {
                    if (((Activity) getContext()).isFinishing()) {
                        return;
                    }
                }
                super.show();
                getWindow().setContentView(shareView);
                WindowManager.LayoutParams lp = getWindow().getAttributes();
                lp.width = WindowManager.LayoutParams.MATCH_PARENT;
                getWindow().setAttributes(lp);
                getWindow().setGravity(Gravity.BOTTOM);
                getWindow().setBackgroundDrawable(null);
                getWindow().setWindowAnimations(R.style.down_enter_down_exit_anim);
                //Android AlertDialog去掉系统黑色背景
                getWindow().setBackgroundDrawableResource(R.color.transparent);
                // 不加这句，软键盘弹不出来
                getWindow().clearFlags(WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
