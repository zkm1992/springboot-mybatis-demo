package com.winter.handle;

import com.winter.constant.ResponseStatus;
import com.winter.exception.UserException;
import com.winter.util.StatusMsg;
import com.winter.util.TransJsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ResponseBody
    @ExceptionHandler(RuntimeException.class)
    public String handle(Exception e) {
        if (e instanceof UserException) {
            UserException userException = ((UserException) e);
            return TransJsonUtil.Obj2Json("", new StatusMsg(userException.getCode(), userException.getMessage()));
        }
        logger.info("", e);
        return TransJsonUtil.Obj2Json("", new StatusMsg(ResponseStatus.UNKNOWN_ERROR));
    }

}
