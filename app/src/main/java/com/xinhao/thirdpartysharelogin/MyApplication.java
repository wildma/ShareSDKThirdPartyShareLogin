package com.xinhao.thirdpartysharelogin;

import android.app.Application;

import cn.sharesdk.framework.ShareSDK;

/**
 * author           Alpha58
 * date             2017/03/15
 * desc	            ${Application}
 * <p>
 * upDateAuthor     $Author$
 * upDate           $Date$
 * upDateDesc       ${TODO}
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化ShareSDK
        ShareSDK.initSDK(this);
    }
}
