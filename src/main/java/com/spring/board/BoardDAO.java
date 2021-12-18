package com.spring.board;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

@Repository
public class BoardDAO {
	
	@Autowired
	SqlSession sqlSession;

	public int insertBoard(BoardVO vo) {
		int result = sqlSession.insert("Board.insertBoard", vo); 
		return result;
	}
	
	public int updateBoard(BoardVO vo) {
		int result = sqlSession.update("Board.updateBoard", vo); 
		return result;
	}
	
	public int deleteBoard(int seq) {
		int result = sqlSession.delete("Board.deleteBoard", seq); 
		return result;
	}
	
	public BoardVO getBoard(int seq) {
		BoardVO one = sqlSession.selectOne("Board.getBoard", seq); 
		return one;
	}
	
	public List<BoardVO> getBoardList(BoardVO vo) {
		List<BoardVO> list = sqlSession.selectList("Board.getBoardList", vo); 
		return list;
	}

	
	/*
	@Autowired
	private JdbcTemplate template;
	
	private final String BOARD_INSERT = "insert into BOARD (title, writer, content, category) values (?, ?, ?, ?)";
	private final String BOARD_UPDATE =	"update BOARD set title=?, writer=?, content=?, category=? where seq=?";
	private final String BOARD_DELETE = "delete from BOARD where seq=?";
	private final String BOARD_GET = "select * from BOARD where seq = ?";
	private final String BOARD_LIST = "select * from BOARD order by seq desc";
	
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int insertBoard(BoardVO vo) {
		return template.update(BOARD_INSERT, 
				new Object[] {vo.getTitle(), vo.getWriter(), vo.getContent(), vo.getCategory()});
	}
	
	public int deleteBoard(int id) {
		return template.update(BOARD_DELETE,
				new Object[]{id});
	}
	
	public int updateBoard(BoardVO vo) {
		return template.update(BOARD_UPDATE, 
				new Object[] {vo.getTitle(), vo.getWriter(), vo.getContent(), vo.getCategory(), vo.getSeq()});
	}
	
	public BoardVO getBoard(int seq) {
		return template.queryForObject(BOARD_GET, 
				new Object[] {seq},
				new BeanPropertyRowMapper<BoardVO>(BoardVO.class));
	}
	
	public List<BoardVO> getBoardList() {
		return template.query(BOARD_LIST, new RowMapper<BoardVO>() {
			@Override
			public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				BoardVO data = new BoardVO();
				data.setSeq(rs.getInt("seq"));
				data.setTitle(rs.getString("title"));
				data.setWriter(rs.getString("writer"));
				data.setContent(rs.getString("content"));	
				data.setRegdate(rs.getDate("regdate"));	
				data.setCategory(rs.getString("category"));	
				return data;
			}
		});
	}*/
	
}

