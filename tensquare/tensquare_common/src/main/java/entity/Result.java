package entity;

/**
 * @ClassName Result
 * @Description: TODO
 * @Author chenjiafeng
 * @Date 2020/3/24
 * @Version V1.0
 **/
public class Result {
    private boolean flage;  //是否成功
    private Integer code;   //返回码
    private String message; //返回消息
    private Object date;    //返回数据

    public Result() {
    }

    public Result(Integer code, boolean flage, String message) {
        this.flage = flage;
        this.code = code;
        this.message = message;
    }

    public Result(Integer code, boolean flage, String message, Object date) {
        this.flage = flage;
        this.code = code;
        this.message = message;
        this.date = date;
    }

    public boolean isFlage() {
        return flage;
    }

    public void setFlage(boolean flage) {
        this.flage = flage;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }
}
