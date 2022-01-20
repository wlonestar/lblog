package com.wjl.lblog.utils;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.region.Region;
import com.wjl.lblog.common.constants.GlobalConstants;

/**
 * @author: wjl
 * @date: 2021/12/8 20:41
 * @version: v1.0
 */
public class CosClientUtil {

    public static COSClient createClient() {
        String secretId = GlobalConstants.SECRET_ID;
        String secretKey = GlobalConstants.SECRET_KEY;
        COSCredentials credentials = new BasicCOSCredentials(secretId, secretKey);
        Region region = new Region(GlobalConstants.REGION);
        ClientConfig clientConfig = new ClientConfig(region);
        return new COSClient(credentials, clientConfig);
    }

}
