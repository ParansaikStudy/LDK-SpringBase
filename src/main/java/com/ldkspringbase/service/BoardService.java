package com.ldkspringbase.service;

import com.ldkspringbase.dto.BoardDto;
import com.ldkspringbase.entity.BoardEntity;
import com.ldkspringbase.mapper.BoardMapper;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    BoardMapper boardMapper;

    public BoardDto createBoard() {
        // TODO: Entity -> Dto
        BoardEntity boardEntity = boardMapper.createBoard();
        return new BoardDto();
    }
}
