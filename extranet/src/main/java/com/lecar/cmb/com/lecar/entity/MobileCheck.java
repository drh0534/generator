package com.lecar.cmb.com.lecar.entity;

    import java.math.BigDecimal;
    import com.baomidou.mybatisplus.annotation.TableName;
    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.time.LocalDateTime;
    import com.baomidou.mybatisplus.annotation.TableField;
    import java.io.Serializable;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 
    * </p>
*
* @author ZXJ
* @since 2019-07-11
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("cmb_mobile_check")
    public class MobileCheck implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 主键id
            */
            @TableId(value = "check_id", type = IdType.AUTO)
    private Long checkId;

            /**
            * 业务参考号
            */
        @TableField("referNumber")
    private String referNumber;

            /**
            * 分行号
            */
        @TableField("branchNumber")
    private String branchNumber;

            /**
            * 账号
            */
    private String account;

            /**
            * 金额
            */
    private BigDecimal amount;

            /**
            * 授权使用人
            */
    private String certigier;

            /**
            * 流水号
            */
        @TableField("serialNum")
    private String serialNum;

            /**
            * 收方账户
            */
        @TableField("gatherAccount")
    private String gatherAccount;

            /**
            * 收方账户名
            */
        @TableField("gatherName")
    private String gatherName;

            /**
            * 系统内外标志(0-招行 1-非招行)
            */
        @TableField("bankFlag")
    private Integer bankFlag;

            /**
            * 支付汇路（0-CPS他行普通和行内、1-NPS他行实时）
            */
        @TableField("paymentWay")
    private Integer paymentWay;

            /**
            * 收方行号（当汇路为NPS时必填）
            */
        @TableField("gatherBankNum")
    private String gatherBankNum;

            /**
            * 收方行名称
            */
        @TableField("gatherBankName")
    private String gatherBankName;

            /**
            * CPS收方行地址（汇路为CPS且是系统外为必填）
            */
        @TableField("cpsAddress")
    private String cpsAddress;

            /**
            * CPS结算通道（汇路为CPS必填，0-F-快速、1-N-普通）
            */
        @TableField("cpsSettlementChannel")
    private Integer cpsSettlementChannel;

            /**
            * CPS用途（CPS时必输）
            */
        @TableField("cpsUse")
    private String cpsUse;

            /**
            * NPS附言（NPS必输）
            */
        @TableField("npsPostscript")
    private String npsPostscript;

            /**
            * 生效日期
            */
        @TableField("effectiveDate")
    private LocalDateTime effectiveDate;

            /**
            * 失效日期
            */
        @TableField("expiryDate")
    private LocalDateTime expiryDate;

            /**
            * 托收日期
            */
        @TableField("collectionDate")
    private LocalDateTime collectionDate;

            /**
            * 流程实例号
            */
        @TableField("processInstanceNum")
    private String processInstanceNum;

            /**
            * 支票编号
            */
        @TableField("checkNum")
    private String checkNum;

            /**
            * 请求状态
            */
        @TableField("requestStatus")
    private String requestStatus;

            /**
            * 业务处理结果
            */
    private String result;

            /**
            * 备注
            */
    private String remark;

            /**
            * 支票状态
            */
    private Integer status;

            /**
            * 创建时间
            */
        @TableField("createTime")
    private LocalDateTime createTime;

            /**
            * 修改时间
            */
        @TableField("updateTime")
    private LocalDateTime updateTime;


}
