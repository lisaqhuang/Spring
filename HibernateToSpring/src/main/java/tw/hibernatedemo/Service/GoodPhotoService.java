package tw.hibernatedemo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tw.hibernatedemo.model.GoodPhoto;
import tw.hibernatedemo.model.GoodPhotoDao;

@Service
@Transactional
public class GoodPhotoService {

	@Autowired
	private GoodPhotoDao goodPhotoDao;
	
	public GoodPhoto insertPhoto(GoodPhoto goodPhoto) {
		return goodPhotoDao.saveGoodPhoto(goodPhoto);
	}
	
	public GoodPhoto getOnePhotoById(Integer id) {
		
		return goodPhotoDao.getPhotoById(id);
	}
}
