package com.lecar.freecar.model.demo;

public class Corp {
    private String cId;

    private String cCorpId;

    private String cBusRegiscode;

    private String vLegalName;

    private String vLegalIdcard;

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

    public String getcBusRegiscode() {
        return cBusRegiscode;
    }

    public void setcBusRegiscode(String cBusRegiscode) {
        this.cBusRegiscode = cBusRegiscode == null ? null : cBusRegiscode.trim();
    }

    public String getvLegalName() {
        return vLegalName;
    }

    public void setvLegalName(String vLegalName) {
        this.vLegalName = vLegalName == null ? null : vLegalName.trim();
    }

    public String getvLegalIdcard() {
        return vLegalIdcard;
    }

    public void setvLegalIdcard(String vLegalIdcard) {
        this.vLegalIdcard = vLegalIdcard == null ? null : vLegalIdcard.trim();
    }
}