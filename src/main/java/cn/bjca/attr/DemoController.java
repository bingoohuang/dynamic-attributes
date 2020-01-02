package cn.bjca.attr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 属性操作控制器演示api
 */
@RestController
@RequestMapping("/demo")
public final class DemoController {
        /**
         * 查询属性集
         *
         * @return 属性集
         */
        @GetMapping
        public Set get() {
                return Set.builder().name("user_sports_attributes").remark("用户运动类扩展属性")
                                .attrsDefinition(Definition.builder().name("sport_favorite").remark("运动偏好")
                                                .type(Type.文本).maxLength(10).index(Index.无).nullable(true)
                                                .defaultValue(null).demo("篮球🏀").build())
                                .attrsDefinition(Definition.builder().name("sport_years").remark("运动年限").type(Type.数值)
                                                .index(Index.无).nullable(true).defaultValue("0").demo("3").build())
                                .attrsDefinition(Definition.builder().name("sport_member").remark("运动偏好").type(Type.布尔)
                                                .index(Index.无).nullable(false).defaultValue("true").build())
                                .attrsDefinition(Definition.builder().name("sport_class").remark("运动类别").type(Type.选择)
                                                .multiple(true).index(Index.无).nullable(false).defaultValue(null)
                                                .build())
                                .build();
        }

        /**
         * 修改属性集
         *
         * @param set 属性集
         * @return 操作结果
         */
        @PostMapping
        public Result post(@RequestBody final Set set) {
                return Result.success(set);
        }
}
