package com.iu.s1.board.notice.noticeReply;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeReplyService {
	
	@Autowired
	private NoticeReplyDAO noticeReplyDAO;
	
	public int update(NoticeReplyDTO noticeReplyDTO)throws Exception{
		return noticeReplyDAO.update(noticeReplyDTO);
	}
	
	public int delete(NoticeReplyDTO noticeReplyDTO)throws Exception{
		return noticeReplyDAO.delete(noticeReplyDTO);
	}
	
	public int add(NoticeReplyDTO noticeReplyDTO)throws Exception{
		return noticeReplyDAO.add(noticeReplyDTO);
	}
	
	public List<NoticeReplyDTO> list(NoticeReplyDTO noticeReplyDTO)throws Exception{
		return noticeReplyDAO.list(noticeReplyDTO);
	}

}
