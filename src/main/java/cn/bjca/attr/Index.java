package cn.bjca.attr;

import lombok.Getter;

/**
 * 索引类型
 */
@Getter
public enum Index {
    无("无"), 普通索引("普通索引"), 唯一索引("唯一索引");

    private final String value;

    private Index(String value) {
        this.value = value;
    }
}
