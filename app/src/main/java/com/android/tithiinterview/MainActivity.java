package com.android.tithiinterview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.tithiinterview.adapter.DisSpinnerAdapter;
import com.android.tithiinterview.adapter.DivSpinnerAdapter;
import com.android.tithiinterview.adapter.CountrySpinnerAdapter;
import com.android.tithiinterview.adapter.UpSpinnerAdapter;
import com.android.tithiinterview.api.ApiClient;
import com.android.tithiinterview.dump.DatDump;
import com.android.tithiinterview.model.ChildModel;
import com.android.tithiinterview.model.Country;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private Spinner spCountry,spDiv,spDis,spUpz;
    private ArrayList<Country> countryLists;
    private ArrayList<ChildModel> divDataList;
    private ArrayList<ChildModel> disDataList;
    private ArrayList<ChildModel> upDataList;

    private DatDump dataDump;

    private CountrySpinnerAdapter mCountrySpinnerAdapter;
    private DivSpinnerAdapter mChildSpinnerAdapter;
    private DisSpinnerAdapter mDisAdapter;
    private UpSpinnerAdapter mUpAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initVariable();
        initView();
        initFunctionality();
        initListener();
    }

    private void initVariable() {

        mContext = getApplicationContext();
        countryLists = new ArrayList<>();
        divDataList = new ArrayList<>();
        disDataList = new ArrayList<>();
        upDataList = new ArrayList<>();

        dataDump = new DatDump();
    }

    private void initView() {

        spCountry = findViewById(R.id.spCountry);
        spDiv = findViewById(R.id.spDiv);
        spDis = findViewById(R.id.spDis);
        spUpz = findViewById(R.id.spUpz);

        mCountrySpinnerAdapter = new CountrySpinnerAdapter(mContext,0,countryLists);

    }

    private void initFunctionality() {

        //countryLists.addAll(dataDump.getCountries());
        getCountry();
        spCountry.setAdapter(mCountrySpinnerAdapter);
        mCountrySpinnerAdapter.notifyDataSetChanged();
    }

    private void initListener() {

        spCountry.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                /*if (!divDataList.isEmpty())
                    divDataList.clear();

                divDataList.addAll(dataDump.getDivision(countryLists.get(pos).getId()));*/
                getDiv(countryLists.get(pos).getId());
                mChildSpinnerAdapter = new DivSpinnerAdapter(mContext,0,divDataList);
                spDiv.setAdapter(mChildSpinnerAdapter);
            }

            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spDiv.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {

                /*if (!disDataList.isEmpty())
                    disDataList.clear();

                disDataList.addAll(dataDump.getDistrict(divDataList.get(pos).getId()));*/
                getDis(divDataList.get(pos).getParentId());
                mDisAdapter = new DisSpinnerAdapter(mContext,0,disDataList);
                spDis.setAdapter(mDisAdapter);
            }

            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spDis.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {

                /*if (!upDataList.isEmpty())
                    upDataList.clear();

                upDataList.addAll(dataDump.getUpazila(disDataList.get(pos).getId()));*/

                getUpz(disDataList.get(pos).getParentId());

                mUpAdapter = new UpSpinnerAdapter(mContext,0,upDataList);
                spUpz.setAdapter(mUpAdapter);
            }

            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spUpz.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {

                //Toast.makeText(mContext,upDataList.get(pos).getName(),Toast.LENGTH_SHORT).show();
            }

            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    //get country
    private void getCountry(){

        //retrofit success
        countryLists.addAll(response.body);
    }

    //getDiv
    private void getDiv(int id){

        ApiClient.getClient().getDiv(id).
        if (!divDataList.isEmpty())
            divDataList.clear();
                divDataList.addAll(response.body);
    }

    //getDiv
    private void getDis(int id){

        ApiClient.getClient().getDis(id).
                disDataList.addAll(response.body);
    }

    //getDiv
    private void getUpz(int id){

        ApiClient.getClient().getUpz(id).
                upDataList.addAll(response.body);
    }
}
