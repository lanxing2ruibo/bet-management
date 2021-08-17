package blues.service.impl;

import blues.dao.BeRecordCrudRepository;
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
    BeRecordCrudRepository beRecordCrudRepository;

    @Override
    public BetRecord add(BetRecord model) {
        model.setCreateTime(new Date());
        beRecordCrudRepository.save(model);
        return model;
    }

    @Override
    public List<BetRecord> listByUser(String user) {
        return beRecordCrudRepository.findByUser(user);
    }
}
