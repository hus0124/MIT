package org.zerock.service;

import static org.junit.Assert.assertNotNull;

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
public class BoardServiceTests {
	
	@Setter(onMethod_ = @Autowired)
	private BoardService service;
		
	@Test // BoardService 테스트
	public void testExist() {
		log.info(service);
		assertNotNull(service); //Junit 제공 메소드. Null 값인지 판별
	}
	
	@Test
	public void testGetList() {
		Criteria cri = new Criteria();
		service.getList(cri);
	}
	
	@Test
	public void testRegister() {
		BoardVO board = new BoardVO();
		board.setTitle("집에가고싶다");
		board.setContent("냉무");
		board.setWriter("나비옹");
		service.register(board);
	}
	
	@Test
	public void testGetRead() {
		service.get(4L);
	}
	
	@Test
	public void testModify() {
		BoardVO board = new BoardVO();
		board.setBno(16L);
		board.setTitle("저녁메뉴뭐임?");
		board.setContent("햌물ㅋ빜빔ㅋ");
		board.setWriter("밈미밈");
		service.modify(board);
	}
	
	@Test
	public void testRemove() {
		service.remove(15L);
	}
}
