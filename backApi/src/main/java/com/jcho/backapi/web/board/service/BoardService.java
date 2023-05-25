package com.jcho.backapi.web.board.service;

import com.jcho.backapi.web.board.dto.BoardDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BoardService {

    public List<BoardDto> getBoardList(Pageable pageable) throws Exception;

    public BoardDto getBoardOne(long boardNo) throws Exception;

    public BoardDto writeBoard(BoardDto boardDto, Long regUserId) throws Exception;

    public boolean deleteBoard(BoardDto boardDto, long userId) throws Exception;
}
