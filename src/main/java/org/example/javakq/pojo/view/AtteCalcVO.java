package org.example.javakq.pojo.view;

import lombok.Data;

import java.util.List;


@Data
public class AtteCalcVO {
    /**
     * 年
     */
    private Integer year;
    /**
     * 月
     */
    private Integer month;
    /**
     * 用户
     */
    private Long userId;
    /**
     * 用户
     */
    private String userName;
    /**
     * 用户月度总缺勤工时(分钟)
     */
    private Long absenceTotal;
    /**
     * 用户月度总请假工时(分钟)
     */
    private Double leaveTotal;
    /**
     * 用户月度总病假工时(分钟)
     */
    private Double sickTotal;
    /**
     * 用户月度总年假工时(分钟)
     */
    private Double annualTotal;
    /**
     * 用户月度总婚假工时(分钟)
     */
    private Double marriageTotal;
    /**
     * 用户月度总丧假工时(分钟)
     */
    private Double funeralTotal;
    /**
     * 用户月度总产假工时(分钟)
     */
    private Double maternityTotal;
    /**
     * 用户月度总陪产假工时(分钟)
     */
    private Double paternityTotal;
    /**
     * 用户月度总调休工时(分钟)
     */
    private Double compensatoryTotal;
    /**
     * 用户月度总外出工时(分钟)
     */
    private Double goOutTotal;
    /**
     * 用户月度总加班工时(分钟)
     */
    private Double addTotal;
    /**
     * 用户月度总出差工时(分钟)
     */
    private Double businessTotal;
    /**
     * 异常考勤日期详情
     */
    private List<AtteRecordVO> exceptDay;
}
