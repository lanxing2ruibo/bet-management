package blues.resp;

/**
 * @author lanxing  2021-06-26
 */
public class RestResult<T> {
    private int status = 200;
    private String message = "success";
    private T data;

    public RestResult(T data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
