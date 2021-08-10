package blues.service;

import blues.entity.BetRecord;

import java.util.List;

/**
 * @author lanxing  2021-06-26
 */
public interface BetRecordService {
    BetRecord add(BetRecord model);

    List<BetRecord> listByUser(String user);
}
