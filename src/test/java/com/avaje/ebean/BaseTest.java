package com.avaje.ebean;

import org.avaje.agentloader.AgentLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseTest {

  protected static Logger logger = LoggerFactory.getLogger(BaseTest.class);

  static {
    logger.debug("... preStart");
    if (!AgentLoader.loadAgentFromClasspath("avaje-ebeanorm-agent", "debug=1;packages=org.example.**")) {
      logger.info("avaje-ebeanorm-agent not found in classpath - not dynamically loaded");
    }
  }
}
