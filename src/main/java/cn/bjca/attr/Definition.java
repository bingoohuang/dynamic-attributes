package cn.bjca.attr;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;

/**
 * 属性定义
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Definition {
    private String name; // 名称
    private String remark; // 含义
    private Type type; // 类型
    private int maxLength; // 最长（字节）

    @Singular
    private List<String> options; // 类型为“选择”，值列表
    private boolean multiple; // 类型为“选择”，多选

    private Index index; // 索引
    private boolean nullable; // 可空
    private String defaultValue; // 默认值
    private String demo; // 示例值
}
