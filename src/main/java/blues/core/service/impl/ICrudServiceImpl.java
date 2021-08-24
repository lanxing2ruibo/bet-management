package blues.core.service.impl;

import blues.core.service.ICrudService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class ICrudServiceImpl<Domain> implements ICrudService<Domain> {
    public List<Domain> findList(Map map){
        return new ArrayList<Domain>();
    }
}
