package cn.bjca.attr;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;

/**
 * 扩展属性集
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Set {
    private String name; // 属性集名称
    private String remark; // 属性集说明
    @Singular
    private List<Definition> attrsDefinitions; // 属性列表
}
