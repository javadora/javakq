package org.example.javakq.pojo.view;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;


@Data
public class ApplyVO {
    private Long id;
    /**
     * 申请人
     */
    private Long userId;
    /**
     * 申请人名称
     */
    private String userName;
    /**
     * 申请类型
     */
    private Integer type;
    /**
     * 申请开始时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date startTime;
    /**
     * 申请截止时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endTime;
    /**
     * 申请小时数
     */
    private Double hours;
    /**
     * 申请原因
     */
    private String reason;
    /**
     * 申请时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    /**
     * 审批状态
     */
    private Integer status;
    /**
     * 审批人
     */
    private Long approver;
    /**
     * 审批人名称
     */
    private String approverName;
    /**
     * 审批结果
     */
    private Integer result;
    /**
     * 审批备注
     */
    private String remark;
    /**
     * 审批时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date approveTime;
    /**
     * 撤销原申请id
     */
    private Long delApplyId;
}
