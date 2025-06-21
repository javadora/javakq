package org.example.javakq.pojo.view;

import lombok.Data;

import java.util.List;
import java.util.Map;


@Data
public class AtteStatisticVO {
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
     * 每日出勤情况
     */
    private Map<Integer, List<AtteRecordVO>> dateMap;
}
