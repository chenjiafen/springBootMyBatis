package com.chenjiafeng;

/**
 * @author tyler.chen
 * @data 2020-01-08 10:28
 */
public class TestDemo {
    public enum ResultEnum {
        //这里是可以自己定义的，方便与前端交互即可
        UNKNOWN_ERROR(-1, "未知错误"),
        SUCCESS(0, "成功"),
        USER_NOT_EXIST(1, "用户不存在"),
        USER_IS_EXISTS(2, "用户已存在"),
        USER_IS_VALID(6,"失效用户"),
        LOGIN_FAIL(7,"用户名或密码错误"),
        REGISTER_FAIL(8,"同名不可注册"),
        DATA_IS_NULL(3, "数据为空"),
        WRONG_PASSWORD(4,"密码错误"),
        USER_IS_DELEDED(5,"用户已删除"),
        BAD_REQUEST(9,"请求方式错误"),
        ERROR(1000,"失败"),
        PUSH_MERCHANTS_INFO_ERROR(400,"推送商户信息失败"),
        PUSH_MERCHANTS_INFO_SUCCESS(200,"推送商户信息成功"),

        UNAUTHORIZED(999,"未授权,无法访问"),


        MOBILEPARAM_ERROR(-2, "手机号参数为空"),
        CNIDPARAM_ERROR(-3, "身份证参数为空"),
        PARAM_ERROR(16,"参数错误"),
        SERVER_ERROR(500,"服务器异常"),
        AUTH_ERROR(400,"用户授权异常"),
        FIND_AUTH_ERROR(400,"查询用户授权异常"),
        FIND_APPROVAL_DECISION(400,"查询用户审批决策异常"),
        ADD_APPROVAL_DECISION(400,"添加用户审批决策异常"),

        CLEAR_REDIS_EXCEPTION(400,"清除redis缓存异常"),
        //    NOT_FIND_LOAN_APPLICATION_DESC(400,"查询贷款数据异常"),
//    FIND_LOAN_APPLICATION_DESC(200,"没有贷款数据"),
        LOAN_UPDATE_ERROR(400,"更新可还款时间失败"),
        CREDITLINE_QUOTA_SUCCESS(200,"该用户没有额度信息"),
        CREDITLINE_DEFREEZE_ERROR(400,"解除额度冻结失败"),
        FIND_CARD_BIN_FAIL(400,"查询不对对应的银行卡卡bin成生银行卡失败"),

        SET_LOAN_STATE_AND_GRANT_QUOTA_HIERARCHY_ERROR(400,"授予额度或者更新状态异常"),
        ;
        private Integer code;
        private String msg;

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        ResultEnum(Integer code, String msg) {
            this.code = code;
            this.msg = msg;
        }
    }
    public static Result error() {
        Result result = new Result();
        result.setCode(ResultEnum.ERROR.getCode());
        result.setMsg(ResultEnum.ERROR.getMsg());
        return result;
    }
    public static void main(String[] args) {
        TestDemo t=new TestDemo();

//        return ResultUtil.error();
        System.out.println( t.error());


    }
}
