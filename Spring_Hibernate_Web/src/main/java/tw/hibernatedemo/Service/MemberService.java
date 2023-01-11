package tw.hibernatedemo.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tw.hibernatedemo.model.Member;
import tw.hibernatedemo.model.MemberDao;

@Transactional(readOnly=true)
@Service
public class MemberService {
	
	@Autowired
	private MemberDao mDao;
	
	public MemberService() {
		
		this.mDao = new MemberDao();//此處不用session因為filter處開session
	}

	public Member checkLogin(String loginName,String loginPwd) {
		
		//開交易
		Member member = mDao.findByNameAndPassword(loginName, loginPwd);
		
		if(member != null) {
			return member;
		}
		
		//filter那邊做commit
		return null;
	}
}
