package com.fasparrow.smartlockweb.mapper;

import com.fasparrow.smartlockweb.dto.Room;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 로그인 매퍼
 *
 * @author ji
 */
@Mapper
public interface LoginMapper {
    List<Room> selectUserList();
}
