package ku.cs.kafe.service;

import ku.cs.kafe.entity.Menu;
import ku.cs.kafe.model.MenuRequest;
import ku.cs.kafe.repository.MenuRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MenuService {
    @Autowired
    private MenuRepository menuRepository;
    @Autowired
    private ModelMapper modelMapper;
    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }
    public void createMenu(MenuRequest request) {
        Menu record = modelMapper.map(request, Menu.class);
        menuRepository.save(record);
    }
}