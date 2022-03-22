package com.iu.s1.board.notice.noticeReply;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeReplyDAO {
	@Autowired
	private SqlSession sqlSession;
	
	private String NAMESPACE="com.iu.s1.board.notice.noticeReply.NoticeReplyDAO.";
	
	public int delete(NoticeReplyDTO noticeReplyDTO)throws Exception{
		return sqlSession.delete(NAMESPACE+"delete", noticeReplyDTO);
	}
	
	public int add(NoticeReplyDTO noticeReplyDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"add", noticeReplyDTO);
	}
	
	public List<NoticeReplyDTO> list(NoticeReplyDTO noticeReplyDTO)throws Exception{
		return sqlSession.selectList(NAMESPACE+"list", noticeReplyDTO); 
	}

}
