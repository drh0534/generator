package com.lecar.freecar.model.demo;

public class Ssqcert {
    private String cId;

    private String cCorpId;

    private String cUserId;

    private String cUserIdcard;

    private String vUserName;

    private String cUserMobile;

    private Short nRegFlag;

    private Short nAgentFlag;

    private Short nPersonalFlag;

    private Short nCertStatus;

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    public String getcCorpId() {
        return cCorpId;
    }

    public void setcCorpId(String cCorpId) {
        this.cCorpId = cCorpId == null ? null : cCorpId.trim();
    }

    public String getcUserId() {
        return cUserId;
    }

    public void setcUserId(String cUserId) {
        this.cUserId = cUserId == null ? null : cUserId.trim();
    }

    public String getcUserIdcard() {
        return cUserIdcard;
    }

    public void setcUserIdcard(String cUserIdcard) {
        this.cUserIdcard = cUserIdcard == null ? null : cUserIdcard.trim();
    }

    public String getvUserName() {
        return vUserName;
    }

    public void setvUserName(String vUserName) {
        this.vUserName = vUserName == null ? null : vUserName.trim();
    }

    public String getcUserMobile() {
        return cUserMobile;
    }

    public void setcUserMobile(String cUserMobile) {
        this.cUserMobile = cUserMobile == null ? null : cUserMobile.trim();
    }

    public Short getnRegFlag() {
        return nRegFlag;
    }

    public void setnRegFlag(Short nRegFlag) {
        this.nRegFlag = nRegFlag;
    }

    public Short getnAgentFlag() {
        return nAgentFlag;
    }

    public void setnAgentFlag(Short nAgentFlag) {
        this.nAgentFlag = nAgentFlag;
    }

    public Short getnPersonalFlag() {
        return nPersonalFlag;
    }

    public void setnPersonalFlag(Short nPersonalFlag) {
        this.nPersonalFlag = nPersonalFlag;
    }

    public Short getnCertStatus() {
        return nCertStatus;
    }

    public void setnCertStatus(Short nCertStatus) {
        this.nCertStatus = nCertStatus;
    }
}