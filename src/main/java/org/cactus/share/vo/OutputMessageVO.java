package org.cactus.share.vo;

import java.util.Date;

public class OutputMessageVO extends MessageVO  {

    private Date time;

    public OutputMessageVO(MessageVO original, Date time) {
        //TODO: Uncomment, if this class will be in demand again
        //super(original.getId(), original.getMessage());
        this.time = time;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
