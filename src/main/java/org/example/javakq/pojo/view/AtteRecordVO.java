package org.example.javakq.pojo.view;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;


@Data
public class AtteRecordVO {
    /**
     * 考勤记录id
     */
    private Long id;
    /**
     * 考勤人员id
     */
    private Long userId;
    /**
     * 考勤人员名称
     */
    private String userName;
    /**
     * 考勤日期 年
     */
    private Integer atteYear;
    /**
     * 考勤日期 月
     */
    private Integer atteMonth;
    /**
     * 考勤日期 日
     */
    private Integer atteDay;
    /**
     * 上班打卡时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date startTime;
    /**
     * 下班打卡时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endTime;
    /**
     * 考勤结果
     */
    private String result;
    /**
     * 打卡时间
     */
    private Date now;
}
