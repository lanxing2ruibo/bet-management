package blues.service.impl;

import blues.entity.BetRecord;
import blues.service.BetRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author lanxing  2021-06-26
 */
@Service
public class BetRecorderServiceImpl implements BetRecordService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public BetRecord add(BetRecord model) {
        jdbcTemplate.update("insert into bet_record(money,result,income,user,create_time) values(?,?,?,?,?)",
                model.getMoney(),model.getResult(),model.getIncome(),model.getUser(),new Date());

        return model;
    }

    @Override
    public List<BetRecord> listByUser(String user) {
        return jdbcTemplate.query("select * from bet_record where user = ?",new BeanPropertyRowMapper<>(BetRecord.class),user);
    }
}
