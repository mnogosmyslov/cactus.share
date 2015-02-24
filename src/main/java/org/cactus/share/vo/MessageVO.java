package org.cactus.share.vo;

public class MessageVO {

    private String message;
    private int id;

    public MessageVO() {

    }

    public MessageVO(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
