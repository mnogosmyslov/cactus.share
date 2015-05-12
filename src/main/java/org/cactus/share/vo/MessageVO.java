package org.cactus.share.vo;

import java.util.Date;

public class MessageVO extends AbstractVO {

    private long id;
    private String message;
    private long authorId;
    private Date date;

    public MessageVO() {

    }

    public MessageVO(long id, String message, long authorId, Date date) {
        this.id = id;
        this.message = message;
        this.authorId = authorId;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
