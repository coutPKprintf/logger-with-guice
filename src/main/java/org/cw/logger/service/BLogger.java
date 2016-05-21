package org.cw.logger.service;

import org.apache.log4j.Logger;
import org.cw.logger.annotation.InjectLogger;

/**
 * Created by chenwen on 16/5/21.
 */
public class BLogger implements IService{
    @InjectLogger
    Logger logger;

    public void show(){
        logger.info("start show logger in class BLogger");
    }
}
