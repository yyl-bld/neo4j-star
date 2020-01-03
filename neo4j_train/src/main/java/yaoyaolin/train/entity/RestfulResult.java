package yaoyaolin.train.entity;

public class RestfulResult {
    //执行结果
    boolean flag;
    //提示信息
    String message;
    //错误信息
    String errorMessage;
    //数据
    Object data;
    //单位毫秒
    long time;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "RestfulResult{" +
                "flag=" + flag +
                ", message='" + message + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", data=" + data +
                ", time=" + time +
                '}';
    }
}
