package com.ldkspringbase.controller;

import com.ldkspringbase.entity.BoardEntity;
import com.ldkspringbase.service.BoardService;
import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController("/api/boards")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

//    @Autowired
//    public BoardController(BoardService boardService) {
//        this.boardService = boardService;
//    }

    @GetMapping
    public List<BoardEntity> getAllBoards() {
        return boardService.getAllBoards();
    }

    @GetMapping("/{id}")
    public BoardEntity getBoardById(@PathVariable int id) {
        return boardService.getBoardById(id);
    }

    @PostMapping
    public void createBoard(@RequestBody BoardEntity board) {
        boardService.createBoard(board);
    }

    @PutMapping("/{id}")
    public void updateBoard(@PathVariable int id, @RequestBody BoardEntity board) {
        board.setId(id);
        boardService.updateBoard(board);
    }

    @DeleteMapping("/{id}")
    public void deleteBoard(@PathVariable Long id) {
        boardService.deleteBoard(id);
    }
}

