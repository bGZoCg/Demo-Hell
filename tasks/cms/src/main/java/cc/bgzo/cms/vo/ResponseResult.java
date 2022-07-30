package cc.bgzo.cms.vo;

import lombok.Data;

/* File Name: ResponseResult
 * Author: bGZo
 * Created Time: 7/25/2022 00:35
 * License: MIT
 * Description: 响应结果对象
 */
@Data
public class ResponseResult {
    private String code;   //提示码
    private String message;//提示信息

    public ResponseResult(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
