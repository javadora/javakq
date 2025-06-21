package org.example.javakq.pojo.view;

import lombok.Data;


@Data
public class AtteDateVO {
    /**
     * 考勤人员id
     */
    private Long userId;
    /**
     * 考勤日期 年
     */
    private Integer year;
    /**
     * 考勤日期 月
     */
    private Integer month;
    /**
     * 考勤日期 日
     */
    private Integer day;
}
