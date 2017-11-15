package lynn.data.mapper;

import lynn.data.domain.Beauty;

import java.util.List;

public interface BeautyMapper {
    int insert(Beauty record);

    int insertSelective(Beauty record);

    List<Beauty> getAll();
}