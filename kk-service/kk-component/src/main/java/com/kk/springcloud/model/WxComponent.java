package com.kk.springcloud.model;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * Created by kk on 2017/12/3.
 */
@Table(name = "wx_component")
public class WxComponent {

    private Integer id;
    @Column(name = "app_name",length = 120)
    private String appName;
    @Column(name = "component_app_id")
    private String componentAppId;
    @Column(name = "component_app_secret")
    private String componentAppSecret;
    @Column(name = "encoding_aes_key")
    private String encodingAesKey;
    @Column(name = "encoding_token")
    private String encodingToken;
    @Column(name = "component_verify_ticket")
    private String componentVerifyTicket;
    @Column(name = "component_access_token")
    private String componentAccessToken;
    @Column(name = "pre_auth_code")
    private String preAuthCode;
    @Column(name = "component_login_page")
    private String componentLoginPage;
    @Column(name = "component_home")
    private String componentHome;
    @Column(name = "callback_url")
    private String callbackUrl;
    @Column(name = "create_at")
    private String createAt;
    @Column(name = "op_by")
    private String opBy;
    @Column(name = "op_at")
    private String opAt;
    @Column(name = "del_flag")
    private String delFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getComponentAppId() {
        return componentAppId;
    }

    public void setComponentAppId(String componentAppId) {
        this.componentAppId = componentAppId;
    }

    public String getComponentAppSecret() {
        return componentAppSecret;
    }

    public void setComponentAppSecret(String componentAppSecret) {
        this.componentAppSecret = componentAppSecret;
    }

    public String getEncodingAesKey() {
        return encodingAesKey;
    }

    public void setEncodingAesKey(String encodingAesKey) {
        this.encodingAesKey = encodingAesKey;
    }

    public String getEncodingToken() {
        return encodingToken;
    }

    public void setEncodingToken(String encodingToken) {
        this.encodingToken = encodingToken;
    }

    public String getComponentVerifyTicket() {
        return componentVerifyTicket;
    }

    public void setComponentVerifyTicket(String componentVerifyTicket) {
        this.componentVerifyTicket = componentVerifyTicket;
    }

    public String getComponentAccessToken() {
        return componentAccessToken;
    }

    public void setComponentAccessToken(String componentAccessToken) {
        this.componentAccessToken = componentAccessToken;
    }

    public String getPreAuthCode() {
        return preAuthCode;
    }

    public void setPreAuthCode(String preAuthCode) {
        this.preAuthCode = preAuthCode;
    }

    public String getComponentLoginPage() {
        return componentLoginPage;
    }

    public void setComponentLoginPage(String componentLoginPage) {
        this.componentLoginPage = componentLoginPage;
    }

    public String getComponentHome() {
        return componentHome;
    }

    public void setComponentHome(String componentHome) {
        this.componentHome = componentHome;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getOpBy() {
        return opBy;
    }

    public void setOpBy(String opBy) {
        this.opBy = opBy;
    }

    public String getOpAt() {
        return opAt;
    }

    public void setOpAt(String opAt) {
        this.opAt = opAt;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
}
