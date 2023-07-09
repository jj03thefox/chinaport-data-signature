package cn.alphahub.eport.signature.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Abstract Response Interface
 */
interface IAbstractResponse extends Serializable {

}

/**
 * 三方数据返回封装
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
public abstract class ThirdAbstractResponse<O, E> implements IAbstractResponse {
    /**
     * 三方原始返回
     */
    private O original;
    /**
     * 三方期望返回
     */
    private E expected;

    /**
     * @param <O> 原始返回类型
     * @param <E> 期望返回类型
     * @return Abstract Response
     */
    public static <O, E> ThirdAbstractResponse<O, E> getInstance() {
        return new ThirdAbstractResponse<>() {
        };
    }
}
