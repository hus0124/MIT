package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(board -> log.info(board));
	}
	
	@Test
	public void testInsert() {
		BoardVO board = new BoardVO();
		board.setTitle("insert test");
		board.setContent("is it working?");
		board.setWriter("IZONE");
		mapper.insert(board);
	}
	
	@Test
	public void testInsertSelectKey() {
		BoardVO board = new BoardVO();
		board.setTitle("insert test2");
		board.setContent("작동합니까???");
		board.setWriter("ITZY");
		mapper.insertSelectKey(board);
	}
	
	@Test
	public void testRead() {
		mapper.read(2);
	}
	
	@Test
	public void testDelete() {
		log.info("삭제 개수" + mapper.delete(8));
	}
	
	@Test
	public void testUpdate() {
		BoardVO board = new BoardVO();
		board.setTitle("밥메뉴뭐임?");
		board.setContent("코ㅋ닼맄ㅋㅋ");
		board.setWriter("밈미밈");
		board.setBno((long)4);
		mapper.update(board);
		
	}
	
	@Test
	public void testdoubleRead() {
		mapper.doubleRead(3);
	}
	
	@Test
	public void testPagenum() {
		Criteria cri = new Criteria(30,10);
		mapper.getListWithPaging(cri);
	}
	
}
