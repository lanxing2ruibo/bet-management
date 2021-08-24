package blues.core.dao;

import java.util.List;
import java.util.Map;

public interface ICrud<Domain> {
    List<Domain> findList(Map map);
}
