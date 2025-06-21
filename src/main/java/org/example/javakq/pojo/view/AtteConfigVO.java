package org.example.javakq.pojo.view;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;


@Data
public class AtteConfigVO {
    private Long id;

    private String configCode;

    private String configValue;

    private String configDesc;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
}
