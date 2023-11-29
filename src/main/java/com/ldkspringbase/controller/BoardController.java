package com.ldkspringbase.controller;

import com.ldkspringbase.dto.BoardDto;
import com.ldkspringbase.service.BoardService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/boards")
public class BoardController {
    BoardService boardService;

    @PostMapping("/create")
    public BoardDto createBoard() {
        return boardService.createBoard();
    }

}


