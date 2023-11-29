package com.ldkspringbase.mapper;

import com.ldkspringbase.entity.BoardEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    BoardEntity createBoard();
}
