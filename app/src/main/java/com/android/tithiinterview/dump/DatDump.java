package com.android.tithiinterview.dump;

import com.android.tithiinterview.model.ChildModel;
import com.android.tithiinterview.model.Country;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DatDump {

    public static DatDump dataDump = null;

    public DatDump getInstance(){
        if (dataDump == null){
            dataDump = new DatDump();
        }
        return dataDump;
    }

    public ArrayList<Country> getCountries(){
        ArrayList<Country> dataList= new ArrayList<>();

        Country country1 = new Country(1,"Bangladesh");
        Country country2 = new Country(2,"India");
        Country country3 = new Country(3,"Pakistan");
        dataList.add(country1);
        dataList.add(country2);
        dataList.add(country3);
        return dataList;
    }

    public ArrayList<ChildModel> getDivision(int id){
        ArrayList<ChildModel> dataList= new ArrayList<>();
        ArrayList<ChildModel> resultList= new ArrayList<>();

        ChildModel model1 = new ChildModel(1,1,"Dhaka");
        ChildModel model2 = new ChildModel(2,1,"Chittagong");
        ChildModel model3 = new ChildModel(3,1,"Rajshahi");
        ChildModel model4 = new ChildModel(4,1,"Cumilla");
        ChildModel model5 = new ChildModel(5,2,"New Delhi");
        ChildModel model6 = new ChildModel(6,2,"Gujrat");
        ChildModel model7 = new ChildModel(7,3,"Karachi");

        dataList.add(model1);
        dataList.add(model2);
        dataList.add(model3);
        dataList.add(model4);
        dataList.add(model5);
        dataList.add(model6);
        dataList.add(model7);

        for (ChildModel model : dataList){
            if (model.getParentId() == id){
                resultList.add(model);
            }
        }
        return resultList;
    }

    public ArrayList<ChildModel> getDistrict(int id){
        ArrayList<ChildModel> dataList= new ArrayList<>();
        ArrayList<ChildModel> resultList= new ArrayList<>();

        ChildModel model1 = new ChildModel(1,1,"Dhamrai");
        ChildModel model2 = new ChildModel(2,1,"Tangail");
        ChildModel model3 = new ChildModel(3,1,"Narayangaonj");
        ChildModel model4 = new ChildModel(4,1,"Manikgonj");
        ChildModel model5 = new ChildModel(5,5,"Kasmir");
        ChildModel model6 = new ChildModel(6,5,"Gujrat");
        ChildModel model7 = new ChildModel(7,7,"Ahmedabad");

        dataList.add(model1);
        dataList.add(model2);
        dataList.add(model3);
        dataList.add(model4);
        dataList.add(model5);
        dataList.add(model6);
        dataList.add(model7);

        for (ChildModel model : dataList){
            if (model.getParentId() == id){
                resultList.add(model);
            }
        }
        return resultList;
    }

    public ArrayList<ChildModel> getUpazila(int id){
        ArrayList<ChildModel> dataList= new ArrayList<>();
        ArrayList<ChildModel> resultList= new ArrayList<>();

        ChildModel model1 = new ChildModel(1,1,"dohar");
        ChildModel model2 = new ChildModel(2,1,"wetre");
        ChildModel model3 = new ChildModel(3,1,"tithi");
        ChildModel model4 = new ChildModel(4,1,"Cumilla");
        ChildModel model5 = new ChildModel(5,2,"New Delhi");
        ChildModel model6 = new ChildModel(6,2,"Gujrat");
        ChildModel model7 = new ChildModel(7,3,"Karachi");

        dataList.add(model1);
        dataList.add(model2);
        dataList.add(model3);
        dataList.add(model4);
        dataList.add(model5);
        dataList.add(model6);
        dataList.add(model7);

        for (ChildModel model : dataList){
            if (model.getParentId() == id){
                resultList.add(model);
            }
        }
        return resultList;
    }
}
