package android.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by LV on 2017/11/18.
 */

public class Province extends DataSupport {
    private int id;

    private String provinceName;

    private int provinceCode;

    public  int getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public String getProvinceName(){
        return provinceName;
    }

    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }

    public int getProvinceCode(){
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }


}
