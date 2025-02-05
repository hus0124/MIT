package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardService {
	
	//1. 목록보기
	public List<BoardVO> getList(Criteria cri);
	
	//2. 게시글등록
	public void register(BoardVO board);
	
	//3. 게시글보기
	public BoardVO get(Long bno);
	
	//4. 게시글수정
	public boolean modify(BoardVO board);
	
	//5. 게시글삭제
	public boolean remove(Long bno);
	
	
}
