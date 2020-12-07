package lt.baltictalents.uzdaviniai;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Postit {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("message_code")
    @Expose
    private Integer messageCode;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("data")
    @Expose
    private List<Adresas> data = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(Integer messageCode) {
        this.messageCode = messageCode;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<Adresas> getData() {
        return data;
    }

    public void setData(List<Adresas> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Postit{" +
                "status='" + status + '\'' +
                ", success=" + success +
                ", message='" + message + '\'' +
                ", messageCode=" + messageCode +
                ", total=" + total +
                ", data=" + data +
                '}';
    }
}