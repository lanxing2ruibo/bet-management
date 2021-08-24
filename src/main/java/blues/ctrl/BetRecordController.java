package blues.ctrl;

import blues.entity.BetRecord;
import blues.resp.RestResult;
import blues.service.BetRecordCrudService;
import blues.service.BetRecordService;
import jdk.internal.icu.text.UnicodeSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lanxing 2021-06-24
 */
@RestController
@RequestMapping("/betRecord")
public class BetRecordController {
    @Autowired
    BetRecordService betRecordService;

    @Autowired
    BetRecordCrudService betRecordCrudService;

    @PostMapping("/create")
    public RestResult<BetRecord> create(@RequestBody BetRecord model){
        BetRecord betRecord = betRecordService.add(model);
        return new RestResult(betRecord);
    }

    @GetMapping("/listByUser")
    public RestResult<List<BetRecord>> listBetRecord(@RequestParam String user){
//       List<BetRecord> betRecordList = betRecordService.listByUser(user);

        Map<String,Object> queryMap = new HashMap<>();
        queryMap.put("user",user);
        List<BetRecord> betRecordList = betRecordCrudService.findList(queryMap);

        return new RestResult<List<BetRecord>>(betRecordList);
    }
}
