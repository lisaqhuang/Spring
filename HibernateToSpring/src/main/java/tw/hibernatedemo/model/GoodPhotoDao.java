package tw.hibernatedemo.model;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GoodPhotoDao {
	
	
	private SessionFactory factory;
	
	@Autowired
	public GoodPhotoDao(SessionFactory factory) {
		this.factory = factory;
	}
	
	public GoodPhoto saveGoodPhoto(GoodPhoto gp) {
		Session session = factory.getCurrentSession();
		session.save(gp);
		return gp;
	}
	
	public GoodPhoto getPhotoById(Integer id) {
		Session session = factory.getCurrentSession();
		GoodPhoto gp = session.get(GoodPhoto.class,id);
		return gp;
	}
	public List<GoodPhoto> getAllPhoto(){
		Session session = factory.getCurrentSession();
		Query<GoodPhoto> query = session.createQuery("from GoodPhoto Bean",GoodPhoto.class);
		List<GoodPhoto> result = query.getResultList(); 
		return result;
	}
	

}
