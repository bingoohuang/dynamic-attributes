package cn.bjca.attr;

import lombok.Builder;
import lombok.Getter;

/**
 * 通用Restful api返回
 */
@Builder
@Getter
public class Result {
    private final int status;
    private final Object data;

    public static Result success(Object data) {
        return Result.builder().data(data).build();
    }
}
