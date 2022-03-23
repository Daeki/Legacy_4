package com.iu.s1.board.qna;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.s1.board.BoardDAO;
import com.iu.s1.board.BoardDTO;
import com.iu.s1.board.BoardFileDTO;
import com.iu.s1.board.notice.NoticeFileDTO;
import com.iu.s1.util.Pager;

@Repository
public class QnaDAO implements BoardDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE="com.iu.s1.board.qna.QnaDAO.";
	
	public int fileDelete(QnaFileDTO qnaFileDTO)throws Exception{
		return sqlSession.delete(NAMESPACE+"fileDelete", qnaFileDTO);
	}
	
	public List<QnaFileDTO> listFile(BoardDTO boardDTO)throws Exception{
		return sqlSession.selectList(NAMESPACE+"listFile", boardDTO);
	}
	
	public QnaFileDTO detailFile(QnaFileDTO qnaFileDTO)throws Exception{
		return sqlSession.selectOne(NAMESPACE+"detailFile", qnaFileDTO);
	}
	
	@Override
	public int addFile(BoardFileDTO boardFileDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.insert(NAMESPACE+"addFile", boardFileDTO);
	}

	public int reply(QnaDTO qnaDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"reply", qnaDTO);
	}
	
	public int stepUpdate(QnaDTO qnaDTO)throws Exception{
		return sqlSession.update(NAMESPACE+"stepUpdate", qnaDTO);
	}
	
	@Override
	public BoardDTO detail(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"detail", boardDTO);
	}

	@Override
	public List<BoardDTO> list(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(NAMESPACE+"list", pager);
	}

	@Override
	public int add(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.insert(NAMESPACE+"add", boardDTO);
	}

	@Override
	public int update(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.update(NAMESPACE+"update", boardDTO);
	}

	@Override
	public int delete(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.delete(NAMESPACE+"delete", boardDTO);
	}

	@Override
	public Long total(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"total", pager);
	}
	
	

}
