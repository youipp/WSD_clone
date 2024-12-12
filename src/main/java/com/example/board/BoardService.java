package com.example.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    BoardDAO boardDAO;
    public List<BoardVO> getBoardList(){
        return boardDAO.getBoardList();
    }
    public int insertBoard(BoardVO vo) {return boardDAO.insertBoard(vo);}
//    public int deleteBoard(int id) {
//        return boardDAO.deleteBoard(id);
//    }
//    public int updateBoard(BoardVO vo) {return boardDAO.updateBoard(vo);}
//    public BoardVO getBoard(int seq){return boardDAO.getBoard(seq);}
    public int getTotalcnt() {return boardDAO.getTotalcnt();}

    }
