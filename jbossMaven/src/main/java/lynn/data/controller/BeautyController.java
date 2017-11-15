package lynn.data.controller;

import lynn.data.domain.Beauty;
import lynn.data.mapper.BeautyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BeautyController {


    @Autowired
    BeautyMapper beautyMapper;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<Beauty> getBeautyMapper() throws Exception {
        if (true){
            throw  new Exception("500");
        }
        return beautyMapper.getAll();
    }
}
