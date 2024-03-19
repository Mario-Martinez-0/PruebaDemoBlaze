package com.co.PruebaAccenture.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class CarritoData {

    public static List<CarritoData> setData(DataTable dataTable) {
        List<CarritoData> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, CarritoData.class));
        }
        return dates;
    }

    private String nombre;
    private String pais;
    private String ciudad;
    private String tarjeta;
    private String mes;
    private String ano;

}
