package com.lecar.freecar.model.demo;

import java.math.BigDecimal;

public class TransportTruckInput {
    private BigDecimal id;

    private String templateCode;

    private String colName;

    private String colExpr;

    private Short statFlag;

    private Short userFlag;

    private Short delFlag;

    private Short orderby;

    private Short showFlag;

    private Short showOrderby;

    private String colCode;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode == null ? null : templateCode.trim();
    }

    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName == null ? null : colName.trim();
    }

    public String getColExpr() {
        return colExpr;
    }

    public void setColExpr(String colExpr) {
        this.colExpr = colExpr == null ? null : colExpr.trim();
    }

    public Short getStatFlag() {
        return statFlag;
    }

    public void setStatFlag(Short statFlag) {
        this.statFlag = statFlag;
    }

    public Short getUserFlag() {
        return userFlag;
    }

    public void setUserFlag(Short userFlag) {
        this.userFlag = userFlag;
    }

    public Short getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Short delFlag) {
        this.delFlag = delFlag;
    }

    public Short getOrderby() {
        return orderby;
    }

    public void setOrderby(Short orderby) {
        this.orderby = orderby;
    }

    public Short getShowFlag() {
        return showFlag;
    }

    public void setShowFlag(Short showFlag) {
        this.showFlag = showFlag;
    }

    public Short getShowOrderby() {
        return showOrderby;
    }

    public void setShowOrderby(Short showOrderby) {
        this.showOrderby = showOrderby;
    }

    public String getColCode() {
        return colCode;
    }

    public void setColCode(String colCode) {
        this.colCode = colCode == null ? null : colCode.trim();
    }
}