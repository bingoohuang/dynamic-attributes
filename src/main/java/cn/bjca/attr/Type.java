package cn.bjca.attr;

import lombok.Getter;

/**
 * 属性类型。
 */
@Getter
public enum Type {
    文本("文本"), 数值("数值"), 布尔("布尔"), 选择("选择");

    private final String value;

    private Type(String value) {
        this.value = value;
    }
}
