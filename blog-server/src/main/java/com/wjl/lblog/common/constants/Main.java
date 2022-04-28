package com.wjl.lblog.common.constants;

import cn.dev33.satoken.secure.SaBase64Util;

/**
 * @author: wjl
 * @time: 2022/4/28 15:04
 * @version: 1.0
 */
public class Main {

    public static final String SECRET_ID = "AKIDDG3aqpXzA4jALFsSrzqQknZ4IGwQjmgU";
    public static final String SECRET_KEY = "lMkz55tQffOq43lCML5XicGdjZ9SUryp";

    public static void main(String[] args) {
        String encode_id = SaBase64Util.encode(SECRET_ID);
        System.out.println(encode_id);
        System.out.println(SaBase64Util.decode(encode_id));

        String encode_key = SaBase64Util.encode(SECRET_KEY);
        System.out.println(encode_key);
        System.out.println(SaBase64Util.decode(encode_key));
    }

}
