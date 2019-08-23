package com.lecar.cmb.com.lecar.cmb.entity;

    import java.math.BigDecimal;
    import com.baomidou.mybatisplus.annotation.TableName;
    import java.time.LocalDateTime;
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
    @TableName("cmb_payment")
    public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 业务参考号
            */
    private String referNumber;

            /**
            * 付方账号
            */
    private String payAccount;

            /**
            * 业务类别（0-直接支付/1-集团支付）
            */
    private Integer type;

            /**
            * 付方开户地区代码
            */
    private String payCityCode;

            /**
            * 交易金额
            */
    private BigDecimal amount;

            /**
            * 用途
            */
    private String purpose;

            /**
            * 收方账户
            */
    private String gatherAccount;

            /**
            * 收方帐户名
            */
    private String gatherName;

            /**
            * 系统内外标志（0-招行 1-非招行）
            */
    private Integer bankFlag;

            /**
            * 收方开户行（跨行支付必填）
            */
    private String gatherOpenBank;

            /**
            * 收方地址（跨行支付必填）
            */
    private String gatherBankAddress;

            /**
            * 业务摘要
            */
    private String summary;

            /**
            * 状态 0-起始 1-转账成功 2-转账失败 3-成功到账
            */
    private Integer status;

            /**
            * 失败原因
            */
    private String remark;

            /**
            * 创建时间
            */
    private LocalDateTime createTime;

            /**
            * 修改时间
            */
    private LocalDateTime updateTime;


}
