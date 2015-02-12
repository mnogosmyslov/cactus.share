package org.cactus.share.exception;

public class VOTransformException extends RuntimeException {
    public VOTransformException(String message) {
        super(message);
    }

    public VOTransformException(String message, Throwable cause) {
        super(message, cause);
    }
}

