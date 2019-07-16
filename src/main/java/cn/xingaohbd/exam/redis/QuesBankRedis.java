package cn.xingaohbd.exam.redis;

import cn.xingaohbd.exam.model.QuesBank;
import org.springframework.stereotype.Repository;

@Repository
public class QuesBankRedis extends BaseRedis<QuesBank>{
    private static final String REDIS_KEY = "cn.xinggaohbd.exam.redis.QuesBankRedis";

    @Override
    protected String getRedisKey() {
        return REDIS_KEY;
    }
}
