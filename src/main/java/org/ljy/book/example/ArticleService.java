package org.ljy.book.example;

public class ArticleService {
	MemberDao memberDao;

	// Dependency injection을 위한 setter  method
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public void addArticle() {
		memberDao.getMember();
	}
}