package entity;

/**
 * @ClassName StausCode
 * @Description: TODO
 * @Author chenjiafeng
 * @Date 2020/3/24
 * @Version V1.0
 **/
public class StausCode {
    public static final int OK = 20000; //成功
    public static final int ERROR = 20001;//失败
    public static final int LOGINERROR = 20002;//用户卖名或密码错误
    public static final int ACCESSERROR = 20003;//权限不足
    public static final int REMOTEERROR = 20004;//远程调用失败
    public static final int REPERROR = 20005;   //重复操作
}
