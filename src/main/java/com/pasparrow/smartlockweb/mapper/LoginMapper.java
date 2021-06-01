package com.pasparrow.smartlockweb.mapper;

import com.pasparrow.smartlockweb.dto.RoomDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 로그인 매퍼
 *
 * @author ji
 */
@Mapper
public interface LoginMapper {
    List<RoomDto> selectUserList();
}
