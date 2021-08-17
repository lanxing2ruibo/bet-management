package blues.dao;

import blues.entity.BetRecord;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author lanxing 2021-08-17
 */
public interface BeRecordCrudRepository extends CrudRepository<BetRecord,Long> {
    List<BetRecord> findByUser(String user);
}
