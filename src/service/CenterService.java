package service;

import model.Center;
import model.Group;
import model.Student;

public class CenterService {
    private Center[] centerList =new Center[100];
    private int index=0;

    public boolean add(Object object) {
        Center center = (Center) object;
        for (Center center1 : centerList) {
            if(center1 != null){
                if(center1.getLocation().equals(center.getLocation())){
                    return false;
                }
            }
        }
        centerList[index++] = center;
        return true;

    }
}
