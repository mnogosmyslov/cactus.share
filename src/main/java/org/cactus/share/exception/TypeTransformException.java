package org.cactus.share.exception;

public class TypeTransformException extends RuntimeException {
    public TypeTransformException(String message) {
        super(message);
    }

    public TypeTransformException(String message, Throwable cause) {
        super(message, cause);
    }
}