package com.yfgz.es.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.yfgz.es.utils.Cryptography;
import com.yfgz.es.utils.Random;

import java.util.Arrays;

/**
 * Created by Rico on 2016/12/8.
 */
public class WeChatRefund {

    @JSONField(serialize = false)
    private String key;

    private String appid;           //公众账号ID
    private String mch_id;          //商户号
    private String nonce_str;       //随机字符串
    private String op_user_id;      //商户号

    private String sign;            //签名
    private String out_trade_no;    //商户订单号(我們的訂單號）
    private String out_refund_no;   //商户退款单号（我們的退款號)

    private int total_fee;          //订单金额
    private int refund_fee;         //退款金额

    public WeChatRefund() {
        // TODO: 2016/12/8 需要填充
        this.nonce_str = Random.random(32);
    }

    public WeChatRefund sign(WeChatRefund weChatRefund) {
        String[] str = {"appid=" + weChatRefund.getAppid(), "mch_id=" + weChatRefund.getMch_id(), "nonce_str=" + weChatRefund.getNonce_str(),
                "op_user_id=" + weChatRefund.getOp_user_id(), "out_trade_no=" + weChatRefund.getOut_trade_no(), "out_refund_no=" + weChatRefund.getOut_refund_no(),
                "total_fee=" + weChatRefund.getTotal_fee(), "refund_fee=" + weChatRefund.getRefund_fee()};

        Arrays.sort(str);
        String sortStr = "";
        for (String temp : str) {
            sortStr += temp + "&";
        }
        sortStr = sortStr + "key=" + weChatRefund.getKey();
        weChatRefund.setSign( Cryptography.md5Encode(sortStr).toUpperCase() );
        return weChatRefund;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getNonce_str() {
        return nonce_str;
    }

    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getOut_refund_no() {
        return out_refund_no;
    }

    public void setOut_refund_no(String out_refund_no) {
        this.out_refund_no = out_refund_no;
    }

    public int getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(int total_fee) {
        this.total_fee = total_fee;
    }

    public int getRefund_fee() {
        return refund_fee;
    }

    public void setRefund_fee(int refund_fee) {
        this.refund_fee = refund_fee;
    }

    public String getOp_user_id() {
        return op_user_id;
    }

    public void setOp_user_id(String op_user_id) {
        this.op_user_id = op_user_id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}
