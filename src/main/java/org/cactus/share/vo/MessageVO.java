package org.cactus.share.vo;

import java.util.Date;

public class MessageVO {

    private int id;
    private String message;
    private int authorId;
    private Date date;

    public MessageVO() {

    }

    public MessageVO(int id, String message, int authorId, Date date) {
        this.id = id;
        this.message = message;
        this.authorId = authorId;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
