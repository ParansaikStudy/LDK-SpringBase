package com.ldkspringbase.controller;

import com.ldkspringbase.entity.BoardEntity;
import com.ldkspringbase.service.BoardService;
import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/boards")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;
//    @Autowired
//    public BoardController(BoardService boardService) {
//        this.boardService = boardService;
//    }

    // 전체 목록 조회
    @GetMapping
    public List<BoardEntity> getAllBoards() {
        return boardService.getAllBoards();
    }

    // 글 하나 조회
    @GetMapping("/{id}")
    public BoardEntity getBoardById(@PathVariable int id) {
        return boardService.getBoardById(id);
    }

    // 글 등록
    @PostMapping
    public BoardEntity createBoard(@RequestBody BoardEntity board) {
        return boardService.createBoard(board); // Return the created board
    }

//    @GetMapping("/test")
//    public String tt() {
//        return "hello";
//    }


//    @PutMapping("/{id}")
//    public void updateBoard(@PathVariable int id, @RequestBody BoardEntity board) {
//        board.setId(id);
//        boardService.updateBoard(board);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteBoard(@PathVariable Long id) {
//        boardService.deleteBoard(id);
//
//    }
}

