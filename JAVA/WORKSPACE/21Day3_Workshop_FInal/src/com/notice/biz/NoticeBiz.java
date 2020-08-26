package com.notice.biz;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.employee.exception.DataNotFoundException;
import com.notice.entity.Notice;

public class NoticeBiz implements INoticeBiz {

		// 공지사항 목록보기
		public List<Notice> selectAllNotice() {
				SqlSession session = MySqlSessionFactory.getSession();
				try {
						List<Notice> list = session.selectList("notice.selectAllNotice");
						return list;
				} finally {
						// TODO: handle finally clause
						session.close();
				}

		}

		// 공지사항 자세히 보기
		public Notice selectDetailNotice(String noticeNum) throws DataNotFoundException {
				SqlSession session = MySqlSessionFactory.getSession();
				try {
						Notice notice = session.selectOne("selectDetailNotice", Integer.parseInt(noticeNum));
						return notice;
				} finally {
						// TODO: handle finally clause
						session.close();
				}
		}

		// 공지사항 수정하기
		public void noticeUpdate(Notice notice) {

				SqlSession session = MySqlSessionFactory.getSession();
				int num = session.update("notice.noticeUpdate", notice);
				try {
						if (num == 0) {
								throw new Exception("업데이트 할 공지사항이 없습니다.");
						} else {
								System.out.println(notice.getNo() + "번 공지사항 업데이트");
								session.commit();
						}
				} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
				} finally {
						session.close();
				}
		}// noticeUpdate

		// 공지사항 삭제
		public void noticeDelete(String no) throws DataNotFoundException {
				SqlSession session = MySqlSessionFactory.getSession();
				try {
						int num = session.delete("notice.noticeDelete", Integer.parseInt(no));
						if (num == 0) {
								throw new DataNotFoundException("삭제 할 공지사항이 없습니다.");
						} else {
								System.out.println("공지사항 삭제");
								session.commit();
						}
				} finally {
						session.close();
				}

		}

}// end class
