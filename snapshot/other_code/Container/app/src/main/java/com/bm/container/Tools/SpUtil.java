package com.bm.container.Tools;

import android.content.Context;
import android.content.SharedPreferences;

import com.bm.container.module.BaseApplication;

/**
 * 存储键值对的工具类，存储于SharedPreference
 *
 * @author nfmomo
 */
public class SpUtil {

    // 声明sp
    private static SharedPreferences sp;

    /**
     * ID
     */
    public static String ID = "ID";

    /**
     * userId
     */
    public static String USERID = "USERID";

    /**
     * Name
     */
    public static String NAME = "NAME";

    /**
     * USERFLAG 0买家，1卖家
     */
    public static String USERFLAG = "USERFLAG";

    /**
     * APPUSERTYPE 0个人，1公司
     */
    public static String APPUSERTYPE = "APPUSERTYPE";

    /**
     * 国家ID
     */
    public static String COUNTRYID = "COUNTRYID";

    /**
     * 支付成功返回首页标识（现在登录成功也用的同样标识）
     */
    public static String PAYSUCCESS = "PAYSUCCESS";

    /**
     * 点击首页我要买箱，跳转交易市场卖箱信息
     */
    public static String JUMPSALELIST = "JUMPSALELIST";

    /**
     * 登录手机号
     */
    public static String PHONE = "PHONE";

    /**
     * 登录密码
     */
    public static String PWD = "PWD";

    /**
     * 自动登录
     */
    public static String REMEMNBER = "REMEMNBER";

    /**
     * 验证码校验
     */
    public static String CODEPHONE = "CODEPHONE";
    public static String CODECODE = "CODECODE";

    /**
     * 保存登录手机号
     */
    public static String SAVEPHONE = "SAVEPHONE";

    /**
     * 保存登录密码
     */
    public static String SAVEPWD = "SAVEPWD";

    /**
     * 无需刷新
     */
    public static String DONTNEEDREFRESH = "DONTNEEDREFRESH";

    /**
     * 微信支付
     *
     * @param key
     * @param value
     */
    public static String ISPAYED = "ISPAYED";


    /**
     * 极光的id
     */
    public static String REGID = "REGID";

    /**
     * 该标识用于 卖箱信息发布成功 MainActivity功切换到第二页 交易市场切换到卖箱Fragment
     */
    public static String SELL_BOX_SUCCESSFULLY_RELEASED = "SELL_BOX_SUCCESSFULLY_RELEASED";

    /**
     * 出价成功 MainActivity功切换到第二页 交易市场
     */
    public static String SUCCESSFUL_BID_SUCCESS = "SUCCESSFUL_BID_SUCCESS";


    // String的存取方法
    public static void setString(String key, String value) {
        if (sp == null) {
            sp = BaseApplication.context.getSharedPreferences("nfmomo", Context.MODE_PRIVATE);
        }
        sp.edit().putString(key, value).commit();
    }

    public static String getString(String key) {
        if (sp == null) {
            sp = BaseApplication.context.getSharedPreferences("nfmomo", Context.MODE_PRIVATE);
        }
        return sp.getString(key, "");
    }

    // boolean的存取方法
    public static void setBoolean(String key, boolean value) {
        if (sp == null) {
            sp = BaseApplication.context.getSharedPreferences("nfmomo", Context.MODE_PRIVATE);
        }
        sp.edit().putBoolean(key, value).commit();
    }

    public static boolean getBoolean(String key, boolean defValue) {
        if (sp == null) {
            sp = BaseApplication.context.getSharedPreferences("nfmomo", Context.MODE_PRIVATE);
        }
        return sp.getBoolean(key, defValue);
    }


}
